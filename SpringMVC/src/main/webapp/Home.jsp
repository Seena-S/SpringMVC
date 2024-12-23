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
<h1>Home Page</h1>
<h3>Welcome ${ts}</h3>


<%
StudentDTO fromdb =(StudentDTO) session.getAttribute("student");
int sid=fromdb.getSid();
%>
<br>
<br>
<a href="Edit.jsp?id=<%=sid %>">Edit your Details</a>

<a href="Delete.jsp?id=<%=sid %>">Delete Student</a>
</body>
</html>