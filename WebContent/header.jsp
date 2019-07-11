<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<link rel="stylesheet" href="./css/header.css">
<link rel="stylesheet" href="./css/jaguar.css">
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js"></script>
<script src="./js/header.js"></script>

<header>
	<s:form id="form" name="form">
	<ul>
		<li><span>jaguar</span></li>
		<s:if test='#session.mCategoryDTOList!=null && #session.mCategoryDTOList.size()>0'>
		<li><s:select name="categoryId" list="#session.mCategoryDTOList" listValue="categoryName" listKey="categoryId" id="categoryId"/></li>
		</s:if>
		<li><s:textfield name="keywords" placeholder="検索ワード" /></li>
		<li><s:submit value="商品検索" onclick="goSearchItemAction();"/></li>
		<s:if test="#session.logined==1">
		<li><s:submit value="ログアウト" onclick="goLogoutAction();"/></li>
		</s:if>
		<s:else>
		<li><s:submit value="ログイン" onclick="goGoLoginAction();"/></li>
		</s:else>
		<li><s:submit value="カート" onclick="goCartAction();"/></li>
		<li><s:submit value="商品一覧" onclick="goProductListAction();"/></li>
		<s:if test="#session.logined==1">
		<s:submit value="マイページ" onclick="goMyPageAction();"/>
		</s:if>
	</ul>
	</s:form>
</header>