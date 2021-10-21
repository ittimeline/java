<%--
  Created by IntelliJ IDEA.
  User: tony
  Date: 2021/7/19
  Time: 18:28
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>这是我的第一个JSP</title>
</head>
<body>
<h1>这是我的第一个JSP</h1>
<%-- JSP注释 --%>

<%
    //在这里写Java代码
    System.out.println("Hello JSP");

    String str="Hello JSP";
%>

<%--
    这里会向页面上打印输出str的值
--%>
<%=str %>

<%--
    这种脚本的代码是运行Servlet类中，方法外
--%>
<%!
    //私有成员变量
    private int number;

%>

<%-- 往IDEA的控制台输出私有成员变量的值--%>
<%
    System.out.println("number = "+number);
%>




</body>
</html>
