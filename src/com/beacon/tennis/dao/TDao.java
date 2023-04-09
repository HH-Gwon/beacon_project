package com.beacon.tennis.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.sql.DataSource;

import com.beacon.tennis.vo.TMemberVO;
import com.beacon.tennis.vo.TTeacherVO;
import com.beacon.tennis.vo.TTuitionVO;


public class TDao {
	private DataSource dataSource; // connection pool

	public TDao() {
		try {
			Context context = new InitialContext();
			dataSource = (DataSource) context.lookup("java:comp/env/jdbc/oracle");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public int registration(String rmonth, String cno, String clarea, String clname, String tuition, int tcode) {
								
		Connection connection = null;
		PreparedStatement preparedStatement = null;
		int rn = 0;

		try {
			String query = "INSERT INTO TENNIS_TBL_CLASS VALUES (?,?,?,?,?)";

			connection = dataSource.getConnection();
			preparedStatement = connection.prepareStatement(query);
			
			preparedStatement.setString(1, rmonth); //수강월
			preparedStatement.setString(2, cno); //회원번호
			preparedStatement.setString(3, clarea); //강의명
			preparedStatement.setString(4, tuition); //수강료
			preparedStatement.setInt(5, tcode); //강사코드
			
			rn = preparedStatement.executeUpdate();

		} catch (Exception e) {
			e.printStackTrace();
		} finally {

			try {

				if (preparedStatement != null)
					preparedStatement.close();

				if (connection != null)
					connection.close();

			} catch (Exception e2) {
				// TODO: handle exception
				e2.printStackTrace();
			}
		}

		return rn;
	}

	public List<TTeacherVO> teacher() {
		List<TTeacherVO> teachers = new ArrayList<TTeacherVO>();
		

		Connection connection = null;
		PreparedStatement preparedStatement = null;
		ResultSet resultSet = null;
		
		try {
			String query = "select * from TENNIS_TBL_TEACHER order by teacher_code asc";
			connection = dataSource.getConnection();
			preparedStatement = connection.prepareStatement(query);
			resultSet = preparedStatement.executeQuery();
			while (resultSet.next()) {
				String tcode = resultSet.getString("teacher_code");
				String tname = resultSet.getString("teacher_name");
				String cname = resultSet.getString("class_name");
				int cprice = resultSet.getInt("class_price");
				String tdate = resultSet.getString("TEACHER_REHIST_DATE");

				TTeacherVO vo = new TTeacherVO(tcode,tname,cname,cprice,tdate);
				teachers.add(vo);

			}

		} catch (Exception e) {
			e.printStackTrace();
		} finally {

			try {
				if (resultSet != null)
					resultSet.close();

				if (preparedStatement != null)
					preparedStatement.close();

				if (connection != null)
					connection.close();
			} catch (Exception e2) {
				// TODO: handle exception
				e2.printStackTrace();
			}
		}

		return teachers;

	}
	
	public List<TMemberVO> member() {
		List<TMemberVO> members = new ArrayList<TMemberVO>();

		Connection connection = null;
		PreparedStatement preparedStatement = null;
		ResultSet resultSet = null;
		
		try {
			String query = "select c.regist_month, c.c_no, m.c_name, t.class_name, c.class_area, t.class_price, m.grade from TENNIS_TBL_TEACHER t, TENNIS_TBL_MEMBER m, TENNIS_TBL_CLASS c where t.teacher_code = c.teacher_code and m.c_no = c.c_no";
			connection = dataSource.getConnection();
			preparedStatement = connection.prepareStatement(query);
			resultSet = preparedStatement.executeQuery();
			while (resultSet.next()) {
				String rmonth = resultSet.getString("regist_month");
				String cno = resultSet.getString("c_no");
				String cname = resultSet.getString("c_name");
				String clname = resultSet.getString("class_name");
				String clarea = resultSet.getString("class_area");
				int clprice = resultSet.getInt("class_price");
				String grade = resultSet.getString("grade");
				
				TMemberVO vo = new TMemberVO(rmonth,cno,cname,clname,clarea,clprice,grade);
				System.out.println(vo);
				members.add(vo);

			}

		} catch (Exception e) {
			e.printStackTrace();
		} finally {

			try {
				if (resultSet != null)
					resultSet.close();

				if (preparedStatement != null)
					preparedStatement.close();

				if (connection != null)
					connection.close();
			} catch (Exception e2) {
				// TODO: handle exception
				e2.printStackTrace();
			}
		}

		return members;

	}
	
	public List<TTuitionVO> tuition() {
		List<TTuitionVO> tuitions = new ArrayList<TTuitionVO>();

		Connection connection = null;
		PreparedStatement preparedStatement = null;
		ResultSet resultSet = null;
		
		try {
			String query = "select c.teacher_code, class_name, teacher_name, sum(tuition) tuition from TENNIS_TBL_TEACHER t, TENNIS_TBL_CLASS c where t.teacher_code=c.teacher_code group by c.teacher_code, class_name, teacher_name order by c.teacher_code";
			connection = dataSource.getConnection();
			preparedStatement = connection.prepareStatement(query);
			resultSet = preparedStatement.executeQuery();
			while (resultSet.next()) {
				String tcode = resultSet.getString("teacher_code");
				String clname = resultSet.getString("class_name");
				String tname = resultSet.getString("teacher_name");
				int tuition = resultSet.getInt("tuition");

				TTuitionVO vo = new TTuitionVO(tcode,clname,tname,tuition);
				tuitions.add(vo);

			}

		} catch (Exception e) {
			e.printStackTrace();
		} finally {

			try {
				if (resultSet != null)
					resultSet.close();

				if (preparedStatement != null)
					preparedStatement.close();

				if (connection != null)
					connection.close();
			} catch (Exception e2) {
				// TODO: handle exception
				e2.printStackTrace();
			}
		}

		return tuitions;

	}
}