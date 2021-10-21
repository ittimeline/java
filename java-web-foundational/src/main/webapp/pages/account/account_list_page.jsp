<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: tony
  Date: 2021/7/26
  Time: 13:59
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>查看账户列表(分页显示)</title>
</head>
<body>
<h1>查看账户列表</h1>
<div style="color: red">${errorMessage}</div>
<table width="880px">
    <tr>
        <th>编号</th>
        <th>账号名</th>
        <th>账号余额</th>
        <th>账号状态</th>
        <th>账号的创建时间</th>
        <th>账号的修改时间</th>
        <th>操作</th>
    </tr>

    <c:forEach items="${pageBean.dataList}" var="account" varStatus="accountStatus">
        <tr>
            <td>${accountStatus.count}</td>
            <td>${account.name}</td>
            <td>${account.balance}</td>
            <td><c:if test="${account.status==1}">
                启用
            </c:if>
                <c:if test="${account.status==0}">
                    禁用
                </c:if>
            </td>
            <td>${account.createDate}</td>
            <td>${account.updateDate}</td>
            <td>
                <a href="#" onclick="deleteAccountById('${account.id}','${account.name}')">删除账号</a>
                <a href="#" onclick="toUpdateAccountPage('${account.id}')">修改账号</a>
            </td>

        </tr>
    </c:forEach>

    <tr>
        <td>总条数${pageBean.totalCount},每页条数${pageBean.pageSize}</td>
    </tr>

    <tr>
<%--        显示上一页:如果当前页不等于1 那么就显示上一页--%>

        <td>
            <c:if test="${pageBean.pageNo>1}">
                <a href="account?method=findAccountByPage&pageNo=${pageBean.pageNo-1}&pageSize=${pageBean.pageSize}">上一页</a>
            </c:if>
        </td>

<%--        显示页码 --%>
        <td>
            <c:forEach begin="1" end="${pageBean.totalPage}" var="pageNo">
<%--                如果遍历的页码是当前页码 那就高亮显示 也就是样式变成红色--%>
                <c:if test="${pageBean.pageNo==pageNo}">
                    <a href="#" style="color: red">${pageNo}</a>
                </c:if>

<%--            如果遍历的页码不是当前的页码，那么超链接跳转到指定页码对应的数据(也就是跳转到第几页)--%>
                <c:if test="${pageBean.pageNo!=pageNo}">
                    <a href="account?method=findAccountByPage&pageNo=${pageNo}&pageSize=${pageBean.pageSize}">${pageNo}</a>
                </c:if>

            </c:forEach>
        </td>

<%--
        显示下一页：如果当前页码不等于总页数，那么就显示下一页
--%>
        <td>

            <c:if test="${pageBean.pageNo!=pageBean.totalPage}">
                <a href="account?method=findAccountByPage&pageNo=${pageBean.pageNo+1}&pageSize=${pageBean.pageSize}">下一页</a>
            </c:if>

        </td>

    </tr>

</table>



<div>
    <a href="${pageContext.request.contextPath}/pages/account/account_add.jsp" target="_blank">添加账户</a>

</div>

<script type="text/javascript">
    function deleteAccountById(id,name){
        console.log("要删除的账号的id是"+id)
        let flag = confirm("确认要删除"+name+"吗?");
        if (flag){
            window.location.href="${pageContext.request.contextPath}/account?method=deleteAccountById&id="+id
        }

    }

    /**
     * 跳转到AccountServlet
     * @param id
     */
    function  toUpdateAccountPage(id){
        window.location.href="${pageContext.request.contextPath}/account?method=toUpdateAccountPage&id="+id
    }


</script>
</body>
</html>
