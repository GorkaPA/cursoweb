/**
 * 
 */

window.onload = function disableBtn() {
    document.getElementById("myBtn").disabled = true;
}


function validatePassword() {
	var clave1 = document.getElementById("clave").value;
	var clave2 = document.getElementById("confClave").value;
	if (clave1 == clave2) {
		document.getElementById("myBtn").disabled = false;
	}
}