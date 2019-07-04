package com.internousdev.jaguar.action;

import java.util.List;
import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.internousdev.jaguar.dao.DestinationInfoDAO;
import com.internousdev.jaguar.dto.DestinationInfoDTO;
import com.opensymphony.xwork2.ActionSupport;

public class SettlementConfirmAction extends ActionSupport implements SessionAware{
  private List<DestinationInfoDTO> destinationInfoDTO;
  private Map<String, Object> session;


    public String execute() {
    	String result = ERROR;
    	String userId = null;
    	//カート情報を引き継いでくる。
    	//CartInfoDAO cartInfoDAO = new CartinfoDAO;
    	//List<CartInfoList> cartInfoList = new ArrayList<CartInfoDTO>();

    	int logined = Integer.parseInt(String.valueOf(session.get("logined")));
    	//ログインしているかどうかの確認
    	if(logined == 1){
    		//ログインしている場合は、ユーザーIDを取得する。
    		userId = session.get("userId").toString();

    		//ユーザーに紐づくカート情報を取得する。
    		//cartInfoList = cartInfoDAO.メソッド名(userId);
    		//session.put("cartInfoDTOList", cartInfoDTOList);

    		//ユーザーに紐づく
    		DestinationInfoDAO destinationInfoDAO = new DestinationInfoDAO();
    		//destinationInfoDTO = destinationInfoDAO.メソッド名;

    		result = SUCCESS;
    	} else {
    		session.put("cartFlg", "1");

    		result = "login";
    	}
    	return result;
    }


	public List<DestinationInfoDTO> getDestinationInfoDTO() {
		return destinationInfoDTO;
	}


	public void setDestinationInfoDTO(List<DestinationInfoDTO> destinationInfoDTO) {
		this.destinationInfoDTO = destinationInfoDTO;
	}


	public Map<String, Object> getSession() {
		return session;
	}


	public void setSession(Map<String, Object> session) {
		this.session = session;
	}






}
