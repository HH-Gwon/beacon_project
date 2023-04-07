<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>list</title>
</head>
<body>
	<%@ include file="nav.jsp"%>
	<section>
	<div class="container"
			style="width: 100vw; height: 70vh; margin: 0 auto; padding: 5px;">
		<div class="container-lg mt-5">
			<h1 class="display-5 text-center">투표검수조회</h1>
			<table class="mt-5 text-center table table-bordered table-striped">
				<thead class="table-dark">
					<tr>
						<th scope="col">성명</th>
						<th scope="col">생년월일</th>
						<th scope="col">나이</th>
						<th scope="col">성별</th>
						<th scope="col">후보번호</th>
						<th scope="col">투표시간</th>
						<th scope="col">유권자확인</th>
					</tr>
				</thead>
				<tbody>
					<c:forEach var="vList" items="${vLists}">
						<%--VListCommand의 request("vLists")가 들어감  --%>
						<tr>
							<!--emp.getEname();와 동일 -->
							<td>${vList.vName}</td>
							<td><c:choose>
									<c:when test="${fn:substring(vList.vJumin,0,2) > 23}">
						19${fn:substring(vList.vJumin,0,2)}년
						</c:when>
									<c:when test="${fn:substring(vList.vJumin,0,2) <= 23 }">
						20${fn:substring(vList.vJumin,0,2)}년
						</c:when>
								</c:choose> ${fn:substring(vList.vJumin,2,4) }월
								${fn:substring(vList.vJumin,4,6) }일</td>
							<td><c:set var="now" value="<%=new java.util.Date()%>" /> <c:choose>
									<c:when test="${fn:substring(vList.vJumin,0,2) > 23}">
						만 ${fn:substring(now,24,30) - 1900-fn:substring(vList.vJumin,0,2)}세
						</c:when>
									<c:when test="${fn:substring(vList.vJumin,0,2) <= 23 }">
						만 ${fn:substring(now,24,30) - 2000-fn:substring(vList.vJumin,0,2)}세
						</c:when>
								</c:choose></td>

							<td><c:choose>
									<c:when
										test="${fn:substring(vList.vJumin,6,7) == 1 || fn:substring(vList.vJumin,6,7) == 3}">
						남
						</c:when>
									<c:when
										test="${fn:substring(vList.vJumin,6,7) == 2 || fn:substring(vList.vJumin,6,7) == 4}">
						여
						</c:when>
								</c:choose></td>

							<!--후보번호 -->
							<td>${vList.mNo}</td>

							<!--투표시간 -->
							<td>
							<c:choose>
								<c:when test="${fn:substring(vList.vTime,0,1) > 4}">
								0${fn:substring(vList.vTime,0,1)} : ${fn:substring(vList.vTime,1,4)}
								</c:when>
								<c:when test="${fn:substring(vList.vTime,0,2) >= 10}">
								${fn:substring(vList.vTime,0,2)} : ${fn:substring(vList.vTime,2,4)}
								</c:when>
							</c:choose>
							</td>

							<!--유권자확인 -->
							<td>${vList.vConfirm}</td>
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