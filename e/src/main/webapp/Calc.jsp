<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
    <form method="get" action="Calc.jsp">
      <center>
         First No :
         <input type="number" name="firstNo" /> <br/><br/>
         Second No :
         <input type="number" name="secondNo" /> <br/><br/>
         <input type="submit" value="Calculation" />
      </center>
    </form>
    <%
      if(request.getParameter("firstNo")!=null && request.getParameter("secondNo")!=null){
    	  int firstNo,secondNo,result;
    	  firstNo = Integer.parseInt(request.getParameter("firstNo"));
    	  secondNo = Integer.parseInt(request.getParameter("secondNo"));
    	  result = firstNo + secondNo;
    	  out.println("Sum is " +result+ "<br/>");
    	  result = firstNo - secondNo;
    	  out.println("Sub is " +result+ "<br/>");
    	  result = firstNo * secondNo;
    	  out.println("Mul is " +result+ "<br/>");
    	  
    	  
      }
    %>
</body>
</html>