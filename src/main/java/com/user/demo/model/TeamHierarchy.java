package com.user.demo.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "teamhierarchy")
public class TeamHierarchy {
	
	@Id
	private String empid;
	
	private String managerid;
	
	public TeamHierarchy() {}
	
	public TeamHierarchy(String empid, String managerid) {
		super();
		this.empid = empid;
		this.managerid = managerid;
	}

	public String getEmpid() {
		return empid;
	}

	public void setEmpid(String empid) {
		this.empid = empid;
	}

	public String getManagerid() {
		return managerid;
	}

	public void setManagerid(String managerid) {
		this.managerid = managerid;
	}

	@Override
	public String toString() {
		return "TeamHierarchy [empid=" + empid + ", managerid=" + managerid + "]";
	}
	

}
