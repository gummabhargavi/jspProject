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
      <form method="get" action="AddRoom.jsp">
       <table border="3" align="center">
       <tr>
         <th>Room Type</th> 
           <td>
           <input type="text" name="type"/> 
           </td>
         </tr>
        <tr>   
          <th>Status</th>
          <td>
              <select name="status">
						<option value="AVAILABLE">Available</option>
						<option value="BOOKED">Booked</option>
					</select>
          </td>
         </tr>
         <tr> 
          <th>CostperDay</th>
          <td>
          <input type="number" name="costPerDay"/> 
          </td>
         </tr> 
        <tr> 
         <th colspan="2">
          <input type="submit" value="Add Room"/>
          </th>
        </tr>  
     </table>
      </form>
     <c:if test="${param.type!=null && param.status!=null && param.costPerDay!=null}">
     	<jsp:useBean id="beanRoom" class="com.infinite.oyoproject.Room"/>
     	<jsp:setProperty property="*" name="beanRoom"/>
     	<jsp:useBean id="beanDao" class="com.infinite.oyoproject.OyoDAO"/>
     	<c:out value="${beanDao.addRoom(beanRoom)}"/>
     </c:if>
</body>
</html>