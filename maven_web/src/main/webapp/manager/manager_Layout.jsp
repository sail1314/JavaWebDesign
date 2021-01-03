<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" errorPage="404_error.html"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<html lang="en">
<head>
    <link rel="icon" href="../images/logo1.png">
    <!-- basic -->
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <!-- mobile metas -->
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <meta name="viewport" content="initial-scale=1, maximum-scale=1">
    <!-- site metas -->
    <title>安排管理-Mstore</title>
    <meta name="keywords" content="">
    <meta name="description" content="">
    <meta name="author" content="">
    <!-- bootstrap css -->
    <link rel="stylesheet" href="../css/bootstrap.min.css"/>
    <!-- site css -->
    <link rel="stylesheet" href="style.css"/>
    <!-- responsive css -->
    <link rel="stylesheet" href="../css/responsive.css"/>
    <!-- color css -->
    <link rel="stylesheet" href="../css/color.css"/>
    <!-- select bootstrap -->
    <link rel="stylesheet" href="../css/bootstrap-select.css"/>
    <!-- scrollbar css -->
    <link rel="stylesheet" href="../css/perfect-scrollbar.css"/>
    <!-- custom css -->
    <link rel="stylesheet" href="../css/custom.css"/>
    <!-- calendar file css -->
    <link rel="stylesheet" href="../js/semantic.min.js"/>
    <!-- fancy box js -->
    <link rel="stylesheet" href="../css/jquery.fancybox.css"/>

