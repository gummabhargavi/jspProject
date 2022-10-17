<%@page import="com.infinite.session.Employ"%>
<%@page import="com.infinite.session.EmployDAO"%>
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
     int empno = Integer.parseInt(request.getParameter("empno"));
     EmployDAO dao=new EmployDAO();
     Employ employ = dao.searchEmploy(empno);
   %>
      <form method="get" action="UpdateEmploy.jsp">
        <center>
           Employ No :
           <input type="text" name="empno" value=<%=employ.getEmpno() %>>
           <br/>
           Employ Name :
            <input type="text" name="name" value=<%=employ.getName() %>>
           <br/>
           Department :
            <input type="text" name="dept" value=<%=employ.getDept() %>>
           <br/>
           Designation :
            <input type="text" name="desig" value=<%=employ.getDesig() %>>
           <br/>
           Basic :
            <input type="number" name="basic" value=<%=employ.getBasic() %>>
           <br/>
            <input type="submit" value="Update Employ" />
           
        </center>
      </form>
      <%
      if(request.getParameter("empno")!=null && request.getParameter("basic")!=null){
    	  Employ employNew = new Employ();
    	  employNew.setEmpno(Integer.parseInt(request.getParameter("empno")));
    	  employNew.setName(request.getParameter("name"));
    	  employNew.setDept(request.getParameter("dept"));
    	  employNew.setDesig(request.getParameter("desig"));
    	  employNew.setBasic(Integer.parseInt(request.getParameter("basic")));
    	  dao.updateEmploy(employNew);
    	%>
    	<jsp:forward page="EmployTable.jsp" />
    	<%   
      }
      %>
</body>
</html>