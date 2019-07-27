<%--
  Created by IntelliJ IDEA.
  User: HP
  Date: 2019/7/24
  Time: 13:38
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>首页</title>
</head>
<body>

<a href="${pageContext.request.contextPath}/t_part/queryTPartAll">查询全部的部门</a><br/>
<a href="${pageContext.request.contextPath}/t_emp/queryTEmpAll">查询全部的员工</a><br/>
<a href="${pageContext.request.contextPath}/t_sort/queryTSortAll">查询产品类别信息</a><br/>
<a href="${pageContext.request.contextPath}/t_product/queryTProductAll">查询全部的产品</a><br/>
<a href="${pageContext.request.contextPath}/t_productyear/queryTProductyearAll">查询产品年份信息</a><br/>
<a href="${pageContext.request.contextPath}/t_inproduct/queryTInproductAll">查询产品入库信息</a>

</body>
</html>
