function goLoginAction(){
	document.getElementById("loginForm").action="LoginAction"; //login.jspのid = loginFormのタグに属性 action = "LoginAction"を追加
}
function goCreateUserAction(){
	document.getElementById("loginForm").action="CreateUserAction";
}
function goResetPasswordAction(){
	document.getElementById("loginForm").action="ResetPasswordAction";
}