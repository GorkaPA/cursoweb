<%@page import="com.garaipenadev.loginapp.vo.User"%>
<% 
User user = (User)session.getAttribute("user");

%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<%if(user !=null){%>
<h1>Bienvenido ,
<%=user.getName()%>
.</h1>
<%} %>
<ul>
<li><a href="sumar.jsp">Sumar dos n�meros</a></li>
<li><a href="jubilaci�n">Jubilaci�n</a></li>
</ul>

</body>
</html>