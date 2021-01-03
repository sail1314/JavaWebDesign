<%@ page import="cn.xb.bean.User" %><%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2020/12/30
  Time: 10:09
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" errorPage="error.html"%>
<html>
<head>
    <link rel="icon" href="images/logo1.png">

    <title>Mstore</title>

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
    <script type="text/javascript" src="js/jquery-1.9.0.min.js"></script>
    <script type="text/javascript" src="js/move-top.js"></script>
    <script type="text/javascript" src="js/easing.js"></script>
    <script type="text/javascript" src="js/jquery.nivo.slider.js"></script>
    <script type="text/javascript">
        $(window).load(function () {
            $('#slider').nivoSlider();
        });
    </script>
</head>

<body>

<nav class="nnavbar navbar-inverse">
    <div class="container-fluid">
        <!-- Brand and toggle get grouped for better mobile display -->
        <div class="navbar-header">
            <button type="button" class="navbar-toggle collapsed" data-toggle="collapse" data-target="#bs-example-navbar-collapse-1" aria-expanded="false">
                <span class="sr-only">Toggle navigation</span>
                <span class="icon-bar"></span>
                <span class="icon-bar"></span>
                <span class="icon-bar"></span>
            </button>
            <a class="navbar-brand" href="#"><font color="#ffd700">M</font>store</a>
        </div>

        <!-- Collect the nav links, forms, and other content for toggling -->
        <div class="collapse navbar-collapse" id="bs-example-navbar-collapse-1">
            <ul class="nav navbar-nav">
                <li><a href="index.jsp">首页</a></li>
                <li><a href="contact.html" target="_blank">电影</a></li>
                <li><a href="contact.html" target="_blank">影院</a></li>
                <li><a href="contact.html" target="_blank">榜单</a></li>
                <li><a href="contact.html" target="_blank">商城</a></li>
            </ul>
            <ul class="nav navbar-nav navbar-right">
                <li><a href="PersonServlet?name=${sessionScope.user.name}" target="_blank">${sessionScope.user.name}</a></li>
                <li><a href="index.jsp" target="_self">退出</a></li>
            </ul>
        </div><!-- /.navbar-collapse -->
    </div><!-- /.container-fluid -->
</nav>
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
                            <input type="text"size="50" class="form-control" placeholder="Search">
                        </div>
                        <button type="submit" class="btn btn-default">Submit</button>
                    </form>
                </div>

                <div class="clear"></div>
            </div>
            <div class="header_bottom">
                <div class="header_bottom_left">
                    <div class="categories">
                        <ul>
                            <h3>Categories</h3>
                            <li><a href="#">全部</a></li>
                            <li><a href="#">爱情</a></li>
                            <li><a href="#">喜剧</a></li>
                            <li><a href="#">动画</a></li>
                            <li><a href="#">恐怖</a></li>
                            <li><a href="#">惊悚</a></li>
                            <li><a href="#">科幻</a></li>
                            <li><a href="#">悬疑</a></li>
                            <li><a href="#">古装</a></li>
                            <li><a href="#">犯罪</a></li>
                            <li><a href="#">冒险</a></li>
                            <li><a href="#">战争</a></li>
                        </ul>
                    </div>
                </div>
                <div class="header_bottom_right">
                    <!------ Slider ------------>
                    <div class="slider">
                        <div class="slider-wrapper theme-default">
                            <div id="slider" class="nivoSlider">
                                <img src="images/1.jpg" data-thumb="images/1.jpg" alt=""/>
                                <img src="images/2.jpg" data-thumb="images/2.jpg" alt=""/>
                                <img src="images/3.jpg" data-thumb="images/3.jpg" alt=""/>
                                <img src="images/4.jpg" data-thumb="images/4.jpg" alt=""/>
                                <img src="images/5.jpg" data-thumb="images/5.jpg" alt=""/>
                            </div>
                        </div>
                    </div>
                    <!------End Slider ------------>
                </div>
                <div class="clear"></div>
            </div>
        </div>
    </div>
</div>
<!------------End Header ------------>

