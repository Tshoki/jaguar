package com.internousdev.jaguar.action;

import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.internousdev.jaguar.dao.CartInfoDAO;
import com.internousdev.jaguar.dto.CartInfoDTO;
import com.opensymphony.xwork2.ActionSupport;

public class CartAction extends ActionSupport implements SessionAware{

	CartInfoDAO dao = new CartInfoDAO();
	CartInfoDTO dto = new CartInfoDTO();

	private Map<String, Object> session;

	public String execute(){

		// タイムアウト処理
		if(){
			return sessionTimeout;
		}

		// カート情報全部持ってくるリスト
		session.get(userId);
		List = dao.getCartInfo(userId);

		// 合計金額演算
		totalPrice = CartInfoDAO 演算(userId);


		return SUCCESS ;
	}


	public Map<String, Object> getSession(){
		return session;
	}
	public void setSession(Map<String, Object> session){
		this.session = session;
	}
}
