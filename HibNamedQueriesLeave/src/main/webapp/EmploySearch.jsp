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
	<form method="get" action="EmploySearch.jsp">
		<center>
			Employ Id : 
			<input type="number" name="empId" /> <br/><br/> 
			<input type="submit" value="Search" />
		</center>
	</form>
	<c:if test="${param.empId!=null}">
	<c:set var="empno" value="${param.empId}"/>
		<c:set var="employ" value="${beanDao.searchEmploy(empId)}"/>
		<c:if test="${employ!=null}">
		Employ Id : <b>
			<c:out value="${employ.empId}"/></b> <br/>
		Employ Name : <b>
			<c:out value="${employ.name}"/></b> <br/>
		Emaploy Email : <b>
		<c:out value="${employ.email}"/></b> <br/>	
		Department : <b>
			<c:out value="${employ.dept}"/></b> <br/>
		Designation : <b>
			<c:out value="${employ.desig}"/></b> <br/>
		Basic : <b>
			<c:out value="${employ.basic}"/></b> <br/>
		
		</c:if>
	</c:if>
</body>
</html>