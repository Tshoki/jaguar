package com.internousdev.jaguar.action;

import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.internousdev.jaguar.dao.UserInfoDAO;
import com.internousdev.jaguar.dto.UserInfoDTO;
import com.opensymphony.xwork2.ActionSupport;

public class MyPageAction extends ActionSupport implements SessionAware {
	public Map<String, Object> session;
	private UserInfoDTO userInfoDTO;
	
	public String execute() {

		if(!session.containsKey("tempUserId") && !session.containsKey("userId")) {
			return "sessionTimeOut";
		}
//		仮ユーザーIdとユーザーIdが含まれていない時、セッションタイムアウト
		
		UserInfoDAO userInfoDAO = new UserInfoDAO();
		
		userInfoDTO = userInfoDAO.getUserInfo(String.valueOf("userId")); 
//		valueOf　sessionから値をString型の値で取り出すために使用。nullでもエラーは出ない
		
		if(userInfoDTO.getUserId() == null) {
			userInfoDTO = null;
		}
//		DTOのuserIdがnullと等しいならnull代入
		
		return SUCCESS;
//		SUCCESSを返す
	}
	public UserInfoDTO getUserInfoDTO() {
		return userInfoDTO;
	}
	public void setUserInfoDTO(UserInfoDTO userInfoDTO) {
		this.userInfoDTO = userInfoDTO;
	}
	public Map<String, Object> getSession() {
		return session;
	}
	public void setSession(Map<String, Object> session) {
		this.session = session;
	}
}
