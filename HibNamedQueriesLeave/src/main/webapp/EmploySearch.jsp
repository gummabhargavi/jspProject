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
	<c:set var="empId" value="${param.empId}"/>
		<c:set var="employ" value="${beanDao.searchEmploy(empId)}"/>
		<c:if test="${employ!=null}">
		Employ Id : <b>
			<c:out value="${employ.empId}"/></b> <br/>
		Employ Name : <b>
			<c:out value="${employ.name}"/></b> <br/>
		Emaploy Email : <b>
		    <c:out value="${employ.email}"/></b> <br/>
		Mobil No : <b>
		    <c:out value="${employ.mob}"/></b> <br/>
		Date Of Join : <b>
		    <c:out value="${employ.doj}"/></b>	<br/>
		Department : <b>
			<c:out value="${employ.dept}"/></b> <br/>
	    Manager Id : <b>
	      <c:out value="${employ.mId}"/></b> <br/>
	    Available : <b>
	      <c:out value="${employ.leaveAvail}"/></b> <br/>  
		</c:if>
		</c:if>
		<h1>Manger Details...</h1>
		<c:set var="magid" value="${employ.mId}"></c:set>
		<c:if test="${magid != null}">
		<c:set var="employ1" value="${beanDao.searchEmploy(magid)}"/>
		<c:if test="${employ1!=null}">
		Employ Id : <b>
			<c:out value="${employ1.empId}"/></b> <br/>
		Employ Name : <b>
			<c:out value="${employ1.name}"/></b> <br/>
		Emaploy Email : <b>
		    <c:out value="${employ1.email}"/></b> <br/>
		Mobil No : <b>
		    <c:out value="${employ1.mob}"/></b> <br/>
		Date Of Join : <b>
		    <c:out value="${employ1.doj}"/></b>	<br/>
		Department : <b>
			<c:out value="${employ1.dept}"/></b> <br/>
	    Manager Id : <b>
	      <c:out value="${employ1.mId}"/></b> <br/>
	    Available : <b>
	      <c:out value="${employ1.leaveAvail}"/></b> <br/>  
		</c:if>	
		</c:if>
		<c:if test="${magid == null}">
			<c:out value="No Manger .."></c:out>
		</c:if>		
			
</body>
</html>