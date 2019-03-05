package com.service;

import java.util.List;

import com.pojo.Worker;


public interface WorkerService {
	
	//根据账号、密码、职位匹配数据库
		public boolean findworker(Integer workerno,String workerpwd,Integer adminno);

		
		//  查询用户名（放入session）
		public Worker getWorkerName(Integer workerno);
		
		
		//分页查询所有员工的信息
		public List<Worker> getAllworker(Integer pageNo,Integer pageSize,
											Integer workerno,String workername);
		
		//个人修改密码
		public boolean changePwd(Integer workerno,String workerpwd);
		
		//修改员工信息
		public boolean updateWorker(Integer workerno,Integer adminno,
				String workername,String workersex,
				String workerphone,Integer workersalary,
				String workerpwd);
		
		//根据ID查询员工信息
		public Worker getWorker(Integer workerno);
		
		
		
		//添加员工信息
		public boolean addWorker(Integer adminno,String workername,
								String workersex,String workerphone,
								Integer workersalary,String workerpwd);
		//根据ID删除员工信息
		public boolean delWorker(Integer adminno);
}
