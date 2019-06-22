package com.hcl.ingsymphony.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class User {
	
	@Id
	
	private int empId;
	private String password;
	public User() {
		super();
			}
	public User(int empId, String password) {
		super();
		this.empId = empId;
		this.password = password;
	}
	public int getEmpId() {
		return empId;
	}
	public void setEmpId(int empId) {
		this.empId = empId;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	

	
}


