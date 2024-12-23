<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h1>Student Registration</h1>
<form action="register.do" method="post">
Student Name: <input type="text" name="sname"><br>
<br>
Student Address: <input type="text" name="saddress"><br>
<br>
Course:  <select name="scourse">

<option value="Btech">Btech</option>
<option value="Bcom">Bcom</option>
<option value="BBA">BBA</option>
<option value="Mtech">Mtech</option>
</select><br><br>
Place: <input type="text" name="splace"><br>
<br>
Age: <input type="text" name="sage"><br>
<br>
Email Id: <input type="email" name="semailid"><br>
<br>
Password: <input type="password" name="spwd"><br>
<br>
<input type="submit" value="Register">
<br>
</form>
<a href="Login.jsp">Sign Up</a>
</body>
</html>