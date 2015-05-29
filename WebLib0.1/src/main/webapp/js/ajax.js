//Праверка формы ўводу
function run() {
	var appContainer1 = document.getElementById("name");
	var appContainer2 = document.getElementById("lastname");
	var appContainer3 = document.getElementById("password");
	var appContainer4 = document.getElementById("repeatpassword");
	var appContainer5 = document.getElementById("email");

	appContainer1.addEventListener('blur', delegateEvent);
	appContainer2.addEventListener('blur', delegateEvent);
	appContainer3.addEventListener('blur', delegateEvent);
	appContainer4.addEventListener('blur', delegateEvent);
	appContainer5.addEventListener('blur', delegateEvent);
};

function delegateEvent(e) {
	if (e.type == 'blur' && e.target.id == 'name')
		change(document.getElementById("name"));
	if (e.type == 'blur' && e.target.id == 'lastname')
		change(document.getElementById("lastname"));
	if (e.type == 'blur' && e.target.id == 'password')
		change(document.getElementById("password"));
	if (e.type == 'blur' && e.target.id == 'repeatpassword')
		change(document.getElementById("repeatpassword"));
	if (e.type == 'blur' && e.target.id == 'email')
		change(document.getElementById("email"));
};

var reg = /^[^\s()<>@,;:\/]+@\w[\w\.-]+\.[a-z]{2,}$/i;

function change(inputName) {
	smth = inputName;

	if (smth == document.getElementById("name")
			|| smth == document.getElementById("lastname")) {
		if (smth.value == "") { // введено не число
			// показать ошибку
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
				.getElementById("password").value) { // введено не число
			// показать ошибку
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
		if ((smth.value) == "" || !reg.test(smth.value)) { // введено не число
			// показать ошибку
			smth.classList.add("error");
		}
		if (smth.value != "" && reg.test(smth.value)) {
			smth.classList.add("accept");
		} else {
			smth.classList.remove("accept");
		}

	}
};

// Ajax запыт
var xmlHttpRequest;
if (window.XMLHttpRequest) {
	xmlHttpRequest = new XMLHttpRequest();
} else if (window.ActiveXObject) {
	xmlHttpRequest = new ActiveXObject("MICROSOFT.XMLHTTP");
}

function sendMessageToServer() {

	if (document.getElementById("name").value != ""
			&& document.getElementById("lastname").value != ""
			&& document.getElementById("password").value != ""
			&& document.getElementById("repeatpassword").value != ""
			&& document.getElementById("email").value != ""
			&& document.getElementById("repeatpassword").value == document
					.getElementById("password").value
			&& reg.test(document.getElementById("email").value)) {

		var data = {
			name : (document.getElementById("name").value),
			lastname : (document.getElementById("lastname").value),
			password : (document.getElementById("password").value),
			email : (document.getElementById("email").value),
		};

		xmlHttpRequest.open("POST", "RegistrServlet", true);
		xmlHttpRequest.onreadystatechange = receiveMessageFromServer;
		xmlHttpRequest.send(JSON.stringify(data));// stringify преобразует в
		// json объект а потом в
		// строку

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

function clean() {
	document.getElementById("name").value = "";
	document.getElementById("lastname").value = "";
	document.getElementById("password").value = "";
	document.getElementById("repeatpassword").value = "";
	document.getElementById("email").value = "";
}