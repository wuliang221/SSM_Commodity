<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core"  prefix="c"%>
                <div class="row">
                    <div class="col-sm-12">
                        <div class="nest" id="FilteringClose"> 
                        
                            <div class="body-nest" id="Filtering">
                                <div class="row" style="margin-bottom:10px;">
                                    <div class="col-sm-4">
                                        <input class="form-control" id="filter" placeholder="供应商名称..." type="text">
                                    </div>
                                    <div class="col-sm-6">
                                        <a href="#clear" style="margin-left:10px;" class="pull-right btn btn-info clear-filter" title="clear filter">待定</a>
                                        <a href="#api" class="pull-right btn btn-info filter-api" title="Filter using the Filter API">查找</a>
                                    </div>
                                </div>
                                <table class="table table-striped">
                                    <thead>
                                    <tr>
                                        <th>员工编号</th>
                                        <th>职位</th>
                                        <th>姓名</th>
                                        <th>性别</th>
                                        <th>联系电话</th>
                                        <th>工资</th>
                                    </tr>
                                    </thead>
                                    <tbody>
                                    <c:forEach items="${worker }" var="w">
                                    <tr>
                                        <td>${w.workerno }</td>
                                        <td>${w.adminno }</td>
                                        <td>${w.workername }</td>
                                        <td>${w.workersex }</td>
                                        <td>${w.workerphone}</td>
                                        <td>${w.workersalary}</td>
                                        <td>
                                            <button type="button" onclick="js_xiu4('${s.workerno }','${s.adminno }','${s.workername }','${s.workersex }','${s.workerphone }','${s.workersalary }')" class="btn btn-primary btn-xs">修改</button>
                                            <button type="button" onclick="js_shanchu('${s.workerno }','YG','${s.workerno }')" class="btn btn-danger btn-xs">删除</button>
                                        </td>
                                    </tr>
                                    </c:forEach>
                                    
                                    </tbody>
                                </table>

                <ul>
					<li>共${ps.totalCount }条记录&nbsp;&nbsp; 第${ps.currPageNo }/${ps.totalPageCount }页
					</li>
					<a class="btn btn-default" href="javascript:void(0);" onclick="supplierfirstPage()">首页</a>
					<button class="btn btn-default" onclick="supplierupPage()">上一页</button>
					<button class="btn btn-default" onclick="supplierdowmPage()">下一页</button>
					<a class="btn btn-default" href="javascript:void(0);" onclick="supplierlastPage()">末页</a>
					&nbsp;&nbsp;
				</ul>
                            </div>

                        </div>


                    </div>

                </div>


<%-- <script src="${pageContext.request.contextPath }/statics/js/Table_js/supplier.js"></script> --%>

<input type="hidden" id="pageNoUp" value="${ps.currPageNo-1}"/>
<input type="hidden" id="pageNoDom" value="${ps.currPageNo+1}"/>
<input type="hidden" id="pageNoLast" value="${ps.totalPageCount}"/>
