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
     <c:set var="searchtype" value="${param.searchtype}"/>
	<c:set var="searchvalue" value="${param.searchvalue}"/>
	<jsp:useBean id="beanDao" class="com.infinite.oyoproject.OyoDAO" />
		<br/> Select Room to Available: <br/> 
	
	<form action="Booking.jsp" method="post">
	<table border='3'>
		<tr>
		 <th>Id </th>
		 <th>type</th>
		 <th>status</th>
		 <th>CostPerDay</th>
		 <th> Select </th>
	    </tr>
	  <c:forEach var="room" items="${beanDao.searchRoom(searchtype,searchvalue)}">
	  	<tr>
	  		<td><c:out value="${room.roomId}"/> </td>
	  		<td><c:out value="${room.type}"/> </td>
	  		<td><c:out value="${room.status}"/> </td>
	  		<td><c:out value="${room.costPerDay}"/> </td>
	  		
	  	</tr>
	  </c:forEach>
	 </table>
	 <br/>
	 <input type='submit' value='rooms Booking ' >
	</form>
</body>
</html>