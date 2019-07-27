<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <meta charset="UTF-8">
    <title>部门管理</title>
    <link rel="stylesheet" href="../css/bootstrap.css" />
    <link rel="stylesheet" href="../css/bootstrap.min.css" />
    <script src="../js/jquery.min.js"></script>
    <script src="../js/bootstrap.min.js"></script>
    <script src="../js/bootstrap.js"></script>
    <link href="../css/ionicons.min.css" rel="stylesheet" type="text/css" />
    <link href="../css/index.css" rel="stylesheet" type="text/css" />
    <style>
        .right{
            position: absolute;
            top: 0px;
            left: 230px;
            height:500px;
            border: 0px solid black;
        }
    </style>
</head>
<body>
<%@include file="../common/daohanglan.jsp"%>
<div class="container-fluid">
    <div class="row">
        <div class="col-md-2">
            <ul id="main-nav" class="nav nav-tabs nav-stacked" style="">
                <li>
                    <a href="#left1" data-toggle="collapse">
                        <img src="img/duola.jpg" class="img-circle" width="25px"/>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
                        部门管理
                    </a>
                    <script>
                    </script>
                    <ul id="left1" class="nav nav-list collapse secondmenu" style="height: 0px;">
                        <li><a href="${pageContext.request.contextPath}/t_part/queryTPartAll">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
                            <img src="img/tong.jpg" class="img-circle" width="25px"/>
                            &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;部门管理</a></li>
                        <li><a href="#">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
                            <img src="img/tong.jpg" class="img-circle" width="25px"/>
                            &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;恢复部门</a></li>
                    </ul>
                </li>
                <li>
                    <a href="#left2" class="nav-header collapsed" data-toggle="collapse">
                        <img src="img/duola.jpg" class="img-circle"  width="25px"/>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
                        员工管理
                    </a>
                    <ul id="left2" class="nav nav-list collapse secondmenu" style="height: 0px;">
                        <li><a href="${pageContext.request.contextPath}/t_emp/queryTEmpAll">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
                            <img src="img/tong.jpg" class="img-circle" width="25px"/>
                            &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;员工管理</a></li>
                        <li><a href="#">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
                            <img src="img/tong.jpg" class="img-circle" width="25px"/>
                            &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;恢复员工</a></li>
                        <li><a href="${pageContext.request.contextPath}/t_emp/queryTEmp">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
                            <img src="img/tong.jpg" class="img-circle" width="25px"/>
                            &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;查询员工</a></li>
                    </ul>
                </li>
                <li>
                    <a href="#left3" data-toggle="collapse">
                        <img src="img/duola.jpg" class="img-circle"  width="25px"/>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
                        产品管理
                    </a>
                    <ul id="left3" class="nav nav-list collapse secondmenu" style="height: 0px;">
                        <li><a href="${pageContext.request.contextPath}/t_sort/queryTSortAll">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
                            <img src="img/tong.jpg" class="img-circle" width="25px"/>
                            &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;类别管理</a></li>
                        <li><a href="${pageContext.request.contextPath}/t_product/queryTProductAll">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
                            <img src="img/tong.jpg" class="img-circle" width="25px"/>
                            &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;产品管理</a></li>
                        <li><a href="${pageContext.request.contextPath}/t_sort/queryTSort">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
                            <img src="img/tong.jpg" class="img-circle" width="25px"/>
                            &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;产品查询</a></li>
                    </ul>
                </li>
                <li>
                    <a href="#left4" data-toggle="collapse">
                        <img src="img/duola.jpg" class="img-circle"  width="25px"/>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
                        库存管理
                        <!-- <span class="label label-warning pull-right">5</span>-->
                    </a>
                    <ul id="left4" class="nav nav-list collapse secondmenu" style="height: 0px;">
                        <li><a href="#">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
                            <img src="img/tong.jpg" class="img-circle" width="25px"/>
                            &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;出入库管理</a></li>
                    </ul>
                </li>
                <li>
                    <a href="#left5" data-toggle="collapse">
                        <img src="img/duola.jpg" class="img-circle"  width="25px"/>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
                        客户管理
                    </a>
                    <ul id="left5" class="nav nav-list collapse secondmenu" style="height: 0px;">
                        <li><a href="#">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
                            <img src="img/tong.jpg" class="img-circle" width="25px"/>
                            &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;客户管理</a></li>
                    </ul>
                </li>
                <li>
                    <a href="#left6" data-toggle="collapse">
                        <img src="img/duola.jpg" class="img-circle"  width="25px"/>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
                        订单管理
                    </a>
                    <ul id="left6" class="nav nav-list collapse secondmenu" style="height: 0px;">
                        <li><a href="#">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
                            <img src="img/tong.jpg" class="img-circle" width="25px"/>
                            &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;订单管理</a></li>
                    </ul>
                </li>
                <li>
                    <a href="#left7" data-toggle="collapse">
                        <img src="img/duola.jpg" class="img-circle"  width="25px"/>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
                        业绩报表
                    </a>
                    <ul id="left7" class="nav nav-list collapse secondmenu" style="height: 0px;">
                        <li><a href="#">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
                            <img src="img/tong.jpg" class="img-circle" width="25px"/>
                            &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;部门业绩统计</a></li>
                        <li><a href="#">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
                            <img src="img/tong.jpg" class="img-circle" width="25px"/>
                            &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;产品业绩销售统计</a></li>
                        <li><a href="#">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
                            <img src="img/tong.jpg" class="img-circle" width="25px"/>
                            &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;员工个人业绩</a></li>
                    </ul>
                </li>
            </ul>
        </div>
    </div>

    <div class="right col-lg-12">
        <br />
        <div class="right-add">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<button class="btn btn-danger" data-toggle="modal" data-target="#myAdd">
            <span class="glyphicon glyphicon-plus-sign">&nbsp;</span>添加员工</button></div>


        <div class="modal fade" id="myAdd" tabindex="-1" role="dialog" aria-labelledby="myModalLabel" aria-hidden="true">
            <div class="modal-dialog">
                <div class="modal-content">
                    <div class="modal-header">
                        <button type="button" class="close" data-dismiss="modal" aria-hidden="true">&times;</button>
                        <h4 class="modal-title">添加员工</h4>
                    </div>
                    <div class="modal-body">
                        <form class="form-horizontal" role="form">
                            <div class="form-group">
                                <label class="col-sm-3 control-label">真实姓名：</label>
                                <div class="col-sm-7">
                                    <input class="form-control" name="employeeName" type="text" value=" ">
                                </div>
                            </div>
                            <div class="form-group">
                                <label class="col-sm-3 control-label">登录名称：</label>
                                <div class="col-sm-7">
                                    <input class="form-control" name="employeeUname" type="text" placeholder=" ">
                                </div>
                            </div>
                            <div class="form-group">
                                <label class="col-sm-3 control-label">登录密码：</label>
                                <div class="col-sm-7">
                                    <input class="form-control" name="employeePwd" type="text" value=" ">
                                </div>
                            </div>
                            <div class="form-group">
                                <label class="col-sm-3 control-label">员工部门：</label>
                                <div class="col-sm-7">
                                    <select name="employeeSection" class="form-control">
                                        <option>人事部</option>
                                    </select>
                                </div>
                            </div>
                            <div class="form-group">
                                <label class="col-sm-3 control-label">员工性别：</label>
                                <label class="radio-inline">
                                    <input type="radio" name="optionsRadiosinline" id="optionsRadios3" value="option1" checked>男
                                </label>
                                <label class="radio-inline">
                                    <input type="radio" name="optionsRadiosinline" id="optionsRadios4"  value="option2"> 女
                                </label>
                            </div>
                            <div class="form-group">
                                <label class="col-sm-3 control-label">上传头像：</label>
                                <input type="file" class="file" />
                            </div>
                            <div class="form-group">
                                <label class="col-sm-3 control-label">员工备注：</label>
                                <div class="col-sm-7 col-sm-offset-3"><textarea  class="form-control col-sm-2" rows="3"></textarea></div>
                            </div>
                            <div class="form-group">
                                <label class="col-sm-3 control-label">员工类别：</label>
                                <div class="col-sm-7">
                                    <select name="employeeSection" class="form-control">
                                        <option>人事部</option>
                                    </select>
                                </div>
                            </div>
                            <div class="form-group">
                                <label class="col-sm-3 control-label">权限级别：</label>
                                <div class="col-sm-7">
                                    <select name="employeeSection" class="form-control">
                                        <option>人事部</option>
                                    </select>
                                </div>
                            </div>
                            <div class="modal-footer">
                                <button type="button" class="btn btn-default" data-dismiss="modal">关闭</button>
                                <button type="button" class="btn btn-primary">添加</button>
                            </div>
                        </form>
                    </div><!-- /.modal-content -->
                </div><!-- /.modal -->
            </div>

            <div class="right-table col-lg-10">​</div>
        </div>
    </div>
</div>
</body>
</html>
