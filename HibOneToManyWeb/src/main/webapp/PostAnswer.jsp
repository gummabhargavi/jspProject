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
      <form method="get" action="PostAnswer.jsp">
		<center>
			AnswerName : 
			<input type="text" name="answerName" /> <br/><br/> 
			Posted By :
			<input type="text" name="postedBy" /> <br/><br/>
			<input type="submit" value="Post Answer" />
		</center>
	</form>
   <c:if test="${param.answerName!=null}">
		<jsp:useBean id="beanDao" class="com.infinite.hib.QuestionDAO"/>
		<jsp:useBean id="beanAnswer" class="com.infinite.hib.Answer"/>
		<jsp:setProperty property="*" name="beanAnswer"/>
		<c:out value="${beanDao.addAnswer(beanAnswer)}"/>
	</c:if>
</body>
</html>