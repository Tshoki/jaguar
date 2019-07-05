<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link rel="stylesheet" type="text/css" href="./css/jaguar.css">
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js"></script>
<script type="text/javascript" src="./js/jaguar.js"></script>
<title>宛先入力確認画面</title>
</head>
<body>
<h1>宛先入力確認画面</h1>
<br>
<s:form id="destinationInfo">
<s:property value="familyName"/>
<br>
<s:property value="firstName"/>
<br>
<s:property value="familyNameKana"/>
<br>
<s:property value="firstNameKana"/>
<br>
<s:property value="userAddress"/>
<br>
<s:property value="telNumber"/>
<br>
<s:property value="email"/>
<br>
<s:submit value="登録" onclick="GOtoCompleteAction()"/>
<s:submit value="戻る" onclick="BACKtoAction()"/>
<s:hidden id="backFlg" name="backFlg" value=""/>
</s:form>
</body>
</html>