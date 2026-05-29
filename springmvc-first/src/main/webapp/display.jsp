<%@ page import="com.first.Customer" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Display Page</title>
</head>
<body>

<%
    // Getting data from request
    String name = (String) request.getAttribute("name");
    String email = (String) request.getAttribute("email");
    Customer c = (Customer) request.getAttribute("customer");
%>

<h1>
    <%= name %> 
    <%= email %> 
    <%= c.getUsername() %> 
    <%= c.getUserage() %> 
    <%= c.getUserphono() %>
</h1>

</body>
</html>