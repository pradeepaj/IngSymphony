package com.hcl.ingsymphony.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Rules {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int ruleId;
	private String areaName;
	private String categoryName;
	private String severity;
	
	public Rules(int ruleId, String areaName, String categoryName, String severity) {
		super();
		this.ruleId = ruleId;
		this.areaName = areaName;
		this.categoryName = categoryName;
		this.severity = severity;
	}
	
	public Rules() {
		super();
	}

	public int getRuleId() {
		return ruleId;
	}
	public void setRuleId(int ruleId) {
		this.ruleId = ruleId;
	}
	public String getAreaName() {
		return areaName;
	}
	public void setAreaName(String areaName) {
		this.areaName = areaName;
	}
	public String getCategoryName() {
		return categoryName;
	}
	public void setCategoryName(String categoryName) {
		this.categoryName = categoryName;
	}
	public String getSeverity() {
		return severity;
	}
	public void setSeverity(String severity) {
		this.severity = severity;
	}

	
	

}
