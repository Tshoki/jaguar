<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<script src="./js/header.js"></script>
<header>
	<div id="header">
		<div id="header-title">
		jaguar
		</div>
		<div id="header-menu">

			<s:form id="form" name="form">
				<s:if test='#session.mCategoryDTOList!=null && #session.mCategoryDTOList.size()>0'>
					<s:select name="categoryId" list="#session.mCategoryDTOList" listValue="categoryName" listKey="categoryId" class="cs-div" id="categoryId"/>
					</s:if>
						<s:textfield name="keywords" class="txt-keywords" placeholder="検索ワード" />
						<s:submit value="商品検索" class="submit_btn" onclick="goSearchItemAction();"/>
					<s:if test="#session.logined==1">
						<s:submit value="ログアウト" class="submit_btn" onclick="goLogoutAction();"/>
					</s:if>
					<s:else>
						<s:submit value="ログイン" class="submit_btn" onclick="goGoLoginAction();"/>
					</s:else>
						<s:submit value="カート" class="submit_btn" onclick="goCartAction();"/>
						<s:submit value="商品一覧" class="submit_btn" onclick="goProductListAction();"/>
					<s:if test="#session.logined==1">
						<s:submit value="マイページ" class="submit_btn" onclick="goMyPageAction();"/>
					</s:if>
				</s:form>

		</div>
	</div>
</header>