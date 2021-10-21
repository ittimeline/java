<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: tony
  Date: 2021/7/21
  Time: 11:17
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>展示用户列表</title>
</head>
<body>
<h1>使用JavaBean+自定义的Dbutils+Servlet+JSP+EL+JSTL展示用户列表信息</h1>
<table width="900px" border="1" cellspacing="0" cellpadding="0">
    <tr>
        <th>用户序号</th>
        <th>用户名</th>
<%--        一般页面上不会展示密码，这里只是演示展示数据库的数据--%>
        <th>用户密码</th>
        <th>创建时间</th>
        <th>更新时间</th>
    </tr>
<%--
    使用EL表达式结合JSTL将域对象的数据展示在JSP页面上
--%>

    <c:forEach items="${userVOList}" var="user" varStatus="status">
        <tr>
            <th>${status.count}</th>
            <th>${user.name}</th>
                <%--        一般页面上不会展示密码，这里只是演示展示数据库的数据--%>
            <th>${user.password}</th>
            <th>${user.createDate}</th>
            <th>${user.updateDate}</th>
        </tr>
    </c:forEach>



</table>


</body>
</html>
