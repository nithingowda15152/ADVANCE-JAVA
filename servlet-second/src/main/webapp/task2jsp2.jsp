<%@ page language="java" contentType="text/html; charset=UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<title>JSP2</title>
</head>
<body>
<%
String data = (String) request.getAttribute("uname");
%>

<h1>Received name: <%= data %></h1>
</body>
</html>