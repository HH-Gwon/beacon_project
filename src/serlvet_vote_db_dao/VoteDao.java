package serlvet_vote_db_dao;

import java.sql.*;
import java.util.*;

import javax.naming.*;
import javax.sql.DataSource;

import servlet_vote_db_dto.*;

public class VoteDao {
	private DataSource dataSource;

	public VoteDao() {
		try {
			Context context = new InitialContext();
			dataSource = (DataSource) context.lookup("java:comp/env/jdbc/oracle");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	// �ĺ��ڵ��
	public List<RankingDTO> rLists() {
		List<RankingDTO> rLists = new ArrayList<RankingDTO>();
		Connection connection = null;
		PreparedStatement preparedStatement = null;
		ResultSet resultSet = null;
		try {
			String query = "SELECT M.M_NO, M.M_NAME, COUNT(V.M_NO)\r\n" + 
					"FROM VOTING_TBL_MEMBER_202303 M\r\n" + 
					"LEFT JOIN VOTING_TBL_VOTE_202303 V ON M.M_NO = V.M_NO AND V.V_CONFIRM = 'y'\r\n" + 
					"GROUP BY M.M_NO, M.M_NAME, V.M_NO\r\n" + 
					"ORDER BY COUNT(V.M_NO) DESC";
			connection = dataSource.getConnection();
			preparedStatement = connection.prepareStatement(query);
			resultSet = preparedStatement.executeQuery();

			while (resultSet.next()) { // DB ������� ��ġ
				int M_NO = resultSet.getInt("M_NO");
				String M_NAME = resultSet.getString("M_NAME");
				int R_RANKING = resultSet.getInt("count(V.M_NO)");

				RankingDTO vo = new RankingDTO(M_NO, M_NAME, R_RANKING);
				rLists.add(vo);
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
				e2.printStackTrace();
			}
		}
		return rLists;
	}

	// ��ǥ�˼���ȸ
	public List<VoteDTO> vLists() {
		List<VoteDTO> vLists = new ArrayList<VoteDTO>();
		Connection connection = null;
		PreparedStatement preparedStatement = null;
		ResultSet resultSet = null;
		try {
			String query = "select * from VOTING_TBL_VOTE_202303";
			connection = dataSource.getConnection();
			preparedStatement = connection.prepareStatement(query);
			resultSet = preparedStatement.executeQuery();

			while (resultSet.next()) { // DB ������� ��ġ
				String V_JUMIN = resultSet.getString("V_JUMIN");
				String V_NAME = resultSet.getString("V_NAME");
				int M_NO = resultSet.getInt("M_NO");
				int V_TIME = resultSet.getInt("V_TIME");
				String V_AREA = resultSet.getString("V_AREA");
				String V_CONFIRM = resultSet.getString("V_CONFIRM");

				VoteDTO vo = new VoteDTO(V_JUMIN, V_NAME, M_NO, V_TIME, V_AREA, V_CONFIRM);
				vLists.add(vo);
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
				e2.printStackTrace();
			}
		}
		return vLists;
	}

	// ��ǥ�ϱ�
	public int vote(String V_JUMIN, String V_NAME, String M_NO, String V_TIME, String V_AREA, String V_CONFIRM) {
		Connection connection = null;
		PreparedStatement preparedStatement = null;
		int rn = 0;
		try {
			String query = "insert into VOTING_TBL_VOTE_202303 (V_JUMIN, V_NAME, M_NO, V_TIME, V_AREA, V_CONFIRM) values (?, ? , ?, ?, ?, ?)";
			// ? = preparedStatement.setString(1, bname); 1�� ���� ����ִ� ��
			// setString(1)��1���� �������� || setString(2)��2���� ��������
			connection = dataSource.getConnection();
			preparedStatement = connection.prepareStatement(query);

			preparedStatement.setString(1, V_JUMIN);
			preparedStatement.setString(2, V_NAME);
			preparedStatement.setInt(3, Integer.valueOf(M_NO));
			preparedStatement.setInt(4, Integer.valueOf(V_TIME));
			preparedStatement.setString(5, V_AREA);
			preparedStatement.setString(6, V_CONFIRM);

			rn = preparedStatement.executeUpdate(); // rn : result number

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if (preparedStatement != null)
					preparedStatement.close();
				if (connection != null)
					connection.close();
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}
		return rn;
	}

	// �ĺ��� ��ȸ
	public List<MemberDTO> mLists() {
		List<MemberDTO> mLists = new ArrayList<MemberDTO>();
		Connection connection = null;
		PreparedStatement preparedStatement = null;
		ResultSet resultSet = null;
		try {
			String query = "select * from VOTING_TBL_MEMBER_202303 M INNER JOIN VOTING_TBL_PARTY_202303 P on M.P_CODE = P.P_CODE";
			connection = dataSource.getConnection();
			preparedStatement = connection.prepareStatement(query);
			resultSet = preparedStatement.executeQuery();

			while (resultSet.next()) { // DB ������� ��ġ
				int M_NO = resultSet.getInt("M_NO");
				String M_NAME = resultSet.getString("M_NAME");
				String P_NAME = resultSet.getString("P_NAME");
				String P_SCHOOL = resultSet.getString("P_SCHOOL");
				String M_JUMIN = resultSet.getString("M_JUMIN");
				String M_CITY = resultSet.getString("M_CITY");
				String P_TEL = resultSet.getString("P_TEL1") + " - " + resultSet.getString("P_TEL2") + " - "
						+ resultSet.getString("P_TEL3");

				MemberDTO vo = new MemberDTO(M_NO, M_NAME, P_NAME, P_SCHOOL, M_JUMIN, M_CITY, P_TEL);
				mLists.add(vo);
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
				e2.printStackTrace();
			}
		}
		return mLists;
	}
}