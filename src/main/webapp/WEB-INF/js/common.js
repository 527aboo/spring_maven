$(function() {

	$('.deleteBtn').on('click', function(e) {
		if (confirm('削除してもよろしいですか？') ) {
			e.submit();
		} else {
			return false;
		}
	});

});
