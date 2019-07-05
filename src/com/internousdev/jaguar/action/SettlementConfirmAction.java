package com.internousdev.jaguar.action;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.internousdev.jaguar.dao.CartInfoDAO;
import com.internousdev.jaguar.dao.DestinationInfoDAO;
import com.internousdev.jaguar.dto.CartInfoDTO;
import com.internousdev.jaguar.dto.DestinationInfoDTO;
import com.opensymphony.xwork2.ActionSupport;

public class SettlementConfirmAction extends ActionSupport implements SessionAware{
  private List<DestinationInfoDTO> destinationInfoDTOList;
  private Map<String, Object> session;


    public String execute() {
    	String result = ERROR;
    	String userId = null;
    	//カート情報を引き継いでくる。
    	CartInfoDAO cartInfoDAO = new CartInfoDAO();
    	List<CartInfoDTO> cartInfoDTOList = new ArrayList<CartInfoDTO>();

    	int logined = Integer.parseInt(String.valueOf(session.get("logined")));
    	//logined → "ログインフラグ" ログインしているかどうかの確認
    	if(logined == 1){
    		//ログインしている場合は、ユーザーIDを取得する。
    		userId = session.get("userId").toString();

    		//ユーザーに紐づくカート情報を取得する。
    		//cartInfoDTOList = cartInfoDAO.getCartInfo(userId);
    		//session.put("cartInfoDTOList", cartInfoDTOList);

    		//ユーザーに紐づく宛先情報をList内に格納する。
    		DestinationInfoDAO destinationInfoDAO = new DestinationInfoDAO();
    		destinationInfoDTOList = destinationInfoDAO.getDestinationInfo(userId);

    		result = SUCCESS;
    	} else {
    		//ログイン状態でなければ、カート画面で決済を押下すると、ログイン画面に遷移する。
    		//cartFlg = 仮ユーザーでカートに商品が格納されているというFlg
    		session.put("cartFlg", "1");

    		result = "login";
    	}
    	return result;
    }


	public List<DestinationInfoDTO> getDestinationInfoDTOList() {
		return destinationInfoDTOList;
	}


	public void setDestinationInfoDTOList(List<DestinationInfoDTO> destinationInfoDTOList) {
		this.destinationInfoDTOList = destinationInfoDTOList;
	}


	public Map<String, Object> getSession() {
		return session;
	}


	public void setSession(Map<String, Object> session) {
		this.session = session;
	}






}
