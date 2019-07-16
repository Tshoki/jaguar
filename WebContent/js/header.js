function goGoLoginAction(){
	document.getElementById("form").action="GoLoginAction";
}
function goMyPageAction(){
	document.getElementById("form").action="MyPageAction";
}
function goCartAction(){
	document.getElementById("form").action="CartAction";
}
function goProductListAction(){
	document.getElementById("form").action="ProductListAction";
}
function goLogoutAction(){
	document.getElementById("form").action="LogoutAction";
}
function goSearchItemAction(){
	document.getElementById("form").action="SearchItemAction";
}

$(function(){
	var height=$('header').height();
	$('body').css('margin-top', height + 14);

	// 2019 07 16 考察中 ひどい指定
	//var h1_height=$('h1').height(); // 新変数追加
	//$('h1').next().css('margin-top', h1_height + height + 100); // h1 の 次の要素に margin 追加
});

/*
$(function(){
	setTimeout(function(){
		$('h1').text('Cart'); // 表示文字操作
		$('h1').css('border','none'); // border 操作
		$('h1').animate({'left':'15%'},{duration: 300}); // position 操作
	},1000);
});
*/