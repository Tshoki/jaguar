<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<!-- 〜秒後に画面遷移の記述 -->
<meta http-equiv="refresh" content=" 3; url=./home.jsp">
<link rel="stylesheet" href="./css/style.css">
<title>SettlementComplete画面</title>
</head>
<body>
<jsp:include page="header.jsp">

<div id="main">
  <s:property value="message"/>
</div>
</body>
</html>