<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%@ page import="com.dao.dao" %>
<jsp:useBean id="u" class="com.pojo.pojo"></jsp:useBean>
<jsp:setProperty property="*" name="u"/>

<%
    dao.dataInsert(u);
	response.sendRedirect("view.jsp");
%>

</body>
</html>