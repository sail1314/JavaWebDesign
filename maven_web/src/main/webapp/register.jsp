<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2020/12/28
  Time: 16:22
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" errorPage="error.html" %>
<html>
<head>
    <link rel="icon" href="images/logo1.png">

    <title>注册 - Mstore</title>

    <link href="css/bootstrap.min.css" rel="stylesheet">

    <link rel="stylesheet" href="css/font-awesome.min.css">

    <!-- jQuery (Bootstrap 的所有 JavaScript 插件都依赖 jQuery，所以必须放在前边) -->
    <script src="js/jquery-3.2.1.min.js"></script>
    <!-- 加载 Bootstrap 的所有 JavaScript 插件。你也可以根据需要只加载单个插件。 -->
    <script src="js/bootstrap.min.js"></script>

    <%--    链接外部样式表自己的--%>
    <link type="text/css" rel="stylesheet" href="css/myBody.css"/>

    <meta http-equiv="Content-Type" content="text/html; charset=utf-8"/>
    <meta name="viewport" content="width=device-width, initial-scale=1, maximum-scale=1">
    <link href="css/style.css" rel="stylesheet" type="text/css" media="all"/>
    <link href="css/slider.css" rel="stylesheet" type="text/css" media="all"/>
<%--    <script type="text/javascript" src="js/jquery-1.9.0.min.js"></script>--%>
    <script type="text/javascript" src="js/move-top.js"></script>
    <script type="text/javascript" src="js/easing.js"></script>
<%--    <script type="text/javascript" src="js/jquery.nivo.slider.js"></script>--%>

    <script type="text/javascript">

        <!-- 利用script语句刷新验证码 -->
        function changeImg(img) {
            img.src=img.src+"?"+(new Date().getDate())
        }
    </script>

    <script crossorigin="anonymous" src="https://cdn.bootcdn.net/ajax/libs/jquery/3.5.1/jquery.js"></script>
    <style>
        #sp{
            font: 12px "隶书";
        }
    </style>
</head>
<body>
<%--头部--%>
<iframe src="top.jsp" width="100%" height="48" scrolling="no" frameborder="0"></iframe>

<div class="container-fluid">
    <div class="row">
        <div class="wrap">
            <div class="header_top">
                <div class="logo">
                    <a href="index.jsp"><img src="images/logo.png" alt=""/></a>
                </div>
                <div class="header_top_right">
                    <form class="navbar-form navbar-left">
                        <div class="form-group">
                            <input type="text" size="50" class="form-control" placeholder="Search">
                        </div>
                        <button type="submit" class="btn btn-default">Submit</button>
                    </form>
                </div>
            </div>
        </div>
    </div>
</div>

<%--主体--%>
<div class="container-fluid">
    <div class="row">
        <div class="main">
            <div class="wrap">
                <div class="content">
                    <div class="content_top">
                        <div class="back-links">
                            <p style="width: 300px"><a href="login.jsp" class="active">已有账号？欢迎登录</a></p>
                        </div>
                        <div class="clear"></div>
                    </div>
                    <div class="section group">
                        <div class="col span_2_of_3">
                            <div class="contact-form">
                                <h2>Mstore注册</h2>
                                <form method="post" action="RegisterServlet">
                                    <div>
                                        <span><label>账号</label></span>
                                        <input style="margin: 0px" id="un" name="username" placeholder="账号必须字母开头，可以有数字，必须6位以上" type="text"/><font id="sp"></font>
                                    </div>
                                    <div>
                                        <span><label>密码</label></span>
                                        <span><input id="pw" name="password" type="password"/></span><span id="sp1"></span>
                                    </div>
                                    <div>
                                        <span><label>验证码</label></span>
                                        <span><input style="width: 98%" type="text" name="yanzhenma" id="yzm1"></span>
                                        <img id="conform_img" src="login.do"  onclick="changeImg(this)">
                                    </div>

                                    <div>
                                        <span><input type="submit" value="Submit"  class="mybutton"></span>
                                    </div>
                                </form>
                            </div>
                        </div>
                        <div class="col span_1_of_3">
                            <div class="contact_info">
                                <h2>欢迎加入Mstore</h2>
                                <div class="map">
                                    <iframe width="100%" height="300" frameborder="0" scrolling="no" marginheight="0" marginwidth="0" src="images/1.jpg"></iframe><br><small><a href="#" style="color:#888;text-align:left;font-size:0.85em">View Larger Map</a></small>
                                </div>
                            </div>
                        </div>
                    </div>
                </div>
            </div>
        </div>

<%--        ajax来进行判断账号密码的格式和账号是否已存在--%>
        <script type="text/javascript">
            //失去焦点
            $(function () {
                $("#un").blur(function () {

                    var username = $("#un").val();

                    // 发送ajax请求
                    $.get("AJAXServlet",{username:username},function (data) {
                        if (data.userExsit){
                            //用户名已存在
                            $("#sp").css("color","red");
                            $("#sp").html(data.msg);
                        } else {
                            //用户名不存为
                            $("#sp").css("color","green");
                            $("#sp").html(data.msg);
                        }
                    },"json")
                })
            });


        </script>
    </div>
</div>


<%--尾部--%>
<iframe src="foot.jsp" width="100%" height="260px" scrolling="no" frameborder="0"></iframe>

</body>
</html>
