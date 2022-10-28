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
     <form  method="get" action="AddLeaveHistory.jsp">
     
      NoOfDays :
      <input type="number" name="noOfDays"/> <br/><br/>
      Manager Comment :
      <input type="text" name="mgrCmt"/> <br/><br/>
      LeaveStartDate : 
      <input type="date" name="leaveStartDate"/> <br/><br/>
      LeaveEndDate :
      <input type="date" name="leaveEndDate"/> <br/><br/>
      LeaveStatus :
          <select name="leaveStatus">
             <option value="APPROVED">APPROVED</option>
             <option value="PENDING">PENDING</option>
             <option value="DENIED">DENIED</option>
          </select> <br/><br/>
      LeaveType :
       <select name="leaveType">
           <option value="EL">EL</option>
           <option value="ML">ML</option>
       </select> <br/><br/>
      Leave Reason :
      <input type="text" name="leaveReason"/> <br/><br/>
      <input type="submit" value="Add LeaveHistory"/>
     </form>
     <c:if test="${param.noOfDays!=null}">
       <jsp:useBean id="beanDao" class="com.infinite.hibleave.EmployDAO"/>
       <jsp:useBean id="beanLeave" class="com.infinite.hibleave.Leave"/>
       <c:set var="sdate" value="${beanDao.convertDate(param.leaveStartDate)}" />
       <c:set var="edate" value="${beanDao.convertDate(param.leaveEndDate)}" />
       <jsp:setProperty property="noOfDays" name="beanLeave" value="${param.noOfDays}"/>
        <jsp:setProperty property="mgrCmt" name="beanLeave" value="${param.mgrCmt}"/>
        <jsp:setProperty property="leaveStartDate" name="beanLeave" value="${sdate}"/>
        <jsp:setProperty property="leaveEndDate" name="beanLeave" value="${edate}"/>
        <jsp:setProperty property="leaveStatus" name="beanLeave" value="${param.leaveStatus}"/>
         <jsp:setProperty property="leaveType" name="beanLeave" value="${param.leaveType}"/>
         <jsp:setProperty property="leaveReason" name="beanLeave" value="${param.leaveReason}"/>
         <c:out value="${beanDao.addLeaveHistory(beanLeave)}"/>
        
     </c:if>
</body>
</html>