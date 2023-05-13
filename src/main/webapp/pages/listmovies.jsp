<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Liste des films</title>
</head>
<body>
	
	<c:forEach var="movie" items="${movies }">
		<h1>${movie.id} - ${movie.title}</h1>
	</c:forEach>
</body>
</html>