<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<link rel="stylesheet" type="text/css" href="./css/jaguar.css">

	<title> 商品一覧画面 </title>
</head>

<body>
	<jsp:include page="header.jsp" /><!-- ヘッダーの埋め込み -->
	<div id="contents">
		<h1>商品一覧画面</h1>
		<s:if test="keywordsErrorMessageList!=null && keywordsErrorMessageList.size()>0">
			<div class="error">
				<div class="error-message">
					<s:iterator value="keywordsErrorMessageList"><s:property /><br></s:iterator>
				</div>
			</div>
		</s:if>
		<s:elseif test="productInfoDTOList!=null && productInfoDTOList.size()>0">
		<div id="product-list">
			<s:iterator value="productInfoDTOList">
			<div class="product-list-box">
				<ul>
					<li>
					<a href='<s:url action="ProductDetailsAction">
						<s:param name="productId" value="%{productId}"/>
						</s:url>'><img src='<s:property value="imageFilePath"/>/<s:property value="imageFileName"/>' class="item-image-box-200"/><br>
						<s:property value="productName"/><br>
						<s:property value="productNameKana"/><br>
						<s:property value="price"/>円<br>
					</a>
				  </li>
				</ul>
			</div>
			</s:iterator>
		</div>
		</s:elseif>
		<s:else><!-- 商品情報が存在しない場合 -->
		<div class="info">
		検索結果がありません。<!--- 指定メッセージ --->
		</div>
		</s:else>
	</div>
</body>
</html>