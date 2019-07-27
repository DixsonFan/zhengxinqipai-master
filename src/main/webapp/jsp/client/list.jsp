<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<html>
<head>
    <title>显示全部客户页面</title>
</head>
<body>
<h1>显示全部客户页面</h1>
<a href="${pageContext.request.contextPath}/client/addClient">添加客户</a>
    <table border="1"   width="80%" cellspacing="0" cellpadding="0">
        <tr>
            <th>c_id</th>
            <th>e_id</th>
            <th>c_name</th>
            <th>c_tel</th>
            <th>c_address</th>
            <th>c_is</th>
        </tr>
    <c:forEach items="${clientList}" var="client">
        <tr align="center">
            <td>${client.cid}</td>
            <td>${client.EId}</td>
            <td>${client.cname}</td>
            <td>${client.ctel}</td>
            <td>${client.caddress}</td>
            <td>${client.cis}</td>
            <td>
                <a href="${pageContext.request.contextPath}/client/deleteClient/${client.cid}">删除</a>
                <a href="${pageContext.request.contextPath}/client/updateClient">修改</a>
            </td>
        </tr>
    </c:forEach>
</table>
</body>
</html>
