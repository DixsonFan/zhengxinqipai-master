<%--
  Created by IntelliJ IDEA.
  User: TWill
  Date: 2019/7/26
  Time: 2:42
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>修改单条数据</title>
</head>
<body>
<form action="${pageContext.request.contextPath}/t_emp/update">
    <input type="hidden" name="e_id" value="${tEmp.EId}" />
    <h1>修改一条数据</h1>
    部门编号：<input type="text" name="p_id" placeholder="${tEmp.PId} />
    登录名：<input type="text" name="e_loginname" placeholder="${tEmp.ELoginname} />
    登录密码：<input type="text" name="e_psw" placeholder="${tEmp.EPsw} />
    员工图片：<input type="text" name="e_img" placeholder="${tEmp.EImg} />
    员工性别：<input type="text" name="e_sex" placeholder="${tEmp.ESex} />
    员工级别：<input type="text" name="e_flag" placeholder="${tEmp.EFlag} />
    系统权限：<input type="text" name="e_admin" placeholder="${tEmp.EAdmin} />
    员工备注：<input type="text" name="e_remark" placeholder="${tEmp.ERemark} />
    真实姓名：<input type="text" name="e_truename" placeholder="${tEmp.ETruename} />
    删除与否：<input type="text" name="e_is" placeholder="${tEmp.EIs} />
    <button type="submit">提交</button>
</form>

</body>
</html>
