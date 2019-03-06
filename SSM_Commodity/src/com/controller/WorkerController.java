package com.controller;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.pojo.Worker;
import com.service.WorkerService;
import com.util.PageSupport;

@Controller
@RequestMapping("/worker")
public class WorkerController {
	@Resource
	private WorkerService workerService;
	@RequestMapping(value="/worker.html")
	public String workerAll(@RequestParam(value="pageNo",required = false)String pageNo,
							@RequestParam(value="workername",required=false)String workername,
							@RequestParam(value="workerno",required=false)Integer workerno,Model model){
		
		

		int result = workerService.countWorker(workername, workerno);
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

		List<Worker> worker = workerService.getAllworker(index, ps.getPageSize(), workerno, workername);
		System.out.println(worker);
		model.addAttribute("ygworkername", workername);
		model.addAttribute("worker", worker);
		model.addAttribute("ps", ps);
		return "Table/TableYG1";
		
		
	}
}
