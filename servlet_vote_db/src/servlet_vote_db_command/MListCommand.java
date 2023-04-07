package servlet_vote_db_command;

import java.io.*;
import java.util.*;

import javax.servlet.http.*;

import serlvet_vote_db_dao.*;
import servlet_vote_db_dto.*;

public class MListCommand implements VCommand {
	// ��������
	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) {
		VoteDao vDao = new VoteDao(); // Vote DAO ȣ��
		List<MemberDTO> mDto = vDao.mLists(); // DAO ���� list()�� ȣ���Ͽ� MemberDTO�� List ��ü ����
		request.setAttribute("mLists", mDto); // DB�� �����͸� ��û�Ͽ� ���� ����
	}
}