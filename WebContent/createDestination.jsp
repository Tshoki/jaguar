<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>宛先入力画面</title>
</head>
<body>
	<jsp:include page="header.jsp" />
	<h1>宛先情報入力画面</h1>
	<!-- エラーメッセージ出力 -->
	<s:if
		test="familyNameErrorMessageList!= null && familyNameErrorMessageList.size()> 0">
		<s:iterator value="familyNameErrorMessageList">
			<s:property />
		</s:iterator>
	</s:if>
	<s:if
		test="firstNameErrorMessageList!= null && firstNameErrorMessageList.size()> 0">
		<s:iterator value="firstNameErrorMessageList">
			<s:property />
		</s:iterator>
	</s:if>
	<s:if
		test="familyNameKanaErrorMessageList!= null && familyNameKanaErrorMessageList.size()> 0">
		<s:iterator value="familyNameKanaErrorMessageList">
			<s:property />
		</s:iterator>
	</s:if>
	<s:if
		test="firstNameKanaErrorMessageList!= null && firstNameKanaErrorMessageList.size()> 0">
		<s:iterator value="firstNameKanaErrorMessageList">
			<s:property />
		</s:iterator>
	</s:if>
	<s:if
		test="userAddressErrorMessageList!= null && userAddressErrorMessageList.size()> 0">
		<s:iterator value="userAddressErrorMessageList">
			<s:property />
		</s:iterator>
	</s:if>
	<s:if
		test="telNumberErrorMessageList!= null && telNumberErrorMessageList.size()> 0">
		<s:iterator value="telNumberErrorMessageList">
			<s:property />
		</s:iterator>
	</s:if>
	<s:if
		test="emailErrorMessageList!= null && emailErrorMessageList.size()> 0">
		<s:iterator value="emailErrorMessageList">
			<s:property />
		</s:iterator>
	</s:if>

	<!-- 宛先情報入力フォーム -->
	<s:form action="CreateDestinationConfirmAction">
		<table>
			<tr>
				<th>姓</th>
				<td><s:textfield name="familyName"
						value="%{#session.familyName}" /></td>
			</tr>
			<tr>
				<th>名</th>
				<td><s:textfield name="firstName" value="%{#session.firstName}" /></td>
			</tr>
			<tr>
				<th>姓ふりがな</th>
				<td><s:textfield name="familyNameKana"
						value="%{#session.familyNameKana}" /></td>
			</tr>
			<tr>
				<th>名ふりがな</th>
				<td><s:textfield name="firstNameKana"
						value="%{#session.firstNameKana}" /></td>
			</tr>
			<tr>
				<th>住所</th>
				<td><s:textfield name="userAddress"
						value="%{#session.userAddress}" /></td>
			</tr>
			<tr>
				<th>電話番号</th>
				<td><s:textfield name="telNumber" value="%{#session.telNumber}" /></td>
			</tr>
			<tr>
				<th>メールアドレス</th>
				<td><s:textfield name="email" value="%{#session.email}" /></td>
			</tr>
		</table>
		<s:submit value="確認" />
	</s:form>
</body>
</html>