<%@page import="infinite.libraryproject.LibraryDAO"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
  <body>
<form method="post" action="Login.jsp">
<center>
<h2>Please Login :</h2>
Username : <input type="text" name="username" size="50"> <br/><br/>
Password : <input type="password" name="pass" size="50"> <br/><br/>
<input type="submit" value="Login">
</center>
</form>
<%
	if (request.getParameter("username")!=null && 
		request.getParameter("pass")!=null) {
		String user = request.getParameter("username");
		String pwd = request.getParameter("pass");
		LibraryDAO dao = new LibraryDAO();
		int count = dao.authenticate(user, pwd);
		if (count==1) {
			session.setAttribute("user", user);
%>
	<jsp:forward page="Menu.jsp"/>
<%
		} else{
%>
	<p>Invalid Credentials</p>
<%
		}
	}
%>
</body>
</html>