<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
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
<jsp:useBean id="beanDao"
class="com.infinite.libraryprojecthib.LibraryDAO" />
<c:set var="user" value="${sessionScope.user}"/>
<c:set var="books" value="${beanDao.showBooks(user)}"/>
<form method="get" action="Return.jsp">
<table border="3" >
<tr>
<th>userName</th>
<th>BookId</th>
<th>select</th>
</tr>
<c:forEach var="books" items="${beanDao.showBooks(user)}">
<tr>
<td><c:out value="${books.userName}" /></td>
<td><c:out value="${books.bookId}" /></td>
<td>
<input type="checkbox" name="bookid" value="${books.bookId}"/>
</td>
</tr>

</c:forEach>

</table>
<input type="submit" value="Return" />
</form>
<c:forEach var="b" items="${paramValues.bookid}">
<jsp:useBean id="beanTrans"
class="com.infinite.libraryprojecthib.TransReturn" />
<jsp:setProperty property="bookId" name="beanTrans" value="${b}" />
<jsp:setProperty property="userName" name="beanTrans"
value="${sessionScope.user}" />

<c:out value="${beanDao.returnBookNew(beanTrans)}" />
</c:forEach>
</body>
</html>
