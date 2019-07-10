package com.internousdev.jaguar.action;
import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.internousdev.jaguar.dao.UserInfoDAO;
import com.opensymphony.xwork2.ActionSupport;

public class LogoutAction extends ActionSupport implements SessionAware {

	private Map<String,Object> session;

	public String execute(){

		//セッション変数からユーザーIDとユーザーID保存チェックを取得し、クラス変数に格納
		String userId = String.valueOf(session.get("userId"));
		boolean savedUserId = Boolean.valueOf(String.valueOf(session.get("savedUserIdFlg")));

		UserInfoDAO userInfoDAO=new UserInfoDAO();
		//ログインフラグ(DBにおける"logined"カラム)を書き換え、未ログイン状態にする
		int count=userInfoDAO.logout(userId);
		//logoutメソッドの戻り値（更新に成功した件数）が1件以上あれば、セッション変数を削除する
		if(count>0){
			session.clear();
			//"savedUserId"の値がtrueであればセッション変数にクラス変数の値を格納する
			if(savedUserId){
				session.put("savedUserIdFlg", savedUserId);
				session.put("savedUserId", userId);
			}
		}else{
			session.remove("logined");
			return ERROR;
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
