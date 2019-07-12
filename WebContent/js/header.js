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
});

// 検索ボックス の placeholder 操作
$(function(){
	$('input[type="text"]').eq(0).focus( function(){
		$('input[type="text"]').eq(0).removeAttr('placeholder');
	});
	$('input[type="text"]').eq(0).blur( function(){
		if($('input[type="text"]').eq(0).val().length == 0){
			$('input[type="text"]').eq(0).attr('placeholder', '検索ワード');
		}
	});
});