
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>添加一个部门</title>
</head>
<body>

<form action="${pageContext.request.contextPath}/t_part/addTPart">
    <h1>添加一个部门</h1>
    部门名称：<input type="text" name="p_name" />
    部门备注：<input type="text" name="p_remark" />
    删除与否：<input type="text" name="p_is" />
    <button type="submit">提交</button>
</form>
</body>

</html>
