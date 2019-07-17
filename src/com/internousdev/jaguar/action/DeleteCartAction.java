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

	public String execute(){

		String ret = ERROR ;

		// タイムアウト確認
		if(!session.containsKey("tempUserId") && !session.containsKey("userId")){
			return "sessionTimeout";
		}

		// ログインフラグを参照 に userId の 値 を 設定
		if((int)session.get("logined") == 1){
			userId = session.get("userId").toString();
		}else{
			userId = session.get("tempUserId").toString();
		}

		CartInfoDAO cartInfoDAO = new CartInfoDAO();

		int count = 0;

		for(String productId: checkbox){
			count += cartInfoDAO.deleteCartInfo(userId, Integer.parseInt(productId));
		}

		if(count == checkbox.length){
			cartInfoDTOList = cartInfoDAO.getCartInfoDTOList(userId);
			totalPrice = cartInfoDAO.getTotalPrice(userId);

			ret = SUCCESS ;
		}

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

	public String[] getCheckbox(){
		return checkbox;
	}
	public void setCheckbox(String[] checkbox){
		this.checkbox = checkbox;
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
}
