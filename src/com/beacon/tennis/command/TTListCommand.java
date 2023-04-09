package com.beacon.tennis.command;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.beacon.tennis.dao.TDao;
import com.beacon.tennis.vo.TTeacherVO;

import servlet_vote_db_command.VCommand;

/**
 * Servlet implementation class BoardController
 */

public class TTListCommand implements VCommand {

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) {

		TDao dao = new TDao();
		List<TTeacherVO> vos = dao.teacher();
		request.setAttribute("teachers", vos);
	}
}