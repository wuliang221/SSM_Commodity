<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core"  prefix="c"%>


<!-- 商品修改模态框 -->
<div class="modal fade" id="myModal1" tabindex="-1" role="dialog" aria-labelledby="myModalLabel">
  <div class="modal-dialog" role="document">
    <div class="modal-content">
      <div class="modal-header">
        <button type="button" class="close" data-dismiss="modal" aria-label="Close"><span aria-hidden="true">&times;</span></button>
        <h4 class="modal-title" id="myModalLabel1">商品修改</h4>
      </div>
      <div class="modal-body">
        <form class="form-horizontal">
        	<!-- 隐藏框，保存ID -->
        	<input type="hidden" id="inputEmail10" value="商品编号">
		  <div class="form-group">
		    <label for="inputEmail3" class="col-sm-2 control-label">商品名称</label>
		    <div class="col-sm-10">
		      <input type="text" class="form-control" name="departmentalname" id="inputEmail11" >
		    </div>
		  </div>
		    <div class="form-group">
		    <label for="inputEmail3" class="col-sm-2 control-label">商品类别</label>
		    <div class="col-sm-10" id="depart">
		      <select class="form-control" id="inputEmail12">
		      <c:forEach items="${type }" var="t">
	             <option value="${t.typeno }">${t.typename }</option>
	          </c:forEach>
				</select>
		    </div>
		  </div>
		  <div class="form-group">
		    <label for="inputEmail3" class="col-sm-2 control-label">供应商</label>
		    <div class="col-sm-10" id="depart">
		     <select class="form-control" id="inputEmail13">
                   <c:forEach items="${supplier }" var="s">
	                 <option value="${s.supplierno }">${s.suppliername }</option>
	                 </c:forEach>
                   </select>
			</div>
		  </div>
		   <div class="form-group">
		    <label for="inputEmail3" class="col-sm-2 control-label">单位(g)</label>
		    <div class="col-sm-10">
		      <input type="tezt" class="form-control" name="wagecoefficient" id="inputEmail14" >
		    </div>
		  </div>
		  <div class="form-group">
		    <label for="inputEmail3" class="col-sm-2 control-label">进货价</label>
		    <div class="col-sm-10">
		      <input type="tezt" class="form-control" name="wagecoefficient" id="inputEmail15" >
		    </div>
		  </div>
		  <div class="form-group">
		    <label for="inputEmail3" class="col-sm-2 control-label">销售价</label>
		    <div class="col-sm-10">
		      <input type="tezt" class="form-control" name="wagecoefficient" id="inputEmail16" >
		    </div>
		  </div>
		</form>
      </div>
      <div class="modal-footer">
  		<button type="button" class="btn btn-default" onclick="js_js_xiugai('spxiu')">保存</button>
        <button type="button" class="btn btn-primary" data-dismiss="modal">取消</button>
      </div>
    </div>
  </div>
</div>



<!-- 商品库存修改模态框 -->
<div class="modal fade" id="myModal2" tabindex="-1" role="dialog" aria-labelledby="myModalLabel">
  <div class="modal-dialog" role="document">
    <div class="modal-content">
      <div class="modal-header">
        <button type="button" class="close" data-dismiss="modal" aria-label="Close"><span aria-hidden="true">&times;</span></button>
        <h4 class="modal-title" id="myModalLabel2">商品修改</h4>
      </div>
      <div class="modal-body">
        <form class="form-horizontal">
        	<!-- 隐藏框，保存ID -->
        	<input type="hidden" id="inputEmail20" value="商品编号">
		  <div class="form-group">
		    <label for="inputEmail3" class="col-sm-2 control-label">商品名称</label>
		    <div class="col-sm-10">
		      <input type="text" class="form-control" name="departmentalname" id="inputEmail21" disabled>
		    </div>
		  </div>
		   <div class="form-group">
		    <label for="inputEmail3" class="col-sm-2 control-label">库存</label>
		    <div class="col-sm-10">
		      <input type="tezt" class="form-control" name="wagecoefficient" id="inputEmail22" >
		    </div>
		  </div>
		  <div class="form-group">
		    <label for="inputEmail3" class="col-sm-2 control-label">规格</label>
		    <div class="col-sm-10">
		      <input type="tezt" class="form-control" name="wagecoefficient" id="inputEmail23" >
		    </div>
		  </div>
		</form>
      </div>
      <div class="modal-footer">
  		<button type="button" class="btn btn-default" onclick="js_js_xiugai('spxiu')">保存</button>
        <button type="button" class="btn btn-primary" data-dismiss="modal">取消</button>
      </div>
    </div>
  </div>
</div>




