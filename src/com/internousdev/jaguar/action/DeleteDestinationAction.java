package com.internousdev.jaguar.action;

import java.sql.SQLException;
import java.util.List;
import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.internousdev.jaguar.dao.DestinationInfoDAO;
import com.internousdev.jaguar.dto.DestinationInfoDTO;
import com.opensymphony.xwork2.ActionSupport;

public class DeleteDestinationAction extends ActionSupport implements SessionAware{
  private int id;
  private List<DestinationInfoDTO> destinationInfoDTOList;
  private Map<String, Object> session;

  public String execute()throws SQLException{
	  //sessionのタイムアウトをチェック
	  if(!session.containsKey("tempUserId") && !session.containsKey("userId")) {
		  return "sessionTimeout";
	  }

	  String result = ERROR;
	  DestinationInfoDAO destinationInfoDAO = new DestinationInfoDAO();
	  int count = destinationInfoDAO.deleteDestination(id);

	  if(count>0) {
		  //List内の情報を消去後のデータベースの内容に書き換える。
		  destinationInfoDTOList = destinationInfoDAO.getDestinationInfo(session.get("userId").toString());
		  result = SUCCESS;
	  }
	  return result;
  }

public int getId() {
	return id;
}

public void setId(int id) {
	this.id = id;
}

public List<DestinationInfoDTO> getDestinationInfoDTOList() {
	return destinationInfoDTOList;
}

public void setDestinationInfoDTO(List<DestinationInfoDTO> destinationInfoDTOList) {
	this.destinationInfoDTOList = destinationInfoDTOList;
}

public Map<String, Object> getSession() {
	return session;
}

public void setSession(Map<String, Object> session) {
	this.session = session;
}

}
