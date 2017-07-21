/**
 * 
 */
function validatePassword(){
  if(getElementById("confClave").value != getElementById("clave").value) {
    confirm_password.setCustomValidity("Passwords Don't Match");
  } else {
    confirm_password.setCustomValidity('');
  }
}