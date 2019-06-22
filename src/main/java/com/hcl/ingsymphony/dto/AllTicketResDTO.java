package com.hcl.ingsymphony.dto;

public class AllTicketResDTO {
	private String businessArea;
	private String businessCategory;
	private String severity;
	private String status;
	private String description;
	private Long breachId;

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

	public AllTicketResDTO(String businessArea, String businessCategory, String severity, String status,
			String description, Long breachId) {
		super();
		this.businessArea = businessArea;
		this.businessCategory = businessCategory;
		this.severity = severity;
		this.status = status;
		this.description = description;
		this.breachId = breachId;
	}
}
