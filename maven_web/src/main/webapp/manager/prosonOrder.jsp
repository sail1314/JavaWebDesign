<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" errorPage="404_error.html"%>
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
    <title>个人中心-Mstore</title>
    <meta name="keywords" content="">
    <meta name="description" content="">
    <meta name="author" content="">
    <!-- bootstrap css -->
    <link rel="stylesheet" href="css/bootstrap.min.css" />
    <!-- site css -->
    <link rel="stylesheet" href="style.css" />
    <!-- responsive css -->
    <link rel="stylesheet" href="css/responsive.css" />
    <!-- color css -->
    <link rel="stylesheet" href="css/colors.css" />
    <!-- select bootstrap -->
    <link rel="stylesheet" href="css/bootstrap-select.css" />
    <!-- scrollbar css -->
    <link rel="stylesheet" href="css/perfect-scrollbar.css" />
    <!-- custom css -->
    <link rel="stylesheet" href="css/custom.css" />
    <!-- calendar file css -->
    <link rel="stylesheet" href="js/semantic.min.js" />
</head>
<body class="inner_page profile_page">
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
                        <a href="user/updataUser.html">
                            <i class="fa fa-dashboard yellow_color"></i>
                            <span>修改个人信息</span>
                        </a>
                    </li>
                    <li>
                        <a href="../LayoutManagerServlet">
                            <i class="fa fa-clock-o orange_color"></i>
                            <span>订单记录</span>
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
                                <h2>个人中心</h2>
                            </div>
                        </div>
                    </div>
                    <!-- row -->
                    <div class="row column1">
                        <div class="col-md-2"></div>
                        <div class="col-md-8">
                            <div class="white_shd full margin_bottom_30">
                                <div class="full graph_head">
                                    <div class="heading1 margin_0">
                                        <h2>个人信息</h2>
                                    </div>
                                </div>
                                <div class="full price_table padding_infor_info">
                                    <div class="row">
                                        <!-- user profile section -->
                                        <!-- profile image -->
                                        <div class="col-lg-12">
                                            <div class="full dis_flex center_text">
                                                <div class="profile_img"><img width="180" class="rounded-circle" src="../images/manager_img.jpg" alt="#" /></div>
                                                <div class="profile_contant">
                                                    <div class="contact_inner">
                                                        <h3>${sessionScope.proson.name}</h3>
                                                        <p><strong>About: </strong>Frontend Developer</p>
                                                        <ul class="list-unstyled">
                                                            <li><i class="fa fa-envelope-o"></i> : test@gmail.com</li>
                                                            <li><i class="fa fa-phone"></i> : 987 654 3210</li>
                                                        </ul>
                                                    </div>
                                                    <div class="user_progress_bar">
                                                        <div class="progress_bar">
                                                            <!-- Skill Bars -->
                                                            <span class="skill" style="width:85%;">Web Applications <span class="info_valume">85%</span></span>
                                                            <div class="progress skill-bar ">
                                                                <div class="progress-bar progress-bar-animated progress-bar-striped" role="progressbar" aria-valuenow="85" aria-valuemin="0" aria-valuemax="100" style="width: 85%;">
                                                                </div>
                                                            </div>
                                                            <span class="skill" style="width:78%;">Website Design <span class="info_valume">78%</span></span>
                                                            <div class="progress skill-bar">
                                                                <div class="progress-bar progress-bar-animated progress-bar-striped" role="progressbar" aria-valuenow="78" aria-valuemin="0" aria-valuemax="100" style="width: 78%;">
                                                                </div>
                                                            </div>
                                                            <span class="skill" style="width:47%;">Automation & Testing <span class="info_valume">47%</span></span>
                                                            <div class="progress skill-bar">
                                                                <div class="progress-bar progress-bar-animated progress-bar-striped" role="progressbar" aria-valuenow="54" aria-valuemin="0" aria-valuemax="100" style="width: 54%;">
                                                                </div>
                                                            </div>
                                                            <span class="skill" style="width:65%;">UI / UX <span class="info_valume">65%</span></span>
                                                            <div class="progress skill-bar">
                                                                <div class="progress-bar progress-bar-animated progress-bar-striped" role="progressbar" aria-valuenow="65" aria-valuemin="0" aria-valuemax="100" style="width: 65%;">
                                                                </div>
                                                            </div>
                                                        </div>
                                                    </div>
                                                </div>
                                            </div>
                                        </div>
                                    </div>
                                </div>
                            </div>
                            <div class="col-md-2"></div>
                        </div>
                        <!-- end row -->
                    </div>
                    <!-- footer -->
                    <div class="container-fluid">
                        <div class="row">
                            <div class="footer">
                                <p>Copyright &copy; 2020.Company name All rights reserved.</p>
                            </div>
                        </div>
                    </div>
                </div>
                <!-- end dashboard inner -->
            </div>
        </div>
    </div>
</div>
<!-- jQuery -->
<script src="js/jquery.min.js"></script>
<script src="js/popper.min.js"></script>
<script src="js/bootstrap.min.js"></script>
<!-- wow animation -->
<script src="js/animate.js"></script>
<!-- select country -->
<script src="js/bootstrap-select.js"></script>
<!-- owl carousel -->
<script src="js/owl.carousel.js"></script>
<!-- chart js -->
<script src="js/Chart.min.js"></script>
<script src="js/Chart.bundle.min.js"></script>
<script src="js/utils.js"></script>
<script src="js/analyser.js"></script>
<!-- nice scrollbar -->
<script src="js/perfect-scrollbar.min.js"></script>
<script>
    var ps = new PerfectScrollbar('#sidebar');
</script>
<!-- custom js -->
<script src="js/custom.js"></script>
<!-- calendar file css -->
<script src="js/semantic.min.js"></script>
</body>
</html>