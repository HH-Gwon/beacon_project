package servlet_vote_db_command;

import java.io.*;
import java.util.*;

import javax.servlet.http.*;

import serlvet_vote_db_dao.*;
import servlet_vote_db_dto.*;

public class VVoteCommand implements VCommand {
	// 실행파일
	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) {
		String V_JUMIN  = request.getParameter("V_JUMIN");
		String V_NAME  = request.getParameter("V_NAME");
		String M_NO = request.getParameter("M_NO");
		String V_TIME = request.getParameter("V_TIME");
		String V_AREA = request.getParameter("V_AREA");
		String V_CONFIRM = request.getParameter("V_CONFIRM");
		System.out.println(V_JUMIN +", "+ V_NAME+", "+M_NO+", "+V_TIME+", "+V_AREA+", "+V_CONFIRM);

		VoteDao vDao = new VoteDao(); // Vote DAO 호출
		vDao.vote(V_JUMIN, V_NAME, M_NO,V_TIME,V_AREA,V_CONFIRM);
	}
}