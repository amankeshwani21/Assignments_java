<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib uri="/WEB-INF/myfile.tld" prefix="my" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<form>
<input type="number" name="data">
<input type="submit" value="submit"><br>
</form>

<%!
   String s="0";
%>
<%
s=request.getParameter("data");
if(s==null){
	s="0";
}
%>


  <my:hello number="<%=s%>"></my:hello>
  
</body>
</html>