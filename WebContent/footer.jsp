<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
   <!-- footer -->
    <footer class="container py-5">
      <div class="row">
        <div class="col-12 col-md">
          <img src="img/Logo100.png" alt="logo" style="margin-left: 20px;">
            <title>Product</title>
            <circle cx="12" cy="12" r="10" />
            <path
              d="M14.31 8l5.74 9.94M9.69 8h11.48M7.38 12l5.74-9.94M9.69 16L3.95 6.06M14.31 16H2.83m13.79-4l-5.74 9.94"
            />
          </svg>
          <small class="d-block mb-3 text-muted" style="margin-left: 20px;">&copy; 2023/03-04</small>
        </div>
        <div class="col-6 col-md">
          <h5><a class = "Tennis" href="tennis.jsp" style="text-decoration: none; color: rgb(59, 59, 59);">Tennis</a></h5>
          <ul class="list-unstyled text-small">
            <li><a class="text-muted" href="member.do">MemberInformation</a></li>
            <li><a class="text-muted" href="teacher.do">TeacherInformation</a></li>
            <li><a class="text-muted" href="tuition.do">Teachertuition</a></li>
            <li><a class="text-muted" href="registration_view.do">Class Registration</a></li>
          </ul>
        </div>
        <div class="col-6 col-md">
          <h5><a class = "shopping" href="template.jsp" style="text-decoration: none; color: rgb(59, 59, 59);">Shopping</a></h5>
          <ul class="list-unstyled text-small">
            <li><a class="text-muted" href="register.do">ShoppingJoin</a></li>
            <li><a class="text-muted" href="list.do">MemberList</a></li>
            <li><a class="text-muted" href="salary.do">SalesInquiry</a></li>
 
          </ul>
        </div>
        <div class="col-6 col-md">
          <h5><a class = "voting" href="vote_main.jsp" style="text-decoration: none; color: rgb(59, 59, 59);">Voting</a></h5>
          <ul class="list-unstyled text-small">
            <li><a class="text-muted" href="VoteList.do">VoteList</a></li>
            <li><a class="text-muted" href="VoteVoting.jsp">Voting</a></li>
            <li><a class="text-muted" href="VoteResult.do">VotingResult</a></li>
            <li><a class="text-muted" href="VoteRanking.do">VotingRanking</a></li>

          </ul>
        </div>
          </ul>
        </div>
      </div>
    </footer>
</body>
</html>