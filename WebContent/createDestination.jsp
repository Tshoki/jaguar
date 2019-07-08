<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link rel="stylesheet" type="text/css" href="./css/jaguar.css">
<title>宛先入力画面</title>
</head>
<body>
<h1>宛先情報入力画面</h1>
<!-- エラーメッセージ出力 -->
<!-- size...nullがListに入っていたときnullpointaExceptionが発生 -->
<s:if test="familyNameErrorMessageList!= null && familyNameErrorMessageList.size()> 0">
	<div class="error">
		<div class="error-message">
			<s:iterator value="familyNameErrorMessageList">
				<s:property/>
			</s:iterator>
		</div>
	</div>
</s:if>
<s:if test="firstNameErrorMessageList!= null && firstNameErrorMessageList.size()> 0">
	<div class="error">
		<div class="error-message">
			<s:iterator value="firstNameErrorMessageList">
				<s:property/>
			</s:iterator>
		</div>
	</div>
</s:if>
<s:if test="familyNameKanaErrorMessageList!= null && familyNameKanaErrorMessageList.size()> 0">
	<div class="error">
		<div class="error-message">
			<s:iterator value="familyNameKanaErrorMessageList">
				<s:property/>
			</s:iterator>
		</div>
	</div>
</s:if>
<s:if test="firstNameKanaErrorMessageList!= null && firstNameKanaErrorMessageList.size()> 0">
	<div class="error">
		<div class="error-message">
			<s:iterator value="firstNameKanaErrorMessageList">
				<s:property/>
			</s:iterator>
		</div>
	</div>
</s:if>
<s:if test="userAddressErrorMessageList!= null && userAddressErrorMessageList.size()> 0">
	<div class="error">
		<div class="error-message">
			<s:iterator value="userAddressErrorMessageList">
				<s:property/>
			</s:iterator>
		</div>
	</div>
</s:if>
<s:if test="telNumberErrorMessageList!= null && telNumberErrorMessageList.size()> 0">
	<s:iterator value="telNumberErrorMessageList">
		<s:property/>
	</s:iterator>
</s:if>
<s:if test="emailErrorMessageList!= null && emailErrorMessageList.size()> 0">
	<s:iterator value="emailErrorMessageList">
		<s:property/>
	</s:iterator>
</s:if>


<!-- 宛先情報入力フォーム -->
<s:form action="CreateDestinationConfirmAction">
	<p>
	<s:textfield name="familyName" value="%{#session.familyName}" label="姓"/>
	</p>
	<p>
	<s:textfield name="firstName" value="%{#session.firstName}" label="名"/>
	</p>
	<p>
	<s:textfield name="familyNameKana" value="%{#session.familyNameKana}" label="姓ふりがな"/>
	</p>
	<p>
	<s:textfield name="firstNameKana" value="%{#session.firstNameKana}" label="名ふりがな"/>
	</p>
	<p>
	<s:textfield name="userAddress" value="%{#session.userAddress}" label="住所"/>
	</p>
	<p>
	<s:textfield name="telNumber" value="%{#session.telNumber}" label="電話番号"/>
	</p>
	<p>
	<s:textfield name="email" value="%{#session.email}" label="メールアドレス"/>
	</p>
	<s:submit value="確認"/>
</s:form>
</body>
</html>