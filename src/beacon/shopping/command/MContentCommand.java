package beacon.shopping.command;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import beacon.shopping.dao.MemberDAO;
import beacon.shopping.vo.MemberVO;
import servlet_vote_db_command.VCommand;


public class MContentCommand implements VCommand {
	public void execute(HttpServletRequest request, HttpServletResponse response) {
		
		String custno = request.getParameter("custno");
		 MemberDAO dao = new MemberDAO();
		 MemberVO vo = dao.contentView(custno);
		request.setAttribute("content_view", vo);
		
		}
}
