<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
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
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>

<body>
	<nav class="navbar navbar-expand-lg navbar-light bg-light">
		<a class="navbar-brand" href="index.jsp"><img src="img/NavLogo02.png" /></a>
		<button class="navbar-toggler"
			type="button"
			data-toggle="collapse"
			data-target="#navbarNav"
			aria-controls="navbarNav"
			aria-expanded="false"
			aria-label="Toggle navigation">
			<span class="navbar-toggler-icon"></span>
		</button>
		<div class="collapse navbar-collapse" id="navbarNav">
			<ul class="navbar-nav">
				<li class="nav-item active"><a class="nav-link"href="vote_main.jsp">홈으로 <span class="sr-only">(current)</span></a></li>
				<li class="nav-item active"><a class="nav-link" href="VoteList.do">이사후보조회 <span class="sr-only">(current)</span></a></li>
				<li class="nav-item active"><a class="nav-link" href="VoteVoting.jsp">투표하기 <span class="sr-only">(current)</span></a></li>
				<li class="nav-item active"><a class="nav-link" href="VoteResult.do">투표검수조회 <span class="sr-only">(current)</span></a></li>
				<li class="nav-item active"><a class="nav-link" href="VoteRanking.do">후보자등수 <span class="sr-only">(current)</span></a></li>
			</ul>
		</div>
	</nav>
</body>
</html>