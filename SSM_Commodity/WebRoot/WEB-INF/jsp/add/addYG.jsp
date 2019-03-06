<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core"  prefix="c"%>
 <div class="content-wrap">
                <div class="row">
                    <div class="col-sm-12">
                        <div class="nest" id="validationClose">
                            <div class="title-alt">
                                <div class="titleClose">
                                </div>
                            </div>

                            <div class="body-nest" id="validation">
                                <div class="form_center">

                                        <fieldset>


                                            <div class="control-group">
                                                <label class="control-label" for="name">商品名</label>
                                                <div class="controls">
                                                    <input type="text" class="form-control" name="" id="shuju11" placeholder="请输入商品名称">
                                                </div>
                                            </div>
                                            <div class="control-group">
                                                <label class="control-label" for="subject">商品类别</label>
                                                <div class="controls">
                                                    <select class="form-control" namr="" id="shuju12">
                                                    	<option value="0">请选择商品类别</option>
	                                                    <c:forEach items="${type }" var="t">
	                                                   		<option value="${t.typeno }">${t.typename }</option>
	                                                    </c:forEach>
                                                    </select>
                                                </div>
                                            </div>
                                            <div class="control-group">
                                                <label class="control-label" for="subject">供应商</label>
                                                <div class="controls">
                                                    <select class="form-control" namr="" id="shuju13">
                                                    	<option value="0">请选择供应商</option>
                                                        <c:forEach items="${supplier }" var="s">
	                                                   		<option value="${s.supplierno }">${s.suppliername }</option>
	                                                    </c:forEach>
                                                    </select>
                                                </div>
                                            </div>

                                            <div class="control-group">
                                                <label class="control-label" for="subject">规格</label>
                                                <div class="controls">
                                                    <input type="text" class="form-control" name="" id="shuju14" placeholder="请输入商品规格（个、瓶、颗、件...）">
                                                </div>
                                            </div>
                                            <div class="control-group">
                                                <label class="control-label" for="subject">单位</label>
                                                <div class="controls">
                                                    <input type="text" class="form-control" name="" id="shuju15" placeholder="请输入商品单位（g）">
                                                </div>
                                            </div>
                                            <div class="control-group">
                                                <label class="control-label" for="subject">零售价</label>
                                                <div class="controls">
                                                    <input type="text" class="form-control" name="" id="shuju16" placeholder="请输入商品零售价（￥）">
                                                </div>
                                            </div>
                                            <div class="control-group">
                                                <label class="control-label" for="subject">进货价</label>
                                                <div class="controls">
                                                    <input type="text" class="form-control" name="" id="shuju17" placeholder="请输入商品（￥）">
                                                </div>
                                            </div>
                                            <div class="form-actions" style="margin:20px 0 0 0;">
                                                <button onclick="js_tianjia('1')" class="btn btn-primary">保存</button>
                                                <button type="reset" class="btn">清空</button>
                                            </div>
                                        </fieldset>

                                </div>
                            </div>



                        </div>
                    </div>
                </div>
            </div>