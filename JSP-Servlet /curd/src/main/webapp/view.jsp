 <%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

			<%@ page import="com.dao.dao,com.pojo.pojo,java.util.*" %>
			<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="n" %>
			
			<%
			List<pojo> h = dao.getalldata();
			request.setAttribute("h", h);
			
			%>
			
			<center>
			
			<table border="1">
			
			<tr>
			<th>Rid</th>
			<th>Name</th>
			<th>Email</th>
			<th>Password</th>
			<th>Action</th>
			
			</tr>
			
			<n:forEach items="${h}" var="j">
			
			<tr>   
			<td>${j.getRid()}</td>
			<td>${j.getName()}</td>
			<td>${j.getEmail()}</td>
			<td>${j.getPassword()}</td>
			<td> <a href="delete.jsp?rid=${j.getRid()}">Delete</a> </td>
			<td> <a href="edit1.jsp?rid=${j.getRid()}" >Edit</a> </td>
			
			</tr>
			</n:forEach>
			</table>

			</center>

</body>
</html>