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
			.add{
				font-size: 16px;
				margin-left:100px;
				margin-bottom: 20px;
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
							<img src="../img/duola.jpg" class="img-circle" width="25px"/>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
							部门管理
						</a>
						<script>
						</script>
						<ul id="left1" class="nav nav-list collapse secondmenu" style="height: 0px;">
							<li><a href="${pageContext.request.contextPath}/t_part/queryTPartAll">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
								<img src="../img/tong.jpg" class="img-circle" width="25px"/>
								&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;部门管理</a></li>
							<li><a href="#">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
								<img src="../img/tong.jpg" class="img-circle" width="25px"/>
								&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;恢复部门</a></li>
						</ul>
					</li>
					<li>
						<a href="#left2" class="nav-header collapsed" data-toggle="collapse">
							<img src="../img/duola.jpg" class="img-circle"  width="25px"/>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
							员工管理
						</a>
						<ul id="left2" class="nav nav-list collapse secondmenu" style="height: 0px;">
							<li><a href="${pageContext.request.contextPath}/t_emp/queryTEmpAll">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
								<img src="../img/tong.jpg" class="img-circle" width="25px"/>
								&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;员工管理</a></li>
							<li><a href="#">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
								<img src="../img/tong.jpg" class="img-circle" width="25px"/>
								&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;恢复员工</a></li>
							<li><a href="${pageContext.request.contextPath}/t_emp/queryTEmp">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
								<img src="../img/tong.jpg" class="img-circle" width="25px"/>
								&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;查询员工</a></li>
						</ul>
					</li>
					<li>
						<a href="#left3" data-toggle="collapse">
							<img src="../img/duola.jpg" class="img-circle"  width="25px"/>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
							产品管理
						</a>
						<ul id="left3" class="nav nav-list collapse secondmenu" style="height: 0px;">
							<li><a href="${pageContext.request.contextPath}/t_sort/queryTSortAll">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
								<img src="../img/tong.jpg" class="img-circle" width="25px"/>
								&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;类别管理</a></li>
							<li><a href="${pageContext.request.contextPath}/t_product/queryTProductAll">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
								<img src="../img/tong.jpg" class="img-circle" width="25px"/>
								&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;产品管理</a></li>
							<li><a href="${pageContext.request.contextPath}/t_sort/queryTSort">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
								<img src="../img/tong.jpg" class="img-circle" width="25px"/>
								&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;产品查询</a></li>
						</ul>
					</li>
					<li>
						<a href="#left4" data-toggle="collapse">
							<img src="../img/duola.jpg" class="img-circle"  width="25px"/>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
							库存管理
							<!-- <span class="label label-warning pull-right">5</span>-->
						</a>
						<ul id="left4" class="nav nav-list collapse secondmenu" style="height: 0px;">
							<li><a href="#">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
								<img src="../img/tong.jpg" class="img-circle" width="25px"/>
								&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;出入库管理</a></li>
						</ul>
					</li>



					<%--DDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDixson--%>
					<%--DDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDixson--%>
					<%--DDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDixson--%>
					<%--DDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDixson--%>
					<%--DDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDixson--%>
					<%--DDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDixson--%>
					<%--DDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDixson--%>
					<%--DDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDixson--%>
					<%--DDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDixson--%>
					<%--DDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDixson--%>
					<%--DDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDixson--%>
					<%--DDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDixson--%>
					<li>
						<a href="#left5" data-toggle="collapse">
							<img src="../img/duola.jpg" class="img-circle"  width="25px"/>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
							客户管理
						</a>
						<ul id="left5" class="nav nav-list collapse secondmenu" style="height: 0px;">
							<li><a href="${pageContext.request.contextPath}/client/queryAllClient">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
								<img src="../img/tong.jpg" class="img-circle" width="25px"/>
								&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;客户管理</a></li>


						</ul>
					</li>
					<li>
						<a href="#left6" data-toggle="collapse">
							<img src="../img/duola.jpg" class="img-circle"  width="25px"/>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
							订单管理
						</a>
						<ul id="left6" class="nav nav-list collapse secondmenu" style="height: 0px;">
							<li><a href="${pageContext.request.contextPath}/orders/queryAllOrders">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
								<img src="../img/tong.jpg" class="img-circle" width="25px"/>
								&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;订单管理</a></li>
						</ul>
					</li>
					<li>
						<a href="#left7" data-toggle="collapse">
							<img src="../img/duola.jpg" class="img-circle"  width="25px"/>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
							业绩报表
						</a>
						<ul id="left7" class="nav nav-list collapse secondmenu" style="height: 0px;">
							<li><a href="#">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
								<img src="../img/tong.jpg" class="img-circle" width="25px"/>
								&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;部门业绩统计</a></li>
							<li><a href="#">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
								<img src="../img/tong.jpg" class="img-circle" width="25px"/>
								&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;产品业绩销售统计</a></li>
							<li><a href="#">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
								<img src="../img/tong.jpg" class="img-circle" width="25px"/>
								&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;员工个人业绩</a></li>
						</ul>
					</li>
				</ul>
			</div>
		</div>
            
		<div class="right col-lg-12">
			<br />
			<div class="right-add">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
				<button class="btn btn-danger" data-toggle="modal" data-target="#myAdd">
				<span class="glyphicon glyphicon-plus-sign">&nbsp;</span>添加部门</button>

				<a href="${pageContext.request.contextPath}/client/queryAllClient">已删除客户</a>

			</div>

			<div class="modal fade" id="myAdd" tabindex="-1" role="dialog" aria-labelledby="myModalLabel" aria-hidden="true">
			    <div class="modal-dialog">
			        <div class="modal-content">
			            <div class="modal-header">
			                <button type="button" class="close" data-dismiss="modal" aria-hidden="true">&times;</button>
			                <h4 class="modal-title">添加部门</h4>
			            </div>
						<form action="${pageContext.request.contextPath}/client/addClient">
			            <div class="modal-body">
			            	<div class="add"><span class="label label-success label-lg">客户姓名：</span>&nbsp;&nbsp;<input type="text" name="cname"/></div>
							<div class="add"><span class="label label-success label-lg">客户电话：</span>&nbsp;&nbsp;<input type="text" name="ctel"/></div>
							<div class="add"><span class="label label-success label-lg">客户地址：</span>&nbsp;&nbsp;<input type="text" name="caddress"/></div>
			            </div>
			            <div class="modal-footer">
			                <button type="button" class="btn btn-default" data-dismiss="modal">关闭</button>
			                <input type="submit" class="btn btn-primary" value="添加"></input>
			            </div>
						</form>
			        </div><!-- /.modal-content -->
			    </div><!-- /.modal -->
			</div>

			<div class="right-table col-lg-10">​
                <table class="table table-striped">
                    <thead>
					<tr>

					</tr>
                    <tr>
                        <th>编号(已删除的客户）</th>
                        <th>姓名</th>
                        <th>电话</th>
						<th>地址</th>


                    </tr>
                    </thead>
                    <tbody>
                    <c:forEach items="${clientList1}" var="client">
						<c:if test="${client.cis == 0}">
                    <tr>

                    <td>${client.cid}</td>
                    <td>${client.cname}</td>
						<td>${client.ctel}</td>
                    <td>${client.caddress}</td>
                    <td><a href="#" data-target="#modify" data-toggle="modal" ><span class="glyphicon glyphicon-edit">修改</span></a>
                        <div class="modal fade" id="modify" tabindex="-1" role="dialog" aria-labelledby="myModalLabel" aria-hidden="true">
                        <div class="modal-dialog">
                        <div class="modal-content">
                        <div class="modal-header">
                        <button type="button" class="close" data-dismiss="modal" aria-hidden="true">&times;</button>
                        <h4 class="modal-title" id="myModalLabel">修改客户</h4>
                        </div>
                         <form action="${pageContext.request.contextPath}/client/updateClient/${client.cid}">
							 <%--<input type="hidden" name="ccid" value="${client.cid}"/>--%>
                        <div class="modal-body">
                            <div class="form-group">
								<%--姓名--%>
                                <label class="col-sm-3 control-label">客户姓名：</label>
                                <div class="col-sm-7">
                                    <input class="form-control" name="cname" type="text" placeholder=" ">
                                </div>

										<%--电话--%>
									<label class="col-sm-3 control-label">电话：</label>
									<div class="col-sm-7">
										<input class="form-control" name="ctel" type="text" placeholder=" ">
									</div>

										<%--地址--%>
									<label class="col-sm-3 control-label">地址：</label>
									<div class="col-sm-7">
										<input class="form-control" name="caddress" type="text" placeholder=" ">
									</div>



							</div>
                            <br/>
                            <br/>

                        </div>
                        <div class="modal-footer">
                        <button type="button" class="btn btn-default" data-dismiss="modal">关闭</button>
                        <input type="submit" class="btn btn-primary"></input>
                        </div>
                         </form>
                        </div><!-- /.modal-content -->
                        </div><!-- /.modal -->
                        </div>
                    </td>
                    <td><a href="${pageContext.request.contextPath}/client/recoverClient/${client.cid}" onclick="del()"><span class="glyphicon glyphicon-share-alt">恢复</span></a>
                        <script type="text/javascript">
                        function del(){
                        var msg=confirm("此操作回让该客户重新上岗，你确定恢复此记录吗？");
                        if(msg==true){
                        return true;
                        }else{
                        return false;
                        }
                        }
                        </script>
                    </td>
                    </tr>	 </c:if>
                    </c:forEach>
                    </tbody>
                </table>
            </div>
		</div>
		</div>
	</body>
</html>
