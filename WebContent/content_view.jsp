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
	<div class="container" style="width: 100vw; height: 70vh; margin: 0 auto; padding: 5px;;">
		<section>
	<table class="mt-5 text-center table table-bordered table-striped" style="width: 46%; margin: 0 auto;">
				<form action="modify.do" method="get">
					<input type="hidden" name="custno" value="${content_view.custno}">
					<tr>
						<td>회원번호</td>
						<td>${content_view.custno}</td>
					</tr>
					<tr>
						<td>회원성명</td>
						<td><input type="text" name="custname"
							value="${content_view.custname}"></td>
					</tr>
					<tr>
						<td>회원전화</td>
						<td><input type="text" name="phone"
							value="${content_view.phone}"></td>
					</tr>
					<tr>
						<td>회원주소</td>
						<td><input type="text" name="address"
							value="${content_view.address}"></td>
					</tr>
					<tr>
						<td>가입일자</td>
						<td><input type="text" name="joindate"
							value="${fn:substring(content_view.joinDate,0,4)}${fn:substring(content_view.joinDate,5,7)}${fn:substring(content_view.joinDate,8,10)}"></td>

					</tr>
					<tr>
						<td>고객등급</td>
						<td><input type="text" name="grade"
							value="${content_view.grade}"></td>
					</tr>
					<tr>
						<td>고객등급</td>
						<td><input type="text" name="city"
							value="${content_view.city}"></td>
					</tr>
					<tr>
						<td colspan="2"><center>
								<input class="btn btn-light" type="submit" value="수정">
						</td>
					</tr>
				</form>
			</table>
	</div>
	</section>

	<jsp:include page="footer.jsp"></jsp:include>
</body>
</html>