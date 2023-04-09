<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>BeaconShopping</title>
</head>
<body>
	<jsp:include page="sh_nav.jsp"></jsp:include>
	<section>
		<div class="container" style="width: 100vw; height: 70vh;margin: 0 auto; padding: 5px;">
			<h3  class="display-5 text-center" style = " margin: 20px;">회원매출조회</h2>
			<form>
				<table class = "table table-striped">
					<tr>
						<td>회원번호</td>
						<td>회원성명</td>
						<td>고객등급</td>
						<td>매출</td>

					</tr>
					<c:forEach var="sal" items="${sallist}">
						<tr>
							<td>${sal.custno}</td>
							<td>${sal.custname}</td>
							<td>${sal.grade}</td>
							<td>${sal.price}</td>
						</tr>
					</c:forEach>
				</table>
			</form>
		</div>
	</section>
	<jsp:include page="footer.jsp"></jsp:include>
</body>
</html>