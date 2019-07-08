<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<!--  3秒後にLoginActionに遷移する-->
<meta http-equiv="refresh" content="3;URL='LoginAction'"/>
<link rel="stylesheet" href="./css/style.css">
<script type="text/javascript" src="./js/header.js"></script>
<title> ユーザー情報入力確認画面</title>
</head>
<body>
<jsp:include page="header.jsp"/>

<h1>ユーザー情報入力完了画面</h1>
ユーザー情報入力が完了しました。
</body>
</html>