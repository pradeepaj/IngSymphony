package com.hcl.ingsymphony.entity;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
@Entity
public class AllTickets implements Serializable {
	
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long employeeId;
	private String businessArea;
	private String businessCategory;
	private String severity;
	private String status;
	private String description;
	private Long breachId;
	public AllTickets() {
		
	}
	public Long getEmployeeId() {
		return employeeId;
	}
	public void setEmployeeId(Long employeeId) {
		this.employeeId = employeeId;
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
	public Long getBreachId() {
		return breachId;
	}
	public void setBreachId(Long breachId) {
		this.breachId = breachId;
	}
	public AllTickets(Long employeeId, String businessArea, String businessCategory, String severity, String status,
			String description, Long breachId) {
		super();
		this.employeeId = employeeId;
		this.businessArea = businessArea;
		this.businessCategory = businessCategory;
		this.severity = severity;
		this.status = status;
		this.description = description;
		this.breachId = breachId;
	}
}
