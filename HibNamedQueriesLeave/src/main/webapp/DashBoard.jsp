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
<h2>My Details</h2>
 <jsp:useBean id="beanDao" class="com.infinite.hibleave.EmployDAO"/>
 <c:set var="empId" value="${param.empId}"/>
 <c:set var="mgrId" value="${param.mgrId}"/>
 <c:set var="employ" value="${beanDao.searchEmploy(empId)}"/>
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
<h2>My Manager Details</h2>
 <c:set var="employManager" value="${beanDao.searchEmploy(mgrId)}"/>
 		Manager Id : <b>
			<c:out value="${employManager.empId}"/></b> <br/>
		Manager Name : <b>
			<c:out value="${employManager.name}"/></b> <br/>
		Manager Email : <b>
		    <c:out value="${employManager.email}"/></b> <br/>
		Mobil No : <b>
		    <c:out value="${employManager.mob}"/></b> <br/>
		Date Of Join : <b>
		    <c:out value="${employManager.doj}"/></b>	<br/>
		Department : <b>
			<c:out value="${employManager.dept}"/></b> <br/>
	    Manager Id : <b>
	      <c:out value="${employManager.mId}"/></b> <br/>
	    Available : <b>
	      <c:out value="${employManager.leaveAvail}"/></b> <br/>  

 
</body>
</html>