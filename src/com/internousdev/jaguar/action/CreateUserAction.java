package com.internousdev.jaguar.action;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.opensymphony.xwork2.ActionSupport;

public class CreateUserAction extends ActionSupport implements SessionAware {

	private String backFlg;
	private Map<String,Object> session;

	public String execute(){
		//セッション変数tempUserIdが存在しなければ、sessionTimeoutを返し、sessionError.jspへ遷移
		if(!session.containsKey("tempUserId")){
			return "sessionTimeOut";
		}

		/**
		 * createUserComfirm.jspからの遷移であればbackFlgを使用し、セッション変数（ユーザーが入力した情報）を保持するが、login.jsp
		 * からの遷移（新規登録）であればセッション変数を削除する
		 * */
		if(backFlg==null){
			session.remove("familyName");
			session.remove("firstName");
			session.remove("familyNameKana");
			session.remove("firstNameKana");
			session.remove("sex");
			session.remove("email");
			session.remove("userIdForCreateUser");
			session.remove("password");
		}

		//次画面の入力フォーム（性別）に関する前準備
		List<String> sexList=new ArrayList<String>();
		//セッション変数"sex"が存在していなければ、値を"男性"として新たに作成（login.jspから遷移した場合）
		if(!session.containsKey("sex")){
			session.put("sex","男性");
		//セッション変数"sex"が存在していれば、その値を取り出し、再び格納する（createUserComfirm.jspから戻るボタンが押下され、遷移した場合）
		}else{
			session.put("sex", String.valueOf(session.get("sex")));
		}
		//次画面で使用する性別の選択肢をセッション変数"sexList"として用意
		sexList.add("男性");
		sexList.add("女性");
		session.put("sexList", sexList);

		return SUCCESS;
	}

	public String getBackFlg(){
		return backFlg;
	}

	public void setBackFlag(String backFlg){
		this.backFlg=backFlg;
	}

	public Map<String,Object> getSession(){
		return session;
	}

	public void setSession(Map<String,Object> session){
		this.session=session;
	}
}
