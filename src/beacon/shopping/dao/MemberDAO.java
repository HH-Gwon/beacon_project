package beacon.shopping.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.sql.DataSource;

import beacon.shopping.vo.MemberVO;
import beacon.shopping.vo.SalVO;

public class MemberDAO {
	private DataSource dataSource; // connection pool

	public MemberDAO() {
		try {
			Context context = new InitialContext();
			dataSource = (DataSource) context.lookup("java:comp/env/jdbc/oracle");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public int join(int custno, String custname, String phone, String address, String joinDate, String grade,
			String city) {
		Connection connection = null;
		PreparedStatement preparedStatement = null;
		int rn = 0;

		try {
			String query = "INSERT INTO member_tbl_02 (CUSTNO, CUSTNAME, PHONE, ADDRESS, JOINDATE, GRADE, CITY) VALUES (?, ?, ?, ?, ?, ?, ?)";

			connection = dataSource.getConnection();
			preparedStatement = connection.prepareStatement(query);

			preparedStatement.setInt(1, custno);
			preparedStatement.setString(2, custname);
			preparedStatement.setString(3, phone);
			preparedStatement.setString(4, address);
			preparedStatement.setString(5, joinDate);
			preparedStatement.setString(6, grade);
			preparedStatement.setString(7, city);

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

	public MemberVO contentView(String custno1) {
		MemberVO list = null;

		Connection connection = null;
		PreparedStatement preparedStatement = null;
		ResultSet resultSet = null;
		System.out.println(custno1);
		try {
			String query = "select * from member_tbl_02 where custno = ?";

			connection = dataSource.getConnection();
			preparedStatement = connection.prepareStatement(query);

			preparedStatement.setInt(1, Integer.valueOf(custno1));
			resultSet = preparedStatement.executeQuery();

			while (resultSet.next()) {

				int custno = Integer.valueOf(resultSet.getString("custno"));

				String custname = resultSet.getString("custname");
				String phone = resultSet.getString("phone");
				String address = resultSet.getString("address");
				String joinDate = resultSet.getString("joinDate");
				String grade = resultSet.getString("grade");
				String city = resultSet.getString("city");

				System.out.println(joinDate);
				list = new MemberVO(custno, custname, phone, address, joinDate, grade, city);

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

		return list;
	}

	public int modify(int custno, String custname, String phone, String address, String joinDate, String grade,
			String city) {
		Connection connection = null;
		PreparedStatement preparedStatement = null;
		int rn = 0;

		try {
			String query = "UPDATE member_tbl_02 SET CUSTNAME = ?, PHONE = ?, ADDRESS = ?, JOINDATE = ?, GRADE = ?, CITY = ? where custno = ?";

			connection = dataSource.getConnection();
			preparedStatement = connection.prepareStatement(query);

			preparedStatement.setString(1, custname);
			preparedStatement.setString(2, phone);
			preparedStatement.setString(3, address);
			preparedStatement.setString(4, joinDate);
			preparedStatement.setString(5, grade);
			preparedStatement.setString(6, city);
			preparedStatement.setInt(7, custno);

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

	public List<MemberVO> list() {
		List<MemberVO> lists = new ArrayList<MemberVO>();

		Connection connection = null;
		PreparedStatement preparedStatement = null;
		ResultSet resultSet = null;

		try {
			String query = "SELECT * FROM MEMBER_TBL_02"; // 荑쇰━ �븘�슂
			connection = dataSource.getConnection();
			preparedStatement = connection.prepareStatement(query);
			resultSet = preparedStatement.executeQuery();

			while (resultSet.next()) {
				int num = resultSet.getInt("custno");
				String name = resultSet.getString("custname");
				String tel = resultSet.getString("phone");
				String address = resultSet.getString("address");
				String joinDate = resultSet.getString("joinDate");
				String grade = resultSet.getString("grade");
				String city = resultSet.getString("city");
				MemberVO vo = new MemberVO(num, name, tel, address, joinDate, grade, city);

				lists.add(vo);

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

		return lists;

	}

	public List<SalVO> sal() {
		List<SalVO> sallist = new ArrayList<SalVO>();

		Connection connection = null;
		PreparedStatement preparedStatement = null;
		ResultSet resultSet = null;

		try {
			String query = "select me.custno, me.custname, me.grade, sum(mo.price) as \"price\" \r\n"
					+ "from member_tbl_02 me, money_tbl_02 mo\r\n" + "where me.custno = mo.custno\r\n"
					+ "group by me.custno ,me.custname , me.grade\r\n" + "order by sum(price) desc"; // 荑쇰━ �븘�슂

			connection = dataSource.getConnection();
			preparedStatement = connection.prepareStatement(query);
			resultSet = preparedStatement.executeQuery();
			while (resultSet.next()) {
				int custno = resultSet.getInt("custno");
				String custname = resultSet.getString("custname");
				String grade = resultSet.getString("grade");
				int price = resultSet.getInt("price");

				SalVO vo = new SalVO(custno, custname, grade, price);

				sallist.add(vo);

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

		return sallist;

	}

	public int getNextCustno() {

		int custno = -1;

		Connection connection = null;
		PreparedStatement preparedStatement = null;
		ResultSet resultSet = null;

		try {
			String query = "SELECT MAX(CUSTNO) FROM MEMBER_TBL_02";

			connection = dataSource.getConnection();
			preparedStatement = connection.prepareStatement(query);
			resultSet = preparedStatement.executeQuery();

			while (resultSet.next()) {
				custno = resultSet.getInt("MAX(CUSTNO)");

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

		return custno;
	}
}
