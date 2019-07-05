package com.internousdev.jaguar.action;
import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.opensymphony.xwork2.ActionSupport;

public class CreateUserCompleteAction extends ActionSupport implements SessionAware {

	private Map<String,Object> session;

	public String execute(){
		if(!session.containsKey("tempUserId")){
			return "sessionTimeout";
		}


	}
}
