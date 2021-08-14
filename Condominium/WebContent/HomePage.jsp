<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Welcome</title>
</head>
<body>

	<%
		
		response.setHeader("Cache-Control", "no-cache, no-store, must-revalidate");
		
		response.setHeader("Pragma", "no-cache"); //HTTP 1.0
		
		response.setHeader("Expires", "0"); //Proxies
	
//		if(session.getAttribute("email")==null)
//		{
//			response.sendRedirect("Login.jsp");
//		}
	%>

	Welcome ${email}

	<a href="videos.jsp">Videos here</a>
	
	<form action="Logout">
		<input type="submit" value="logout">
	</form>
</body>
</html>