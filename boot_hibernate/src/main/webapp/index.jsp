<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
  <form action="/details">
  
  <input type="text" name="id"><br>
   <input type="text" name="name"><br>
    <input type="text" name="sal"><br>
     <input type="submit" >
     
     <%
      out.print("inserted succesfully");
     
     %>
  
  </form>
</body>
</html>