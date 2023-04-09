package beacon.shopping.command;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import beacon.shopping.dao.MemberDAO;
import beacon.shopping.vo.MemberVO;
import servlet_vote_db_command.VCommand;

public class MModifyCommand implements VCommand {
	public void execute(HttpServletRequest request, HttpServletResponse response) {

		int custno = Integer.valueOf(request.getParameter("custno"));
		String custname = request.getParameter("custname");
		String phone = request.getParameter("phone");
		String address = request.getParameter("address");
		String joinDate = String.valueOf(request.getParameter("joindate"));
		String grade = request.getParameter("grade");
		String city = request.getParameter("city");

		MemberDAO dao = new MemberDAO();

		dao.modify(custno, custname, phone, address, joinDate, grade, city);
	}
}
