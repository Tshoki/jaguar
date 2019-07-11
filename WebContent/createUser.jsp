<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8" />
<title>ユーザー情報入力画面</title>
</head>
<body>

	<jsp:include page="header.jsp" />

	<h1 class="cart_title">ユーザー情報入力画面</h1>

	<!--  入力にミスがあり、CreateUserConfirmActionから戻された場合に表示するメッセージ一覧-->
	<s:if
		test="familyNameErrorMessageList!=null && familyNameErrorMessageList.size()>0">
		<s:iterator value="familyNameErrorMessageList">
			<s:property />
		</s:iterator>
	</s:if>

	<s:if
		test="firstNameErrorMessageList!=null && firstNameErrorMessageList.size()>0">
		<s:iterator value="firstNameErrorMessageList">
			<s:property />
		</s:iterator>
	</s:if>

	<s:if
		test="familyNameKanaErrorMessageList!=null && familyNameKanaErrorMessageList.size()>0">
		<s:iterator value="familyNameKanaErrorMessageList">
			<s:property />
		</s:iterator>
	</s:if>

	<s:if
		test="firstNameKanaErrorMessageList!=null && firstNameKanaErrorMessageList.size()>0">
		<s:iterator value="firstNameKanaErrorMessageList">
			<s:property />
		</s:iterator>
	</s:if>

	<s:if
		test="emailErrorMessageList!=null && emailErrorMessageList.size()>0">
		<s:iterator value="emailErrorMessageList">
			<s:property />
		</s:iterator>
	</s:if>

	<s:if
		test="userIdErrorMessageList!=null && userIdErrorMessageList.size()>0">
		<s:iterator value="userIdErrorMessageList">
			<s:property />
		</s:iterator>
	</s:if>

	<s:if
		test="passwordErrorMessageList!=null && passwordErrorMessageList.size()>0">
		<s:iterator value="passwordErrorMessageList">
			<s:property />
		</s:iterator>
	</s:if>

	<s:if
		test="isExistsUserErrorMessage!=null && !isExistsUserErrorMessage.isEmpty()">
		<s:iterator value="isExistsUserErrorMessage">
			<s:property />
		</s:iterator>
	</s:if>

	<div>
		<s:form action="CreateUserConfirmAction">
			<table>
				<tr>
					<th>姓：</th>
					<td><s:textfield name="familyName" value="%{#session.familyName}" placeholder="姓"/></td>
				</tr>

				<tr>
					<th>名：</th>
					<td><s:textfield name="firstName" value="%{session.firstName}" placeholder="名"/>
					</td>
				</tr>

				<tr>
					<th>姓ふりがな：</th>
					<td><s:textfield name="familyNameKana"
							value="%{session.familyNameKana}" placeholder="姓ふりがな"/></td>
				</tr>

				<tr>
					<th>名ふりがな：</th>
					<td><s:textfield name="firstNameKana"
							value="%{session.firstNameKana}" placeholder="名ふりがな"/></td>
				</tr>

				<tr>
					<th>性別：</th>
					<td><s:radio name="sex" list="%{session.sexList}" value="%{session.sex}" placeholder="性別"/></td>
				</tr>

				<tr>
					<th>メールアドレス：</th>
					<td><s:textfield name="email" value="%{session.email}" placeholder="メールアドレス"/></td>
				</tr>

				<tr>
					<th>ユーザーID：</th>
					<td><s:textfield name="userId"
							value="%{session.userIdForCreateUser}" placeholder="ユーザーID"/></td>
				</tr>

				<tr>
					<th>パスワード：</th>
					<td><s:password name="password" value="%{session.password}" placeholder="パスワード"/>
					</td>
				</tr>
				<s:submit value="確認" />
			</table>
		</s:form>
	</div>
</body>
</html>