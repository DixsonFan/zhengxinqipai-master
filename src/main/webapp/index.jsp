<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2019/7/26
  Time: 13:56
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <meta charset="UTF-8">
    <title></title>
    <link rel="stylesheet" 	href="css/bootstrap.css" />
    <link rel="stylesheet" href="css/bootstrap.min.css" />
    <script src="js/jquery.min.js"></script>
    <script src="js/bootstrap.min.js"></script>
    <script src="js/bootstrap.js"></script>
    <link rel="stylesheet" href="https://cdn.staticfile.org/twitter-bootstrap/3.3.7/css/bootstrap.min.css">
    <script src="https://cdn.staticfile.org/jquery/2.1.1/jquery.min.js"></script>
    <script src="https://cdn.staticfile.org/twitter-bootstrap/3.3.7/js/bootstrap.min.js"></script>


<style type="text/css">
    body{
        background-image: url(../img/bg1.jpg);
        background-repeat: no-repeat;
    }
    .top{
        height: 30px;
        width: 100%;
        background-color: cadetblue;
    }
    #span1{
        font-size: 15px;
        color: white;
        float: left;
        line-height: 30px;
    }
    #span2{
        font-size: 15px;
        color: white;
        float:right;
        line-height: 30px;
        text-decoration: none;
    }
    .second{
        position: absolute;
        left: 0;
        top:35px;
        height: 150px;
        width:100%;
        line-height: 300px;
        text-align: center;
    }
    .second img{
        width: 50px;
        height: 50px;
        border-radius: 50%;
    }
    .middleLeft{
        position: absolute;
        left: 30%;
        top:300px;
        width: 15%;
    }
    .middleLeft img{
        width: 100%;
        height: 250px;
        border-radius: 5px;
        float: right;
    }
    .middleRight{
        position: absolute;
        left: 45%;
        top: 300px;
        width: 30%;

    }
</style>
    <script type="text/javascript">
        function check() {
            var username = document.getElementById("username").value;
            var password = document.getElementById("password").value;
            if(username=="123456" && password=="123456")
            {
            // alert("成功");
                return true;
            }
            else
            {
                alert("用户名或密码错误");
                return false;
            }
        }
    </script>
</head>
<body>
<div class="top">
    <span id="span1">&nbsp;&nbsp;&nbsp;&nbsp;欢迎登录后台管理界面</span>
    <a id="span2" href="#">关于</a>
    <a id="span2" href="#">帮助&nbsp;&nbsp;&nbsp;&nbsp;</a>
    <a id="span2" href="#">回首页&nbsp;&nbsp;&nbsp;&nbsp;</a>
</div>
<div class="second">
    <p><img src="../img/icon1.jpg" style="vertical-align: middle;" >
        <font style="color: white;font-family: '微软雅黑';font-size: 20px;">&nbsp;&nbsp;江岸日用化工管理</font></p>
</div>

<div class="middleLeft"><img src="../img/logo.jpg"></div>
<form method="post" action="${pageContext.request.contextPath}/t_emp/login" onsubmit="return check();"  >
    <div class="middleRight">
        <div class="panel panel-primary" style="height: 250px;">
            <div class="panel-heading">
                <h3 class="panel-title" style="height: 25px;text-align: center;line-height: 25px;">用户登录</h3>
            </div>
            <div class="panel-body" style="height: 200px;">
                <div><br>
                    <div class="input-group">
                        <span class="input-group-addon" style="width: 60px;" >用户名</span>
                        <input type="text" class="form-control"  id="username" name="username" placeholder="username">
                    </div>
                </div>
                <br>
                <div>
                    <div class="input-group">
                        <span class="input-group-addon" style="width:60px;" >密&nbsp;码&nbsp;&nbsp;&nbsp;</span>
                        <input type="password" class="form-control" id="password" name="password" placeholder="password">
                    </div>
                </div>
                <br>
                <input type="submit" class="btn btn-primary" value="登录"></input>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
                <label>
                    <input type="radio" name="optionsRadios" id="optionsRadios1"
                           value="option1" checked> 记住密码&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
                </label>
                <a href="#">忘记密码？</a>
            </div>
        </div>
    </div>
</form>
</body>
</html>