</head>
<body class="inner_page email_page">
<div class="full_container">
    <div class="inner_container">
        <!-- Sidebar  -->
        <nav id="sidebar">
            <div class="sidebar_blog_1">
                <div class="sidebar-header">
                    <div class="logo_section">
                        <a href="index.html"><img class="logo_icon img-responsive" src="images/logo/logo_icon.png" alt="#"/></a>
                    </div>
                </div>
                <div class="sidebar_user_info">
                    <div class="icon_setting"></div>
                    <div class="user_profle_side">
                        <div class="user_img"><img class="img-responsive" src="../images/manager_img.jpg" alt="#"/>
                        </div>
                        <div class="user_info">
                            <h6>超级管理员</h6>
                            <p><span class="online_animation"></span> 在线</p>
                        </div>
                    </div>
                </div>
            </div>
            <div class="sidebar_blog_2">
                <h4>General</h4>
                <ul class="list-unstyled components">
                    <li class="active">
                        <a href="../UserManagerServlet">
                            <i class="fa fa-dashboard yellow_color"></i>
                            <span>用户管理</span>
                        </a>
                    </li>
                    <li>
                        <a href="../LayoutManagerServlet">
                            <i class="fa fa-clock-o orange_color"></i>
                            <span>安排电影</span>
                        </a>
                    </li>
                    <li>
                        <a href="../CinemaManagerServlet">
                            <i class="fa fa-diamond purple_color"></i>
                            <span>影院管理</span>
                        </a>
                    </li>
                    <li>
                        <a href="../OrderManagerServlet">
                            <i class="fa fa-table purple_color2"></i>
                            <span>订单管理</span>
                        </a>
                    </li>
                    <li>
                        <a href="../FilmManagerServlet">
                            <i class="fa fa-object-group blue2_color"></i>
                            <span>影片管理</span>
                        </a>
                    </li>
                    <li>
                        <a href="charts.html">
                            <i class="fa fa-bar-chart-o green_color"></i>
                            <span>Charts</span>
                        </a>
                    </li>
                    <li>
                        <a href="settings.html">
                            <i class="fa fa-cog yellow_color"></i>
                            <span>Settings</span>
                        </a>
                    </li>
                </ul>
            </div>
        </nav>
        <!-- end sidebar -->
        <!-- right content -->
        <div id="content">
            <!-- topbar -->
            <div class="topbar">
                <nav class="navbar navbar-expand-lg navbar-light">
                    <div class="full">
                        <button type="button" id="sidebarCollapse" class="sidebar_toggle"><i class="fa fa-bars"></i>
                        </button>
                        <div class="right_topbar">
                            <div class="icon_info">
                                <ul>
                                    <li><a href="#"><i class="fa fa-bell-o"></i><span class="badge">2</span></a></li>
                                    <li><a href="#"><i class="fa fa-question-circle"></i></a></li>
                                    <li><a href="#"><i class="fa fa-envelope-o"></i><span class="badge">3</span></a>
                                    </li>
                                </ul>
                            </div>
                        </div>
                    </div>
                </nav>
            </div>
            <!-- end topbar -->
            <!-- dashboard inner -->
            <div class="midde_cont">
                <div class="container-fluid">
                    <div class="row column_title">
                        <div class="col-md-12">
                            <div class="page_title">
                                <h2>管理中心</h2>
                            </div>
                        </div>
                    </div>
                    <!-- row -->
                    <div class="row">
                        <!-- table section -->
                        <div class="col-md-12">
                            <div class="white_shd full margin_bottom_30">
                                <div class="full graph_head">
                                    <div class="heading1 margin_0">
                                        <h2>安排影片</h2>
                                    </div>
                                </div>
                                <div class="full inbox_inner_section">
                                    <div class="row">
                                        <div class="col-md-12">
                                            <div class="full padding_infor_info">
                                                <div class="mail-box">
                                                    <aside class="lg-side">
                                                        <div class="inbox-body">
                                                            <div class="mail-option">
                                                                <div class="chk-all">
                                                                    <div class="btn-group">
                                                                        <a href="user/addUser.html" class="btn mini all">添加</a>
                                                                    </div>
                                                                </div>
                                                                <div class="btn-group hidden-phone">
                                                                    <a href="user/updataUser.html" class="btn mini blue">修改</a>
                                                                </div>
                                                                <div class="btn-group hidden-phone">
                                                                    <a href="user/deleteUser.html" class="btn mini blue">删除</a>
                                                                </div>
                                                                <div class="btn-group hidden-phone">
                                                                    <a href="user/findUser.html" class="btn mini blue">查找</a>
                                                                </div>

                                                                <ul class="unstyled inbox-pagination">
                                                                    <li><span>1-50 of 234</span></li>
                                                                    <li>
                                                                        <a class="np-btn" href="#"><i
                                                                                class="fa fa-angle-left  pagination-left"></i></a>
                                                                    </li>
                                                                    <li>
                                                                        <a class="np-btn" href="#"><i
                                                                                class="fa fa-angle-right pagination-right"></i></a>
                                                                    </li>
                                                                </ul>
                                                            </div>

                                                            <table class="table table-inbox table-hover">
                                                                <tbody>
                                                                <tr class="">
                                                                    <td class="inbox-small-cells">编号</td>
                                                                    <td class="view-message"><strong>放映时间</strong></td>
                                                                    <td class="view-message dont-show"><strong>语言版本</strong></td>
                                                                    <td class="inbox-small-cells">放映厅</td>
                                                                    <td class="view-message"><strong>售价</strong></td>
                                                                    <td class="view-message inbox-small-cells">影院名</td>
                                                                    <td class="view-message text-right"><strong>影片名</strong></td>
                                                                </tr>
                                                                <c:forEach items="${sessionScope.layoutList}" var="list" >
                                                                    <tr class="">
                                                                        <td class="inbox-small-cells">${list.id}</td>
                                                                        <td class="inbox-small-cells"><fmt:formatDate value="${list.time}" pattern="HH:mm"/></td>
                                                                        <td class="view-message dont-show">${list.language}</td>
                                                                        <td class="view-message">${list.name}</td>
                                                                        <td class="view-message">￥${sessionScope.film[list.fid-1].price} RMB</td>
                                                                        <td class="view-message inbox-small-cells">${sessionScope.cinema[list.cid-1].name}</td>
                                                                        <td class="view-message text-right">${sessionScope.film[list.fid-1].name}</td>
                                                                    </tr>
                                                                </c:forEach>


                                                                </tbody>
                                                            </table>
                                                        </div>
                                                    </aside>
                                                </div>
                                            </div>
                                        </div>
                                    </div>
                                </div>
                            </div>
                        </div>
                        <!-- table section -->
                    </div>
                </div>
                <!-- footer -->
                <div class="container-fluid">
                    <div class="footer">
                        <p>Copyright &copy; 2020.Company name All rights reserved.</p>
                    </div>
                </div>
            </div>
            <!-- end dashboard inner -->
        </div>
    </div>
    <!-- model popup -->
</div>
<!-- jQuery -->
<script src="../js/jquery.min.js"></script>
<script src="../js/popper.min.js"></script>
<script src="../js/bootstrap.min.js"></script>
<!-- wow animation -->
<script src="../js/animate.js"></script>
<!-- select country -->
<script src="../js/bootstrap-select.js"></script>
<!-- owl carousel -->
<script src="../js/owl.carousel.js"></script>
<!-- chart js -->
<script src="../js/Chart.min.js"></script>
<script src="../js/Chart.bundle.min.js"></script>
<script src="../js/utils.js"></script>
<script src="../js/analyser.js"></script>
<!-- nice scrollbar -->
<script src="../js/perfect-scrollbar.min.js"></script>
<script>
    var ps = new PerfectScrollbar('#sidebar');
</script>
<!-- fancy box js -->
<script src="../js/jquery-3.3.1.min.js"></script>
<script src="../js/jquery.fancybox.min.js"></script>
<!-- custom js -->
<script src="../js/custom.js"></script>
<!-- calendar file css -->
<script src="../js/semantic.min.js"></script>
</body>
</html>