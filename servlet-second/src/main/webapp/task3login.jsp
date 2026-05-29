<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Login Result</title>
</head>
<body>
<%
    // Read data from form
    String user = request.getParameter("user");
    String pass = request.getParameter("pass");
    
    // Validation logic
    if(user != null && pass != null && user.equals("admin") && pass.equals("1234")) {
        // Create session and store data
        HttpSession sessionObj = request.getSession();
        sessionObj.setAttribute("username", user);
%>
        <h1 style="color:green;">Login Successful ✅</h1>
        <h2>Welcome, <%= user %></h2>
<%
    } else {
%>
        <h1 style="color:red;">Invalid Username or Password ❌</h1>
        <!-- Show login form again -->
        <jsp:include page="task3login.html" />
<%
    }
%>
</body>
</html>