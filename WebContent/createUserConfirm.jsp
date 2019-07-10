<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8"/>
<title> ユーザー情報入力確認画面</title>
</head>
<body>

<script type="text/javascript" src="./js/createUser.js"></script>
<jsp:include page="header.jsp"/>


<h1 class="cart_title">ユーザー情報入力確認画面</h1>

	<div>
		<s:form id="createUserForm">
		<table>
			<tr>
				<th>
					<s:label value="姓："/>
				</th>
				<td>
					<s:property value="familyName"/>
				</td>
			</tr>

			<tr>
				<th>
					<s:label value="名："/>
				</th>
				<td>
					<s:property value="firstName"/>
				</td>
			</tr>

			<tr>
				<th>
					<s:label value="姓ふりがな："/>
				</th>
				<td>
					<s:property value="familyNameKana"/>
				</td>
			</tr>

			<tr>
				<th>
					<s:label value="名ふりがな："/>
				</th>
				<td>
					<s:property value="firstNameKana"/>
				</td>
			</tr>

			<tr>
				<th>
					<s:label value="性別："/>
				</th>
				<td>
					<s:property value="sex"/>
				</td>
			</tr>

			<tr>
				<th>
					<s:label value="メールアドレス："/>
				</th>
				<td>
					<s:property value="email"/>
				</td>
			</tr>

			<tr>
				<th>
					<s:label value="ユーザーID："/>
				</th>
				<td>
					<s:property value="userId"/>
				</td>
			</tr>

			<tr>
				<th>
					<s:label value="パスワード："/>
				</th>
				<td>
					<s:property value="password"/>
				</td>
			</tr>

			<!-- 登録ボタン押下で、createUser.jsのgoCreateUserCompleteActionメソッドを実行 -->
			<s:submit value="登録" onclick="goCreateUserCompleteAction()"/>
			<!-- 戻るボタン押下で、createUser.jsのgoCreateUserActionメソッドを実行 -->
			<s:submit value="戻る" onclick="goCreateUserAction()"/>
			<s:hidden id="backFlg" name="backFlg" value=""/>
		</table>
		</s:form>
	</div>
</body>
</html>