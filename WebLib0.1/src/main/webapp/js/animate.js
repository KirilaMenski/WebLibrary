$(document).ready(function() {
	$('#text a img').width(120).hover(function() {

		$(this).stop().animate({
			width : 180
		});
	}, function() {
		$(this).stop().animate({
			width : 120
		});
	});

});


//$(document).ready(function() {
//	$(".newsClass a").hover(function() {
//		$(this).next("em").stop(true,true)
//                          .animate({opacity: "show", top: "-75"}, "slow");
//	}, function() {
//		$(this).next("em").stop(true,true)
//                          .animate({opacity: "hide", top: "-85"}, "fast");
//	});
//});
//
//$(document).ready(function(){
//
//	$(".newsClass a").append("<em></em>");
//	
//	$(".newsClass a").hover(function() {
//		$(this).find("em").stop(true, true).animate({opacity: "show", top: "-75"}, "slow");
//		var hoverText = $(this).attr("title");
//	    $(this).find("em").text(hoverText);
//	}, function() {
//		$(this).find("em").stop(true, true).animate({opacity: "hide", top: "-85"}, "fast");
//	});
//
//
//});