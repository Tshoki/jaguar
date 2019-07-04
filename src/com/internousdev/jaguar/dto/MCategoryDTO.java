package com.internousdev.jaguar.dto;

public class MCategoryDTO {
	private int id;
	private int categoryId;
	private String categoryName;
	private String categoryDetails;

	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
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
	public String getCategoryDetails() {
		return categoryDetails;
	}
	public void setCategoryDescription(String categoryDetails) {
		this.categoryDetails = categoryDetails;
	}
}
