<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<!-- Preloader -->
    <div id="preloader">
        <div id="status">&nbsp;</div>
    </div>
    <!-- TOP NAVBAR -->
    <nav role="navigation" class="navbar navbar-static-top">
        <div class="container-fluid">
            <!-- Brand and toggle get grouped for better mobile display -->
            <div class="navbar-header">
                <button data-target="#bs-example-navbar-collapse-1" data-toggle="collapse" class="navbar-toggle" type="button">
                    <span class="entypo-menu"></span>
                </button>
                <button class="navbar-toggle toggle-menu-mobile toggle-left" type="button">
                    <span class="entypo-list-add"></span>
                </button>

            </div>


            <!-- Collect the nav links, forms, and other content for toggling -->
            <div id="bs-example-navbar-collapse-1" class="collapse navbar-collapse">
                <ul class="nav navbar-nav">
                    <li><a  href="javascript:void(0)" onclick="location.reload()"><i data-toggle="tooltip" data-placement="bottom" title="刷新" style="font-size:20px;" class="entypo-home"></i></a>
                    </li>
                </ul>
s
                <div id="nt-title-container" class="navbar-left running-text visible-lg">
                <ul class="date-top">
                    <li class="entypo-calendar" style="margin-right:5px"></li>
                    <li id="data"></li>
                </ul>
                <ul id="digital-clock" class="digital">
                    <li class="entypo-clock" style="margin-right:5px"></li>
                    <li id="shi"></li>
                    <li>:</li>
                    <li id="fen"></li>
                    <li>:</li>
                    <li id="miao"></li>
	                <li id="wu"></li>
                </ul>
                <ul id="nt-title">
                <iframe width="500" scrolling="no" height="15" frameborder="0" allowtransparency="true" src="//i.tianqi.com/index.php?c=code&id=11&color=%23FFFFFF&icon=1&py=chanchengqu&site=12"></iframe>
                </ul>
            </div>

                <ul style="margin-right:0;" class="nav navbar-nav navbar-right">
                    <li>
                        <a data-toggle="dropdown" class="dropdown-toggle" href="#">
                            ${admin }&nbsp&nbsp&nbsp:&nbsp&nbsp&nbsp${userName} <b class="caret"></b>
                        </a>
                        <ul style="margin-top:14px;" role="menu" class="dropdown-setting dropdown-menu">
                            <li>
                                <a href="#">
                                    <span class="entypo-user"></span>&#160;&#160;个人信息</a>
                            </li>
                            <li>
                                <a href="#">
                                    <span class="entypo-vcard"></span>&#160;&#160;账户设置</a>
                            </li>
                            <li>
                                <a href="#">
                                    <span class="entypo-lifebuoy"></span>&#160;&#160;Help</a>
                            </li>
                            <li class="divider"></li>
                            <li>
                                <a href="http://themeforest.net/item/apricot-navigation-admin-dashboard-template/7664475?WT.ac=category_item&WT.z_author=themesmile">
                                    <span class="entypo-basket"></span>&#160;&#160; 采购</a>
                            </li>
                        </ul>
                    </li>
                    <li>
                        <a data-toggle="dropdown" class="dropdown-toggle" href="#">
                            <span class="icon-gear"></span>&#160;&#160;背景</a>
                        <ul role="menu" class="dropdown-setting dropdown-menu">
                            <li class="theme-bg">
                                <div id="button-bg"></div>
                                <div id="button-bg2"></div>
                                <div id="button-bg3"></div>
                                <div id="button-bg5"></div>
                                <div id="button-bg6"></div>
                                <div id="button-bg7"></div>
                                <div id="button-bg8"></div>
                                <div id="button-bg9"></div>
                                <div id="button-bg10"></div>
                                <div id="button-bg11"></div>
                                <div id="button-bg12"></div>
                                <div id="button-bg13"></div>
                            </li>
                        </ul>
                    </li>
                </ul>

            </div>
            <!-- /.navbar-collapse -->
        </div>
        <!-- /.container-fluid -->
    </nav>
