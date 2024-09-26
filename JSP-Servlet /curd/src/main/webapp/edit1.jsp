<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
    
    
     
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%@ page import="com.dao.dao,com.pojo.pojo,java.util.*" %>
<jsp:useBean id="u" class="com.pojo.pojo" scope="page" />
<jsp:setProperty property="*" name="u" />



   

<%
   
    String s= request.getParameter("rid");
    
     pojo p= dao.getdatafetchbyid(Integer.parseInt(s));
   
   System.out.println(s);
   
 
  %>
  
  <form name="rform" method="get" action="edit.jsp">
  
   <input type="hidden" name="rid" value="<%= p.getRid()%>"><br><br>
   
   
  Enter your name :- <input type="text" name="name" value="<%= p.getName()%>"><br><br>
  
  Enter your email :- <input type="email" name="email" value="<%= p.getEmail()%>"><br><br>
  
  Enter your password :- <input type="password" name="password" value="<%= p.getPassword()%>"><br><br>
  
  
  <input type="submit" value="registration"><br><br>
  
  
  </form>
  
    <a href="view.jsp">View user</a>
 

 



</body>
</html>