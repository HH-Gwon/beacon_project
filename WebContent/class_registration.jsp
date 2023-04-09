<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ page import="java.util.*"%>
<%@ page import="java.sql.*"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>

<body>
	<%@ include file="tennis_nav.jsp"%>
	<section>
		<div class="container"
			style="width: 100vw; height: 70vh; margin: 0 auto; padding: 5px;">
			<script type="text/javascript" src="tennis_check.js"></script>
			<h1 class="display-5 text-center">수강신청</h1>
			<table class="mt-5 text-center table table-bordered table-striped" style="width: 46%; margin: 0 auto;">
				<thead class="table-dark text-center ">
					<tr>
						<td colspan="2">Class Regist</td>
					</tr>
				</thead>

				<tbody>
					<form name="frm" action="registration.do" method="post">
					<tr>
						<td>수강월</td>
						<td class="text-left"><input type="text" name=rmonth size="20">
							2022년03월 예)202203</td>
					</tr>
					<tr>
						<td>회원명</td>
						<td class="text-left"><select name="cname" onchange="getvalue(this.value)">
								<option value='0'>회원명</option>
								<option value='10001'>홍길동</option>
								<option value='10002'>장발장</option>
								<option value='10003'>임꺽정</option>
								<option value='20001'>성춘향</option>
								<option value='20002'>이몽룡</option>
						</select></td>
					</tr>
					<tr>
						<td>회원번호</td>
						<td class="text-left"><input type="text" id="cno" name=cno size="20">
							예)10001</td>
					</tr>
					<tr>
						<td>강의장소</td>
						<td class="text-left"><select name="clarea">
								<option value='0'>강의장소</option>
								<option value='서울본원'>서울본원</option>
								<option value='성남분원'>성남분원</option>
								<option value='대전분원'>대전분원</option>
								<option value='부산분원'>부산분원</option>
								<option value='대구분원'>대구분원</option>
						</select></td>
					</tr>
					<tr>
						<td>강의명</td>
						<td class="text-left"><select name="clname" onchange="getvalue2(this.value)">
								<option value='0'>강의명</option>
								<option value='100000'>초급반</option>
								<option value='200000'>중급반</option>
								<option value='300000'>고급반</option>
								<option value='400000'>심화반</option>
						</select></td>
					</tr>
					<tr>
						<td>수강료</td>
						<td class="text-left"><input type="text" id="tuition" name=tuition size="20">원</td>
					</tr>
					<tr>
						<td colspan="2"><input type="button" onclick="add();"
							value="수강신청"> &nbsp; <input type="button"
							onclick="res();" value="다시쓰기"></td>
					</tr>
					</form>
				</tbody>
			</table>
		</div>
	</section>
	<%@ include file="footer.jsp"%>
</body>
</html>