<%@page import="com.beacon.project.vo.TennisTeacherVO"%>
<%@page import="java.util.List"%>
<%@page import="com.beacon.project.dao.TennisDAO"%>
<%@page import="java.sql.*"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<%
		String url = "jdbc:oracle:thin:@localhost:1521/xe";
		Class.forName("oracle.jdbc.driver.OracleDriver");

		String sql = "SELECT teacher_code 강사코드, teacher_name 강사명, class_name 강의명, class_price 수강료, teacher_rehist_date 강사자격취득일 FROM tennis_tbl_teacher";

		Connection con = DriverManager.getConnection(url, "beacon", "1234");
		Statement st = con.createStatement();
		ResultSet rs = st.executeQuery(sql);

/* 		TennisDAO tdao = new TennisDAO();
		List<TennisTeacherVO> teachers = tdao.empSelect(); */
/* 
		pageContext.setAttribute("teachers", teachers); */
		
		while(rs.next()){
		out.print("강사코드: " + rs.getInt("tcode") + "<br>");
		out.print("강사명: " + rs.getString("tname") + "<br>");
		out.print("수강명: " + rs.getString("cname") + "<br>");
		out.print("수강료: " + rs.getInt("cprice") + "<br>");
		out.print("강사자격취득일: " + rs.getString("tdate") + "<br>");
		out.print("<hr>");
		
/* 		while (rs.next()) {
			out.print("이름 : " + rs.getString("ename") + "<br>");
			out.print("연봉 : " + rs.getString("연봉") + "<br>");
			out.print("<hr>");
		} */

		rs.close();
		st.close();
		con.close();
	}
	%>

<%-- 	<table border="1">
		<c:forEach var="teachers" items="${teachers}">
			<tr>
				<td>${teachers.teacher_code}</td>
			</tr>
		</c:forEach>
	</table> --%>
</body>
</html>