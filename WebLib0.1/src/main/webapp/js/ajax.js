//�������� ����� �����
function run() {
	var appContainer1 = document.getElementById("name");
	var appContainer2 = document.getElementById("lastname");
	var appContainer6 = document.getElementById("login_reg");
	var appContainer3 = document.getElementById("password");
	var appContainer4 = document.getElementById("repeatpassword");
	var appContainer5 = document.getElementById("email");

	appContainer1.addEventListener('blur', delegateEvent);
	appContainer2.addEventListener('blur', delegateEvent);
	appContainer3.addEventListener('blur', delegateEvent);
	appContainer4.addEventListener('blur', delegateEvent);
	appContainer5.addEventListener('blur', delegateEvent);
	appContainer6.addEventListener('blur', delegateEvent);
};

function delegateEvent(e) {
	if (e.type == 'blur' && e.target.id == 'name')
		change(document.getElementById("name"));
	if (e.type == 'blur' && e.target.id == 'lastname')
		change(document.getElementById("lastname"));
	if (e.type == 'blur' && e.target.id == 'login_reg')
		change(document.getElementById("login_reg"));
	if (e.type == 'blur' && e.target.id == 'password')
		change(document.getElementById("password"));
	if (e.type == 'blur' && e.target.id == 'repeatpassword')
		change(document.getElementById("repeatpassword"));
	if (e.type == 'blur' && e.target.id == 'email')
		change(document.getElementById("email"));
};

function returneToMainPage() {
	alert('You are not accepted the rule!');
	location.href = "savecitation.by";
}

var reg = /^[^\s()<>@,;:\/]+@\w[\w\.-]+\.[a-z]{2,}$/i;

function change(inputName) {
	smth = inputName;

	if (smth == document.getElementById("name")
			|| smth == document.getElementById("lastname")
			|| smth == document.getElementById("login_reg")) {
		if (smth.value == "") { // ������� �� �����
			// �������� ������
			smth.classList.add("error");
		}
		if (smth.value != "") {
			smth.classList.add("accept");
		} else {
			smth.classList.remove("accept");
		}
	}

	if (smth == document.getElementById("repeatpassword")) {
		if (document.getElementById("repeatpassword").value != document
				.getElementById("password").value) { // ������� �� �����
			// �������� ������
			smth.classList.add("error");
		}
		if (document.getElementById("repeatpassword").value == document
				.getElementById("password").value) {
			smth.classList.add("accept");
		} else {
			smth.classList.remove("accept");
		}

	}
	if (smth == document.getElementById("email")) {
		if ((smth.value) == "" || !reg.test(smth.value)) { // ������� �� �����
			// �������� ������
			smth.classList.add("error");
		}
		if (smth.value != "" && reg.test(smth.value)) {
			smth.classList.add("accept");
		} else {
			smth.classList.remove("accept");
		}

	}
};

// Ajax �����
var xmlHttpRequest;
if (window.XMLHttpRequest) {
	xmlHttpRequest = new XMLHttpRequest();
} else if (window.ActiveXObject) {
	xmlHttpRequest = new ActiveXObject("MICROSOFT.XMLHTTP");
}

function sendMessageToServer() {

	if (document.getElementById("name").value != ""
			&& document.getElementById("lastname").value != ""
			&& document.getElementById("login_reg").value != ""
			&& document.getElementById("password").value != ""
			&& document.getElementById("repeatpassword").value != ""
			&& document.getElementById("email").value != ""
			&& document.getElementById("repeatpassword").value == document
					.getElementById("password").value
			&& reg.test(document.getElementById("email").value)) {

		var data = {
			name : (document.getElementById("name").value),
			lastname : (document.getElementById("lastname").value),
			login : (document.getElementById("login_reg").value),
			password : (document.getElementById("password").value),
			email : (document.getElementById("email").value),
		};

		xmlHttpRequest.open("POST", "RegistrServlet", true);
		xmlHttpRequest.onreadystatechange = receiveMessageFromServer;
		xmlHttpRequest.send(JSON.stringify(data));// stringify ����������� �
		// json ������ � ����� �
		// ������

		clean();
	} else {
		alert('Error!');
		clean();
	}

}

function receiveMessageFromServer() {
	if (xmlHttpRequest.readyState == 4 && xmlHttpRequest.status == 200)
		document.getElementById("email").value = xmlHttpRequest.responseXML
				.getElementsByTagName("responseFromServer")[0].text;
	location.href = "savecitation.by";
}

/*
 * Check login and password, enter in account
 */
function enterToAccount() {
	/*
	 * var userName = document.getElementById("user_name"); var userPass =
	 * document.getElementById("user_pass"); // if (userName != "" && userPass !=
	 * "") {
	 * 
	 * $.ajax({ url : 'enter_account', type : 'POST', dataType : 'json',
	 * contentType : 'application/json', mimeType : 'application/json', data : ({
	 * name : userName.value, pass : userPass.value }), succes : function(data) {
	 * var result = data.name; $('#hello').Text(result); } }); alert("Sorry! but
	 * this button doesn't work"); // } else { // alert("Please, check your
	 * login and password"); // }
	 */
	var userName = $("#user_name").val();
	var userPass = $("#user_pass").val();

	$.ajax({
		url : 'enter_account',
		/*
		 * type: 'GET', dataType: 'json', contentType: 'application/json',
		 * mimeType: 'application/json',
		 */
		data : ({
			name : userName,
			pass : userPass
		}),
		success : function(data) {
			/* var name = 'Hello, ' + userName + '! '; */
			$("#hello").text(data);

		}
	});
}
/*
 * exit from account
 */
function exiteFromAccount() {
	document.getElementById('user_name').value = "";
	document.getElementById('user_pass').value = "";
	document.getElementById('hello').value = " ";
}

function search() {
	alert("Sorry! but this button doesn't work");
}

function clean() {
	document.getElementById("name").value = "";
	document.getElementById("lastname").value = "";
	document.getElementById("login_reg").value = "";
	document.getElementById("password").value = "";
	document.getElementById("repeatpassword").value = "";
	document.getElementById("email").value = "";
}