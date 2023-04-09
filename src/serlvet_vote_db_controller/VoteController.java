package serlvet_vote_db_controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.beacon.tennis.command.TMListCommand;
import com.beacon.tennis.command.TMRegistrationCommand;
import com.beacon.tennis.command.TTListCommand;
import com.beacon.tennis.command.TTTuitionCommand;

import beacon.shopping.command.MContentCommand;
import beacon.shopping.command.MJoinCommand;
import beacon.shopping.command.MListCommand;
import beacon.shopping.command.MModifyCommand;
import beacon.shopping.command.MRegisterCommand;
import beacon.shopping.command.SListCommand;
import servlet_vote_db_command.VCommand;
import servlet_vote_db_command.VListCommand;
import servlet_vote_db_command.VRankingCommand;
import servlet_vote_db_command.VVoteCommand;

@WebServlet("*.do")
public class VoteController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public VoteController() {
		super();
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		voteDo(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		voteDo(request, response);
	}

	private void voteDo(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("voteDo() ..");

		request.setCharacterEncoding("UTF-8");

		String viewPage = null;
		VCommand command = null;

		String uri = request.getRequestURI();
		String contextPath = request.getContextPath();
		String com = uri.substring(contextPath.length());

		// servlet_vote_db/vList.do
		// contextPath:/servlet_vote_db = OS���� ���� ����
		// com:/vList.do

		System.out.println("uri:" + uri);
		System.out.println("contextPath:" + contextPath);
		System.out.println("com:" + com);

		if (com.equals("/VoteList.do")) { // list.do�� ������ BListCommand �Խ����� ���� ������
			command = new servlet_vote_db_command.MListCommand();
			command.execute(request, response); // �Խñ� ��������
			viewPage = "VoteList.jsp"; // dispatcher�� request��ü�� response��ü�� forward��
		}

		else if (com.equals("/VoteVoting.do")) {
			command = new VVoteCommand();
			command.execute(request, response);
//			viewPage = "VoteList.do";
			viewPage = "VoteResult.do";
		}

		else if (com.equals("/VoteResult.do")) {
			command = new VListCommand();
			command.execute(request, response);
			viewPage = "VoteResult.jsp";
		}

		else if (com.equals("/VoteRanking.do")) {
			command = new VRankingCommand();
			command.execute(request, response);
			viewPage = "VoteRanking.jsp";
		}

		// shopping
		else if (com.equals("/template.do")) {
			// command = new MCommand();
			command.execute(request, response);
			viewPage = "template.jsp";
		}

		else if (com.equals("/content_view.do")) {
			command = new MContentCommand();
			command.execute(request, response);
			viewPage = "content_view.jsp";
		}

		else if (com.equals("/modify.do")) {
			System.out.println("/modify.do");
			command = new MModifyCommand();
			command.execute(request, response);
			viewPage = "list.do";
		}

		else if (com.equals("/join.do")) {
			command = new MJoinCommand();
			command.execute(request, response);
			viewPage = "list.do";
		} else if (com.equals("/list.do")) {
			command = new beacon.shopping.command.MListCommand();
			command.execute(request, response);
			viewPage = "list.jsp";
		} else if (com.equals("/salary.do")) {
			command = new SListCommand();
			command.execute(request, response);
			viewPage = "salary.jsp";
		} else if (com.equals("/register.do")) {
			command = new MRegisterCommand();
			command.execute(request, response);
			viewPage = "join.jsp";
		}

		// tennis
		else if (com.equals("/tennis.do")) {
			viewPage = "tennis.jsp";
		} else if (com.equals("/teacher.do")) {
			command = new TTListCommand();
			command.execute(request, response);
			viewPage = "teacher_list.jsp";
		} else if (com.equals("/member.do")) {
			command = new TMListCommand();
			command.execute(request, response);
			viewPage = "member_list.jsp";
		} else if (com.equals("/tuition.do")) {
			command = new TTTuitionCommand();
			command.execute(request, response);
			viewPage = "teacher_tuition.jsp";
		} else if (com.equals("/registration_view.do")) {
			System.out.println("/registration_view.do..");
			viewPage = "class_registration.jsp";
		} else if (com.equals("/registration.do")) {
			command = new TMRegistrationCommand();
			command.execute(request, response);
			viewPage = "tennis.jsp";
		}

		RequestDispatcher dispatcher = request.getRequestDispatcher(viewPage);
		dispatcher.forward(request, response);
	}
}