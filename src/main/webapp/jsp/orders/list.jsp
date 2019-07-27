<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<html>
<head>
    <title>显示全部订单页面</title>
</head>
<body>
<h1>显示全部订单页面</h1>
<%--<a href="${pageContext.request.contextPath}//addPageEmp">添加员工</a>--%>
    <table border="1"   width="80%" cellspacing="0" cellpadding="0">
        <tr>
            <th>r_id</th>
            <th>e_id</th>
            <th>c_id</th>
            <th>r_time</th>
            <th>r_is</th>

        </tr>
    <c:forEach items="${ordersList}" var="orders">
        <tr align="center">
            <td>${orders.rid}</td>
            <td>${orders.EId}</td>
            <td>${orders.CId}</td>
            <td>${orders.rtime}</td>
            <td>${orders.ris}</td>

            <td>
                <a href="${pageContext.request.contextPath}/orders/deleteOrders/${orders.rid}">删除</a>
                <a href="${pageContext.request.contextPath}/orders/updateOrders/${orders}">修改</a>
            </td>
        </tr>
    </c:forEach>
</table>
</body>
</html>
