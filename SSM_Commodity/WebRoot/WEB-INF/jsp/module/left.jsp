<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
 <div id="skin-select">
        <div id="logo">
         <h1>商品进销存<span>v1.0</span></h1>
        </div>

        <a id="toggle">
            <span class="entypo-menu"></span>
        </a>

        <div class="search-hover">
            <form id="demo-2">
                <input type="search" placeholder="Search Menu..." class="id_search">
            </form>
        </div>

        <div class="skin-part">
            <div id="tree-wrap">
                <div class="side-bar">
                    <ul class="topnav menu-left-nest">
                        <li>
                            <a href="#" style="border-left:0px solid!important;" class="title-menu-left">

                                <span class="">商品</span>
                                <i data-toggle="tooltip" class="entypo-cog pull-right config-wrap"></i>

                            </a>
                        </li>

                        <li>
                            <a class="tooltip-tip ajax-load" href="#" title="商品详情">
                                <i class="icon icon-align-justify"></i>
                                <span>商品详情</span>

                            </a>
                            <ul>
                                <li>
                                    <a class="tooltip-tip2 ajax-load" href="javascript:void(0);" onclick="js_table('11')" title="商品信息"><i class="entypo-doc-text"></i><span>商品信息</span></a>
                                </li>
                                <li>
                                    <a class="tooltip-tip2 ajax-load" href="javascript:void(0);" onclick="js_table('12')" title="商品库存"><i class="entypo-newspaper"></i><span>商品库存</span></a>
                                </li>
                            </ul>
                        </li>
                        <li>
                            <a class="tooltip-tip ajax-load" href="javascript:void(0);" onclick="js_add('addSP')" title="商品添加">
                                <i class="icon icon-plus"></i>
                                <span>商品添加</span>

                            </a>
                        </li>
                    </ul>

                    <ul class="topnav menu-left-nest">
                        <li>
                            <a href="#" style="border-left:0px solid!important;" class="title-menu-left">

                                <span class="">供应商</span>
                                <i data-toggle="tooltip" class="entypo-cog pull-right config-wrap"></i>

                            </a>
                        </li>

                        <li>
                            <a class="tooltip-tip" href="#" title="供应商详情">
                                <i class="icon icon-align-justify"></i>
                                <span>供应商详情</span>
                            </a>
                            <ul>
                                 <li>
                                    <a class="tooltip-tip2 ajax-load" href="javascript:void(0);" onclick="js_table('21')" title="供应商信息"><i class="entypo-archive"></i><span>供应商信息</span></a>
                                </li>
                            </ul>
                        </li>

                        <li>
                            <a class="tooltip-tip" href="javascript:void(0);" onclick="js_add('addGYS')" title="供应商添加">
                                <i class="icon icon-plus"></i>
                                <span>供应商添加</span>
                            </a>
                        </li>

                    </ul>

                    <ul id="menu-showhide" class="topnav menu-left-nest">
                        <li>
                            <a href="#" style="border-left:0px solid!important;" class="title-menu-left">

                                <span class="">销售</span>
                                <i data-toggle="tooltip" class="entypo-cog pull-right config-wrap"></i>

                            </a>
                        </li>
                        <li>
                            <a class="tooltip-tip" href="#" title="销售详情">
                                <i class="icon icon-align-justify"></i>
                                <span>销售详情</span>
                            </a>
                            <ul>
                                <li>
                                    <a class="tooltip-tip2 ajax-load" href="element.html" title="个人销售信息"><i class="icon-attachment"></i><span>个人销售信息</span></a>
                                </li>
                                <li><a class="tooltip-tip2 ajax-load" href="button.html" title="销售信息查询"><i class="icon-view-list-large"></i><span>商品销售信息</span></a>
                                </li>
                            </ul>
                        </li>
                        <li>
                            <a class="tooltip-tip ajax-load" href="javascript:void(0);" onclick="js_add('addXS')" title="新增销售信息">
                                <i class="icon icon-plus"></i>
                                <span>新增销售信息</span>
                            </a>
                        </li>
                    </ul>
                    
                    
                    <ul id="menu-showhide" class="topnav menu-left-nest">
                        <li>
                            <a href="#" style="border-left:0px solid!important;" class="title-menu-left">
                                <span class="">员工</span>
                                <i data-toggle="tooltip" class="entypo-cog pull-right config-wrap"></i>
                            </a>
                        </li>
                        <li>
                            <a class="tooltip-tip ajax-load" href="javascript:void(0);" onclick="js_table('41')" title="员工信息">
                                <i class="entypo-users"></i>
                                <span>员工信息</span>
                            </a>
                        </li>
                        <li>
                            <a class="tooltip-tip ajax-load" href="javascript:void(0);" onclick="js_add('addYG')" title="员工添加">
                                <i class="entypo-user-add"></i>
                                <span>员工添加</span>
                            </a>
                        </li>
                    </ul>
                </div>
            </div>
        </div>
    </div>