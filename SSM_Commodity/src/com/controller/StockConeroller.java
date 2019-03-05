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

import com.pojo.Stock;
import com.service.StockService;
import com.util.PageSupport;

@Controller
@RequestMapping("/stock")
public class StockConeroller {

	private Logger log = Logger.getLogger(StockConeroller.class);

	@Resource
	private StockService stockService;

	/**
	 * 分页查询进货信息
	 */
	@RequestMapping("/stock.html")
	public String stockselect(
			Model model,
			@RequestParam(value = "pageNo", required = false) String pageNo,
			@RequestParam(value = "workername", required = false) String workername,
			@RequestParam(value = "suppliername", required = false) String suppliername,
			@RequestParam("stockdate") Date stockdate) {

		int result = stockService.countStock();
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

		List<Stock> stock = stockService.findAllStock(index, ps.getPageSize(),
				workername, suppliername, stockdate);
		System.out.println(stock);
		model.addAttribute("stock", stock);
		model.addAttribute("ps", ps);
		return "stock/stocks6";

	}

	/**
	 * 添加进货信息
	 */
	@RequestMapping("addstock.html")
	public String addstock(@RequestParam("stockno") Integer stockno,
			@RequestParam("goodsno") Integer goodsno,
			@RequestParam("supplierno") Integer supplierno,
			@RequestParam("workerno") Integer workerno,
			@RequestParam("stockcount") Integer stockcount,
			@RequestParam("stocklastinprise") Double stocklastinprise,
			@RequestParam("stockdate") Date stockdate) {
		String json = null;
		int result = stockService.addStock(stockno, goodsno, supplierno,
				workerno, stockcount, stocklastinprise, stockdate);
		if (result > 0) {
			return json = "1";
		}
		return json;
	}

	/**
	 * 根据进货单号修改进货信息
	 */
	@RequestMapping("/updatestock.html")
	@ResponseBody
	public Object updatestock(@RequestParam("stockno") Integer stockno,
			@RequestParam("goodsno") Integer goodsno,
			@RequestParam("supplierno") Integer supplierno,
			@RequestParam("workerno") Integer workerno,
			@RequestParam("stockcount") Integer stockcount,
			@RequestParam("stocklastinprise") Double stocklastinprise,
			@RequestParam("stockdate") Date stockdate) {
		String json = null;
		Integer result = stockService.updateStock(stockno, goodsno, supplierno,
				workerno, stockcount, stocklastinprise, stockdate);
		if (result > 0) {
			return json = "1";

		}
		return json;

	}

	//	/**
	//	 * 根据进货单号查询进货信息
	//	 */
	// @RequestMapping("selet.html")
	// public String selet(Model model,@RequestParam(value="stockno")Integer
	// stockno){
	// Stock stock=stockService.Stock(stockno);
	// model.addAttribute("stock",stock);
	// return null;
	// }
	//	/**
	//	 * 根据员工姓名查询进货信息
	//	 */
	// @RequestMapping("selet1.html")
	// public String selet1(Model model,@RequestParam(value="workerName")String
	// workerName){
	// Stock stock=stockService.workerStock(workerName);
	// model.addAttribute("stock",stock);
	// return null;
	// }
	//	/**
	//	 * 根据进货日期查询进货信息
	//	 */
	// @RequestMapping("selet2.html")
	// public String selet2(Model model,@RequestParam(value="stockdate")Date
	// stockdate){
	// Stock stock=stockService.dateStock(stockdate);
	// model.addAttribute("stock",stock);
	// return null;
	// }

	/**
	 * 根据进货单号删除进货信息
	 */
	@RequestMapping("delstock.html")
	public String delstock(@RequestParam("stockno") Integer stockno) {
		String json = "";
		int result = stockService.delStock(stockno);
		if (result > 0) {
			json = "1";
		}
		return json;
	}
}
