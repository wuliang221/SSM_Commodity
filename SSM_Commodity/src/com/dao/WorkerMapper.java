package com.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.pojo.Worker;


public interface WorkerMapper {
	//根据账号、密码、职位匹配数据库
	public Worker getwork(@Param("workerno")Integer workerno,@Param("workerpwd")String workerpwd,
						@Param("adminno")Integer adminno);
	// 查询用户名（放入session）
	public Worker getWorkerName(@Param("workerno")Integer workerno);
	//分页查询所有员工的信息
	public List<Worker> getAllworker(@Param("pageNo")Integer pageNo,@Param("pageSize")Integer pageSize,
										@Param("workerno")Integer workerno,@Param("workername")String workername);
	
	//个人修改密码
	public int changePwd(@Param("workerno")Integer workerno,@Param("workerpwd")String workerpwd);
	
	//修改员工信息
	public int updateWorker(@Param("workerno")Integer workerno,@Param("adminno")Integer adminno,
			@Param("workername")String workername,@Param("workersex")String workersex,
			@Param("workerphone")String workerphone,@Param("workersalary")Integer workersalary,
			@Param("workerpwd")String workerpwd);
	
	//根据ID查询员工信息
	public Worker getWorker(@Param("workerno")Integer workerno);
	
	//添加员工信息
	public int addWorker(@Param("adminno")Integer adminno,@Param("workername")String workername,
							@Param("workersex")String workersex,@Param("workerphone")String workerphone,
							@Param("workersalary")Integer workersalary,@Param("workerpwd")String workerpwd);
	//根据ID删除员工信息
	public int delWorker(@Param("adminno")Integer adminno);
				
 
}