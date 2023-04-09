package beacon.shopping.command;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import beacon.shopping.dao.MemberDAO;
import servlet_vote_db_command.VCommand;

public class MRegisterCommand implements VCommand {

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) {
		
		MemberDAO dao = new MemberDAO();
		int custno  = dao.getNextCustno();
		
		request.setAttribute("nextCustno", custno + 1);

	}

}
