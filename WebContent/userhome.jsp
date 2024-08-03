<%@ page language="java" import="com.util.Utility" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>User Home</title>
</head>
<body bgcolor="lightgreen">

<%

int noo=Utility.parse(request.getParameter("no"));
if(noo==2)
{
	
	%>
	<script type="text/javascript">
	alert("successfully login");
	
	</script>
	
	<%
}
%>

<center>
<img src="titleimg.png">
<h1 style="color:blue">User Home</h1>
</center>
</body>
</html>