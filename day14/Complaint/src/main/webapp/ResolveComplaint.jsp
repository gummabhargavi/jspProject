<%@page import="com.infinite.complaint.ResolveDAO"%>
<%@page import="java.sql.Date"%>
<%@page import="java.text.SimpleDateFormat"%>
<%@page import="com.infinite.complaint.Resolve"%>
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
		String cid = request.getParameter("complaintId");
		String cdate = request.getParameter("complaintDate");
		java.util.Date d1 = new SimpleDateFormat("yyyy-MM-dd").parse(cdate);
		Date cd = new java.sql.Date(d1.getTime());
	%>
	<form method="get" action="ResolveComplaint.jsp">
		<table border="3" align="center">
			<tr> 	
				<th colspan="2">Resolve </th>
			</tr>
			<tr>
				<th>Complaint ID</th>
				<td> 
					<input type="text" name="complaintId" value=<%=cid %> />
				</td>
			</tr>
			<tr>
				<th>Complaint Date</th>
				<td>
					<input type="date" name="complaintDate" value=<%=cd %> />
				</td>
			</tr>
			<tr>
				<th>Resolved Date</th>
				<td>
					<input type="date" name="rdate"  />
				</td>
			</tr>
			<tr>
				<th>Resolved By</th>
				<td> 
					<input type="text" name="resolvedBy" />
				</td>
			</tr>
			<tr>
				<th>Comments</th>
				<td> 
					<input type="text" name="comments" />
				</td>
			</tr>
			<tr>
				<th colspan="2">
					<input type="submit" value="Resolve Issue" />
				</th>
			</tr>
		</table>
	</form>
	<%
		if (request.getParameter("complaintId")!=null && 
			request.getParameter("complaintDate")!=null &&
			request.getParameter("rdate") !=null
			) {
			Resolve resolve = new Resolve();
			resolve.setComplaintId(cid);
			resolve.setComplaintDate(cd);
			String rdate = request.getParameter("rdate");
			java.util.Date rd1 = new SimpleDateFormat("yyyy-MM-dd").parse(rdate);
			Date rd = new java.sql.Date(rd1.getTime());
			resolve.setResolveDate(rd);
			resolve.setResolvedBy(request.getParameter("resolveBy"));
			
		
			resolve.setComments(request.getParameter("comments"));
			
			new ResolveDAO().resolveComplaint(resolve);
			%>
			<jsp:forward page="ShowComplaint.jsp"/>
			<% 
		}
			
	%>
</body>
</html>