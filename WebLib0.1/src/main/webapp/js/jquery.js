$(document).ready(function() {
	$('li').hover(function() {
		$(this).find('ul>li').stop().fadeToggle(300);
	});
});

$(document).ready(function() {
	$(document).click(function(e) {
		if ($(e.target).closest('#logintext').length)
			return;
		$('#logintext div').hide();
		e.stopPropagation();
	});
	$('#logintext a').click(function() {
		$(this).next().show();
	});
	$('#logintext').mouseleave(function() {
		var x = 1;
		$('input:text', this).each(function() {
			if (this.value)
				return x = 0;
		});
		if (x)
			$('div', this).hide();
	});

});