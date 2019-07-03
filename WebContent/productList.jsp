<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge" />
<meta name="viewport" content="width=device-width,initial-scale=1">
<link rel="stylesheet" type="text/css" href="./css/jaguar.css">
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js"></script>
<script type="text/javascript" src="./js/jaguar.js"></script>
<title> productList.jsp </title>
</head>
<body>

<h1 class="###">商品一覧画面</h1><%--CSS上下にボーダー --%>

<!--- 検索結果がある場合 --->
<s:if test="###商品情報が存在する場合を表示する機能">
</s:if>



<s:iterator value="###検索結果">
###<if text="要素数/3==0;<br/>"><!-- 表示2個ごとに1段下げる -->
<div class="###">
<s:property value="productName"/>
<s:property value="productNameKana"/>
###<img src='<s:property value="imageFilePath"/><s:property value="imageFileName"/>'>
<s:property value="price"/>
</div>
</s:iterator>



<!-- 商品情報が存在しない場合 -->
<s:else>
「検索結果なし」<!--- 指定メッセージ --->
</s:else>

</body>
</html>