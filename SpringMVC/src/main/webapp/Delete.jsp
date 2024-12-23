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

<h3>Deleted the user</h3>

<br>
<br>
<%
StudentDTO fromdb =(StudentDTO) session.getAttribute("student");
int sid=fromdb.getSid();
%>
<br>
<br>
<a href="Edit.jsp?id=<%=sid %>">Edit your Details</a>
</body>
</html>