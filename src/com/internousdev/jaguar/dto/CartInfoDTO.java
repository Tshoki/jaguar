package com.internousdev.jaguar.dto;

public class CartInfoDTO {

	private String userId;
	private int productId;
	private int productCount;


	public String getUserId(){
		return userId;
	}
	public void setUserId(String userId){
		this.userId = userId;
	}
	public int getproductId(){
		return productId;
	}
	public void setProductId(int productId){
		this.productId = productId;
	}
	public int getproductCount(){
		return productCount;
	}
	public void setProductCount(int productCount){
		this.productCount = productCount;
	}

}
