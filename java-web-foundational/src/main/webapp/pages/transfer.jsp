<%--
  Created by IntelliJ IDEA.
  User: tony
  Date: 2021/7/21
  Time: 12:23
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>用户转账</title>
</head>
<body>
<h1>用户转账</h1>
<div style="color: red">${transferMessage}</div>
<form action="${pageContext.request.contextPath}/transfer" method="post">
    转出账户名 <input type="text" name="fromAccountName" autocomplete="off"/> <br/>
    转入账户名 <input type="text" name="toAccountName" autocomplete="off"/> <br/>
    转账金额 <input type="text" name="amount" autocomplete="off"/> <br/>
    <input type="submit" value="提交">

</form>
</body>
</html>
