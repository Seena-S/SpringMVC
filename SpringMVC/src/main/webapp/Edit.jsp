<%@page import="com.demo.test.DTO.Registration.StudentDTO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%

int id= Integer.parseInt(request.getParameter("id"));
StudentDTO fromdb= (StudentDTO) session.getAttribute("student");

%>
<h1>Update Student Details</h1>
<form action="update.do" method="post">
Student Id: <input type="number" name="sid" value="<%= fromdb.getSid()%>" disabled="disabled"><br>
<br>
Student Name: <input type="text" name="sname" value="<%= fromdb.getSname()%>"><br>
<br>
Student Address: <input type="text" name="saddress" value="<%= fromdb.getSaddress()%>"><br>
<br>
Course:  <select name="scourse"><br>
<option><%= fromdb.getScourse()%></option>
<option value="Btech">Btech</option>
<option value="Bcom">Bcom</option>
<option value="BBA">BBA</option>
<option value="Mtech">Mtech</option>
</select><br><br>
Place: <input type="text" name="splace" value="<%= fromdb.getSplace()%>"><br>
<br>
Age: <input type="text" name="sage" value="<%= fromdb.getSage()%>"><br>
<br>
Email Id: <input type="email" name="semailid" value="<%= fromdb.getSemailid()%>"><br>
<br>
Password: <input type="password" name="spwd" value="<%= fromdb.getSpwd()%>"><br>
<br>
<input type="submit" value="update">
<br>
</form>
</body>
</html>