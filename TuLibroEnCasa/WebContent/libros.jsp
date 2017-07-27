<%@page import="java.util.List"%>
<%@page import="tulibroencasa.beans.Libro"%>
<%
	String user = (String) session.getAttribute("user");
	List<Libro> libros = (List<Libro>) request.getAttribute("libros");
%>
<html>
<head>
<title>Lista de libros</title>
<script language=JavaScript>
<!-- -->
</script>
</head>
<body>
	USUARIO:
	<b><%=user%></b>
	<form name=form1 method=post action=/Srvcarrito>
		<table>
			<tr>
				<td>&nbsp;</td>
				<td><b>Cantidad</b></td>
				<td><b>ISBN</b></td>
				<td><b>T&iacute;tulo</b></td>
				<td><b>Autor</b></td>
				<td><b>Categor&iacute;a</b></td>
				<td><b>Editorial</b></td>
				<td><b>PRECIO UNIDAD</b></td>
			</tr>
			<%
				Libro libro = null;
				for (int i = 0; i < libros.size(); i++) {
					libro = libros.get(i);
			%>
			<tr>
				<td><input name="isbn" type="checkbox" value="<%=libro.getIsbn()%>"></td>
				<td><input type="text" name="cantidad"></td>
				<td><%=libro.getIsbn()%></td>
				<td><%=libro.getTitulo()%></td>
				<td><%=libro.getAutor()%></td>
				<td><%=libro.getCategoria()%></td>
				<td><%=libro.getEditorial()%></td>
				<td><%=libro.getPrecio()%></td>
			</tr>
			<%
				}
			%>
		</table>
		<input type="submit" value="Seleccionar">
	</form>
</body>
</html>