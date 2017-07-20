
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<style>

input[type=text], select {
    width: 100%;
    padding: 12px 20px;
    margin: 8px 0;
    display: inline-block;
    border: 1px solid #ccc;
    border-radius: 4px;
    box-sizing: border-box;
}

input[type=submit] {
    width: 100%;
    background-color: #4CAF50;
    color: white;
    padding: 14px 20px;
    margin: 8px 0;
    border: none;
    border-radius: 4px;
    cursor: pointer;
}

input[type=submit]:hover {
    background-color: #45a049;
}

div {
    border-radius: 5px;
    background-color: #f2f2f2;
    padding: 20px;
    width: 50%;
}
</style>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<title>Registro</title>
</head>
<body>
<center>
<h1>Libreria Virtual: Registro de Usuario</h1>
<div>
<form action="/TuLibroEnCasa/servlet/SrvGuardarRegistro" method="post">
        <label for="nombre">Nombre:</label>
        <input type="text" name="nombre" id="nombre"/>
        
        <label for="apellido1">Primer apellido:</label>
        <input type="text" name="apellido1" id="apellido1"/>
        
        <label for="apellido2">Segundo apellido:</label>
        <input type="text" name="apellido2" id="apellido2"/>
        
        <label for="DNI">DNI:</label>
        <input type="text" name="DNI" id="DNI"/>
        
        <label for="direccion">Direcci&oacute;n:</label>
        <input type="text" name="direccion" id="direccion"/>
        
        <label for="fechaNacimiento">Fecha de nacimiento:</label>
        <input type="text" name="fechaNacimiento" id="fechaNacimiento"/>
        
        <label for="email">E-mail:</label>
        <input type="text" name="email" id="email"/>
        
        <label for="usuario">Usuario:</label>
        <input type="text" name="usuario" id="usuario"/>
        
        <label for="clave">Clave:</label>
        <input type="text" name="clave" id="clave"/>
        
        <label for="confClave">Confirmar Clave:</label>
        <input type="text" name="confClave" id="confClave"/>
        
        <button type="submit">Registrar</button>
</form>
</div>
</center>
</body>
</html>
