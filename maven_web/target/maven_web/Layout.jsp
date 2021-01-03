<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2021/1/2
  Time: 17:50
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" errorPage="error.html" %>
<html>
<html>
<head>
    <link rel="icon" href="images/logo1.png">
    <!-- basic -->
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <!-- mobile metas -->
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <meta name="viewport" content="initial-scale=1, maximum-scale=1">
    <!-- site metas -->
    <title>Mstore</title>
    <meta name="keywords" content="">
    <meta name="description" content="">
    <meta name="author" content="">
    <!-- bootstrap css -->
    <link rel="stylesheet" href="css/bootstrap.min.css"/>
    <!-- site css -->
    <link rel="stylesheet" href="style.css"/>
    <!-- responsive css -->
    <link rel="stylesheet" href="css/responsive.css"/>
    <!-- color css -->
    <link rel="stylesheet" href="css/color.css"/>
    <!-- select bootstrap -->
    <link rel="stylesheet" href="css/bootstrap-select.css"/>
    <!-- scrollbar css -->
    <link rel="stylesheet" href="css/perfect-scrollbar.css"/>
    <!-- custom css -->
    <link rel="stylesheet" href="css/custom.css"/>
    <!-- calendar file css -->
    <link rel="stylesheet" href="js/semantic.min.js"/>
    <!-- fancy box js -->
    <link rel="stylesheet" href="css/jquery.fancybox.css"/>
</head>
<body>
<%--头部--%>
<iframe src="top.jsp" width="100%" height="48" scrolling="no" frameborder="0"></iframe>

<%--主体--%>
<div class="full_container">
    <div class="inner_container">
        <!-- right content -->
        <div *id="content">
            <!-- dashboard inner -->
            <div class="midde_cont">
                <div class="container-fluid">
                    <div class="row column_title">
                        <div class="col-md-12">
                            <div class="page_title">
                                <h2>购票</h2>
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
                                        <h2>影院列表&nbsp;&nbsp;&nbsp;&nbsp;日期：&nbsp;&nbsp;&nbsp;今天</h2>
                                    </div>
                                </div>
                                <div class="full inbox_inner_section">
                                    <div class="row">
                                        <div class="col-md-12">
                                            <div class="full padding_infor_info">
                                                <div class="mail-box">
                                                    <aside class="lg-side">
                                                        <div class="inbox-body">

                                                            <table class="table table-inbox table-hover">
                                                                <tbody>
                                                                <tr class="">
                                                                    <td class="inbox-small-cells">放映时间</td>
                                                                    <td class="view-message dont-show"><strong>语言版本</strong></td>
                                                                    <td class="inbox-small-cells">放映厅</td>
                                                                    <td class="view-message"><strong>售价</strong></td>
                                                                    <td class="view-message inbox-small-cells"></td>
                                                                    <td class="view-message text-right"><strong></strong></td>
                                                                </tr>
                                                                <c:forEach items="${sessionScope.layoutList}" var="list" >
                                                                    <tr class="">
                                                                        <td class="inbox-small-cells"><fmt:formatDate value="${list.time}" pattern="HH:mm"/></td>
                                                                        <td class="view-message dont-show">${list.language}</td>
                                                                        <td class="view-message">${list.name}</td>
                                                                        <td class="view-message">￥33 RMB</td>
                                                                        <td class="view-message">
                                                                            <div class="form-group" style="text-align: center">
                                                                                <a href="ShopOrderServlet?cid=${list.cid}&username=${sessionScope.user.name}&lid=${list.id}&fid=${list.fid}">
                                                                                    <input class="btn btn-primary" type="submit" value="订票" />
                                                                                </a>
                                                                            </div>
                                                                        </td>
                                                                        <td class="view-message"></td>
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


<%--尾部--%>
<iframe src="foot.jsp" width="100%" height="260px" scrolling="no" frameborder="0"></iframe>

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
<!-- fancy box js -->
<script src="js/jquery-3.3.1.min.js"></script>
<script src="js/jquery.fancybox.min.js"></script>
<!-- custom js -->
<script src="js/custom.js"></script>
<!-- calendar file css -->
<script src="js/semantic.min.js"></script>
</body>
</html>
