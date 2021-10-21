<%@ page import="net.ittimeline.java.web.foundational.util.CookieUtil" %><%--
  Created by IntelliJ IDEA.
  User: tony
  Date: 2021/7/19
  Time: 19:15
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>用户登录</title>
</head>
<body>

<%




%>

<div style="color: red"> ${errorMessage}</div>

<form action="${pageContext.request.contextPath}/login" method="post">
    用户名:<input type="text" name="name" autocomplete="off" value="${cookie.name.value}"/><br/>
    密码:<input type="password" name="password"  autocomplete="off" value="${cookie.password.value}"/><br>
    验证码:<input type="text" name="captcha" autocomplete="off"/><br/>
    <img src="${pageContext.request.contextPath}/captcha" width="130px" height="48px" id="captcha" onclick="changeCaptcha()" /> <br/>
    <input type="checkbox" name="remember"/>记住用户名和密码 <br/>

    <input type="submit" value="提交"/>
</form>

<script>
    /**
     * 用户点击验证码图片实现切换验证码
     */
    function changeCaptcha(){
        //获取图片的元素
        let imgElement = document.getElementById("captcha");
        //因为访问路径没有改变，所以服务器认为我们发送的是一个请求，所以服务器会返回一个状态码 304,所以浏览器会从缓存中取数据
        // 如果每次访问的url有变化，就不会从缓存中取数据，因此可以在请求地址后面加一个动态参数，例如日期
        imgElement.setAttribute("src","${pageContext.request.contextPath}/captcha?date="+new Date())


    }

</script>
</body>
</html>