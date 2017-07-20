
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<title>Registro</title>
</head>
<body>
<center>
<h1>Libreria Virtual: Registro de Usuario</h1>
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
        <input type="date" name="fechaNacimiento" id="fechaNacimiento"/>
        
        <label for="email">E-mail:</label>
        <input type="email" name="email" id="email"/>
        
        <label for="usuario">Usuario:</label>
        <input type="text" name="usuario" id="usuario"/>
        
        <label for="clave">Clave:</label>
        <input type="password" name="clave" id="clave"/>
        
        <label for="confClave">Clave:</label>
        <input type="password" name="confClave" id="confClave"/>
        
        <button type="submit">Registrar</button>
</form>
</center>
</body>
</html>
