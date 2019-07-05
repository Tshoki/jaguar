
// submit click で form action 操作
$(function(){

	$('input[type="submit"]').click(function(){
		$(this).parents('form').attr('action', $(this).data('action'));
		$(this).parents('form').submit();
	})

});

// 削除ボタン opacity 操作
// チェックリストにチェックが入っていたら
$(function(){

});