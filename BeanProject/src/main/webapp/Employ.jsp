<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
     <jsp:useBean id="beanEmploy"  class="infinite.beanproject.Employ" scope="page" />
     <jsp:setProperty property="*" name="beanEmploy"/>
     Employ No : <jsp:getProperty property="empno" name="beanEmploy"/> <br/>
     Employ Name : <jsp:getProperty property="name" name="beanEmploy"/> <br/>
     Department : <jsp:getProperty property="dept" name="beanEmploy"/> <br/>
     Designation : <jsp:getProperty property="desig" name="beanEmploy"/> <br/>
     Basic : <jsp:getProperty property="basic" name="beanEmploy"/> <br/>
</body>
</html>