package com.controller;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.alibaba.fastjson.JSON;
import com.pojo.Goods;
import com.pojo.Type;
import com.service.GoodsService;
import com.service.TypeService;
import com.util.PageSupport;

@Controller
@RequestMapping("/goods")
public class GoodsController {
	@Resource
	private GoodsService goodsService;
	@Resource
	private TypeService typeService;
	
	//分页查询商品
	@RequestMapping("/findgoods.html")
	private String findGoods(Model model,@RequestParam(value = "pageNo", required = false) String pageNo,
								@RequestParam(value="typeNo",required = false)Integer typeNo,
								@RequestParam(value="goodsName",required = false)String goodsName){
		
		int result = goodsService.count(typeNo,goodsName);
		if (pageNo == null || pageNo == "") {
			pageNo = "1";
		}
		int currPageNo = Integer.parseInt(pageNo);
		if (currPageNo < 1) {
			currPageNo = 1;
		}
		System.out.println(currPageNo);
		PageSupport ps = new PageSupport();
		ps.setPageSize(7);
		ps.setTotalCount(result);
		if (currPageNo > ps.getTotalPageCount()) {
			currPageNo = ps.getTotalPageCount();
		}
		ps.setCurrPageNo(currPageNo);
		int index = (ps.getCurrPageNo() - 1) * ps.getPageSize();
		if (index < 0) {
			index = 1;
		}
		System.out.println("==========================" + (ps.getCurrPageNo() - 1)
				* ps.getPageSize());

		List<Goods> goods = goodsService.findAllGoods(index, ps.getPageSize(), typeNo, goodsName);
		List<Type> type=typeService.alltype();
		System.out.println(goods);
		model.addAttribute("type", type);
		model.addAttribute("goods", goods);
		model.addAttribute("ps", ps);
		model.addAttribute("goodsName",goodsName);
		model.addAttribute("typeNo", typeNo);
		return "Table/TableSP1";
		
	}
	
	
	
	//分页查询商品库存
	@RequestMapping("/findgoodscount.html")
	private String findGoodscount(Model model,@RequestParam(value = "pageNo", required = false) String pageNo,
								@RequestParam(value="typeNo",required = false)Integer typeNo,
								@RequestParam(value="goodsName",required = false)String goodsName){
		
		int result = goodsService.count(typeNo,goodsName);
		if (pageNo == null || pageNo == "") {
			pageNo = "1";
		}
		int currPageNo = Integer.parseInt(pageNo);
		if (currPageNo < 1) {
			currPageNo = 1;
		}
		System.out.println(currPageNo);
		PageSupport ps = new PageSupport();
		ps.setPageSize(7);
		ps.setTotalCount(result);
		if (currPageNo > ps.getTotalPageCount()) {
			currPageNo = ps.getTotalPageCount();
		}
		ps.setCurrPageNo(currPageNo);
		int index = (ps.getCurrPageNo() - 1) * ps.getPageSize();
		if (index < 0) {
			index = 1;
		}
		System.out.println("==========================" + (ps.getCurrPageNo() - 1)
				* ps.getPageSize());

		List<Goods> goods = goodsService.getAllGoodsPrice(index, ps.getPageSize(), typeNo, goodsName);
		List<Type> type=typeService.alltype();
		System.out.println(goods);
		model.addAttribute("type", type);
		model.addAttribute("goods", goods);
		model.addAttribute("ps", ps);
		model.addAttribute("goodsName",goodsName);
		model.addAttribute("typeNo", typeNo);
		return "Table/TableSP2";
		
	}
	
	
	
	
	
	//删除商品
	@RequestMapping(value="/del.json",method=RequestMethod.POST)
	@ResponseBody
	private Object del(@RequestParam(value="goodsno")Integer goodsno){
		boolean result=false;
		String json=null;
		if(goodsno !=0 &&goodsno!=null){
			result = goodsService.del(goodsno);
			if(result){
				json="session";
			}
		}
		return JSON.toJSONString(json);
		
	}
	//修改商品
	@RequestMapping("/update.json")
	@ResponseBody
	public Object update(@RequestParam("goodsno")Integer goodsno,@RequestParam("typeno")Integer typeno,
			@RequestParam("supplierno")Integer supplierno,@RequestParam("goodsname")String goodsname,
			@RequestParam("goodsnorm")String goodsnorm,@RequestParam("goodsunit")String goodsunit,
			@RequestParam("goodscount")Integer goodscount,@RequestParam("goodsoutprise")Double goodsoutprise,
			@RequestParam("goodsinprise")Double goodsinprise){
		boolean result=false;
		String json=null;
		result=goodsService.update(goodsno, typeno, supplierno, goodsname, 
									goodsnorm, goodsunit, goodscount, goodsoutprise, goodsinprise);
		if(result){
			json="session";
			
		}
		return JSON.toJSONString(json);
		
	}
	//添加商品
	@RequestMapping("/insert.json")
	@ResponseBody
	public Object insert(@RequestParam("typeno")Integer typeno,@RequestParam("supplierno")Integer supplierno,
				@RequestParam("goodsname")String goodsname,@RequestParam("goodsnorm")String goodsnorm,
				@RequestParam("goodsunit")String goodsunit,@RequestParam("goodsoutprise")Double goodsoutprise,
				@RequestParam("goodsinprise")Double goodsinprise){
		//goodsname:z11,typeno:z12,supplierno:z13,goodsnorm:z14,goodsunit:z15,goodsoutprise:z16,goodsinprise:z17
		boolean result=false;
		String json=null;
		result=goodsService.insert(typeno, supplierno, goodsname, goodsnorm, goodsunit, 
									 goodsoutprise, goodsinprise);
		System.out.println(result);
		if(result){
			json="session";
			
		}
		return JSON.toJSONString(json);
	}

}
