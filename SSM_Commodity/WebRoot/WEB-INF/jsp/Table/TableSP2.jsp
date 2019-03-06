<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core"  prefix="c"%>
                <div class="row">
                    <div class="col-sm-12">
                        <div class="nest" id="FilteringClose1">
                            <div class="body-nest" id="Filtering1">

                                <div class="row" style="margin-bottom:10px;">
                                    <div class="col-sm-4">
                                        <input class="form-control" id="SP2filter" placeholder="商品名称..." type="text" value="${goodsName }">
                                    </div>
                                    <div class="col-sm-2">
                                        <select class="filter-status form-control" id="SP2typeno">
                                            <option value="">商品分类...
                                           <c:forEach items="${type }" var="t">
                                            	<option 
                                            		<c:if test="${t.typeno==typeNo }" >selected = "selected"</c:if>
                                            	value="${t.typeno }">${t.typename }</option>
                                            </c:forEach>
                                        </select>
                                    </div>
                                    <div class="col-sm-6">
                                        <a href="#clear" style="margin-left:10px;" class="pull-right btn btn-info clear-filter" title="clear filter">待定</a>
                                        <a href="#api" class="pull-right btn btn-info filter-api" title="Filter using the Filter API" onclick="SP2chazhao()">查找</a>
                                    </div>
                                </div>
                                <table class="table table-striped">
                                    <thead>
                                    <tr>
                                        <th>商品名</th>
                                        <th>商品类别</th>
                                        <th>供应商名</th>
                                        <th>库存</th>
                                        <th>规格</th>
                                        <th>操作</th>
                                    </tr>
                                    </thead>
                                    <tbody>
                                    
                                    <c:forEach items="${goods }" var="g">
                                     <input type="hidden" id="goodsno" value="${g.goodsno }"/>
                                    <tr>
                                        <td>${g.goodsname }</td>
                                        <td>${g.typeName }</td>
                                        <td>${g.supplierName }</td>
                                        <td>${g.goodscount }</td>
                                        <td>${g.goodsnorm}</td>
                                        <td>
                                        	<button type="button" onclick="js_xiu2('${g.goodsno }','${g.goodsname }','${g.goodscount }','${g.goodsnorm }')" class="btn btn-primary btn-xs">修改</button>
                                        </td>
                                    </tr>
                                    </c:forEach>
                                    
                                    
                                    </tbody>
                                </table>

                                  <ul>
				<li>共${ps.totalCount }条记录&nbsp;&nbsp; 第${ps.currPageNo }/${ps.totalPageCount }页
				</li>
				<button class="btn btn-default"  onclick="SP2firstPage()">首页</button>
				<button class="btn btn-default" onclick="SP2upPage()">上一页</button>
				<button class="btn btn-default" onclick="SP2dowmPage()">下一页</button>
				<button class="btn btn-default" onclick="SP2lastPage()">末页</button>
				&nbsp;&nbsp;
			</ul>
                               
                               
                            </div>

                        </div>


                    </div>

                </div>
<input type="hidden" id="pageNoUp" value="${ps.currPageNo-1}"/>
<input type="hidden" id="pageNoDom" value="${ps.currPageNo+1}"/>
<input type="hidden" id="pageNoLast" value="${ps.totalPageCount}"/>
