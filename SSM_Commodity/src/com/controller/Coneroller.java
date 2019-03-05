package com.controller;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.alibaba.fastjson.JSON;
import com.pojo.Admin;
import com.pojo.Worker;
import com.service.AdminService;
import com.service.SupplierService;
import com.service.TypeService;
import com.service.WorkerService;


@Controller
@RequestMapping("/fin")
public class Coneroller {
	@Resource
	private WorkerService workerService;
	@Resource
	private AdminService adminService;
	
	@Resource
	private SupplierService supplierService;
	
	@Resource
	private TypeService typeService;

	//登录页面
	@RequestMapping("/f.html")
	public String DL(){
		return "login";
	}
	
	//主页
	@RequestMapping("/z.html")
	public String ZY(Model model){
		//获取所有供应商
		model.addAttribute("supplier", supplierService.allSupplier());
		//获取所有商品分类
		model.addAttribute("type", typeService.alltype());
		return "MyJsp";
	}
	
	//主页
	@RequestMapping("/z2.html")
	public String ZY2(){
		return "MyJsp";
	}
	
	//登陆判断
	@RequestMapping(value="/dl.json",method=RequestMethod.POST)
	@ResponseBody
	public Object login(@RequestParam("userNo")Integer userNo,@RequestParam("password")String password,
						@RequestParam("chooseDl")Integer chooseDl,HttpSession session,HttpServletRequest request){
		boolean result=workerService.findworker(userNo, password, chooseDl);
		Worker worker=workerService.getWorkerName(userNo);
		Admin admin=adminService.findAdm(chooseDl);
		String json="";
		if(result==true){
			session.setAttribute("chooseDl", chooseDl);
			session.setAttribute("admin", admin.getAdminname());
			session.setAttribute("userName", worker.getWorkername());
			json="session1";
		}
		System.out.println(json);
		return JSON.toJSONString(json);
		
	}

}
