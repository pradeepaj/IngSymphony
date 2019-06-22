package com.hcl.ingsymphony.dto;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Builder.Default;

public class BreachResponsDTO implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@JsonProperty
	private String businessArea;
	@JsonProperty

	private String businessCategory;
	@JsonProperty

	private String description;
	@JsonProperty

   
	private String status;
	@JsonProperty

	private String severity;

	public BreachResponsDTO() {
		super();
	}

	public BreachResponsDTO(String businessArea, String businessCategory, String description, String status,
			String severity) {
		super();
		this.businessArea = businessArea;
		this.businessCategory = businessCategory;
		this.description = description;
		this.status = status;
		this.severity = severity;
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

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = "Pending approval";
	}

	public String getSeverity() {
		return severity;
	}

	public void setSeverity(String severity) {
		this.severity = severity;
	}

}
