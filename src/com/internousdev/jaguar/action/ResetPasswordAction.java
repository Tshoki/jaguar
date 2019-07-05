package com.internousdev.jaguar.action;

import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.opensymphony.xwork2.ActionSupport;

public class ResetPasswordAction extends ActionSupport implements SessionAware {
	private String backFlg;
	private Map<String, Object> session;
	//executeメソッドを定義
	public String execute(){
		//backFlgの中身がnullのときif文を実行する
		if(backFlg==null){
			//userIdForResetPasswordをsessionから削除する
			session.remove("userIdForResetPassword");
		}
		//
		return SUCCESS;
	}

	public String getBackFlg(){
		return backFlg;
	}

	public void setBackFlg(String backFlg){
		this.backFlg=backFlg;
	}

	public Map<String, Object> getSession(){
		return session;
	}

	public void setSession(Map<String, Object> session){
		this.session=session;
	}


}
