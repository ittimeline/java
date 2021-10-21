<%--
  Created by IntelliJ IDEA.
  User: tony
  Date: 2021/7/27
  Time: 7:18
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>添加账号</title>
</head>
<body>
<h1>添加账号</h1>
<div style="color: red">${errorMessage}</div>
<form action="${pageContext.request.contextPath}/account" method="post">
    <input type="hidden" name="method" value="addAccount"/>
    账户名:<input type="text" name="name" autocomplete="off"/> <br/>
    账户余额: <input type="text" name="balance" autocomplete="off" /> <br/>
    账号状态:<input type="radio" name="status" value="1">启用  <input type="radio" name="status" value="0">禁用<br/>
    <input type="submit" value="提交"/>
</form>



</body>
</html>
