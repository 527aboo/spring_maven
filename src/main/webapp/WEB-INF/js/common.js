$(function() {

	$('.deleteBtn').on('click', function(e) {
		if (confirm('削除してもよろしいですか？') ) {
			e.submit();
		} else {
			return false;
		}
	});
	
	$('#sortTable').tablesorter({
		headers: {
			2: {
				sorter: false
			},
			3: {
				sorter: false
			}
		}
	})

});
