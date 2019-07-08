
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

//checkbox が click された時 checked かどうかで分岐
//指定先の操作受付許可 , 透明度（表示非表示）
$(function(){

	$('input[type="submit"]').eq(7).prop('disabled', true);
	$('input[type="submit"]').eq(7).css('opacity', 0);

	$('input[type="checkbox"]').click(function() {
		if($(this).prop('checked')){
			$('input[type="submit"]').eq(7).prop('disabled', false);
			$('input[type="submit"]').eq(7).animate({opacity: 1},{duration: 200});
		}else{
			$('input[type="submit"]').eq(7).prop('disabled', true);
			$('input[type="submit"]').eq(7).animate({opacity: 0},{duration: 200});
		}
	});

});