<!-- 供应商修改模态框 -->
<div class="modal fade" id="myModal3" tabindex="-1" role="dialog" aria-labelledby="myModalLabel">
  <div class="modal-dialog" role="document">
    <div class="modal-content">
      <div class="modal-header">
        <button type="button" class="close" data-dismiss="modal" aria-label="Close"><span aria-hidden="true">&times;</span></button>
        <h4 class="modal-title" id="myModalLabel3">供应商修改</h4>
      </div>
      <div class="modal-body">
        <form class="form-horizontal">
        	<!-- 隐藏框，保存ID -->
        	<input type="hidden" id="inputEmail30" value="供应商编号">
        	
		   <div class="form-group">
			    <label for="inputEmail3" class="col-sm-2 control-label">供应商名称</label>
			    <div class="col-sm-10">
			      <input type="text" class="form-control" id="inputEmail31">
			    </div>
		   </div>
		   <div class="form-group">
			    <label for="inputEmail3" class="col-sm-2 control-label">供应商地址</label>
			    <div class="col-sm-10">
			      <input type="text" class="form-control" id="inputEmail32">
			    </div>
		   </div>
		   <div class="form-group">
			    <label for="inputEmail3" class="col-sm-2 control-label">联系人姓名</label>
			    <div class="col-sm-10">
			      <input type="text" class="form-control" id="inputEmail33">
			    </div>
		   </div>
		   <div class="form-group">
			    <label for="inputEmail3" class="col-sm-2 control-label">联系人电话</label>
			    <div class="col-sm-10">
			      <input type="text" class="form-control" id="inputEmail34">
			    </div>
		   </div>
		</form>
      </div>
      <div class="modal-footer">
        <button type="button" class="btn btn-default" onclick="js_js_xiugai('gyxiu')">保存</button>
        <button type="button" class="btn btn-primary" data-dismiss="modal">取消</button>
      </div>
    </div>
  </div>
</div>






<!-- 销售信息模态框 -->
<div class="modal fade" id="myModal3" tabindex="-1" role="dialog" aria-labelledby="myModalLabel">
  <div class="modal-dialog" role="document">
    <div class="modal-content">
      <div class="modal-header">
        <button type="button" class="close" data-dismiss="modal" aria-label="Close"><span aria-hidden="true">&times;</span></button>
        <h4 class="modal-title" id="myModalLabel3"></h4>
      </div>
      <div class="modal-body">
        <form class="form-horizontal">
		   <div class="form-group">
		    <label for="inputEmail3" class="col-sm-2 control-label">员工姓名</label>
		    <div class="col-sm-10">
		      <input type="text" class="form-control" id="inputEmail31" placeholder="姓名">
		    </div>
		  </div>
		  <div class="form-group">
		    <label for="inputEmail3" class="col-sm-2 control-label">基本工资</label>
		    <div class="col-sm-10">
		      <input type="text" class="form-control" id="inputEmail32" placeholder="工资">
		    </div>
		  </div>
		  <div class="form-group">
		    <label for="inputEmail3" class="col-sm-2 control-label">职校补贴</label>
		    <div class="col-sm-10">
		      <input type="text" class="form-control" id="inputEmail33" placeholder="职校补贴">
		    </div>
		  </div>
		  <div class="form-group">
		    <label for="inputEmail3" class="col-sm-2 control-label">工龄补贴</label>
		    <div class="col-sm-10">
		      <input type="text" class="form-control" id="inputEmail34" placeholder="工龄补贴">
		    </div>
		  </div>
		</form>
      </div>
      <div class="modal-footer">
        <button type="button" class="btn btn-default" onclick="jjs_js_xiugai('ygxiu')">保存</button>
        <button type="button" class="btn btn-primary" data-dismiss="modal">取消</button>
      </div>
    </div>
  </div>
</div>









<!-- 员工修改模态框 -->
<div class="modal fade" id="myModal4" tabindex="-1" role="dialog" aria-labelledby="myModalLabel">
  <div class="modal-dialog" role="document">
    <div class="modal-content">
      <div class="modal-header">
        <button type="button" class="close" data-dismiss="modal" aria-label="Close"><span aria-hidden="true">&times;</span></button>
        <h4 class="modal-title" id="myModalLabel4"></h4>
      </div>
      <div class="modal-body">
        <form class="form-horizontal">
		   <div class="form-group">
		    <label for="inputEmail3" class="col-sm-2 control-label">类别编号</label>
		    <div class="col-sm-10">
		      <input type="text" class="form-control" id="inputEmail41" placeholder="编号">
		    </div>
		  </div>
		  <div class="form-group">
		    <label for="inputEmail3" class="col-sm-2 control-label">资产类名</label>
		    <div class="col-sm-10">
		      <input type="text" class="form-control" id="inputEmail42" placeholder="名称">
		    </div>
		  </div>
		</form>
      </div>
      <div class="modal-footer">
        <button type="button" class="btn btn-default" onclick="js_js_xiugai('lbxiu')">保存</button>
        <button type="button" class="btn btn-primary" data-dismiss="modal">取消</button>
      </div>
    </div>
  </div>
