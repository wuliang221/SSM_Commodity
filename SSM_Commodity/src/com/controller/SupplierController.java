package com.controller;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.pojo.Supplier;
import com.service.SupplierService;
import com.util.PageSupport;

@Controller
@RequestMapping("/supplier")
public class SupplierController {
	@Resource
	private SupplierService supplierService;
	
	@RequestMapping("/suppslelct.html")
	public String SupplierAll(Model model,@RequestParam(value = "pageNo", required = false) String pageNo,
								@RequestParam(value = "suppliername", required = false)String suppliername){
		
		
		int result = supplierService.countSupplier();
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

		List<Supplier> supplier = supplierService.findAllSupplier(index, ps.getPageSize(), suppliername);
		System.out.println(supplier);
		model.addAttribute("supplier", supplier);
		model.addAttribute("ps", ps);
		return "Table/TableGYS1";
	}

}
