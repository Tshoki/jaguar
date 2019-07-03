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
<title> Cart.jsp </title>
</head>
<body>

<!-- 未完成 -->

<h1 class="cart_title">カート情報</h1>

<!--- カート情報がある場合 --->
<s:if test=" ユーザーIDもしくは仮ユーザーIDに紐づいたカート情報がある && ある分表示 ">

<div class="box">
<ul class="cart_list">
    <li class="left"><img src="color_blue.png" /></li>
    <li class="right">
        <ul class="cart_list_text">
            <li>
                <ul class="cart_list_text_top">
                    <li class="left">
                        <ul class="cart_list_text_top_left">
                            <li><span class="cart_kana">あおいかみとうきょうとちよだくさん</span></li>
                            <li><span class="cart_name">青い紙（東京都千代田区産）</span></li>
                        </ul>
                    </li>
                    <li class="right"><span class="cart_price">¥ 1,000</span></li>
                </ul>
            </li>
            <li><span class="cart_co">株式会社インターノウス</span></li>
            <li>
                <ul class="cart_list_text_bottom">
                    <li class="left">数量 : 5個</li>
                    <li class="right">合計金額 : ¥ 5000</li>
                </ul>
            </li>
        </ul>
    </li>
</ul>
</div>

<h1 class="cart_total_price">
    カート合計金額 :<span class="cart_total_price"> ¥ 5000</span>
</h1>

<button onclick="" class="btn">決済画面</button> <!--- formでsubmitかなあ --->

</s:if>

<!--- カート情報がない場合 --->
<s:else>
カート情報がありません。<!--- 指定メッセージ --->
</s:else>

</body>
</html>