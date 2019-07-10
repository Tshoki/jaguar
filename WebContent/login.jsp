<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<script src="./js/login.js"></script>
<title>ログイン画面</title>
</head>
<body>
	<jsp:include page="header.jsp" /><!-- header -->

	<h1>ログイン画面</h1>

	<s:if test = "userIdErrorMessageList != null && userIdErrorMessageList.size() > 0">
		<s:iterator value ="userIdErrorMessageList">
			<s:property /><br>
		</s:iterator>
	</s:if>

	<s:if test = "passwordErrorMessageList != null && passwordErrorMessageList.size() > 0">
		<s:iterator value ="passwordErrorMessageList">
			<s:property /><br>
		</s:iterator>
	</s:if>

	<s:if test = "isNotUserInfoMessage != null && !isNotUserInfoMessage.isEmpty()">
			<s:property value = "isNotUserInfoMessage" />
	</s:if>

	<s:form id = "loginForm">

		<table>
			<tr>
				<th><s:label>ユーザーID</s:label></th>

				<s:if test = "#session.savedUserIdFlg == true">
					<td><s:textfield name = "userId" value = "%{session.savedUserId}"/></td>
				</s:if>

				<s:else>
					<td><s:textfield name = "userId" value = "%{userId}" /></td>
				</s:else>
			<tr>

			<tr>
				<th><s:label>パスワード</s:label></th>
				<td><s:password name = "password"/></td>
			</tr>
		</table>

		<div>
			<s:if test = "#session.savedUserIdFlg == true">
				<s:checkbox name = "savedUserIdFlg" checked = "checked"/>
			</s:if>

			<s:else>
				<s:checkbox name = "savedUserIdFlg" />
			</s:else>

			<s:label>ユーザーID保存</s:label>
		</div>

		<s:submit value = "ログイン" onclick = "goLoginAction()" />
		<br>
		<s:submit value = "新規ユーザー登録" onclick = "goCreateUserAction()" />
		<br>
		<s:submit value = "パスワード再設定" onclick = "goResetPasswordAction()" />

	</s:form>
</body>
</html>