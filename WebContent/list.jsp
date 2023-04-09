<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>BeaconShopping</title>
</head>
<body>
	<jsp:include page="sh_nav.jsp"></jsp:include>
	<section>
		<div class="container" style="width: 100vw; height: 70vh; margin: 0 auto; padding: 5px;">
			<h3 class="display-5 text-center" style = " margin: 20px;">회원목록조회/수정</h3>
			<form>
				<table class = "table table-striped">
					<tr>
						<td>회원번호</td>
						<td>회원성명</td>
						<td>전화번호</td>
						<td>주소</td>
						<td>가입일자</td>
						<td>고객등급 [A:VIP,B:일반,C:직원]</td>
						<td>거주지역</td>
					</tr>
					<c:forEach var="list" items="${lists}">
						<tr>
							<td><a href="content_view.do?custno=${list.custno}">${list.custno}</a></td>
							<td>${list.custname}</td>
							<td>${list.phone}</td>
							<td>${list.address}</td>
							<td>
								${fn:substring(list.joinDate,0,4)}-${fn:substring(list.joinDate,5,7)}-${fn:substring(list.joinDate,8,10)}
							</td>
							<td><c:choose>
									<c:when test="${fn:substring(list.grade,0,1) == 'A'}">
              						 VIP
               						</c:when>
									<c:when test="${fn:substring(list.grade,0,1) == 'B'}">
              						 일반
            					   </c:when>
									<c:when test="${fn:substring(list.grade,0,1) == 'C'}">
               						 직원
            					   </c:when>
								</c:choose></td>
							<td>${list.city}</td>
						</tr>
					</c:forEach>
				</table>
			</form>
		</div>
	</section>
	<jsp:include page="footer.jsp"></jsp:include>
</body>
</html>