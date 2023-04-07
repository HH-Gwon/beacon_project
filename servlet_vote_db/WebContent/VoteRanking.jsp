<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>후보자등수</title>
</head>
<body>
	<%@ include file="nav.jsp"%>
	<section>
		<div class="container"
			style="width: 100vw; height: 70vh; margin: 0 auto; padding: 5px;">
		<div class="container-lg mt-5">
			<h1 class="display-5 text-center">후보자등수</h1>
			<table class="mt-5 text-center table table-bordered table-striped">
				<thead class="table-dark">
					<tr>
						<th scope="col">후보번호</th>
						<th scope="col">성명</th>
						<th scope="col">총투표건수</th>
					</tr>
				</thead>

				<tbody>
					<c:forEach var="rList" items="${rLists}">
						<tr>
							<td>${rList.rNo}</td>
							<td>${rList.rName}</td>
							<td>${rList.rRanking}</td>
						</tr>
					</c:forEach>
				</tbody>
			</table>
		</div>
		</div>
	</section>
</body>
<%@ include file="footer.jsp"%>
</html>