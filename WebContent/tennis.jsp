<%@page import="java.util.List"%>
<%@page import="java.sql.*"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<%@ include file="tennis_nav.jsp"%>
	<section>
		<div class="container"
			style="width: 100vw; height: 70vh; margin: 0 auto; padding: 5px;">
			<div class="container-lg mt-5 text-center">
				<h1 class="display-5 text-center">Beacon Tennis!</h1>
				<img src="img/TennisHome.jpg" class="rounded" style="width: 50vw; height: 50vh; margin: 0 auto; padding: 5px;">
			</div>
		</div>
	</section>
	<%@ include file="footer.jsp"%>
</body>

</html>