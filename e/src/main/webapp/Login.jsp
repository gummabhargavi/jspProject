<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
     <form method="get" action="Login.jsp">
      <center>
        User Name :
         <input type="text" name="userName" /> <br/><br/>
        Password :
        <input type="password" name="passCode" /> <br/><br/>
        <input type="submit" value="Login" /> <br/><br/>
      </center>
     </form>
     <%
       if(request.getParameter("userName")!=null && request.getParameter("passCode")!=null){
    	   String user,pwd;
    	   user=request.getParameter("userName");
    	   pwd=request.getParameter("passCode");
    	   if(user.equals("Infinite") && pwd.equals("Infinite")){
    		   
    %>
    <jsp:forward page="Menu.jsp" />
    <% 	  
    	   }else{
    %>
     <jsp:include page="Login.jsp" />
    <%  		   
    		   out.println("Invalid Credentials...");
    	   }
    	   
       }
     %>
</body>
</html>