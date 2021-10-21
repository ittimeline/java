<%@ page import="java.util.*" %>
<%@ page import="net.ittimeline.java.web.foundational.bean.entity.User" %>
<%@ page import="net.ittimeline.java.web.foundational.util.CookieUtil" %><%--
  Created by IntelliJ IDEA.
  User: tony
  Date: 2021/7/21
  Time: 8:50
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>EL表达式的使用</title>
</head>
<body>

<h1>EL表达式获取域对象的简单类型的数据</h1>

<%
    //往三个作用域对象储存数据，而且它们的key都相同
  // 但是实际的开发项目中不会将同一个key存储到不同的域对象中
 //   request.setAttribute("message","hello request");
  //这里注释之后，只要不关浏览器，获取的还是session,关闭浏览器之后获取的就是application作用域的
 //   session.setAttribute("message","hello session");
    application.setAttribute("message","hello application");

  String message = (String)request.getAttribute("message");
  if (message==null){
    message="";
  }

%>
使用JSP脚本的方式获取request域对象名为message的值 <%=message%><br/>
使用EL表达式的方式获取request域对象名为message的值${requestScope.message}<br/>
<%--
  默认情况下session的作用域是浏览器没有关闭之前，如果浏览器关了会怎么样？
--%>
使用EL表达式的方式获取session域对象名为message的值${sessionScope.message}<br/>
使用EL表达式的方式获取application域对象名为message的值${applicationScope.message}<br/>
<%--
  如果没有作用域，默认就是先从request作用域获取，如果request作用域没有，那么就增大作用域继续获取,即后面继续从session和application作用域继续获取
  request,session,appliaction域对象 按照作用域的从小到大排序 request<session<application

--%>
使用EL表达式的方式获取域对象名为message的值${message}<br/>


<h1>EL表达式获取域对象的复杂类型的数据</h1>

<%

  //往request作用域对象存储一个数组
  String[]cities=new String[]{"北京","上海","广州","深圳"};
  request.setAttribute("cities",cities);

  //往request作用域对象存储一个List集合
  List<String> productNameList = new ArrayList<>(Arrays.asList("iphone12","S21 Ultra"));
  request.setAttribute("productNameList",productNameList);

  //往request作用域对象存储一个Map集合
  Map<String,String> map =new HashMap<>();
  map.put("name","tony");
  map.put("password","123456");
  request.setAttribute("map",map);

  //往request作用域对象存储一个自定义的类 User
  User user=new User();
  user.setName("admin");
  user.setPassword("111111");
  request.setAttribute("user",user);

  //往request域对象存储一个key为product.name的数据
  request.setAttribute("product.name","小米11 ultra");

  String str="";


%>


使用EL表达式获取域对象数据类型为数组，索引为0元素${cities[0]}<br/>
<%--
  List集合也可以通过下标访问元素
--%>
使用EL表达式获取域对象数据类型为List，索引为0元素${productNameList[0]}<br/>
使用EL表达式获取域对象数据类型为List，索引为0元素${productNameList.get(0)}<br/>
使用EL表达式获取域对象数据类型为Map，key为name的元素${map.get("name")}<br/>
<%--
  这里的name实际上是getName()方法去掉get之后并且首字母小写
--%>
使用EL表达式获取域对象数据类型为User，属性名为name的元素${user.name}<br/>
使用EL表达式获取域对象数据 key为product.name元素${requestScope['product.name']}<br/>

<h1>EL表达式执行运算</h1>

<%--
  el表达式的字符串拼接
--%>
el表达式的字符串拼接 hello ${user.name}<br/>

<%--
  empty运算符的使用
--%>

 empty运算符可以判断域对象中的对象是否为null  ${empty user} <br/>
 empty运算符可以判断字符串是否为空串 ""  ${empty str}  <br/>
 empty运算符还可以判断集合的长度是否为0 ${empty productNameList} <br/>



<h1>EL表达式获取Cookie中的数据</h1>

<%
  Cookie[] cookies = request.getCookies();
  String cookieValue=null;
  if (null!=cookies&&cookies.length>0){
    for (Cookie cookie : cookies) {
      if (cookie.getName().equals("JSESSIONID")){
        cookieValue=cookie.getValue();
      }

    }
  }
  if (cookieValue==null){
    cookieValue="";
  }

%>
使用JSP脚本的方式获取名为JSESSIONID的cookie信息 <%=cookieValue%><br/>
使用EL表达式的方式获取取名为JSESSIONID的cookie信息${cookie.JSESSIONID.value}<br/>





</body>
</html>
