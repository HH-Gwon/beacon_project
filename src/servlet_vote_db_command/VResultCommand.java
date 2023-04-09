package servlet_vote_db_command;

import java.io.*;
import java.util.*;

import javax.servlet.http.*;

import serlvet_vote_db_dao.*;
import servlet_vote_db_dto.*;

public class VResultCommand implements VCommand {
	// 실행파일
	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) {
		VoteDao vDao = new VoteDao(); // Vote DAO 호출
		List<VoteDTO> mDto = vDao.vLists(); // DAO 안의 list()를 호출하여 BoardVO의 List 객체 생성
		request.setAttribute("vLists", mDto); // 요청하여 갖고 오기
	}
}