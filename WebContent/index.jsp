<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!DOCTYPE html>
<html lang="en">
  <head>
    <meta charset="UTF-8" />
    <meta http-equiv="X-UA-Compatible" content="IE=edge" />
    <meta name="viewport" content="width=device-width, initial-scale=1.0" />
    <link
      rel="stylesheet"
      href="https://cdn.jsdelivr.net/npm/bootstrap@4.6.2/dist/css/bootstrap.min.css"
    />
    <script src="https://cdn.jsdelivr.net/npm/jquery@3.6.3/dist/jquery.slim.min.js"></script>
    <script src="https://cdn.jsdelivr.net/npm/popper.js@1.16.1/dist/umd/popper.min.js"></script>
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@4.6.2/dist/js/bootstrap.bundle.min.js"></script>
    <link rel="stylesheet" href="index.css" />
    <title>Beacon</title>
    <!-- 파비콘 -->
    <link
      rel="apple-touch-icon"
      sizes="180x180"
      href="favicon/apple-touch-icon.png"
    />
    <link
      rel="icon"
      type="image/png"
      sizes="32x32"
      href="favicon/favicon-32x32.png"
    />
    <link
      rel="icon"
      type="image/png"
      sizes="16x16"
      href="favicon/favicon-16x16.png"
    />
    <link rel="manifest" href="favicon/site.webmanifest" />
    <link
      rel="mask-icon"
      href="favicon/safari-pinned-tab.svg"
      color="#5bbad5"
    />
    <meta name="msapplication-TileColor" content="#da532c" />
    <meta name="theme-color" content="#ffffff" />
    <style>
      .bd-placeholder-img {
        font-size: 1.125rem;
        text-anchor: middle;
        -webkit-user-select: none;
        -moz-user-select: none;
        -ms-user-select: none;
        user-select: none;
      }

      @media (min-width: 768px) {
        .bd-placeholder-img-lg {
          font-size: 3.5rem;
        }
      }
    </style>
  </head>

  <body>
    <!-- Navbar -->
    <nav class="navbar navbar-expand-lg navbar-light bg-light">
      <a class="navbar-brand" href="index.jsp"><img src="img/NavLogo02.png" /></a>
      <button
        class="navbar-toggler"
        type="button"
        data-toggle="collapse"
        data-target="#navbarNav"
        aria-controls="navbarNav"
        aria-expanded="false"
        aria-label="Toggle navigation"
      >
        <span class="navbar-toggler-icon"></span>
      </button>
      <div class="collapse navbar-collapse" id="navbarNav">
        <ul class="navbar-nav">
          <li class="nav-item active">
            <a class="nav-link" href="index.jsp"
              >Home <span class="sr-only">(current)</span></a
            >
          </li>
          <li class="nav-item">
            <a class="nav-link" href="tennis.jsp">Fitness</a>
          </li>
          <li class="nav-item">
            <a class="nav-link" href="template.jsp">Shopping</a>
          </li>
          <li class="nav-item">
            <a class="nav-link" href="vote_main.jsp">Voting</a>
          </li>
        </ul>
      </div>
    </nav>
    <div class="container">
      <header class="index-title"></header>
      <section>
        <div class="content">
          <article class="content_title">
            <div class="content_log">
              <p>Tennis . Shopping . Voting</p>
              <!-- <img src="img/Logo(1).png" alt=""> -->
            </div>
          </article>
          <div class="content_box">
            <div class="content_text">
              <h2 class="featurette-heading">
                BeaconTennis.
                <span class="text-muted">Enjoy playing tennis in your life</span>
              </h2>
              <p class="lead">
                Our group is always with you. We support your life with Beacon group.
              </p>
            </div>
            <div class="content_img">
             <a href="tennis.jsp"><img src="img/테니스.png" alt="" /></a>
            </div>
          </div>
          <!-- content_box2 -->
          <div class="content_box" id="content_box2 ">
            <div class="content_img">
              <a href="template.jsp"><img src="img/shopping.png" alt="" /></a>
            </div>
            <div class="content_text">
              <h2 class="featurette-heading">
                BeaconShopping.
                <span class="text-muted">a pleasant shopping life.</span>
              </h2>
              <p class="lead">
               Our group is always with you. We support your life with Beacon group.
              </p>
            </div>
          </div>
          <!-- content_box -->
          <div class="content_box">
            <div class="content_text">
              <h2 class="featurette-heading">
                Beacon Group operation.
                <span class="text-muted">I'll be with you.</span>
              </h2>
              <p class="lead">
               Our group is always with you. We support your life with Beacon group.
              </p>
            </div>
            <div class="content_img">
             <a href="vote_main.jsp"><img src="img/운영.png" alt="" /></a>
            </div>
          </div>
        </div>
      </section>
    </div>

    <!-- footer -->
    <footer class="container py-5">
      <div class="row">
        <div class="col-12 col-md">
          <img id="blogo" src="img/Logo100.png" alt="logo" style="margin-left: 20px;">
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