<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js"></script>
<script type="text/javascript" src="./js/createDestination.js"></script>
<title>宛先入力確認画面</title>
</head>
<body>
<jsp:include page="header.jsp"/>
<h1>宛先入力確認画面</h1>
<br>
<s:form id="destinationInfo">
<p>姓
	<s:property value="familyName"/>
</p>
<p>名
	<s:property value="firstName"/>
</p>
<p>姓ふりがな
	<s:property value="familyNameKana"/>
</p>
<p>名ふりがな
	<s:property value="firstNameKana"/>
</p>
<p>住所
	<s:property value="userAddress"/>
</p>
<p>電話
	<s:property value="telNumber"/>
</p>
<p>メール
	<s:property value="email"/>
</p>
<s:submit value="登録" onclick="GOtoCompleteAction()"/>
<s:submit value="戻る" onclick="BACKtoAction()"/>
<s:hidden id="backFlg" name="backFlg" value=""/>
</s:form>
</body>
</html>