<%--
  Created by IntelliJ IDEA.
  User: TWill
  Date: 2019/7/26
  Time: 2:41
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>添加一个员工</title>
</head>
<body>

<form action="${pageContext.request.contextPath}/t_emp/addTEmp">
    <h1>添加一个员工</h1>
    部门编号：<input type="text" name="p_id" />
    登录名：<input type="text" name="e_loginname" />
    登录密码：<input type="text" name="e_psw" />
    员工图片：<input type="text" name="e_img" />
    员工性别：<input type="text" name="e_sex" />
    员工级别：<input type="text" name="e_flag" />
    系统权限：<input type="text" name="e_admin" />
    员工备注：<input type="text" name="e_remark" />
    真实姓名：<input type="text" name="e_truename" />
    删除与否：<input type="text" name="e_is" />
    <button type="submit">提交</button>
</form>

</body>
</html>
