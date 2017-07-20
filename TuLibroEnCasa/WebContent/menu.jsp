<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<title>Tu libro en casa</title>
</head>
<%
	String user = (String)session.getAttribute("user");
%>
<body>
USUARIO: <b><%=user%></b>
<center>
<h1>Libreria Virtual: Menu</h1>
<input name="comprar" type="button" value="Comprar Libros" onclick="javascript:location.href='/TuLibroEnCasa/servlet/SrvBuscarLibros';"/><br /><br />
<input name="foro" type="button" value="Foro" /><br /><br />
<input name="modificar" type="button" value="Modificar Datos" /><br /><br />
</center>
</body>
</html>
