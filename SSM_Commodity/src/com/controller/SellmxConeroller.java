package com.controller;

import java.util.Date;
import java.util.List;

import javax.annotation.Resource;

import org.apache.ibatis.annotations.Param;
import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.pojo.Sellmx;
import com.service.SellmxService;
import com.util.PageSupport;

@Controller
@RequestMapping("/sellmx")
public class SellmxConeroller {

	private Logger log = Logger.getLogger(SellmxConeroller.class);

	@Resource
	private SellmxService sellmxService;

	/**
	 * 分页查询销售的信息
	 */
	@RequestMapping("/sellmx.html")
	public String sellmxselect(
			Model model,
			@RequestParam(value = "pageNo", required = false) String pageNo,
			@RequestParam(value = "goodsno", required = false) Integer goodsno,
			@RequestParam(value = "workerno", required = false) Integer workerno,
			@RequestParam(value = "sellno", required = false) Integer sellno,
			@RequestParam("sellmxdate") Date sellmxdate) {

		int result = sellmxService.countSell();
		if (pageNo == null || pageNo == "") {
			pageNo = "1";
		}
		int currPageNo = Integer.parseInt(pageNo);
		if (currPageNo < 1) {
			currPageNo = 1;
		}
		System.out.println(currPageNo);
		PageSupport ps = new PageSupport();
		ps.setPageSize(5);
		ps.setTotalCount(result);
		if (currPageNo > ps.getTotalPageCount()) {
			currPageNo = ps.getTotalPageCount();
		}
		ps.setCurrPageNo(currPageNo);
		int index = (ps.getCurrPageNo() - 1) * ps.getPageSize();
		if (index < 0) {
			index = 1;
		}
		log.info("==========================" + (ps.getCurrPageNo() - 1)
				* ps.getPageSize());

		List<Sellmx> sellmx = sellmxService.getAllSellmx(index,
				ps.getPageSize(), goodsno, workerno, sellno, sellmxdate);
		System.out.println(sellmx);
		model.addAttribute("sellmx", sellmx);
		model.addAttribute("ps", ps);
		return "stock/stocks6";

	}

	/**
	 * 添加销售信息
	 */
	@RequestMapping("addsellmx.html")
	public String addsellmx(@Param("sellmxno") Integer sellmxno,
			@Param("goodsno") Integer goodsno,
			@Param("workerno") Integer workerno,
			@Param("sellno") Integer sellno,
			@Param("sellmxcount") Integer sellmxcount,
			@Param("sellmxzprise") Double sellmxzprise,
			@Param("sellmxdate") Date sellmxdate) {
		String json = null;
		int result = sellmxService.addSellmx(sellmxno, goodsno, workerno,
				sellno, sellmxcount, sellmxzprise, sellmxdate);
		if (result > 0) {
			return json = "1";
		}
		return json;
	}
	
	/**
	 * 根据销售单号修改销售信息
	 */
	@RequestMapping("/updatesellmx.html")
	@ResponseBody
	public Object updatesellmx(@Param("sellmxno") Integer sellmxno,
			@Param("goodsno") Integer goodsno,
			@Param("workerno") Integer workerno,
			@Param("sellno") Integer sellno,
			@Param("sellmxcount") Integer sellmxcount,
			@Param("sellmxzprise") Double sellmxzprise,
			@Param("sellmxdate") Date sellmxdate){
		String json=null;
		Integer result=sellmxService.addSellmx(sellmxno, goodsno, workerno, sellno, sellmxcount, sellmxzprise, sellmxdate);
		if(result>0){
			return json="1";
				
		}
		return json;
			
	}
	
	/**
	 * 根据销售编号查询销售信息
	 */
	@RequestMapping("selet.html")
	public String selet(Model model,@RequestParam(value="sellmxno")Integer sellmxno){
		Sellmx sellmx = sellmxService.sellmx(sellmxno);
		model.addAttribute("sellmx",sellmx);
		return null;
	}

	/**
	 * 根据销售单号删除销售信息
	 */
	@RequestMapping("delsellmx.html")
	public String delsellmx(@Param("sellmxno") Integer sellmxno) {
		String json = null;
		int result = sellmxService.delSellmx(sellmxno);
		if (result > 0) {
			json = "1";
		}
		return json;
	}

}
