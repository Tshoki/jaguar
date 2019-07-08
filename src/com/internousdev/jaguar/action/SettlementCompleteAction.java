package com.internousdev.jaguar.action;

import java.util.List;
import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.internousdev.jaguar.dao.CartInfoDAO;
import com.internousdev.jaguar.dao.PurchaseHistoryInfoDAO;
import com.internousdev.jaguar.dto.CartInfoDTO;
import com.opensymphony.xwork2.ActionSupport;

public class SettlementCompleteAction extends ActionSupport implements SessionAware{
  private int id;
  private Map<String, Object> session;

  public String execute() {
	  //sessionのタイムアウトのチェック
	  if(!session.containsKey("tempUserId") && !session.containsKey("userId")) {
	    return "sessionTimeout";
	  }
	  String result = ERROR;

	  String userId = session.get("userId").toString();
	  //sessionの情報をList<CartInfoDTO>型にダウンキャスト
	  @SuppressWarnings("unchecked")
	List<CartInfoDTO> cartInfoDTOList = (List<CartInfoDTO>) session.get("CartInfoDTOList");

	PurchaseHistoryInfoDAO purchaseHistoryInfoDAO = new PurchaseHistoryInfoDAO();
	int count = 0;
	//購入商品の情報が格納されたCartInfoDTOをList内にあるだけpurchaseHistoryInfoDAOを使って、
	//購入履歴テーブルに挿入し、その挿入された商品情報の総数をcountに代入する。
	for(CartInfoDTO dto : cartInfoDTOList) {
		count += purchaseHistoryInfoDAO.regist(
				userId,
				dto.getProductId(),
				dto.getProductCount(),
				id,
				dto.getPrice()
		);
	}
	if(count>0) {
		CartInfoDAO cartInfoDAO = new CartInfoDAO();
		//そのユーザーのカート内の情報を購入後に全て削除する。
		count = cartInfoDAO.カート内の要素を全て消去するメソッド名(String.valueOf(session.get("userId")));
		result = SUCCESS;
	}

	    return result;
  }

public Map<String, Object> getSession() {
	return session;
}

public void setSession(Map<String, Object> session) {
	this.session = session;
}

public int getId() {
	return id;
}

public void setId(int id) {
	this.id = id;
}

}
