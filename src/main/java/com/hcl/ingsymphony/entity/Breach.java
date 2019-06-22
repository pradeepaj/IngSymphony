package com.hcl.ingsymphony.entity;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Breach implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int breachId;
	private int userId;
	private String businessArea;
	private String businessCategory;
	private String severity;
	private String status;
	private String description;

	
	public Breach(int breachId, String businessArea, String businessCategory, String severity, String status,
			String description,int userId) {
		super();
		this.breachId = breachId;
		this.businessArea = businessArea;
		this.businessCategory = businessCategory;
		this.severity = severity;
		this.status = status;
		this.description = description;
		this.userId=userId;
	}

	public Breach() {
		super();
	}
	public int getBreachId() {
		return breachId;
	}
	public void setBreachId(int breachId) {
		this.breachId = breachId;
	}
	public int getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
	}
	public String getBusinessArea() {
		return businessArea;
	}
	public void setBusinessArea(String businessArea) {
		this.businessArea = businessArea;
	}
	public String getBusinessCategory() {
		return businessCategory;
	}
	public void setBusinessCategory(String businessCategory) {
		this.businessCategory = businessCategory;
	}
	public String getSeverity() {
		return severity;
	}
	public void setSeverity(String severity) {
		this.severity = severity;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public Breach(int breachId, int userId, String businessArea, String businessCategory, String severity,
			String status, String description) {
		super();
		this.breachId = breachId;
		this.userId = userId;
		this.businessArea = businessArea;
		this.businessCategory = businessCategory;
		this.severity = severity;
		this.status = status;
		this.description = description;
	}

	public Breach(int breachId2, long l, String businessCategory2, String severity2, String status2,
			String description2, String string) {
		// TODO Auto-generated constructor stub
	}
	
	
	
	

}
