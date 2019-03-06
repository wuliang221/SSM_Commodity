package com.pojo;
/**
 * 员工信息表
 * @author lu
 *
 */
public class Worker {
	//员工编号
    private Integer workerno;
    //职位编号
    private Integer adminno;
    //姓名
    private String workername;
    //性别
    private String workersex;
    //联系电话
    private String workerphone;
    //工资
    private Integer workersalary;
    //密码
    private String workerpwd;
    
    private String adminname;

    
    public String getAdminname() {
		return adminname;
	}

	public void setAdminname(String adminname) {
		this.adminname = adminname;
	}

	public Integer getWorkerno() {
        return workerno;
    }

    public void setWorkerno(Integer workerno) {
        this.workerno = workerno;
    }

    public Integer getAdminno() {
        return adminno;
    }

    public void setAdminno(Integer adminno) {
        this.adminno = adminno;
    }

    public String getWorkername() {
        return workername;
    }

    public void setWorkername(String workername) {
        this.workername = workername == null ? null : workername.trim();
    }

    public String getWorkersex() {
        return workersex;
    }

    public void setWorkersex(String workersex) {
        this.workersex = workersex == null ? null : workersex.trim();
    }

    public String getWorkerphone() {
        return workerphone;
    }

    public void setWorkerphone(String workerphone) {
        this.workerphone = workerphone == null ? null : workerphone.trim();
    }

    public Integer getWorkersalary() {
        return workersalary;
    }

    public void setWorkersalary(Integer workersalary) {
        this.workersalary = workersalary;
    }

    public String getWorkerpwd() {
        return workerpwd;
    }

    public void setWorkerpwd(String workerpwd) {
        this.workerpwd = workerpwd == null ? null : workerpwd.trim();
    }
}