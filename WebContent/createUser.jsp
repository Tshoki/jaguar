<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="X-UA-Compatible" content="IE=edge" />
<meta name="viewport" content="width=device-width,initial-scale=1">
<link rel="stylesheet" type="text/css" href="./css/jaguar.css">
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js"></script>
<script type="text/javascript" src="./js/jaguar.js"></script>
<title> userCreate.jsp </title>
</head>
<body>

<h1 class="cart_title">ユーザー登録</h1>
<div id="main">
	<div>
		<table>
		<s:form action="CreateUserConfirmAction">
			<tr>
				<td>
					<label>姓：</label>
				</td>
				<td>
					<input type="text" name="familyName" value=""/>
				</td>
			</tr>

			<tr>
				<td>
					<label>名：</label>
				</td>
				<td>
					<input type="text" name="firstName" value=""/>
				</td>
			</tr>

			<tr>
				<td>
					<label>姓ふりがな：</label>
				</td>
				<td>
					<input type="text" name="familyNameKane" value=""/>
				</td>
			</tr>

			<tr>
				<td>
					<label>名ふりがな：</label>
				</td>
				<td>
					<input type="text" name="firstNameKana" value=""/>
				</td>
			</tr>

			<tr>
				<td>
					<label>性別：</label>
				</td>
				<td>
					<input type="radio" name="sex" value="男性" checked="checked"/>男性
					<input type="radio" name="sex" value="女性"/>女性
				</td>
			</tr>

			<tr>
				<td>
					<label>メールアドレス：</label>
				</td>
				<td>
					<input type="text" name="email" value=""/>
				</td>
			</tr>

			<tr>
				<td>
					<label>ユーザーID：</label>
				</td>
				<td>
					<input type="text" name="userId" value=""/>
				</td>
			</tr>

			<tr>
				<td>
					<label>パスワード</label>
				</td>
				<td>
					<input type="text" name="password" value=""/>
				</td>
			</tr>
			<s:submit value="確認"/>
		</s:form>
		</table>
	</div>
</div>
</body>
</html>