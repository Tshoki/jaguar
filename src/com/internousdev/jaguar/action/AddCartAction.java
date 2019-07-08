package com.internousdev.jaguar.action;

import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.internousdev.jaguar.dao.CartInfoDAO;
import com.opensymphony.xwork2.ActionSupport;

public class AddCartAction extends ActionSupport implements SessionAware{

	private String userId;

	private CartInfoDAO cartInfoDAO = new CartInfoDAO();

	private Map<String, Object> session;

	private int productId;

	private int productCount;

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

		// userId と 紐付けたカート情報に 同じ商品があるかないか分岐
		if(cartInfoDAO.addCartInfo(userId, productId, productCount)){
			//
		}else{
			//
		}

		return ERROR ;
	}

	public Map<String, Object> getSession(){
		return session;
	}
	public void setSession(Map<String, Object> session){
		this.session = session;
	}

}
