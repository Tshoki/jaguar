package com.internousdev.jaguar.action;
import java.util.List;
import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.internousdev.jaguar.dao.UserInfoDAO;
import com.internousdev.jaguar.util.CommonUtility;
import com.internousdev.jaguar.util.InputChecker;
import com.opensymphony.xwork2.ActionSupport;

public class CreateUserConfirmAction extends ActionSupport implements SessionAware {

	private String familyName;
	private String firstName;
	private String familyNameKana;
	private String firstNameKana;
	private String sex;
	private String email;
	private String userId;
	private String password;
	private Map<String,Object> session;
	private List<String> familyNameErrorMessageList;
	private List<String> firstNameErrorMessageList;
	private List<String> familyNameKanaErrorMessageList;
	private List<String> firstNameKanaErrorMessageList;
	private List<String> emailErrorMessageList;
	private List<String> userIdErrorMessageList;
	private List<String> passwordErrorMessageList;
	private String isExistsUserErrorMessage;

	public String execute(){
		String result;
		String rerult=ERROR;

		if(!session.containsKey("tempUserId")){
			return "sessionTimeout";
		}

		session.put("familyName", familyName);
		session.put("firstName", firstName);
		session.put("familyNameKana", familyNameKana);
		session.put("firstNameKana", firstNameKana);
		session.put("sex", sex);
		session.put("email", email);
		session.put("userIdForCreateUser", userId);
		session.put("password", password);

		InputChecker ic=new InputChecker();

		familyNameErrorMessageList=ic.doCheck("姓",familyName,1,16,true,true,true,false,false,false);
		firstNameErrorMessageList=ic.doCheck("名",firstName,1,16,true,true,true,false,false,false);
		familyNameKanaErrorMessageList=ic.doCheck("姓ふりがな",familyNameKana,1,16,false,false,true,false,false,false);
		firstNameKanaErrorMessageList=ic.doCheck("姓ふりがな",familyNameKana,1,16,false,false,true,false,false,false);
		emailErrorMessageList=ic.doCheckForEmail("メールアドレス",email,10,32);
		userIdErrorMessageList=ic.doCheck("ユーザーID",userId,1,8,true,false,false,true,false,false);
		passwordErrorMessageList=ic.doCheck("パスワード",password,1,16,true,false,false,true,false,false);

		if(familyNameErrorMessageList.size()>0){
			return result;
		}else if(firstNameErrorMessageList.size()>0){
			return result;
		}else if(familyNameKanaErrorMessageList.size()>0){
			return result;
		}else if(firstNameKanaErrorMessageList.size()>0){
			return result;
		}else if(emailErrorMessageList.size()>0){
			return result;
		}else if(userIdErrorMessageList.size()>0){
			return result;
		}else if(passwordErrorMessageList.size()>0){
			return result;
		}

		UserInfoDAO userInfoDAO=new UserInfoDAO();
		if(userInfoDAO.isExistsUserInfo(userId)){
			isExistsUserErrorMessage="使用できないユーザーIDです。";
		}else{
			CommonUtility cu=new CommonUtility();
			password=cu.concealPassword(password);
			result=SUCCESS;
		}
		return result;

	}

	public String getFamilyName(){
		return familyName;
	}

	public void setFamilyName(String familyName){
		this.familyName=familyName;
	}

	public String firstName(){
		return firstName;
	}

	public void setFirstName(String firstName){
		this.firstName=firstName;
	}

	public String getFamiyNameKana(){
		return familyNameKana;
	}

	public void setFamilyNameKana(String familyNameKana){
		this.familyNameKana=familyNameKana;
	}

	public String getFirstNameKana(){
		return firstNameKana;
	}

	public void setFirstNameKana(String firstNameKana){
		this.firstNameKana=firstNameKana;
	}

	public String getSex(){
		return sex;
	}

	public void setSex(String sex){
		this.sex=sex;
	}

	public String getEmail(){
		return email;
	}

	public void setEmail(String email){
		this.email=email;
	}

	public String getUserId(){
		return userId;
	}

	public void setUserId(String userId){
		this.userId=userId;
	}

	public String getPassword(){
		return password;
	}

	public void setPassword(String password){
		this.password=password;
	}

	public Map<String,Object> getSession(){
		return session;
	}

	@Override
	public void setSession(Map<String,Object> session){
		this.session=session;
	}

	public List<String> getFamilyNameErrorMessageList(){
		return familyNameErrorMessageList;
	}

	public void setfamilyNameErrorMessageList(List<String> familyNameErrorMessageList){
		this.familyNameErrorMessageList=familyNameErrorMessageList;
	}

	public List<String> getFirstNameErrorMessageList(){
		return firstNameErrorMessageList;
	}

	public void setFirstNameErrorMessageList(List<String> firstNameErrorMessageList){
		this.firstNameErrorMessageList=firstNameErrorMessageList;
	}

	public List<String> getFamilyNameKanaErrorMessageList(){
		return familyNameKanaErrorMessageList;
	}

	public void setFamilyNameKanaErrorMessageList(List<String> familyNameKanaErrorMessageList){
		this.familyNameKanaErrorMessageList=familyNameKanaErrorMessageList;
	}

	public List<String> getFirstNameKanaErrorMessageList(){
		return firstNameKanaErrorMessageList;
	}

	public void setFirstNameKanaErrorMessageList(List<String> firstNameKanaErrorMessageList){
		this.firstNameKanaErrorMessageList=firstNameKanaErrorMessageList;
	}

	public List<String> getEmailErrorMessageList(){
		return emailErrorMessageList;
	}

	public void setEmailErrorMessageList(List<String> emailErrorMessageList){
		this.emailErrorMessageList=emailErrorMessageList;
	}

	public List<String> getUserIdErrorMessageList(){
		return userIdErrorMessageList;
	}

	public void setUserIdErrorMessageList(List<String> userIdErrorMessageList){
		this.userIdErrorMessageList=userIdErrorMessageList;
	}

	public List<String> getPasswordErrorMessageList(){
		return passwordErrorMessageList;
	}

	public void setPasswordErrorMessageList(List<String> passwordErrorMessageList){
		this.passwordErrorMessageList=passwordErrorMessageList;
	}

	public String getIsExistsUserErrorMessage(){
		return isExistsUserErrorMessage;
	}

	public void setIsExistsUserErrorMessage(String isExistsUserErrorMessage){
		this.isExistsUserErrorMessage=isExistsUserErrorMessage;
	}
}
