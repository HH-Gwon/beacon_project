<%@page import="java.util.List"%>
<%@page import="java.sql.*"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Beacon Tennis</title>
</head>
<body>
	<%@ include file="tennis_nav.jsp"%>
	<section>
		<div class="container" style="width: 100vw; height: 70vh; margin: 0 auto; padding: 5px;">
			<h1 class="display-5 text-center">회원정보조회</h1>
			<table class="mt-5 text-center table table-bordered table-striped">
				<thead class="table-dark">
					<tr>
						<td>수강월</td>
						<td>회원번호</td>
						<td>회원명</td>
						<td>강의명</td>
						<td>강의장소</td>
						<td>수강료</td>
						<td>등급</td>
					</tr>
				</thead>
				<tbody>
					<c:forEach items="${members}" var="member">
						<tr>
							<td>${member.rmonth}</td>
							<td>${member.cno}</td>
							<td>${member.cname}</td>
							<td>${member.clname}</td>
							<td>${member.clarea}</td>
							<td>\<fmt:formatNumber value="${member.clprice}"
									pattern="#,###" /></td>
							<td>${member.grade}</td>
						</tr>
					</c:forEach>
				</tbody>
			</table>
		</div>
	</section>
	<%@ include file="footer.jsp"%>
</body>
</html>