<%@page import="com.infinite.session.EmployDAO"%>
<%@page import="com.infinite.session.Employ"%>
<%@page import="java.util.List"%>
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
        EmployDAO dao = new EmployDAO();
      List<Employ> employList = dao.showEmploy();
      %>
      <table border="3" align="center">
        <tr>
        <th>Employ No</th>
        <th>Employ Name</th>
        <th>Department</th>
        <th>Designation</th>
        <th>Basic</th>
        <th>Update</th>
        <th>Delete</th>
        </tr>
        <%
         for(Employ employ : employList){
        %>
           <tr>
             <td><%=employ.getEmpno() %> </td>
             <td><%=employ.getName() %> </td>
             <td><%=employ.getDept() %> </td>
             <td><%=employ.getDesig() %> </td>
             <td><%=employ.getBasic() %> </td> 
             <td>
             <a href=UpdateEmploy.jsp?empno=<%=employ.getEmpno() %>>Update</a>
             </td>
             <td>
             <a href=DeleteEmploy.jsp?empno=<%=employ.getEmpno() %>>Delete</a>
             </td>
           </tr>  
        <%  
         }
        %>
      </table>
      <a href="CreateEmploy.jsp">Create Employ</a>
</body>
</html>