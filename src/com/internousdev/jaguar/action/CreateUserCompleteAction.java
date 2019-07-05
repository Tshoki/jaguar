package com.internousdev.jaguar.action;
import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.internousdev.jaguar.dao.UserInfoDAO;
import com.opensymphony.xwork2.ActionSupport;

public class CreateUserCompleteAction extends ActionSupport implements SessionAware {

	private Map<String,Object> session;

	public String execute(){
		if(!session.containsKey("tempUserId")){
			return "sessionTimeout";
		}

		String result=ERROR;
		//ユーザーが入力した性別
		String sex=null;

		//ユーザーが入力した性別が女性であれば、クラス変数sexに値を格納
		if(String.valueOf(session.get("sex")).equals("女性")){
			sex="1";
		}else{
			sex="0";
		}

		//ユーザーが入力した情報をDBへinsertする
		UserInfoDAO userInfoDAO=new UserInfoDAO();
		int count=userInfoDAO.createUser(
				session.get("familyName").toString(),
				session.get("firstName").toString(),
				String.valueOf(session.get("familyNameKana")),
				String.valueOf(session.get("firstNameKana")),
				sex,String.valueOf("email"),
				session.get("userIdForCreateUser").toString(),
				session.get("password").toString()
				);
		if(count>0){
			result=SUCCESS;
		}

		//ユーザー登録成功後、userIdForCreateUserとpassword以外のセッション変数を削除
		session.remove("familyName");
		session.remove("firstName");
		session.remove("familyNameKana");
		session.remove("firstNameKana");
		session.remove("sex");
		session.remove("sexList");
		session.remove("email");

		return result;
	}

	public Map<String,Object> getSession(){
		return session;
	}

	@Override
	public void setSession(Map<String,Object> session){
		this.session=session;
	}
}
