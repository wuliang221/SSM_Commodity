package com.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Service;

import com.dao.WorkerMapper;
import com.pojo.Worker;
import com.service.WorkerService;
@Service
public class WorkerServiceImpl implements WorkerService {
	@Resource
	private WorkerMapper workerMapper;

	/**
	 * 匹配用户信息进行登陆
	 */
	@Override
	public boolean findworker(Integer workerno, String workerpwd, Integer adminno) {
		boolean result=false;
		Worker worker=workerMapper.getwork(workerno, workerpwd, adminno);
		if(worker !=null){
			result=true;
		}
		return result;
	}
	/**
	 * 用户名
	 */
	@Override
	public Worker getWorkerName(Integer workerno) {
		return workerMapper.getWorkerName(workerno);
	}
	//查询所有的员工
	@Override
	public List<Worker> getAllworker(Integer pageNo, Integer pageSize,
			Integer workerno, String workername) {
		return workerMapper.getAllworker(pageNo, pageSize, workerno, workername);
	}
	//判断员工密码是否更改成功
	@Override
	public boolean changePwd(Integer workerno, String workerpwd) {
		boolean result=false;
		int rs=workerMapper.changePwd(workerno, workerpwd);
		if(rs>0){
			result=true;
		}
		return result;
	}
	//判断员工信息是否修改成功
	@Override
	public boolean updateWorker(Integer workerno, Integer adminno,
			String workername, String workersex, String workerphone,
			Integer workersalary, String workerpwd) {
		
		boolean result=false;
		int rs=workerMapper.updateWorker(workerno, adminno, workername, 
											workersex, workerphone, workersalary, workerpwd);
		if(rs>0){
			result=true;
		}
		return result;
	}
	//根据ID查询员工信息
	@Override
	public Worker getWorker(Integer workerno) {
		
		return workerMapper.getWorker(workerno);
	}
	@Override
	public boolean addWorker(Integer adminno, String workername,
			String workersex, String workerphone, Integer workersalary,
			String workerpwd) {
		
		boolean result=false;
		int rs=workerMapper.addWorker(adminno, workername, workersex, workerphone, workersalary, workerpwd);
		if(rs>0){
			result=true;
		}
		return result;
	}
	@Override
	public boolean delWorker(Integer adminno) {

		boolean result=false;
		int rs=workerMapper.delWorker(adminno);
		if(rs>0){
			result=true;
		}
		return result;
	}
	 

}
