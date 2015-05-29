$(document).ready(function() {
	$('li').hover(function() {
		$(this).find('ul>li').stop().fadeToggle(300);
	});
});

$(document).ready(function() {
	$(document).click(function(e) {
		if ($(e.target).closest('#logintext').length)
			return;// если в поле есть текст -> return
		$('#logintext div').hide();// скрываем блок
		e.stopPropagation();// останавливает всплытие
							// события клик
	});
	$('#logintext a').click(function() {// mouseenter курсор
										// наведён на ссылку,
										// click клик по ссылке
		$(this).next().show();// показывать этот блок
	});
	$('#logintext').mouseleave(function() {// курсор ушел с
											// сылки
		var x = 1;
		$('input:text', this).each(function() {
			if (this.value)
				return x = 0;
		});
		if (x)
			$('div', this).hide();
	});

});