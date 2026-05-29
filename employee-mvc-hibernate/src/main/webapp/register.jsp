<%@ page language="java" contentType="text/html; charset=UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Register Employee</title>
</head>
<body>
<h2>Employee Registration Form</h2>
<form action="insert" method="post">
    Name: <input type="text" name="name" required><br><br>
    Email: <input type="email" name="email" required><br><br>
    Password: <input type="password" name="password" required><br><br>
    Salary: <input type="number" name="salary" step="0.01" required><br><br>
    <input type="submit" value="Register">
</form>
</body>
</html>