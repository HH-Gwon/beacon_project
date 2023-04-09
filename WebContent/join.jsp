<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
	<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%
	request.setCharacterEncoding("UTF-8");
%>
<!DOCTYPE html>
<html>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<head>
<title>BeaconShopping</title>
</head>
<body>
<script type="text/javascript" src="sh_check.js"></script>
	<jsp:include page="sh_nav.jsp"></jsp:include>
	<div  class="container" style="width:100vw; height:70vh; margin: 0 auto; padding: 5px;">
		<h3 class="display-5 text-center" style =" margin: 20px;">홈쇼핑 회원 등록</h3>
		<form name="frm" action="join.do" method="post" class="text-center">
			<table class = "table table-striped">
				<tr>
					<td>회원번호(자동발생)</td>
					<td><input type="text" name="custno" value="${nextCustno}"readonly></td>
				</tr>
				<tr>
					<td>회원성명</td>
					<td><input type="text" name="custname"></td>
				</tr>
				<tr>
					<td>회원전화</td>
					<td><input type="text" name="phone"></td>
				</tr>
				<tr>
					<td>회원주소</td>
					<td><input type="text" name="address"></td>
				</tr>
				<tr>
					<td>가입일자</td>
					<td><input type="text" name="joindate"></td>
				</tr>
				<tr>
					<td>고객등급 [A:VIP,B:일반,C:직원]</td>
					<td><input type="text" name="grade"></td>
				</tr>
				<tr>
					<td>도시코드</td>
					<td><input type="text" name="city"></td>
				</tr>
				<tr>
					<td colspan="2"><center>
					<input  class="btn btn-light"  type="submit" value="등록" onclick ="return joinCheck()">&nbsp; &nbsp; 
					<input  class="btn btn-light"  type="button" value="조회" onclick ="return search()">
					</center></td>
				</tr>
			</table>
		</form>
	</div>
		<jsp:include page="footer.jsp"></jsp:include>
</body>
</html>