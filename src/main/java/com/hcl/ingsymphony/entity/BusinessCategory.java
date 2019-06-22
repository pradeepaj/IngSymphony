package com.hcl.ingsymphony.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class BusinessCategory {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int categoryId;
	private String categoryName;
	@ManyToOne
	private BusinessArea businessArea;
	public BusinessCategory() {
		super();
		
	}
	public BusinessCategory(int categoryId, String categoryName, BusinessArea businessArea) {
		super();
		this.categoryId = categoryId;
		this.categoryName = categoryName;
		this.businessArea = businessArea;
	}
	public int getCategoryId() {
		return categoryId;
	}
	public void setCategoryId(int categoryId) {
		this.categoryId = categoryId;
	}
	public String getCategoryName() {
		return categoryName;
	}
	public void setCategoryName(String categoryName) {
		this.categoryName = categoryName;
	}
	public BusinessArea getBusinessArea() {
		return businessArea;
	}
	public void setBusinessArea(BusinessArea businessArea) {
		this.businessArea = businessArea;
	}

}
