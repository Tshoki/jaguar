package com.internousdev.jaguar.action;

import java.util.List;
import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.internousdev.jaguar.dao.PurchaseHistoryInfoDAO;
import com.internousdev.jaguar.dto.CartInfoDTO;
import com.opensymphony.xwork2.ActionSupport;

public class SettlementCompleteAction extends ActionSupport implements SessionAware{
  private int id;
  private Map<String, Object> session;

  public String execute() {
	  if(!session.containsKey("tempUserId") && !session.containsKey("userId")) {
	    return "sessionTimeout";
	  }
	  String result = ERROR;

	  String userId = session.get("userId").toString();

	  @SuppressWarnings("unchecked")
	List<CartInfoDTO> cartInfoDTOList = (List<CartInfoDTO>) session.get("CartInfoDTOList");

	PurchaseHistoryInfoDAO purchaseHistoryInfoDAO = new PurchaseHistoryInfoDAO();
	int count = 0;
	for(CartInfoDTO dto : cartInfoDTOList) {
		count += purchaseHistoryInfoDAO.購入履歴を登録するメソッド名(
				userId,
				dto.getProduceId(),
				dto.getproductCount(),
				id,
				dto.getPrice()
		);
	}
	if(count>0) {
		CartInfoDAO cartInfoDAO = new CartInfoDAO();
		count = cartInfoDAO.カート内の要素を全て消去するメソッド名;
		if
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
