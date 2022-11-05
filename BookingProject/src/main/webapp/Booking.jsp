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
 <h1>Booking </h1>
     <form method="get" action="Booking.jsp">
        Schedule Id :
            <input type="text" name="scheduleId"/> <br/><br/> 
         User ID :
            <input type="text" name="userId"/> <br/><br/>  
          Fare Amount:
          <input type="number" name="fareAmount"/> <br/><br/>  
          Total Amount:
          <input type="number" name="totalAmount"/> <br/><br/> 
           Seat No:
           <input type="number" name="seatNo"/> <br/><br/>  
           <input type="submit"  value="Book"/>
</body>
 <c:if test="${param.fareAmount!=null}">
      <jsp:useBean id="Dao" class="com.infinite.booking.BookingDAO"/>
      <jsp:useBean id="book" class="com.infinite.booking.Booking"/>
      <jsp:setProperty property="*" name="book"/>
      <c:out value="${Dao.addBooking(book)}"/>
</c:if>
</html>