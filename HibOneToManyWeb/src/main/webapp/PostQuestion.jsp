<%@page import="com.infinite.hib.QuestionDAO"%>
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
      <form method="get" action="PostQuestion.jsp">
		<center>
			Question : 
			<input type="text" name="qname" /> <br/><br/> 
			<input type="submit" value="Post Question" />
		</center>
	</form>
   <c:if test="${param.qname!=null}">
		<jsp:useBean id="beanDao" class="com.infinite.hib.QuestionDAO"/>
		<jsp:useBean id="beanQuestion" class="com.infinite.hib.Question"/>
		<jsp:setProperty property="*" name="beanQuestion"/>
		<c:out value="${beanDao.addQuestion(beanQuestion)}"/>
	</c:if>
    
		<a href="PostAnswer.jsp">Answer</a>
     
</body>
</html>