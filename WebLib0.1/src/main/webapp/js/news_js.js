$(document)
		.ready(
				function() {
					$('#add')
							.click(
									function() {
										var title = $('#title').val();
										var description = $('#description')
												.val();
										var news = $('#news').val();
										var date = new Date();

										if (document.getElementById("title").value != ""
												&& document
														.getElementById("description").value != ""
												&& document
														.getElementById("news").value != "") {
											$
													.ajax({
														type : "POST",
														data : {
															"title" : title,
															"description" : description,
															"news" : news
														},
														success : function(
																response) {
															$('#newsBlock')
																	.after(
																			"<div class='newsClass'>"
																					+ "<div id='titleRes'>"
																					+ "<b>"
																					+ title
																					+ "</b>"
																					+ "</div>"
																					+ "<span id='dateRes'>"
																					+ date
																							.getFullYear()
																					+ ":"
																					+ "0"
																					+ (date
																							.getMonth() + 1)
																					+ ":"
																					+ date
																							.getDate()
																					+ "  "
																					+ date
																							.getHours()
																					+ ":"
																					+ date
																							.getMinutes()
																					+ "</span>"
																					+ "<p>"
																					+ "<span id='descriptionRes'>"
																					+ description
																					+ "</span>"
																					+ "</p>"
																					+ "<p>"
																					+ "<span id='newsRes'>"
																					+ news
																					+ "</span>"
																					+ "</p>"
																					+ "</div>");
														}
													});

											document.getElementById("title").value = "";
											document
													.getElementById("description").value = "";
											document.getElementById("news").value = "";
										} else {
											alert("Error!");
										}

										return false;
									});
				});