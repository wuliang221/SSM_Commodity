//主页js
//修改保存
function js_js_xiugai(DD){
	var url=$("#url").val();
	//Ajax请求参数
	var data2="";
	var close="";
	if(DD == "spxiu"){
		url+="/goods/update.json";
		var id=$("#inputEmail10").val();
		var z11=$("#inputEmail11").val();
		var z12=$("#inputEmail12").val();
		var z13=$("#inputEmail13").val();
		var z14=$("#inputEmail14").val();
		var z15=$("#inputEmail15").val();
		var z16=$("#inputEmail16").val();
		close=$("#myModal1");
		data2={goodsno:id,goodsname:z11,typeno:z12,supplierno:z13,goodsunit:z14,goodsinprise:z15,goodsoutprise:z16};
	}else if(date == 2){
		url+="";
		var z21=$("#inputEmail21").val();
		var z22=$("#inputEmail22").val();
		var z23=$("#inputEmail23").val();
		data2={departmentalName:z21,personsNum:z22,wageCoefficient:z23};
	}else if(date == "3"){
		var z1=$("#inputEmail31").val();
		var z2=$("#inputEmail32").val();
		var z3=$("#inputEmail33").val();
		var z4=$("#inputEmail34").val();
		
	}else if(date == "4"){
		var z1=$("#inputEmail41").val();
		var z2=$("#inputEmail42").val();
		
	}else if(date == "5"){
		var z1=$("#inputEmail51").val();
		var z2=$("#inputEmail52").val();
		
	}else if(date == "6"){
		var z1=$("#inputEmail61").val();
		var z2=$("#inputEmail62").val();
		var z3=$("#inputEmail63").val();
		
	}else if(date == "7"){
		var z1=$("#inputEmail71").val();
		var z2=$("#inputEmail72").val();
		var z3=$("#inputEmail73").val();
		
	}else if(date == "8"){
		
	}else if(date == "9"){
		
	}else{
		alert("网页出现错误");
		return;
	}
	$.ajax({
		type :"post",
		url:url,
		data:data2,
		dataType:"json",	
		success : function(data) {
			if(data=="session"){
			alert("修改成功！");
			close.modal('toggle');
			shuaxin();
			}
		},
		error : function(data) {
			alert("修改失败！");
		}
	});
}

//修改模态框弹出并赋值
//商品修改模态框
function js_xiu1(on,d1,d2,d3,d4,d5,d6) {
	$("#inputEmail10").val(on);
	$("#inputEmail11").val(d1);
	$("#inputEmail12").val([d2]);
	$("#inputEmail13").val([d3]);
	$("#inputEmail14").val(d4);
	$("#inputEmail15").val(d5);
	$("#inputEmail16").val(d6);
	$("#myModal1").modal({backdrop:"static"});
}

//商品库存修改模态框
function js_xiu2(on,d1,d2,d3,d4,d5) {
	$("#inputEmail20").val(on);
	$("#inputEmail21").val(d1);
	$("#inputEmail22").val(d2);
	$("#inputEmail23").val(d3);
	$("#myModal2").modal({backdrop:"static"});
}

//供应商修改模态框
function js_xiu3(on,d1,d2,d3,d4) {
	$("#inputEmail30").val(on);
	$("#inputEmail31").val(d1);
	$("#inputEmail32").val(d2);
	$("#inputEmail33").val(d3);
	$("#inputEmail34").val(d4);
	$("#myModal3").modal({backdrop:"static"});
}







//销售信息修改模态框
function js_xiu3(on,id,id1,id2,id3) {
	
	
}

//员工修改模态框
function js_xiu4(on,id,id1,id2,id3) {
	$("#inputEmail40").val(on);
	$("#inputEmail41").val(d1);
	$("#inputEmail42").val(d2);
	$("#inputEmail43").val(d3);
	$("#inputEmail44").val(d4);
	$("#myModal4").modal({backdrop:"static"});
	
}





//数据添加js
function js_tianjia(date) {
	$('#myModal').modal('toggle');
	//Ajax地址
	var url=$("#url").val();
	var url2="";
	//Ajax请求参数
	var data2="";
	var data3="";
	if(date == 1){
		data3="addSP";
		url+="/goods/insert.json";
		var z11=$("#shuju11").val();
		var z12=$("#shuju12").val();
		var z13=$("#shuju13").val();
		var z14=$("#shuju14").val();
		var z15=$("#shuju15").val();
		var z16=$("#shuju16").val();
		var z17=$("#shuju17").val();
		data2={goodsname:z11,typeno:z12,supplierno:z13,goodsnorm:z14,goodsunit:z15,goodsoutprise:z16,goodsinprise:z17};
	}else if(date == 2){
		url+="";
		var z21=$("#inputEmail21").val();
		var z22=$("#inputEmail22").val();
		var z23=$("#inputEmail23").val();
		data2={departmentalName:z21,personsNum:z22,wageCoefficient:z23};
	}else if(date == "3"){
		var z1=$("#inputEmail31").val();
		var z2=$("#inputEmail32").val();
		var z3=$("#inputEmail33").val();
		var z4=$("#inputEmail34").val();
		
	}else if(date == "4"){
		var z1=$("#inputEmail41").val();
		var z2=$("#inputEmail42").val();
		
	}else if(date == "5"){
		var z1=$("#inputEmail51").val();
		var z2=$("#inputEmail52").val();
		
	}else if(date == "6"){
		var z1=$("#inputEmail61").val();
		var z2=$("#inputEmail62").val();
		var z3=$("#inputEmail63").val();
		
	}else if(date == "7"){
		var z1=$("#inputEmail71").val();
		var z2=$("#inputEmail72").val();
		var z3=$("#inputEmail73").val();
		
	}else if(date == "8"){
		
	}else if(date == "9"){
		
	}else{
		alert("网页出现错误");
		return;
	}
	$.ajax({
		type :"post",
		url:url,
		data:data2,
		dataType:"json",	
		success : function(data) {
			if(data=="session"){
			alert("添加成功！");
			js_add(data3);
			}
		},
		error : function(data) {
			alert("添加失败！");
		}
	});
	
	
}




