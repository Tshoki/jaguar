package com.internousdev.jaguar.action;

import java.util.Map;
import org.apache.struts2.interceptor.SessionAware;
import com.opensymphony.xwork2.ActionSupport;
import com.internousdev.jaguar.dao.DestinationInfoDAO;

public class CreateDestinationCompleteAction extends ActionSupport implements SessionAware{
	private Map<String, Object> session;
	public String execute(){
		if(!session.containsKey("tempUserId") && !session.containsKey("userId")){
			return "sessionTimeout";
		}
		String result=ERROR;
		DestinationInfoDAO destinationInfoDAO=new DestinationInfoDAO();
		int count=destinationInfoDAO.insert(
				//PurchaseHistoryInfoDAOで外部結合するから
				//nullは不可
				session.get("userId").toString(),
				session.get("familyName").toString(),
				session.get("firstName").toString(),
				session.get("userAddress").toString(),
				//この先使うことがない
				//最悪nullでもいい
				String.valueOf(session.get("familyNameKana")),
				String.valueOf(session.get("firstNameKana")),
				String.valueOf(session.get("telNumber")),
				String.valueOf(session.get("email")));

		if(count>0){
			result=SUCCESS;
		}
		session.remove("familyName");
		session.remove("firstName");
		session.remove("familyNameKana");
		session.remove("firstNameKana");
		session.remove("userAddress");
		session.remove("telNumber");
		session.remove("email");

		return result;
	}
	public Map<String, Object> getSession(){
		return session;
	}
	public void setSession(Map<String, Object> session){
		this.session=session;
	}
}