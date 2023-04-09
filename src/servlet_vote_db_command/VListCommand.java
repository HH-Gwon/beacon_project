package servlet_vote_db_command;

import java.io.*;
import java.util.*;

import javax.servlet.http.*;

import serlvet_vote_db_dao.*;
import servlet_vote_db_dto.*;

public class VListCommand implements VCommand {
	// ��������
	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) {
		VoteDao vDao = new VoteDao(); // Vote DAO ȣ��
		List<VoteDTO> vDto = vDao.vLists(); // DAO ���� list()�� ȣ���Ͽ� BoardVO�� List ��ü ����
		request.setAttribute("vLists", vDto); // ��û�Ͽ� ���� ����
	}
}