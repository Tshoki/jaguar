

package com.internousdev.jaguar.action;


import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.opensymphony.xwork2.ActionSupport;


public class GoLoginAction extends ActionSupport implements SessionAware{

	private Map<String, Object> session;



	public String execute() {


		//sessionの仮IDが切れていたらセッションタイムアウト画面へ

		if(!session.containsKey("tempUserId")){

			return "sessionTimeout";

		}


		session.remove("cartFlg");  // 未ログイン状態で、カート画面の決済ボタンを押した場合に立てられるフラグ
                                   //  ここではヘッダーからのログインなので、フラグは削除
	                              //  LoginAction でフラグの有無を確認し、存在すればカート画面に、存在しなければホーム画面に遷移させる処理



		return SUCCESS;
	}


	public Map<String,Object> getSession() {
		return session;
	}

	public void setSession (Map<String, Object> session) {
		this.session = session;
	}

}
