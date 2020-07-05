package com.user.demo.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "useraccess")
public class Useraccess {
	
	@Id
	private String empid;
	
	private String accesskey;
	
	private String country;
	
	private String subuser;
	
	private String subuser_accesskey;
	
	private String subuser_country;
	
	public Useraccess() {}

	public Useraccess(String empid, String accesskey, String country, String subuser, String subuser_accesskey,
			String subuser_country) {
		super();
		this.empid = empid;
		this.accesskey = accesskey;
		this.country = country;
		this.subuser = subuser;
		this.subuser_accesskey = subuser_accesskey;
		this.subuser_country = subuser_country;
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

	public String getSubuser() {
		return subuser;
	}

	public void setSubuser(String subuser) {
		this.subuser = subuser;
	}

	public String getSubuser_accesskey() {
		return subuser_accesskey;
	}

	public void setSubuser_accesskey(String subuser_accesskey) {
		this.subuser_accesskey = subuser_accesskey;
	}

	public String getSubuser_country() {
		return subuser_country;
	}

	public void setSubuser_country(String subuser_country) {
		this.subuser_country = subuser_country;
	}

	@Override
	public String toString() {
		return "Useraccess [empid=" + empid + ", accesskey=" + accesskey + ", country=" + country + ", subuser="
				+ subuser + ", subuser_accesskey=" + subuser_accesskey + ", subuser_country=" + subuser_country + "]";
	}
	
}
