<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ page import="cs6359.utdcart.controller.*" %>
<!DOCTYPE html>
<html>

<head><title>Login Page</title></head>

<body>
	<% String userName = request.getParameter("username"); %>
	<% String password = request.getParameter("password"); %>
	<% UserController usercontroller = new UserController(); %>
	<%= usercontroller.login(userName, password) %>
</body>
</html>