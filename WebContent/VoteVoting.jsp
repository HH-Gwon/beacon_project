<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>투표하기</title>
</head>
<script src="validation.js"></script>
<body>
	<%@ include file="nav.jsp"%>
	<section>
	<div class="container"
			style="width: 100vw; height: 70vh; margin: 0 auto; padding: 5px;">
	<div class="container-lg mt-5">
		<h1 class="display-5 text-center">투표하기</h1>
		<table class="mt-5 table table-bordered table-striped">
			<form name="frm" action="VoteVoting.do" method="post">
				<tbody>
					<tr>
						<td>주민번호</td>
						<td><input type="number" name="V_JUMIN" dir="ltr" size="50">
							예 : 8906153154726</td>
					</tr>
					<tr>
						<td>성명</td>
						<td><input type="text" name="V_NAME" dir="ltr" size="50"
							placeholder="홍길동"></td>
					</tr>
					<tr>
						<td>투표번호</td>
						<td><input type="number" name="M_NO" dir="ltr" size="50"
							min="1" max="5"></td>
					</tr>
					<tr>
						<td>투표시간</td>
						<td><input type="number" name="V_TIME" dir="ltr" size="50"
							placeholder="09:00 ⇒ 0900입력"></td>
					</tr>
					<tr>
						<td>투표장소</td>
						<td><input type="text" name="V_AREA" dir="ltr" size="50"
							placeholder="제1투표장"></td>
						<!--<td>
 							<select name=V_AREA onchange="handleOnChange(this)">
							<option value="제1투표장">제1투표장</option>
							<option value="제2투표장">제2투표장</option>
							</select> 
							</td>-->
					</tr>
					<tr>
						<td>유권자확인</td>
						<td><input type="radio" name="V_CONFIRM" value="y" dir="ltr">확인
							&nbsp;&nbsp; <input type="radio" name="V_CONFIRM" value="n"
							dir="ltr">미확인</td>
					</tr>
					<tr>
						<td colspan="2" style="text-align: center;"><input
							type="submit" value="투표하기" onclick="return validation()">
							&nbsp;&nbsp; <input type="reset" value="다시하기"></td>
					</tr>
				</tbody>
			</form>
		</table>
	</div>
	</div>
	</section>
</body>
<%@ include file="footer.jsp"%>
</html>