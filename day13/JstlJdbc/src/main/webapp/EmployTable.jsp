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
  <sql:setDataSource var="conn"
     driver="${initParam['dbDriver']}"
     url="${initParam['dbURL']}"
     user="${initParam['dbUser']}" 
      password="${initParam['dbPassword']}"  />
      
     <sql:query var="employQuery" dataSource="${conn}">
	select * from Employ
	</sql:query>
   <form method="get" action="EmployTable.jsp">
     <table border="3" align="center">
        <tr>
        <th>Employ No</th>
        <th>Employ Name</th>
        <th>Department</th>
        <th>Designation</th>
        <th>Basic</th>
        <th>Search</th>
        </tr>
 	
	<c:forEach var="employ" items="${employQuery.rows}">
        <tr> <td>
        <c:set var="eno" value="${employ.empno}"/>
         <c:out value="${employ.empno}"/> <br/> </td> 
         <td><c:out value="${employ.name}"/> <br/> </td> 
         <td><c:out value="${employ.dept}"/> <br/> </td> 
         <td><c:out value="${employ.desig}"/> <br/> </td> 
         <td><c:out value="${employ.basic}"/> <br/> </td> 
         <td><a href="EmploySearchNew.jsp?empno=${eno}" >Search</a> </td>
         <td><a href="EmployUpdate.jsp?empno=${eno}" >Update</a> </td>
         <td><a href="EmployDelete.jsp?empno=${eno}" >Delete</a> </td>
         </tr>
         </c:forEach>
         </table>
         
     </form>
</body>
</html>