<div class="container-fluid">
    <div class="row">
        <div class="main">
            <div class="wrap">
                <div class="content">
                    <div class="content_top">
                        <div class="heading">
                            <h3>正在热映</h3>
                        </div>
                    </div>
                    <div class="section group">
                        <div class="grid_1_of_5 images_1_of_5">
                            <a href="preview.html"><img src="images/end-game.jpg" alt=""/></a>
                            <h2><a href="preview.html">End Game</a></h2>
                            <div class="price-details">
                                <div class="price-number">
                                    <p><span class="rupees">￥44RMB</span></p>
                                </div>
                                <div class="add-cart">
                                    <h4><a href="ShopServlet?username=${sessionScope.user.name}">购票</a></h4>
                                </div>
                                <div class="clear"></div>
                            </div>
                        </div>
                        <div class="grid_1_of_5 images_1_of_5">
                            <a href="preview.html"><img src="images/Sorority_Wars.jpg" alt=""/></a>
                            <h2><a href="preview.html">Sorority Wars</a></h2>
                            <div class="price-details">
                                <div class="price-number">
                                    <p><span class="rupees">￥30RMB</span></p>
                                </div>
                                <div class="add-cart">
                                    <h4><a href="ShopServlet?username=${sessionScope.user.name}">购票</a></h4>
                                </div>
                                <div class="clear"></div>
                            </div>

                        </div>
                        <div class="grid_1_of_5 images_1_of_5">
                            <a href="preview.html"><img src="images/New-Moon-The-Score-cover-twilight.jpg" alt=""/></a>
                            <h2><a href="preview.html">Twilight New Moon</a></h2>
                            <div class="price-details">
                                <div class="price-number">
                                    <p><span class="rupees">￥40RMB</span></p>
                                </div>
                                <div class="add-cart">
                                    <h4><a href="ShopServlet?username=${sessionScope.user.name}">购票</a></h4>
                                </div>
                                <div class="clear"></div>
                            </div>

                        </div>
                        <div class="grid_1_of_5 images_1_of_5">
                            <a href="preview.html"><img src="images/avatar_movie.jpg" alt=""/></a>
                            <h2><a href="preview.html">Avatar</a></h2>
                            <div class="price-details">
                                <div class="price-number">
                                    <p><span class="rupees">￥34RMB</span></p>
                                </div>
                                <div class="add-cart">
                                    <h4><a href="ShopServlet?username=${sessionScope.user.name}">购票</a></h4>
                                </div>
                                <div class="clear"></div>
                            </div>
                        </div>
                        <div class="grid_1_of_5 images_1_of_5">
                            <a href="preview.html"><img src="images/black-swan.jpg" alt=""/></a>
                            <h2><a href="preview.html">Black Swan</a></h2>
                            <div class="price-details">
                                <div class="price-number">
                                    <p><span class="rupees">￥33RMB</span></p>
                                </div>
                                <div class="add-cart">
                                    <h4><a href="ShopServlet?username=${sessionScope.user.name}">购票</a></h4>
                                </div>
                                <div class="clear"></div>
                            </div>
                        </div>
                    </div>
                    <div class="content_bottom">
                        <div class="heading">
                            <h3>即将上映</h3>
                        </div>
                    </div>
                    <div class="section group">
                        <div class="grid_1_of_5 images_1_of_5">
                            <a href="preview.html"><img src="images/beauty_and_the_beast.jpg" alt=""/></a>
                            <h2><a href="preview.html">Beauty</a></h2>
                            <div class="price-details">
                                <div class="price-number">
                                    <p><span class="rupees">￥29RMB</span></p>
                                </div>
                                <div class="add-cart">
                                    <h4><a href="ShopServlet?username=${sessionScope.user.name}">预售</a></h4>
                                </div>
                                <div class="clear"></div>
                            </div>

                        </div>
                        <div class="grid_1_of_5 images_1_of_5">
                            <a href="preview.html"><img src="images/Eclipse.jpg" alt=""/></a>
                            <h2><a href="preview.html">Eclipse</a></h2>
                            <div class="price-details">
                                <div class="price-number">
                                    <p><span class="rupees">￥44RMB</span></p>
                                </div>
                                <div class="add-cart">
                                    <h4><a href="ShopServlet?username=${sessionScope.user.name}">预售</a></h4>
                                </div>
                                <div class="clear"></div>
                            </div>

                        </div>
                        <div class="grid_1_of_5 images_1_of_5">
                            <a href="preview.html"><img src="images/Coraline.jpg" alt=""/></a>
                            <h2><a href="preview.html">Coraline</a></h2>
                            <div class="price-details">
                                <div class="price-number">
                                    <p><span class="rupees">￥35RMB</span></p>
                                </div>
                                <div class="add-cart">
                                    <h4><a href="ShopServlet?username=${sessionScope.user.name}">预售</a></h4>
                                </div>
                                <div class="clear"></div>
                            </div>

                        </div>
                        <div class="grid_1_of_5 images_1_of_5">
                            <a href="preview.html"><img src="images/Unstoppable.jpg" alt=""/></a>
                            <h2><a href="preview.html">Unstoppable</a></h2>
                            <div class="price-details">
                                <div class="price-number">
                                    <p><span class="rupees">￥37RMB</span></p>
                                </div>
                                <div class="add-cart">
                                    <h4><a href="ShopServlet?username=${sessionScope.user.name}">预售</a></h4>
                                </div>
                                <div class="clear"></div>
                            </div>
                        </div>
                        <div class="grid_1_of_5 images_1_of_5">
                            <a href="preview.html"><img src="images/Priest.jpg" alt=""/></a>
                            <h2><a href="preview.html">Priest 3D</a></h2>
                            <div class="price-details">
                                <div class="price-number">
                                    <p><span class="rupees">￥31RMB</span></p>
                                </div>
                                <div class="add-cart">
                                    <h4><a href="ShopServlet?username=${sessionScope.user.name}">预售</a></h4>
                                </div>
                                <div class="clear"></div>
                            </div>
                        </div>
                    </div>
                </div>
            </div>
        </div>
    </div>
</div>

<iframe src="foot.jsp" width="100%" height="260px" scrolling="no" frameborder="0"></iframe>

</body>
</html>
