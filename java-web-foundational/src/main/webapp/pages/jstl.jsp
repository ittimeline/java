<%@ page import="java.util.ArrayList" %>
<%@ page import="java.util.List" %>
<%@ page import="java.util.Arrays" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: tony
  Date: 2021/7/21
  Time: 10:21
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>JSTL标签库的使用</title>
</head>
<body>

<h1>JSTL if标签的使用</h1>
<%
  //往request作用域存储年龄
  request.setAttribute("age",16);
%>
<%--
  test 属性是必须包含的，可以写el表达式
  var可以存储判断结果，然后可以直接通过EL表达式获取，因此底层会将结果存储到域对象中
--%>
<c:if test="${age>=18}" var="flag" scope="page">
  你已经成年了，可以办信用卡<br/>
</c:if>
判断结果 ${flag}<br/>

<c:if test="${age<18}">
  你没有成年了，不能办信用卡<br/>
</c:if>

<h1>JSTL choose when标签的使用</h1>

<%
  request.setAttribute("score",180);
%>
<c:choose>
  <c:when test="${score>=90 && score<=100}">
    成绩优秀
  </c:when>
  <c:when test="${score>=80 && score<90}">
    成绩良好
  </c:when>
  <c:when test="${score>=70 && score<80}">
    成绩中等
  </c:when>
  <c:when test="${score>=60 && score<70}">
    成绩及格
  </c:when>
  <c:when test="${score>=0 && score<60}">
    成绩不及格
  </c:when>
  <c:otherwise>
    成绩有误
  </c:otherwise>
</c:choose>

<h1>JSTL foreach标签的使用</h1>
<h2>foreach标签的基本使用</h2>
<c:forEach begin="0" end="9" step="1" var="i">
  ${i}<br/>
</c:forEach>

<h2>foreach标签遍历集合</h2>

<%
  List<String> cities=new ArrayList<>(Arrays.asList("北京","上海","广州","深圳"));
  request.setAttribute("cities",cities);
%>
中国的四大城市<br/>
<%--
  begin 表示开始遍历的下标，如果遍历即可，默认就是0，可以不写
  end  表示结束遍历的下标，默认值就是集合的最后一个元素
  step 表示步长 默认是1
  items 表示要遍历的数据
  var 表示将遍历到的数据存储到哪里
  varStatus 表示将当前遍历的信息状态存储到page作用域的属性名称，遍历出来的每个元素都有一些常用的状态属性
  - index下标
  - count(序号、计数)
  - first(是否是第一个元素)
  - last(是否是最后一个)
  以上的这些状态信息会封装到对象中，获取该状态对象(例如status)就可以获取这些状态属性信息，该对象需要存储到page域对象中
  varStatus 表示指定了状态对象存储到域对象的key

--%>
<c:forEach items="${cities}"  var="desc" >
  ${desc}<br/>
</c:forEach>

状态对象的属性信息的使用<br/>
<table width="800px">
  <tr>
    <th>下标</th>
    <th>序号</th>
    <th>城市名</th>
    <th>是否是第一个元素</th>
    <th>是否是最后一个</th>
  </tr>
  <c:forEach items="${cities}" var="desc" varStatus="status" >
    <tr>
      <th>${status.index}</th>
      <th>${status.count}</th>
      <th>${status.current}</th>
      <th>${status.first}</th>
      <th>${status.last}</th>
    </tr>
  </c:forEach>

</table>






</body>
</html>
