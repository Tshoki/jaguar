
// submit click で form action 操作
$(function(){

	$('input[type="submit"]').click(function(){
		$(this).parents('form').attr('action', $(this).data('action'));
		$(this).parents('form').submit();
	})

});

$(function(){

	$('.delete_btn').prop('disabled', true);

	$('input[type="checkbox"]').click(function() {
		var check_count = $('input[type="checkbox"]:checked').length;
		if(check_count == 0){
			$('.delete_btn').prop('disabled', true);
		}else if(check_count > 0){
			$('.delete_btn').prop('disabled', false);
		}
	});

});