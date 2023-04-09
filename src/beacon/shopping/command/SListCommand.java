package beacon.shopping.command;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import beacon.shopping.dao.MemberDAO;
import beacon.shopping.vo.MemberVO;
import beacon.shopping.vo.SalVO;
import servlet_vote_db_command.VCommand;

public class SListCommand implements VCommand {
	public void execute(HttpServletRequest request, HttpServletResponse response) {

		MemberDAO dao = new MemberDAO();
		List<SalVO> vos = dao.sal();
		request.setAttribute("sallist", vos);

	}
}
