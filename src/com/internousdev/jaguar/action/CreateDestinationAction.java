package com.internousdev.jaguar.action;

import com.opensymphony.xwork2.ActionSupport;
import org.apache.struts2.interceptor.SessionAware;
import java.util.Map;

public class CreateDestinationAction extends ActionSupport implements SessionAware{
private Map<String, Object> session;
private String backFlg;		//jspを1つ戻すときにvalue値が入る
	public String execute(){
		if(!session.containsKey("backFlg") && !session.containsKey("userId")){		//SessionTimeOut
			return "sessionTimeOut";
		}

		if(backFlg == null){	//戻らない場合
			session.remove("familyName");
			session.remove("firstName");
			session.remove("familyNameKana");
			session.remove("firstNameKana");
			session.remove("email");
			session.remove("telNumber");
			session.remove("userAddress");
		}
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