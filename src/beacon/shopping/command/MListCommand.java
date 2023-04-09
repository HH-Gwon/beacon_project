package beacon.shopping.command;
import java.util.*;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import beacon.shopping.dao.MemberDAO;
import beacon.shopping.vo.MemberVO;
import servlet_vote_db_command.VCommand;

public class MListCommand implements VCommand{
public void execute(HttpServletRequest request, HttpServletResponse response) {
		
	MemberDAO dao = new MemberDAO();
	List<MemberVO> vos = dao.list();
	request.setAttribute("lists", vos);  
}
}
