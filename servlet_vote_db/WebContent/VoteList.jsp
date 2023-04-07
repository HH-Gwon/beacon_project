<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions"%>
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
<title>list</title>
</head>
	<%@ include file="nav.jsp"%>
<body>
	<section>
	<div class="container"
			style="width: 100vw; height: 70vh; margin: 0 auto; padding: 5px;">
	<div class="container-lg mt-5">
<h1 class="display-5 text-center" >이사후보조회</h1>
	<table class="mt-5 text-center table table-bordered table-striped">
		<thead class="table-dark">
			<tr>
				<th scope="col">후보번호</th>
				<th scope="col">성명</th>
				<th scope="col">소속정당</th>
				<th scope="col">학력</th>
				<th scope="col">주민번호</th>
				<th scope="col">지역구</th>
				<th scope="col">대표전화</th>
			</tr>
		</thead>
		<tbody>
			<c:forEach var="mList" items="${mLists}">
				<tr>
					<!--emp.getEname();와 동일 -->
					<td>${mList.mNo}</td>
					<td>${mList.mName}</td>
					<td>${mList.pName}</td>
					<td><c:choose>
							<c:when test="${fn:substring(mList.pSchool,0,1) == 1}">
					고졸
					</c:when>
							<c:when test="${fn:substring(mList.pSchool,0,1) == 2}">
					학사
					</c:when>
							<c:when test="${fn:substring(mList.pSchool,0,1) == 3}">
					석사
					</c:when>
							<c:when test="${fn:substring(mList.pSchool,0,1) == 4}">
					박사
					</c:when>

						</c:choose></td>
					<td>${fn:substring(mList.mJumin,0,6) }-${fn:substring(mList.mJumin,6,13) }
					</td>
					<td>${mList.mCity}</td>
					<td>${mList.pTel}</td>
				</tr>
		</c:forEach>
		</tbody>
	</table>
	</div>
	</div>
	</section>
</body>
	<%@ include file = "footer.jsp" %>
</html>