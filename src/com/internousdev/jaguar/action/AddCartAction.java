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
			ret = sessionTimeout;
		}
		*/

		// session 前後の括弧を外す修正 2019-07-09
		// ログインフラグを参照 に userId の 値 を 設定
		if((Integer)session.get("logined") == 1){
			userId = session.get("userId").toString();
		}else{
			userId = session.get("tempUserId").toString();
		}

		CartInfoDAO cartInfoDAO = new CartInfoDAO();
		int count = 0;

		// userId と 紐付けたカート情報に 同じ商品があるかないか分岐
		if(cartInfoDAO.checkCartInfo(userId, productId)){
			count = cartInfoDAO.countUpProduct(userId, productId, productCount);
		}else{
			count = cartInfoDAO.createProductId(userId, productId, productCount);
		}
		if(count > 0){
			// カート情報 抽出
			cartInfoDTOList = cartInfoDAO.getCartInfoDTOList(userId);

			// 合計金額 算出
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

	public Map<String, Object> getSession() {
		return session;
	}
	public void setSession(Map<String, Object> session) {
		this.session = session;
	}

	public List<CartInfoDTO> getCartInfoDTOList() {
		return cartInfoDTOList;
	}
	public void setCartInfoDTOList(List<CartInfoDTO> cartInfoDTOList) {
		this.cartInfoDTOList = cartInfoDTOList;
	}

	public int getTotalPrice() {
		return totalPrice;
	}
	public void setTotalPrice(int totalPrice) {
		this.totalPrice = totalPrice;
	}
}
