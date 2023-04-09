<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
	   <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>BeaconShopping</</title>
</head>
<body>
<script type="text/javascript" src="check.js"></script>
	<jsp:include page="sh_nav.jsp"></jsp:include>
	<section>
	<div  class="container" style="width:100vw; height:70vh; margin: 0 auto; padding: 5px;">
	<h3>홈쇼핑 회원 정보 수정</h3>
	      <form action="modify.do" method="post">
	<table calss = "table table-striped">
				<tr>
					<td>회원번호</td>
           <td><input type="text" name="custno" value="${list.custno}"> </td>
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
					<input type="submit" value="수정" onclick ="return modify"> 
					<input type="button" value="조회" onclick ="return search()">
					</center></td>
				</tr>
			</table>
	</form>
	</div>
	</section>
	<jsp:include page="footer.jsp"></jsp:include>
</body>
</html>