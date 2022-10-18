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
	Complaint[] arrComplaint = dao.showComplaint();
	int tat;
%>
	<table border="3" align="center">
		<tr>
			<th>Complaint Id</th>
	 		<th>Complaint Type</th>
			<th>Complaint Description</th>
			<th>Complaint Date</th>
			<th>Severity</th>
			<th>Tat</th>
			<th>Status</th>
		</tr>
	<%
		for(Complaint c : arrComplaint) {
			tat = dao.tat(c.getComplaintDate());
			//out.println(tat);
			if (tat >= 7) {
	%>
		<tr style="background-color: green;">
			<td><%=c.getComplaintId() %> </td>
			<td><%=c.getComplaintType() %> </td>
			<td><%=c.getcDescription() %> </td>
			<td><%=c.getComplaintDate() %> </td>
			<td><%=c.getSeverity() %> </td>
			<td><%=tat %> </td>
			<td><%=c.getStatus() %>  </td>
			<%
				if (c.getStatus().equals("PENDING")) {
			%>
			<td><a href=Resolve.jsp?cid=<%=c.getComplaintId() %> > Resolve</a> </td>

			<%
				}
			%>
		</tr>
	<%
			} else {
	%>
	<tr>
			<td><%=c.getComplaintId() %> </td>
			<td><%=c.getComplaintType() %> </td>
			<td><%=c.getcDescription() %> </td>
			<td><%=c.getComplaintDate() %> </td>
			<td><%=c.getSeverity() %> </td>
			<td><%=tat %> </td>
			<td><%=c.getStatus() %>  </td>
			<%
				if (c.getStatus().equals("PENDING")) {
			%>
			<td><a href=Resolve.jsp?id=<%=c.getComplaintId() %> > Resolve</a> </td>

			<%
				}
			%>

		</tr>
	<%
			}
		}
	%>
	</table>
	<a href="AddComplaint.jsp">Add Complaint</a>
</body>
</html>