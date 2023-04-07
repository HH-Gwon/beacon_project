package serlvet_vote_db_controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;
import servlet_vote_db_command.*;

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
			command = new MListCommand();
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

		RequestDispatcher dispatcher = request.getRequestDispatcher(viewPage);
		dispatcher.forward(request, response);
	}
}