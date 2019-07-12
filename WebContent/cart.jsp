<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link rel="stylesheet" href="./css/cart.css">
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js"></script>
<script src="./js/cart.js"></script>
<title>カート画面</title>
</head>
<body>

<jsp:include page="header.jsp"/><!-- header -->

<h1>カート画面</h1>

<!--- カート情報がある場合 --->
<s:if test="!cartInfoDTOList.isEmpty()">
<s:form action="DeleteCartAction">
<!-- 項目列 -->
<table class="column_table">
	<thead>
		<tr>
			<th>#</th>
			<th>商品名</th>
			<th>商品名ふりがな</th>
			<th>商品画像</th>
			<th>値段</th>
			<th>発売会社名</th>
			<th>発売年月日</th>
			<th>購入個数</th>
			<th>合計金額</th>
		</tr>
	</thead>
<!-- /項目列 -->

<!-- カート内容 -->
	<tbody>
		<s:iterator value="cartInfoDTOList">
		<tr>
			<td><s:checkbox name="checkbox" fieldValue='%{productId}' /></td>
			<td><s:property value="productName" /></td>
			<td><s:property value="productNameKana" /></td>
			<td><img src='<s:property value="imageFilePath" />/<s:property value="imageFileName" />' width="20px" /></td>
			<td><s:property value="price" />円</td>
			<td><s:property value="releaseCompany" /></td>
			<td><s:property value="releaseDate" /></td>
			<td><s:property value="productCount" />個</td>
			<td><s:property value="subTotal" />円</td>
		</tr>
		</s:iterator>
	</tbody>
<!-- /カート内容 -->
</table>

<div class="total_price_box">カート合計金額 : <s:property value="totalPrice" />円</div><!-- カート合計金額 -->

<!-- 決済ボタン -->
<s:submit value="決済" data-action="SettlementConfirmAction" />

<!-- 削除ボタン -->
<s:submit value="削除" class="delete_btn" data-action="DeleteCartAction" />

</s:form>
</s:if>

<!--- カート情報がない場合 --->
<s:else>
<div class="message bg_blue">カート情報がありません。</div><!--- 指定メッセージ --->
</s:else>

</body>
</html>