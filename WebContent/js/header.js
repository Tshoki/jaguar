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

/* 先週分
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
*/

// 2019 07 16 placeholder 操作
/* 指定種類
[name="userId"] placeholder="ユーザーID"
[name="password"] ここ2種 placeholder="パスワード", "現在のパスワード"
[name="newPassword"] placeholder="新しいパスワード"
[name="reConfirmationPassword"] placeholder="新しいパスワード（再確認)"
[name="familyName"] placeholder="姓"
[name="firstName"] placeholder="名"
[name="familyNameKana"] placeholder="姓ふりがな"
[name="firstNameKana"] placeholder="名ふりがな"
[name="userAddress"] placeholder="住所"
[name="telNumber"] placeholder="電話番号"
[name="email"] placeholder="メールアドレス"
*/
$(function(){
	// focus 処理
	$('[name="keywords"]').focus( function(){
		$('[name="keywords"]').removeAttr('placeholder');
	});
	$('[name="userId"]').focus( function(){
		$('[name="userId"]').removeAttr('placeholder');
	});
	$('[name="password"]').focus( function(){
		$('[name="password"]').removeAttr('placeholder');
	});
	$('[name="newPassword"]').focus( function(){
		$('[name="newPassword"]').removeAttr('placeholder');
	});
	$('[name="reConfirmationPassword"]').focus( function(){
		$('[name="reConfirmationPassword"]').removeAttr('placeholder');
	});
	$('[name="familyName"]').focus( function(){
		$('[name="familyName"]').removeAttr('placeholder');
	});
	$('[name="firstName"]').focus( function(){
		$('[name="firstName"]').removeAttr('placeholder');
	});
	$('[name="familyNameKana"]').focus( function(){
		$('[name="familyNameKana"]').removeAttr('placeholder');
	});
	$('[name="firstNameKana"]').focus( function(){
		$('[name="firstNameKana"]').removeAttr('placeholder');
	});
	$('[name="userAddress"]').focus( function(){
		$('[name="userAddress"]').removeAttr('placeholder');
	});
	$('[name="telNumber"]').focus( function(){
		$('[name="telNumber"]').removeAttr('placeholder');
	});
	$('[name="email"]').focus( function(){
		$('[name="email"]').removeAttr('placeholder');
	});

	// blur 処理
	$('[name="keywords"]').blur( function(){
		if($('[name="keywords"]').val().length == 0){
			$('[name="keywords"]').attr('placeholder', '検索ワード');
		}
	});
	$('[name="userId"]').blur( function(){
		if($('[name="userId"]').val().length == 0){
			$('[name="userId"]').attr('placeholder', 'ユーザーID');
		}
	});
	$('[name="newPassword"]').blur( function(){
		if($('[name="newPassword"]').val().length == 0){
			$('[name="newPassword"]').attr('placeholder', '新しいパスワード');
		}
	});
	$('[name="reConfirmationPassword"]').blur( function(){
		if($('[name="reConfirmationPassword"]').val().length == 0){
			$('[name="reConfirmationPassword"]').attr('placeholder', '新しいパスワード（再確認)');
		}
	});
	$('[name="familyName"]').blur( function(){
		if($('[name="familyName"]').val().length == 0){
			$('[name="familyName"]').attr('placeholder', '姓');
		}
	});
	$('[name="firstName"]').blur( function(){
		if($('[name="firstName"]').val().length == 0){
			$('[name="firstName"]').attr('placeholder', '名');
		}
	});
	$('[name="familyNameKana"]').blur( function(){
		if($('[name="familyNameKana"]').val().length == 0){
			$('[name="familyNameKana"]').attr('placeholder', '姓ふりがな');
		}
	});
	$('[name="firstNameKana"]').blur( function(){
		if($('[name="firstNameKana"]').val().length == 0){
			$('[name="firstNameKana"]').attr('placeholder', '名ふりがな');
		}
	});
	$('[name="userAddress"]').blur( function(){
		if($('[name="userAddress"]').val().length == 0){
			$('[name="userAddress"]').attr('placeholder', '住所');
		}
	});
	$('[name="telNumber"]').blur( function(){
		if($('[name="telNumber"]').val().length == 0){
			$('[name="telNumber"]').attr('placeholder', '電話番号');
		}
	});
	$('[name="email"]').blur( function(){
		if($('[name="email"]').val().length == 0){
			$('[name="email"]').attr('placeholder', 'メールアドレス');
		}
	});

	// placeholder attr パスワード 分岐
	var path = location.pathname
	if(path.match('ResetPasswordAction')){
		$('[name="password"]').blur( function(){
			if($('[name="password"]').val().length == 0){
				$('[name="password"]').attr('placeholder', '現在のパスワード');
			}
		});
	}else{
		$('[name="password"]').blur( function(){
			if($('[name="password"]').val().length == 0){
				$('[name="password"]').attr('placeholder', 'パスワード');
			}
		});
	}
});


