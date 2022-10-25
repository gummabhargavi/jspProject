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
      <form method="get" action="AddCourse.jsp">
       
         Course Duration :
           
           <input type="number" name="duration"/> <br/><br/> 
        startDate :
        
          <input type="date" name="startDate"/> <br/><br/>
        
       EndDate :
        
          <input type="date" name="endDate"/> <br/><br/>
          
      Hod :
          <input type="text" name="hod"/>  <br/><br/>
        
          <input type="submit" value="Add Course"/>
         
      </form>
     <c:if test="${param.duration!=null}">
     <jsp:useBean id="beanDao" class="com.infinite.hibcollege.CollegeDAO"/>
     	<jsp:useBean id="beanCourse" class="com.infinite.hibcollege.Course"/>
     	<c:set var="sdate" value="${beanDao.convertDate(param.startDate)}" />
     	<c:set var="edate" value="${beanDao.convertDate(param.endDate)}" />
     	<jsp:setProperty property="duration" name="beanCourse" value="${param.duration}"/>
     	<jsp:setProperty property="hod" name="beanCourse" value="${param.hod}" />
     	<jsp:setProperty property="startDate" name="beanCourse" value="${sdate}"/>
     	<jsp:setProperty property="endDate" name="beanCourse" value="${edate}"/>
     	
     	<c:out value="${beanDao.addCourse(beanCourse)}"/>
     </c:if>
    
</body>
</html>