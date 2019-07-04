package com.internousdev.jaguar.action;

import java.util.List;
import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.internousdev.jaguar.dao.UserInfoDAO;
import com.internousdev.jaguar.util.InputChecker;
import com.opensymphony.xwork2.ActionSupport;





public class LoginAction extends ActionSupport implements SessionAware{



	private String userId;
	private String password;

	private boolean savedUserIdFlg;    //  login.jspでs:checkboxタグ name = "savedUserIdFlg"   チェックを入れるとsetter経由でtrueが入る


	private String isNotUserInfoMessage;
	private List<String> userIdErrorMessageList;
	private List<String> passwordErrorMessageList;



	private Map<String,Object> session;




	public String execute() {

        //  まだログインしてないので、仮IDの存在の有無でタイムアウトのチェック
		if(!session.containsKey("tempUserId")){

			return "sessionTimeout";
		}




	    //登録完了画面から自動遷移した際、ここのフィールドのuserIdとpasswordに 登録時にsessionに入れたものを入れる

		if(session.containsKey("新規ユーザー登録からのユーザーID")){

			userId = session.get("新規ユーザー登録からのユーザーID").toString();
			password = session.get("新規ユーザー登録からのパスワード").toString();

			//ユーザー登録時にIDとパスがセッションに入っているが、ここではもう必要ないのでセッションから削除
			session.remove("新規ユーザー登録からのユーザーID");
			session.remove("新規ユーザー登録からのパスワード");

		}



		// ユーザーIDの保存にチェックがついていた場合、「保存されたユーザーID」と、「保存している」という情報をセッションに保存する

		if(savedUserIdFlg){  // true ならチェック済

			session.put("savedUserIdFlag",true);
			session.put("savedUserId", userId);
		}
		else {
			session.remove("savedUserIdFlag");
			session.remove("savedUserId");
		}





		String result = ERROR;  //ここから↓はERROR時（入力エラー時）の処理



		InputChecker ic = new InputChecker();

		userIdErrorMessageList = ic.doCheck("ユーザーID", userId, 1, 8, true, false, false, true, false, false);
		passwordErrorMessageList = ic.doCheck("パスワード", password, 1, 16, true, false, false, true, false, false);



		if(userIdErrorMessageList.size() > 0  ||
			passwordErrorMessageList.size() > 0	){       //IDまたはパスに入力エラーがあれば


			session.put("logined", 0);  //  セッションのログインフラグに0を
			return result;


		}



		// ここからログイン認証チェック



		UserInfoDAO userInfoDAO = new UserInfoDAO();


		if(userInfoDAO.isExistsUserInfo(userId, password) &&   //ユーザーの存在確認メソッド
				userInfoDAO.login(userId, password) > 0) {        // ログインフラグを掲げるメソッド    ログイン成功







		} else {//ログイン失敗

			isNotUserInfoMessage = "ユーザーIDまたはパスワードが異なります。";

		}

		// ログイン認証チェック終了













		return result;
	}




	public String getUserId(){
		return userId;
	}

	public void setUserId(String userId){
		this.userId = userId;
	}




	public String getPassword(){
		return password;
	}

	public void setPassword(String password){
		this.password = password;
	}





	public void setSavedUserIdFlg(boolean savedUserIdFlg){
		this.savedUserIdFlg = savedUserIdFlg;
	}



	public String getIsNotExistsErrorMessage(){
		return isNotUserInfoMessage;
	}


	public Map<String,Object> getSession() {
		return session;
	}

	public void setSession (Map<String, Object> session) {
		this.session = session;
	}



}
