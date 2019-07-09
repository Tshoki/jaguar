package com.internousdev.jaguar.action;

import java.util.List;
import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.internousdev.jaguar.dao.CartInfoDAO;
import com.internousdev.jaguar.dto.CartInfoDTO;
import com.opensymphony.xwork2.ActionSupport;

public class DeleteCartAction extends ActionSupport implements SessionAware{

	private String userId;
	private int productId;
	private int productCount;

	private String[] checkbox;


	private List<CartInfoDTO> cartInfoDTOList;

	private Map<String, Object> session;

	private int totalPrice; // 合計金額

	// 未完成
	public String execute(){

		String ret = ERROR ;

		// タイムアウト sessionTimeout

		// ログインフラグを参照 に userId の 値 を 設定
		if((Integer)(session.get("logined")) == 1){
			userId = session.get("userId").toString();
		}else{
			userId = session.get("tempUserId").toString();
		}

		CartInfoDAO cartInfoDAO = new CartInfoDAO();

		int count = 0;

		for(String productId: checkbox){
			count += cartInfoDAO.deleteTempCartInfo(userId, Integer.parseInt(productId));
		}
		cartInfoDTOList = cartInfoDAO.getCartInfoDTOList(userId);
		totalPrice = cartInfoDAO.getTotalPrice(userId);

		ret = SUCCESS ;
		/*
		count = cartInfoDAO.deleteCartInfo(String userId, );

		if(cartInfoDAO.○○){
			cartInfoDTOList = cartInfoDAO.getCartInfoDTOList(userId);
			totalPrice = cartInfoDAO.getTotalPrice(userId);

			ret = SUCCESS ;
		}
		*/

		return ret ;
	}


	public String getUserId(){
		return userId;
	}
	public void setUserId(String userId){
		this.userId = userId;
	}
	public int getProductId(){
		return productId;
	}
	public void setProductId(int productId){
		this.productId = productId;
	}
	public int getProductCount(){
		return productCount;
	}
	public void setProductCount(int productCount){
		this.productCount = productCount;
	}
	public int getTotalPrice(){
		return totalPrice;
	}
	public void setTotalPrice(int totalPrice){
		this.totalPrice = totalPrice;
	}

	public List<CartInfoDTO> getCartInfoDTOList(){
		return cartInfoDTOList;
	}
	public void setCartInfoDTOList(List<CartInfoDTO> cartInfoDTOList){
		this.cartInfoDTOList = cartInfoDTOList;
	}
	public Map<String, Object> getSession(){
		return session;
	}
	public void setSession(Map<String, Object> session){
		this.session = session;
	}

	public String[] getCheckbox() {
		return checkbox;
	}
	public void setCheckbox(String[] checkbox) {
		this.checkbox = checkbox;
	}

}
