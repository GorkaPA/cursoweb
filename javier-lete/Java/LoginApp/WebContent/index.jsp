<%@page import="com.garaipenadev.loginapp.vo.User"%>

<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<% 
User user = (User)session.getAttribute("user");
String usuario = "";
if(user !=null){

	usuario = user.getName();
}
%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>LoginApp</title>
</head>
<body>

<%
if(user == null){
%>
	<h1>Login</h1>
	<form action="login" method="post">
		<p>
			<label for="nombre">Nombre:</label> <input type="text" id="nombre"
				name="nombre" required>
		</P>
		<p>
			<label for="pass">Contrase�a:</label> <input type="text" id="pass"
				name="pass" required>
		</P>
		<p>
		<label for="recordar">Recu�rdame</label><input type="checkbox" name="recordar" value="recordar" id="recordar" checked> 
		</p>
		<input type="submit" value="Login">
	</form>
	
<%
}else{
%>
<h1>Bienvenido, <%=usuario %></h1>
<h2>Ya est�s logueado, indica qu� deseas hacer:</h2>
<ul>
	<li><a href="/private/index.jsp">Ir al men�</a></li>
	<li><a href="logout">Cerrar sesi�n</a></li>
</ul>

<%
}
%>
</body>
</html>