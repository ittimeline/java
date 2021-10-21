package net.ittimeline.java.web.foundational.servlet;

import com.alibaba.fastjson.JSON;
import net.ittimeline.java.web.foundational.bean.entity.Words;
import net.ittimeline.java.web.foundational.bean.response.ResponseBean;
import net.ittimeline.java.web.foundational.service.WordsService;
import net.ittimeline.java.web.foundational.service.impl.WordsServiceImpl;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.util.List;

/**
 * 异步请求搜索自动补全
 * @author tony 18601767221@163.com
 * @version 2021/8/7 15:23
 * @since JDK11
 */
@WebServlet("/words")
public class WordsServlet extends BaseServlet {

    private WordsService wordsService=new WordsServiceImpl();

    public void search(HttpServletRequest request,HttpServletResponse response) throws IOException {
        ResponseBean<List<Words>> responseBean=new ResponseBean<>(Boolean.TRUE);

        try {
            String keyword = request.getParameter("keyword");
            List<Words> wordsList = wordsService.searchWords(keyword);
            if (null!=wordsList&&wordsList.size()>0){
                responseBean.setData(wordsList);
            }
        } catch (Exception e) {
            e.printStackTrace();
            responseBean.setFlag(Boolean.FALSE);
            responseBean.setErrorMessage("服务器异常");
        }

        String responseJSONString = JSON.toJSONString(responseBean);
        System.out.println("【异步请求搜索自动补全】服务器响应的JSON字符串的内容是"+responseJSONString);

        response.getWriter().write(responseJSONString);

    }
}