</div>





<!-- 资产信息模态框 -->
<div class="modal fade" id="myModal5" tabindex="-1" role="dialog" aria-labelledby="myModalLabel">
  <div class="modal-dialog" role="document">
    <div class="modal-content">
      <div class="modal-header">
        <button type="button" class="close" data-dismiss="modal" aria-label="Close"><span aria-hidden="true">&times;</span></button>
        <h4 class="modal-title" id="myModalLabel5"></h4>
      </div>
      <div class="modal-body">
        <form class="form-horizontal">
		  <div class="form-group">
		    <label for="inputEmail3" class="col-sm-2 control-label">资产类别</label>
		    <div class="col-sm-10">
		      <select class="form-control" id="inputEmail51">
				  <option>投资1</option>
				  <option>投资1</option>
				  <option>投资1</option>
				  <option>投资1</option>
				  <option>投资5</option>
				</select>
		    </div>
		  </div>
		  <div class="form-group">
		    <label for="inputEmail3" class="col-sm-2 control-label">资产信息</label>
		    <div class="col-sm-10">
		      <input type="text" class="form-control" id="inputEmail52" placeholder="名称">
		    </div>
		  </div>
		</form>
      </div>
      <div class="modal-footer">
        <button type="button" class="btn btn-default" onclick="js_js_xiugai('add5')">保存</button>
        <button type="button" class="btn btn-primary" data-dismiss="modal">取消</button>
      </div>
    </div>
  </div>
</div>




<!-- 资产信息模态框 -->
<div class="modal fade" id="myModal6" tabindex="-1" role="dialog" aria-labelledby="myModalLabel">
  <div class="modal-dialog" role="document">
    <div class="modal-content">
      <div class="modal-header">
        <button type="button" class="close" data-dismiss="modal" aria-label="Close"><span aria-hidden="true">&times;</span></button>
        <h4 class="modal-title" id="myModalLabel6"></h4>
      </div>
      <div class="modal-body">
        <form class="form-horizontal">
		  <div class="form-group">
		    <label for="inputEmail3" class="col-sm-2 control-label">经营信息</label>
		    <div class="col-sm-10">
		      <input type="text" class="form-control" id="inputEmail61" placeholder="名称">
		    </div>
		  </div>
		   <div class="form-group">
		    <label for="inputEmail3" class="col-sm-2 control-label">投入</label>
		    <div class="col-sm-10">
		      <input type="text" class="form-control" id="inputEmail62" placeholder="999,99">
		    </div>
		  </div>
		   <div class="form-group">
		    <label for="inputEmail3" class="col-sm-2 control-label">营收</label>
		    <div class="col-sm-10">
		      <input type="text" class="form-control" id="inputEmail63" placeholder="999,99">
		    </div>
		  </div>
		</form>
      </div>
      <div class="modal-footer">
        <button type="button" class="btn btn-default" onclick="js_js_xiugai('add6')">保存</button>
        <button type="button" class="btn btn-primary" data-dismiss="modal">取消</button>
      </div>
    </div>
  </div>
</div>







<!-- 费用信息模态框 -->
<div class="modal fade" id="myModal7" tabindex="-1" role="dialog" aria-labelledby="myModalLabel">
  <div class="modal-dialog" role="document">
    <div class="modal-content">
      <div class="modal-header">
        <button type="button" class="close" data-dismiss="modal" aria-label="Close"><span aria-hidden="true">&times;</span></button>
        <h4 class="modal-title" id="myModalLabel7"></h4>
      </div>
      <div class="modal-body">
        <form class="form-horizontal">
		  <div class="form-group">
		    <label for="inputEmail3" class="col-sm-2 control-label">费用信息</label>
		    <div class="col-sm-10">
		      <input type="text" class="form-control" id="inputEmail71" placeholder="名称">
		    </div>
		  </div>
		   <div class="form-group">
		    <label for="inputEmail3" class="col-sm-2 control-label">金额</label>
		    <div class="col-sm-10">
		      <input type="text" class="form-control" id="inputEmail72" placeholder="999,99">
		    </div>
		  </div>
		   <div class="form-group">
		    <label for="inputEmail3" class="col-sm-2 control-label">性别</label>
		    <div class="col-sm-10">
		      <label class="radio-inline">
				  <input type="radio" name="inlineRadioOptions" id="inputEmail73" value="1" checked="checked"> 已报
				</label>
				<label class="radio-inline">
				  <input type="radio" name="inlineRadioOptions" id="inputEmail73" value="2"> 未报
				</label>
		    </div>
		    </div>	
		   
		</form>
      </div>
      <div class="modal-footer">
        <button type="button" class="btn btn-default" onclick="js_js_xiugai('add7')">保存</button>
        <button type="button" class="btn btn-primary" data-dismiss="modal">取消</button>
      </div>
    </div>
  </div>
</div>

