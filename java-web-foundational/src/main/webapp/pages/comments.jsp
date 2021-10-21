<%--
  Created by IntelliJ IDEA.
  User: tony
  Date: 2021/7/23
  Time: 13:20
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>评论页面</title>
</head>
<body>
<h1>评论页面</h1>

<form action="${pageContext.request.contextPath}/comments" method="post">
    评论内容:<input type="text" name="comments"></br>
    <input type="submit" value="提交"/>
</form>
</body>
</html>
