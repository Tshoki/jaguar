package com.internousdev.jaguar.action;

import java.util.List;
import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.internousdev.jaguar.dao.CartInfoDAO;
import com.internousdev.jaguar.dto.CartInfoDTO;
import com.opensymphony.xwork2.ActionSupport;

public class CartAction extends ActionSupport implements SessionAware{

	private CartInfoDAO cartInfoDAO = new CartInfoDAO();

	private String userId;
	private List<CartInfoDTO> cartInfoDTOList;
	private int totalPrice;

	private Map<String, Object> session;

	public String execute(){

		/* タイムアウト処理
		if(){
			return sessionTimeout;
		}
		*/

		// ログインフラグを参照 に userId の 値 を 設定
		if((Integer)(session.get("logined")) == 1){
			userId = session.get("userId").toString();
		}else{
			userId = session.get("tempUserId").toString();
		}

		//
		cartInfoDTOList = cartInfoDAO.getCartInfoDTOList(userId);

		// 合計金額
		totalPrice = cartInfoDAO.getTotalPrice(userId);

		return SUCCESS ;
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
