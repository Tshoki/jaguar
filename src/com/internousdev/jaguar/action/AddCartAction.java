package com.internousdev.jaguar.action;

import java.util.List;
import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.internousdev.jaguar.dao.CartInfoDAO;
import com.internousdev.jaguar.dto.CartInfoDTO;
import com.opensymphony.xwork2.ActionSupport;

public class AddCartAction extends ActionSupport implements SessionAware{

	private String userId;
	private int productId;
	private int productCount;

	private Map<String, Object> session;

	private List<CartInfoDTO> cartInfoDTOList;

	private int totalPrice; // 合計金額

	public String execute(){

		String ret = ERROR ;

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
		CartInfoDAO cartInfoDAO = new CartInfoDAO();

		if(cartInfoDAO.addCartInfo(userId, productId, productCount)){
			cartInfoDTOList = cartInfoDAO.getCartInfoDTOList(userId);
			totalPrice = cartInfoDAO.getTotalPrice(userId);

			ret = SUCCESS ;
		}

		return ret ;
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
