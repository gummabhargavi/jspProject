<%@page import="java.text.SimpleDateFormat"%>
<%@page import="com.infinite.complaint.Complaint"%>
<%@page import="com.infinite.complaint.ComplainDAO"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
     <%
	ComplainDAO dao = new ComplainDAO();
	String id= dao.generateComplaintId();
%>
	<form method="get" action="AddComplaint.jsp">
		<table border="3" align="center">
			<tr>
				<th>Complaint Id</th>
				<td>
					<input type="text" name="complaintId" value=<%=id %> />
				</td>
			</tr>
			<tr>
				<th>Complaint Type</th>
				<td> 
					<input type="text" name="complaintType" /> 
				</td>
			</tr>
			<tr>
				<th>Description</th>
				<td> 
					<input type="text" name="cdescription" />
				</td>
			</tr>
			<tr>
				<th>Complaint Date</th> 
				<td> 
					<input type="date" name="complaintDate" />
				</td>
			</tr>
			<tr>
				<th>Severity</th>
				<td>
					<select name="severity">
						<option value="HIGH">High</option>
						<option value="MEDIUM">Medium</option>
						<option value="LOW">Low</option>
					</select>
				</td>
			</tr>
			<tr>
				<th colspan="2">
					<input type="submit" value="Add Complaint" />
				</th>
			</tr>
		</table>
	</form>
	<%
		if (request.getParameter("complaintId") !=null && request.getParameter("complaintDate") !=null) {
			Complaint complaint = new Complaint();
			complaint.setComplaintId(request.getParameter("complaintId"));
			complaint.setComplaintType(request.getParameter("complaintType"));
			complaint.setcDescription(request.getParameter("cdescription"));
			java.util.Date cd = new SimpleDateFormat("yyyy-MM-dd").parse(request.getParameter("complaintDate"));
			java.sql.Date cdate = new java.sql.Date(cd.getTime());
			complaint.setComplaintDate(cdate);
			complaint.setSeverity(request.getParameter("severity"));
			dao.addComplaint(complaint);
	%>
	<jsp:forward page="ShowComplaint.jsp"/>
	<%
		}
	%>
</body>
</html>