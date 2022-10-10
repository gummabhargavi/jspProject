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
  <jsp:include page="Menu.jsp"/> <br/>
  <%
    LibraryDAO dao = new LibraryDAO();
    String[] id=request.getParameterValues("bookid");
    String user = (String)session.getAttribute("user");
    for(String s : id){
    	int bid = Integer.parseInt(s);
    	out.println(dao.issueBook(user, bid));
    	out.println("<br/>");
    }
  %>
</body>
</html>