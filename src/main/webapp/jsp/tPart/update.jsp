
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>修改单条数据</title>
</head>
<body>

<form action="${pageContext.request.contextPath}/t_part/update">
    <input type="hidden" name="p_id" value="${tPart.PId}" />
    <h1>修改一条数据</h1>
    部门名称：<input type="text" name="p_name" placeholder="${tPart.PName}/>
    部门备注：<input type="text" name="p_remark" placeholder="${tPart.PRemark}/>
    删除与否：<input type="text" name="p_is" placeholder="${tPart.PIs}/>
    <button type="submit">提交</button>
</form>

</body>
</html>
