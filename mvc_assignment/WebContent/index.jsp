<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<form action="calci">
     <input type="text" name="num1">
     <input type="text" name="num2">
     <input type="submit" value="submit ">

</form>
   <%
  try{
    int ad=(int) session.getAttribute("ad");
    int sb=(int) session.getAttribute("sb");
    int ml=(int) session.getAttribute("ml");
    int dv=(int) session.getAttribute("dv");
    out.println(ad);
    out.println(sb);
    out.println(ml);
    out.println(dv);
    session.removeAttribute("ad");
    session.removeAttribute("sb");
    session.removeAttribute("ml");
    session.removeAttribute("dv");
  }
   catch(NullPointerException e){
	   
   }
       
   %>
</body>
</html>