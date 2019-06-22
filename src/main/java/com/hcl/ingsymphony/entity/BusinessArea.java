package com.hcl.ingsymphony.entity;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class BusinessArea {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int areaId;
	private String areaName;
	@OneToMany
	private List<BusinessCategory> businessCategory;
	public int getAreaId() {
		return areaId;
	}
	public void setAreaId(int areaId) {
		this.areaId = areaId;
	}
	public String getAreaName() {
		return areaName;
	}
	public void setAreaName(String areaName) {
		this.areaName = areaName;
	}
	public List<BusinessCategory> getBusinessCategory() {
		return businessCategory;
	}
	public void setBusinessCategory(List<BusinessCategory> businessCategory) {
		this.businessCategory = businessCategory;
	}
	public BusinessArea() {
		super();
		
	}
	public BusinessArea(int areaId, String areaName, List<BusinessCategory> businessCategory) {
		super();
		this.areaId = areaId;
		this.areaName = areaName;
		this.businessCategory = businessCategory;
	}
	
	
	

}
