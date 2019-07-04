<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>パスワード再設定</title>
</head>
<body>
<jsp:include page="header.jsp" />

<h1>パスワード再設定画面</h1>


	<s:if test="userIdErrorMessageList!=null && userIdErrorMessageList.size()>0">
	<div class="error">
	<div class="error-message">
		<s:iterator value="userIdErrorMessageList"><s:property/>
		<br></s:iterator>
		</div>
		</div>
	</s:if>

	<s:if test="passwordErrorMessageList!=null && passwordErrorMessageList.size()>0">
	<div class="error">
	<div class="error-message">
		<s:iterator value="passwordErrorMessageList"><s:property/>
		<br></s:iterator>
		</div>
		</div>
	</s:if>

	<s:if test="newPasswordErrorMessageList!=null && newPsswordErrorMessageList.size()>0">
	<div class="error">
	<div class="error-massage">
		<s:iterator value="newPasswordErrorMessageList"><s:property/>
		<br></s:iterator>
		</div>
		</div>
	</s:if>

	<s:if test="reConfirmationNewPasswordErrorMessageList!=null && reconfirmationNewPasswordErrorMessageList.size()>0">
	<div class="error">
	<div class="error-message">
		<s:iterator value="reConfirmationNewPasswordErrorMessageList"><s:property/>
		<br></s:iterator>
		</div>
		</div>
	</s:if>

	<s:if test="passwordIncorrectErrorMessage!=null && !passwordIncorrectErrorMessage.isEmpty()">
	<div class="error">
	<div class="error-message">
		<s:property value="newPasswordIncorrectErrorMessage"/>
		<br>
	</div>
	</div>
	</s:if>

