/**
 * 
 */
function validatePassword(){
	var clave1 = document.getElementById("clave").value;
	var clave2 = document.getElementById("confClave").value;
	
	document.getElementById("myBtn").disabled = true;
  if(clave1 = clave2) {
	  document.getElementById("myBtn").disabled = false;
  }
}