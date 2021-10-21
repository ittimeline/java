package net.ittimeline.java.web.foundational.filter;

import javax.servlet.*;
import javax.servlet.annotation.*;
import javax.servlet.http.HttpServletRequest;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.ArrayList;
import java.util.List;

/**
 * 拦截非法字符的请求
 *
 * @author tony 18601767221@163.com
 * @version 2021/7/23 13:30
 * @since JDK11
 */
@WebFilter("/*")
public class IllegalCharacterFilter implements Filter {

    /**
     * 存储所有的非法字符
     */
    List<String> illegalCharacterList;


    @Override
    public void init(FilterConfig config) throws ServletException {

        try (
                //获取非法字符文件的字节输入流
                InputStream inputStream = IllegalCharacterFilter.class.getClassLoader().getResourceAsStream("illegal.txt");
                //字节输入流转换成字符输入流
                InputStreamReader inputStreamReader = new InputStreamReader(inputStream);
                //将字符输入流转换从带缓冲的字符输入流
                BufferedReader bufferedReader = new BufferedReader(inputStreamReader);

        ) {
            String readLine = null;
            illegalCharacterList = new ArrayList<>();
            while ((readLine = bufferedReader.readLine()) != null) {
                illegalCharacterList.add(readLine);

            }
        } catch (Exception ex) {
            ex.printStackTrace();
        }

        System.out.println("当前illegal.txt文件的非法字符列表是");
        for (String illegalCharacter : illegalCharacterList) {
            System.out.println(illegalCharacter);

        }


    }


    /**
     *
     * 通过动态代理的方式增强了HttpServletRequest的getParameter()方法，改变了该方法的返回值
     * 由请求参数变成了将请求参数如果包含非法字符的，将非法字符替换成*号
     * @param request
     * @param response
     * @param chain
     * @throws ServletException
     * @throws IOException
     */
    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws ServletException, IOException {
        HttpServletRequest httpServletRequest = (HttpServletRequest) request;

        //使用Filter实现非法字符过滤
        //获取Servlet的请求参数，然后将请求参数中的非法字符替换成**
        //使用动态代理增强HttpServletRequest的getParameter()方法

        /**
         * - ClassLoader loader 表示被代理类的类加载器
         * - Class<?>[] interfaces 表示被代理类所有实现的接口
         * - InvocationHandler h 表示执行处理接口，该接口还是一个函数式接口。在传递InvocationHandler 类型参数的时候，必须实现invoke方法，该方法就是返回方法执行的返回值。
         */
        HttpServletRequest proxyHttpServletRequest = (HttpServletRequest) Proxy.newProxyInstance(HttpServletRequest.class.getClassLoader(), new Class[]{HttpServletRequest.class}, new InvocationHandler() {
            @Override
            public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                String returnValue = null;
                String proxyMethodName = "getParameter";
                //增强getParameter方法
                if (method.getName().equals(proxyMethodName)) {
                    //目的是改变getParameter方法的返回值
                    // 执行原本的方法获取返回值
                    returnValue = (String) method.invoke(httpServletRequest, args);
                    System.out.println(proxyMethodName+"的返回值是"+returnValue);
                    //将返回值的结果中非法字符替换成**
                    if (null != returnValue) {
                        if (null != illegalCharacterList) {
                            //遍历所有的非法字符列表
                            for (String illegalCharacter : illegalCharacterList) {
                                //如果请求参数中包含了非法字符
                                if (returnValue.contains(illegalCharacter)) {
                                    String asterisk = "";
                                    //一个星号表示一个字符
                                    for (int i = 0; i < illegalCharacter.length(); i++) {
                                        asterisk += "*";
                                    }
                                    //将非法字符的每个字符替换成星号
                                    returnValue = returnValue.replace(returnValue, asterisk);
                                    System.out.println("替换之前的内容是" + returnValue + "替换之后的内容是" + returnValue);
                                }
                            }
                        }
                        //返回方法的调用结果的返回值
                        return returnValue;
                    }
                }
                //如果不是getParameter()方法，则执行原来的方法。即不增强
                return method.invoke(httpServletRequest, args);
            }

        });
        //放行的时候一定要使用代理的HttpServletRequest，否则获取的参数还是没有替换成星号的非法字符
        chain.doFilter(proxyHttpServletRequest, response);
    }

    @Override
    public void destroy() {
    }

}