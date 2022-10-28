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
      <jsp:useBean id="beanDAO" class="com.infinite.hibcollege.CollegeDAO"/>
	<form name="feedbackForm">
		<c:if test="${param.instructor != null }">
			<c:set var="instructorName" value="${param.instructor }"/>
		</c:if>
			
		<c:if test="${param.instructor != null }">
			Instructor:
			<select id="instructor" name="instructor">
				<option value="${instructorName }">${instructorName }</option>
			</select><br><br>
			
			Subject:
			<select name="subject">
				<c:forEach var="subjectName" items="${beanDAO.subjects(instructorName) }">
					<option value="${subjectName }">${subjectName }</option>
				</c:forEach>
			</select><br><br>
			
			Student Name:
			<input type="text" name="studentName" /><br><br>

			Feedback:
			<select name="fbValue">
				<option value="Adequate">Adequate</option>
				<option value="Good">Good</option>
				<option value="Excellent">Excellent</option>
			</select><br><br>
			
			<input type="submit">
		</c:if>
		<c:if test="${param.instructor == null }">
			Instructor:
			<select id="instructor" name="instructor" onchange="submit()">
				<option selected disabled>SELECT</option>
				<c:forEach var="instructorName" items="${beanDAO.instructors() }">
					<option value="${instructorName }">${instructorName }</option>
				</c:forEach>
			</select><br><br>
		</c:if>
	</form>
	
	<c:if test="${param.subject != null }">
		<jsp:useBean id="beanFeedback" class="com.infinite.hibcollege.Feedback" />
		<jsp:setProperty property="*" name="beanFeedback"/>
		<c:out value="${beanDAO.addFeedback(beanFeedback) }"/>
	</c:if>
	
	<script>
			function change(){
				document.feedbackForm.submit();
			}
	</script>

</body>
</html>