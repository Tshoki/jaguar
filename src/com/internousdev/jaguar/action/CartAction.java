package com.internousdev.jaguar.action;

import java.util.List;
import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.internousdev.jaguar.dao.CartInfoDAO;
import com.internousdev.jaguar.dto.CartInfoDTO;
import com.opensymphony.xwork2.ActionSupport;

public class CartAction extends ActionSupport implements SessionAware{

	private String userId;

	private Map<String, Object> session;

	private List<CartInfoDTO> cartInfoDTOList;

	private int totalPrice;

	public String execute(){

		String ret = SUCCESS ;

		// タイムアウト確認
		if(!session.containsKey("tempUserId") && !session.containsKey("userId")){
			ret = "sessionTimeout";
		}

		// ログインフラグを参照 に userId の 値 を 設定
		if((int)session.get("logined") == 1){
			userId = session.get("userId").toString();
		}else{
			userId = session.get("tempUserId").toString();
		}

		CartInfoDAO cartInfoDAO = new CartInfoDAO();

		// カート情報 抽出
		cartInfoDTOList = cartInfoDAO.getCartInfoDTOList(userId);

		// 合計金額 算出
		totalPrice = cartInfoDAO.getTotalPrice(userId);

		return ret ;
	}

	public String getUserId(){
		return userId;
	}
	public void setUserId(String userId){
		this.userId = userId;
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
