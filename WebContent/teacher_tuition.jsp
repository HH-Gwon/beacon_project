<%@page import="java.util.List"%>
<%@page import="java.sql.*"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<!DOCTYPE html>
<html>
<head>
<link rel="stylesheet"
	href="https://cdn.jsdelivr.net/npm/bootstrap@4.6.2/dist/css/bootstrap.min.css" />
<script
	src="https://cdn.jsdelivr.net/npm/jquery@3.6.3/dist/jquery.slim.min.js"></script>
<script
	src="https://cdn.jsdelivr.net/npm/popper.js@1.16.1/dist/umd/popper.min.js"></script>
<script
	src="https://cdn.jsdelivr.net/npm/bootstrap@4.6.2/dist/js/bootstrap.bundle.min.js"></script>

<meta charset="UTF-8">
<title>Beacon Tennis</title>
</head>
<body>
	<%@ include file="tennis_nav.jsp"%>
	<section>
	<div class="container" style="width: 100vw; height: 70vh; margin: 0 auto; padding: 5px;">
		<h1 class="display-5 text-center">강사매출현황</h1>
		<table class="mt-5 text-center table table-bordered table-striped">
			<thead class="table-dark">
				<tr>
					<td>강사코드</td>
					<td>강의명</td>
					<td>강사명</td>
					<td>총매출</td>
				</tr>
			</thead>
			<tbody>
				<c:forEach items="${tuitions}" var="tuition">
					<tr>
						<td>${tuition.tcode}</td>
						<td>${tuition.clname}</td>
						<td>${tuition.tname}</td>
						<td>\<fmt:formatNumber value="${tuition.tuition}"
								pattern="#,###" /></td>
					</tr>
				</c:forEach>
			</tbody>
		</table>
		</div>
	</section>
	<footer class="navbar-fixed-bottom">
	<%@ include file="footer.jsp"%>
	</footer>
</body>
</html>