<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/sql" prefix="sql" %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
 <form action="EmploySearch.jsp">
	Employ No : 
	<input type="number" name="empno" /> <br/><br/>
	<input type="submit" value="Search" /> <br/><br/>
</form>
<c:if test="${param.empno!=null}">
	<sql:setDataSource var="conn" 
	driver="com.mysql.jdbc.Driver"
	url="jdbc:mysql://localhost:3306/infinite"
	user="root"
	password="root"
/>
<sql:query var="employQuery" dataSource="${conn}">
	select * from Employ where empno=?
	<sql:param value="${param.empno}"/>
	
</sql:query>
	<c:set var="flag" value="0" />
	<c:forEach var="e" items="${employQuery.rows}">
		Employ No : 
		<c:out value="${e.empno}" /> <br/>
		Name : 
		<c:out value="${e.name}" /> <br/> 
		Department : 
		<c:out value="${e.dept}" /> <br/> 
		Designation : 
		<c:out value="${e.desig}" /> <br/>
		Basic : 
		<c:out value="${e.basic}" /> <br/>
		<c:set var="flag" value="1" />
	</c:forEach>
	<c:if test="${flag==0}">
		<c:out value="Employ No Not Found..." />
	</c:if>


</c:if>
 
   
</body>
</html>