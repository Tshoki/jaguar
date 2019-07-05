package com.internousdev.jaguar.action;
import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.internousdev.jaguar.dao.UserInfoDAO;
import com.opensymphony.xwork2.ActionSupport;

public class LogoutAction extends ActionSupport implements SessionAware {

	private Map<String,Object> session;

	public String execute(){
		String result;

		String userId = String.valueOf(session.get("userId"));
		Boolean savedUserId = Boolean.valueOf(String.valueOf(session.get("savedUserId")));

		UserInfoDAO userInfoDAO=new UserInfoDAO();
		int count=userInfoDAO.logout(userId);

		if(count>0){
			session.clear();
			if(savedUserId){
				session.put("savedUserid", userId);
				session.put("savedUserId", savedUserId);
			}
		}
		return SUCCESS;
	}

	public Map<String,Object> getSession(){
		return session;
	}

	@Override
	public void setSession(Map<String,Object> session){
		this.session=session;
	}
}
