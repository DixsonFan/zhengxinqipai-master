<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<html>
<head>
    <title>显示全部员工页面</title>
</head>
<body>
<h1>显示全部员工页面</h1>
<%--<a href="${pageContext.request.contextPath}//addPageEmp">添加员工</a>--%>
    <table border="1"   width="80%" cellspacing="0" cellpadding="0">
        <tr>
            <th>k_id</th>
            <th>p_id</th>
            <th>k_sum</th>
        </tr>
    <c:forEach items="${stockList}" var="stock">
        <tr align="center">
            <td>${stock.kid}</td>
            <td>${stock.PId}</td>
            <td>${stock.sum}</td>


            <td>
                <%--<a href="${pageContext.request.contextPath}/emp/deleteEmp/${emp.id}">删除</a>--%>
                <%--<a href="${pageContext.request.contextPath}/emp/updatePageEmp/${emp.id}">修改</a>--%>
            </td>
        </tr>
    </c:forEach>
</table>
</body>
</html>