//删除Ajax
//id=编号，on=判断条件，name=名字
function js_shanchu(id,on,name) {
	var String="";
	var url=$("#url").val();
	
	if(on=="SP1"){
		//商品信息表
		String="是否删除商品1:"+name;
		data={goodsno:id}
		url+="/goods/del.json";
	}else if(on=="SP2"){
		//商品库存表
		String="是否删除商品2:"+name;
		url="";
	}else if(on=="GYS"){
		String="是否删除供应商:"+name;
		url="";
	}
	
	if(confirm(String)){
		$.ajax({
			type :"POST",
			url:url,
			data:data,
			dataType:"json",
			success : function(data) {
				if(data=="session"){
					alert("删除成功！");
					//演讲时用的js刷新临时的（stock   goods  关联goodsNo取消了）
					//js_table(11);
					shuaxin();
				}
				
			},
			error : function() {
				alert("删除失败！");
			}
		});
		
		
		
	}
	
}



//add页面
function js_add(date) {
	      if(date=="addSP"){
		$("#biaodanname").text("商品信息添加");
	}else if(date=="addGYS"){
		$("#biaodanname").text("供应商信息添加");
	}else if(date=="addXS"){
		$("#biaodanname").text("销售信息添加");
	}else if(date=="addYG"){
		$("#biaodanname").text("员工信息添加");
	}
	$.ajax({
		type :"get",
		url:$("#url").val()+"/add/"+date+".html",
		dataType:"html",
		success : function(data) {
			$("#maindiv").html(data);
		},
		error : function() {
			alert("添加页面获取失败");
		}
	});
	
	
}


//点击显示数据表格
function js_table(date) {
	var lianjie=$("#url").val();
	var com="";
	if(date==11){
		$("#biaodanname").text("商品信息表");
		com="/goods/findgoods.html";
	}else if(date==12){
		$("#biaodanname").text("商品库存表");
		com="/goods/findgoodscount.html";
	}else if(date==21){
		$("#biaodanname").text("供应商信息表");
		com="/supplier/suppslelct.html";
	}else if(date==31){
		$("#biaodanname").text("个人销售信息表");
		com="";
	}else if(date==32){
		$("#biaodanname").text("销售信息表");
		com="";
	}else if(date==41){
		$("#biaodanname").text("员工信息表");
		com="/worker/worker.html";
	}
	$.ajax({
		type :"get",
		url:$("#url").val()+"/table/bg"+date,
		dataType:"html",
		success : function(data) {
			$("#maindiv").load(lianjie+com);
			$("#maindiv").html(data);
		},
		error : function() {
			alert("显示数据表失败");
		}
	});
}	




//主页时间显示
function shu() {
    var date=new Date();
    document.getElementById("data").innerHTML=(date.getFullYear()+"年"+(date.getMonth()+1)+"月"+date.getDate()+"日");
    document.getElementById("shi").innerHTML=(date.getHours());
    document.getElementById("fen").innerHTML=(date.getMinutes());
    document.getElementById("miao").innerHTML=(date.getSeconds());
    if(date.getHours()==0){
        document.getElementById("wu").innerHTML=("午夜");
    }else if(date.getHours()>=1 && date.getHours()<=4) {
        document.getElementById("wu").innerHTML=("凌晨");
    }else if(date.getHours()==5) {
        document.getElementById("wu").innerHTML=("清晨");
    }else if(date.getHours()>=6 && date.getHours()<=7) {
        document.getElementById("wu").innerHTML=("早上");
    }else if(date.getHours()>=8 && date.getHours()<=10) {
        document.getElementById("wu").innerHTML=("上午");
    }else if(date.getHours()>=11 && date.getHours()<=12) {
        document.getElementById("wu").innerHTML=("中午");
    }else if(date.getHours()>=13 && date.getHours()<=16) {
        document.getElementById("wu").innerHTML=("下午");
    }else if(date.getHours()==17) {
        document.getElementById("wu").innerHTML=("傍晚");
    }else if(date.getHours()>=18 && date.getHours()<=23) {
        document.getElementById("wu").innerHTML=("晚上");
    }
}
var myTime=window.setInterval("shu()",100);
