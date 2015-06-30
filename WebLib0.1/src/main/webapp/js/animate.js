$(document).ready(
		function() {
//			#fantasy,#science_fiction,#detective,#science,#education
			$('#text a img')
					.width(120).hover(function() {

						$(this).stop().animate({
							width : 180
						});
					}, function() {
						$(this).stop().animate({
							width : 120
						});
					});

		});