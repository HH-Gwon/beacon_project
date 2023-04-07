package servlet_vote_db_command;

import java.io.*;
import java.util.*;

import javax.servlet.http.*;

import serlvet_vote_db_dao.*;
import servlet_vote_db_dto.*;

public class VRankingCommand implements VCommand {
	// ��������
	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) {
		VoteDao vDao = new VoteDao(); // Vote DAO ȣ��
		List<RankingDTO> rDto = vDao.rLists(); // DAO ���� list()�� ȣ���Ͽ� BoardVO�� List ��ü ����
		request.setAttribute("rLists", rDto); // ��û�Ͽ� ���� ����
	}
}