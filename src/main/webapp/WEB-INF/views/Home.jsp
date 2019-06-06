<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"
    isELIgnored="false"
    %>
    
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h3>Welome to Spring MVC </h3>
${eid}, ${ename},${esal}

<hr/>
<%
Object ob=request.getAttribute("eid");
//int id=(Integer)ob;
out.println("Data : eid="+ob.toString());
%>
<hr/>
${mylst} <br/>

<c:forEach items="${mylst}" var="ob">
	<c:out value="${ob}"/>, <br/>
</c:forEach>
<hr/>
${myset},<br/>
<c:forEach items="${myset}" var="s">
 <c:out value="${s}"/>, <br/>
</c:forEach>  

<hr/>
<c:forEach items="${mymap}" var="m">
	<c:out value="${m.key}"/> = <c:out value="${m.value }"/> <br/> 
</c:forEach>
<hr/>
${emp} <br/> 
${emp.empId}, ${emp.empName},
${emp.empSal }  

</body>
</html>



