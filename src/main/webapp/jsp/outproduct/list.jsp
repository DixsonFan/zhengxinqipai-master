<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<html>
<head>
    <title>显示全部出入库产品页面</title>
</head>
<body>
<h1>显示全部出入库产品页面</h1>
<%--<a href="${pageContext.request.contextPath}//addPageEmp">添加员工</a>--%>
    <table border="1"   width="80%" cellspacing="0" cellpadding="0">
        <tr>
            <th>o_id</th>
            <th>p_id</th>
            <th>o_integer</th>
            <th>o_time</th>
            <th>e_id</th>
            <th>o_eid</th>
            <th>o_remark</th>

        </tr>
    <c:forEach items="${outProductList}" var="outProduct">
        <tr align="center">
            <td>${outProduct.oid}</td>
            <td>${outProduct.PId}</td>
            <td>${outProduct.ointeger}</td>
            <td>${outProduct.otime}</td>
            <td>${outProduct.EId}</td>
            <td>${outProduct.OEId}</td>
            <td>${outProduct.oremark}</td>
            <td>
                <%--<a href="${pageContext.request.contextPath}/emp/deleteEmp/${emp.id}">删除</a>--%>
                <%--<a href="${pageContext.request.contextPath}/emp/updatePageEmp/${emp.id}">修改</a>--%>
            </td>
        </tr>
    </c:forEach>
</table>
</body>
</html>
