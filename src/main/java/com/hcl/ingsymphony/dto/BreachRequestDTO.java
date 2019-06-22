package com.hcl.ingsymphony.dto;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonProperty;

public class BreachRequestDTO implements Serializable {

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

	public BreachRequestDTO() {
		super();
	}

	public BreachRequestDTO(String businessArea, String businessCategory, String description) {
		super();
		this.businessArea = businessArea;
		this.businessCategory = businessCategory;
		this.description = description;
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

}
