package com.user.demo.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "user")
public class User {
	
	@Id
	private String empid;
	
	private String accesskey;
	
	private String country;
	
	public User() {}

	public User(String empid, String accesskey, String country) {
		super();
		this.empid = empid;
		this.accesskey = accesskey;
		this.country = country;
	}

	public String getEmpid() {
		return empid;
	}

	public void setEmpid(String empid) {
		this.empid = empid;
	}

	public String getAccesskey() {
		return accesskey;
	}

	public void setAccesskey(String accesskey) {
		this.accesskey = accesskey;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	@Override
	public String toString() {
		return "User [empid=" + empid + ", accesskey=" + accesskey + ", country=" + country + "]";
	}
	
}
