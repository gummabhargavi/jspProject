<%@page import="com.infinite.session.EmployDAO"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
    <form method="post" action="Login.jsp">
    <center>
      User Name :
      <input type="text" name="userName" /> <br/><br/>
      Password :
      <input type="password" name="passCode" /> <br/><br/>
      <input type="submit" value="Login" />
    </center>
    </form>
    <%
     if(request.getParameter("userName")!=null && request.getParameter("passCode")!=null){
    	 EmployDAO dao = new EmployDAO();
    	 String user = request.getParameter("userName");
    	 String pwd = request.getParameter("passCode");
    	 int count = dao.validate(user, pwd);
    	 if(count==1){
    	%>
    	<jsp:forward page="EmployTable.jsp" />
    	<%	 
    	 }else{
    		 out.println("Invalid Credentials...");
    	 }
    	 
     }
    %>
</body>
</html>