<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link rel="stylesheet" href="./css/destinationComplete.css">
<meta http-equiv="refresh" content="3;URL='SettlementConfirmAction'">	<!-- 3秒後決済確認画面遷移 -->
<title>宛先入力完了画面</title>
</head>
<body>
<jsp:include page="header.jsp"/>
<div id="content">
        <h1>ユーザー情報入力完了画面</h1>
        <div class="complete_message bg_green">
            ユーザー情報入力が完了しました。
        </div>
    </div>
</body>
</html>