$(document)
		.ready(
				function() {
					$('#addBut')
							.click(
									function() {
										var commentText = $('#commentText').val();
										
										var date = new Date();

										if (document.getElementById("commentText").value != "") {
											$
													.ajax({
														type : "POST",
														data : {
															"commentText" : commentText
														},
														success : function(
																response) {
															$('#comments')
																	.after(
																			"<div class='commentClass'>"
																					+ "<b>"
																					+ "<p>"
																					+ commentText
																					+ "  "
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
																					+ "</p></b>"
																					+ "</div>");
														}
													});

											document.getElementById("commentText").value = "";
											
										} else {
											alert("Error!");
										}

										return false;
									});
				});