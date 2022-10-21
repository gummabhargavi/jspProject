<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
       <jsp:include page="menu.jsp" />
       <form method="get" action="Return.jsp">
          <table border="3">
              <tr>
                <th>Book Id</th>
                <th>User Name</th>
                <th>Issued On</th>
                <th>Return</th>
              </tr>
             
          </table>
       </form>
	
</body>
</html>