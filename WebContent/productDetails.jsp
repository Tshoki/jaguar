<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link rel="stylesheet" href="./css/style.css">
<title>商品詳細</title>
</head>
<body>
<jsp:include page="header.jsp" />
	<div id="contents">
	<h1>商品詳細画面</h1>
	<!-- 選択された商品の詳細 DTO型があれば 表示 -->
		<s:if test="productInfoDTO!=null">

			<s:form action="AddCartAction">
			<div class="box">
				<div class="2column-container">
					<div class="right">
						<img src='<s:property value="productInfoDTO.imageFilePath"/>/<s:property value="productInfoDTO.imageFileName"/>' class="item-image-box-320"/><br>
					</div>
					<div class="left">
					<table class="vertical-list-table-mini">
						<tr>
						<!-- scope="row"はth（見出し用セル）に対応するtd（データ用セル）はrow行方向（横方向）ですよいう意味 -->
						<th scope="row"><s:label value="商品名"/></th>
						<td><s:property value="productInfoDTO.productName"/></td>
						</tr>
						<tr>
						<th scope="row"><s:label value="商品名ふりがな"/></th>
						<td><s:property value="productInfoDTO.productNameKana"/></td>
						</tr>
						<tr>
						<th scope="row"><s:label value="値段"/></th>
						<td><s:property value="productInfoDTO.price"/>円</td>
						</tr>
						<tr>
						<th scope="row"><s:label value="購入個数"/></th>
						<td><s:select name="productCount" list="%{productCountList}"/>個</td> <!-- productCountListはInteger型の配列 -->
						</tr>
						<tr>
						<th scope="row"><s:label value="発売会社名"/></th>
						<td><s:property value="productInfoDTO.releaseCompany"/></td>
						</tr>
						<tr>
						<th scope="row"><s:label value="発売年月日"/></th>
						<td><s:property value="productInfoDTO.releaseDate"/></td>
						</tr>
						<tr>
						<th scope="row"><s:label value="商品詳細情報"/></th>
						<td><s:property value="productInfoDTO.productDescription"/></td>
						</tr>
						</table>
					</div>
				</div>
			<s:hidden name="productId" value="%{productInfoDTO.productId}"/> <!-- hiddenで選択されている商品IDを渡す -->
			</div>
			<div class="submit_btn_box">
			<s:submit value="カートに追加" class="submit_btn" />
			</div>
			</s:form>

			<!-- 関連商品のListがあれば表示して 商品IDはparamで渡す -->
			<s:if test="relatedProductList!=null && relatedProductList.size()>0">
				<div class="box">
					<div class="product-details-recomｍend-box">
					<h2>【関連商品】</h2>
					<s:iterator value="relatedProductList">
							<div class="recommend-box">
								<a href='<s:url action="ProductDetailsAction">
								<s:param name="productId" value="%{productId}"/>
								</s:url>'><img src='<s:property value="imageFilePath"/>/<s:property value="imageFileName"/>' class="item-image-box-100"/>
								<s:property value="productName"/><br>
							</a></div>
					</s:iterator>
					</div>
				</div>
			</s:if>

		</s:if>
		<!-- 選択された商品の詳細 DTO型がなかった場合 -->
		<s:else>
			<div class="info">
				商品の詳細情報がありません。
			</div>
		</s:else>
	</div>
</body>
</html>