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
     <jsp:useBean id="beanDao" class="com.infinite.hibleave.EmployDAO"/>
	<table border="3" align="center">
	<tr>
		<th>Employ Id</th>
		<th>Employ Name</th>
		<th>Email</th>
		<th>Mobil No</th>
		<th>Date Of Join</th>
		<th>Department</th>
		<th>Manager Id</th>
		<th>LeaveAvail</th>
		<th>Show Info</th>
	</tr>
	<c:forEach var="employee" items="${beanDao.showEmploy()}" >
		
	
		<tr>
			<td>${employee.empId}</td>
			<td>${employee.name}</td>
			<td>${employee.email}</td>
			<td>${employee.mob}</td>
			<td>${employee.doj}</td>
			<td>${employee.dept}</td>
			<td>${employee.mId}</td>
			<td>${employee.leaveAvail}</td>
			<td><a href="DashBoard.jsp?empId=${employee.empId}&mgrId=${employee.mId}">Show Info</a> </td>
		</tr>
	</c:forEach>
	</table>
	
</body>
</html>