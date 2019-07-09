<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link rel="stylesheet" href="./css/jaguar.css"> <!-- こちらです -->
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js"></script>
<script type="text/javascript" src="./js/cart.js"></script>
<title>カート画面</title>
</head>
<body>

<!-- 未完成 -->
<!-- imgパス " / " データ次第 -->
<!-- 画面実装 未調査 -->

<jsp:include page="header.jsp"/><!-- header -->

<h1>ページタイトル</h1><!-- 1日目の指令 h1 を 使うこと 推奨 -->

<!--- カート情報がある場合 --->
<s:if test="!cartInfoDTOList.isEmpty()">
<s:form action="DeleteCartAction">
<!-- 項目列 -->
<table>
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
			<!-- チェックボックス考察中 --><!-- 値は商品ID -->
			<td><s:checkbox name="checkbox" value='<s:property value="productId" />' fieldValue="%{}" /></td>
			<td><s:property value="productName" /></td>
			<td><s:property value="productNameKana" /></td>
			<td><img src='<s:property value="imageFilePath" />/<s:property value="imageFileName" />' /></td>
			<td><s:property value="price" /></td>
			<td><s:property value="releaseCompany" /></td>
			<td><s:property value="releaseDate" /></td>
			<td><s:property value="productCount" /></td>
			<td><s:property value="subTotal" /></td>
		</tr>
	</s:iterator>
</tbody>
<!-- /カート内容 -->
</table>

<s:property value="totalPrice" /><!-- カート合計金額 -->

<!-- 決済ボタン -->
<s:submit value="決済" data-action="SettlementConfirmAction" />

<!-- 削除ボタン --><!-- 初期設定 css(opaity:0;) , jQuery で opacity 操作 -->
<s:submit value="削除" class="delete_btn" data-action="DeleteCartAction" />

</s:form>
</s:if>


<!--- カート情報がない場合 --->
<s:else>
カート情報がありません。<!--- 指定メッセージ --->
</s:else>

</body>
</html>