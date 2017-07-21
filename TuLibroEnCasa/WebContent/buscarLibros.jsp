<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<title>buscar Libros</title>
</head>
<body>
	USUARIO:
	<%
	String user = (String) session.getAttribute("user");
    %>
	<b><%=user%></b>
	<center>
		<h1>Libreria Virtual: Menu -> Buscar Libros</h1>
		<form id="form1" name="form1" method="post"	action="/TuLibroEnCasa/servlet/SrvMostrarLibros">
			Titulo: <input name="titulo" type="text" /><br /> <br />
		    <input name="opcionCondicion" type="radio" value="and" />AND&nbsp;&nbsp;&nbsp;
			<input name="opcionCondicion" type="radio" value="or" />OR <br /> <br />
			Autor: <input name="autor" type="text" /><br /> <br /> Categoria:
			<select name="categoria">
				<option value="0" selected="selected"><b>Cualquiera</b></option>
				<option value="1">Ciencia ficcion</option>
				<option value="2">Terror</option>
				<option value="3">Aventuras</option>
				<option value="4">Suspense</option>
			</select> <br /> <br />
			<h3>Orden:</h3>
			&nbsp;&nbsp;&nbsp; <input name="opcionOrden" type="radio"
				value="OrdenTitulo" />Titulo&nbsp;&nbsp;&nbsp; <input
				name="opcionOrden" type="radio" value="OrdenAutor" />Autor <br />
			<br /> <input type="submit" value="Buscar" />
		</form>
	</center>
</body>
</html>
