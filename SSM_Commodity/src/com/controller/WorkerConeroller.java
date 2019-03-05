package com.controller;

import java.util.List;

import javax.annotation.Resource;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.alibaba.fastjson.JSON;
import com.pojo.Worker;
import com.service.WorkerService;
import com.util.PageSupport;

@Controller
@RequestMapping("/worker")
public class WorkerConeroller {

	private Logger log = Logger.getLogger(WorkerConeroller.class);

	@Resource
	private WorkerService workerService;

	@RequestMapping("/worker.html")
	public String workerselet(Model model,
			@RequestParam(value = "pageNo", required = false) String pageNo,
			@RequestParam(value = "pageSize", required = false) Integer pageSize,
			@RequestParam(value = "workerno", required = false) Integer workerno,
			@RequestParam(value = "workername", required = false) String workername) {
		
		int result = workerService.countWorker();
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

		List<Worker> sellmx = workerService.getAllworker(index,
				ps.getPageSize(), workerno, workername);
		System.out.println(sellmx);
		model.addAttribute("sellmx", sellmx);
		model.addAttribute("ps", ps);
		model.addAttribute("workerno", workerno);
		model.addAttribute("workername", workername);
		return "stock/stocks6";
	}
	
	/**
	 * 个人修改密码
	 */
	@RequestMapping("/updatepwd.html")
	@ResponseBody
	public Object updatepwd(@RequestParam("workerno")Integer workerno,
			@RequestParam("workerpwd")String workerpwd){
		boolean result = false;
		String json=null;
		result=workerService.changePwd(workerno, workerpwd);
		if(result){
			return json="1";
				
		}
		return JSON.toJSONString(json);
			
	}
	
	/**
	 * 修改员工信息
	 */
	@RequestMapping("/updateworker.html")
	@ResponseBody
	public Object updateworker(@RequestParam("workerno") Integer workerno,
			@RequestParam("adminno") Integer adminno,
			@RequestParam("workername") String workername,
			@RequestParam("workersex") String workersex,
			@RequestParam("workerphone") String workerphone,
			@RequestParam("workersalary") Integer workersalary,
			@RequestParam("workerpwd") String workerpwd){
		boolean result = false;
		String json=null;
		result=workerService.updateWorker(workerno, adminno, workername, workersex, workerphone, workersalary, workerpwd);
		if(result){
			return json="1";
				
		}
		return JSON.toJSONString(json);
			
	}
	
	/**
	 * 添加员工信息
	 */
	@RequestMapping("/addworker.html")
	public String addworker(@RequestParam("workerno") Integer workerno,
			@RequestParam("adminno") Integer adminno,
			@RequestParam("workername") String workername,
			@RequestParam("workersex") String workersex,
			@RequestParam("workerphone") String workerphone,
			@RequestParam("workersalary") Integer workersalary,
			@RequestParam("workerpwd") String workerpwd) {
		boolean result = false;
		String json = null;
		result = workerService.addWorker(adminno, workername, workersex, workerphone, workersalary, workerpwd);
		if (result) {
			return json = "1";
		}
		return JSON.toJSONString(json);
	}
	
	/**
	 * 根据员工编号查询员工信息
	 */
	@RequestMapping("/seletworker.html")
	public String seletworker(Model model,@RequestParam(value="workerno")Integer workerno){
		Worker worker = workerService.getWorker(workerno);
		model.addAttribute("worker",worker);
		return null;
	}
	
	/**
	 * 根据姓名查询员工信息
	 */
	@RequestMapping("/seletworkername.html")
	public String seletworkername(Model model,@RequestParam(value="workername")String workername){
		Worker worker = workerService.getWorkername(workername);
		model.addAttribute("worker",worker);
		return null;
	}
	
	/**
	 * 根据员工编号删除员工信息
	 */
	@RequestMapping("/delworker.html")
	public String delworker(@RequestParam("workerno") Integer workerno) {
		boolean result = false;
		String json = null;
		result = workerService.delWorker(workerno);
		if (result) {
			json = "1";
		}
		return JSON.toJSONString(json);
	}
	
	
	
	
	
}
