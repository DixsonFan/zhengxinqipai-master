<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<html>
<head>
    <title>显示全部订单细节页面</title>
</head>
<body>
<h1>显示全部订单细节页面</h1>
<%--<a href="${pageContext.request.contextPath}//addPageEmp">添加员工</a>--%>
    <table border="1"   width="80%" cellspacing="0" cellpadding="0">
        <tr>
            <th>x_id</th>
            <th>r_id</th>
            <th>p_id</th>
            <th>y_id</th>
            <th>x_count</th>
            <th>x_price</th>
        </tr>
    <c:forEach items="${orderSMXList}" var="ordersmx">
        <tr align="center">
            <td>${ordersmx.xid}</td>
            <td>${ordersmx.RId}</td>
            <td>${ordersmx.PId}</td>
            <td>${ordersmx.YId}</td>
            <td>${ordersmx.xcount}</td>
            <td>${ordersmx.xprice}</td>

            <td>
                <%--<a href="${pageContext.request.contextPath}/emp/deleteEmp/${emp.id}">删除</a>--%>
                <%--<a href="${pageContext.request.contextPath}/emp/updatePageEmp/${emp.id}">修改</a>--%>
            </td>
        </tr>
    </c:forEach>
</table>
</body>
</html>
