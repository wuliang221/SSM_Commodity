<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core"  prefix="c"%>
                <div class="row">
                    <div class="col-sm-12">
                            <div class="body-nest" id="Filtering">

                                <div class="row" style="margin-bottom:10px;">
                                    <div class="col-sm-4">
                                        <input class="form-control" id="filter" placeholder="商品名称..." type="text" value="${goodsName }">
                                    </div>
                                    <div class="col-sm-2">
                                        <select class="filter-status form-control" id="typeno">
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
                                        <a href="#api" class="pull-right btn btn-info filter-api" href="javascript:void(0);" onclick="chazhao()">查找</a>
                                    </div>
                                </div>
                                <table class="table table-striped">
                                    <thead>
                                    <tr>
                                        <th>商品名</th>
                                        <th>商品类别</th>
                                        <th>供应商</th>
                                        <th>单位</th>
                                        <th>进货价</th>
                                        <th>销售价</th>
                                        <th>操作</th>
                                    </tr>
                                    </thead>
                                    <tbody>
                                    <c:forEach items="${goods }" var="g">
                                     <input type="hidden" id="goodsno" value="${g.goodsno }"/>
                                    <tr id="SP${g.goodsno }">
                                        <td>${g.goodsname }</td>
                                        <td>${g.typeName }</td>
                                        <td>${g.supplierName }</td>
                                        <td>${g.goodsunit }</td>
                                        <td>${g.goodsinprise}</td>
                                        <td>${g.goodsoutprise }</td>
                                        <td>
                                        	<button type="button" onclick="js_xiu1('${g.goodsno }','${g.goodsname }',
                                        	'${g.typeno }','${g.supplierno }','${g.goodsunit}','${g.goodsinprise }'
                                        	,'${g.goodsoutprise }')" class="btn btn-primary btn-xs">修改</button>
                                            <button type="button" onclick="js_shanchu('${g.goodsno }','SP1','${g.typeName }')" class="btn btn-danger btn-xs">删除</button>
                                        </td>
                                    </tr>
                                    </c:forEach>
                                    
                                    </tbody>
                                </table>

                                 <ul>
				<li>共${ps.totalCount }条记录&nbsp;&nbsp; 第${ps.currPageNo }/${ps.totalPageCount }页
				</li>
				<button class="btn btn-default" href="javascript:void(0);" onclick="firstPage()">首页</button>
				<button class="btn btn-default" onclick="upPage()">上一页</button>
				<button class="btn btn-default" onclick="dowmPage()">下一页</button>
				<button class="btn btn-default" href="javascript:void(0);" onclick="lastPage()">末页</button>
				&nbsp;&nbsp;
			</ul>
                            </div>
                        </div>
                    </div>
                </div>

<input type="hidden" id="pageNothis" value="${ps.currPageNo}"/>
<input type="hidden" id="pageNoUp" value="${ps.currPageNo-1}"/>
<input type="hidden" id="pageNoDom" value="${ps.currPageNo+1}"/>
<input type="hidden" id="pageNoLast" value="${ps.totalPageCount}"/>
