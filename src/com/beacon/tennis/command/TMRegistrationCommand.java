package com.beacon.tennis.command;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.beacon.tennis.dao.TDao;

import servlet_vote_db_command.VCommand;

/**
 * Servlet implementation class BoardController
 */

public class TMRegistrationCommand implements VCommand {

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) {

		String rmonth = request.getParameter("rmonth");
		String cno = request.getParameter("cno");
		String clarea = request.getParameter("clarea");
		String clname = request.getParameter("clname");
		String tuition = request.getParameter("tuition");
		int tcode = Integer.parseInt(clname)/1000;
		
		TDao dao = new TDao();

		dao.registration(rmonth,cno,clarea,clname,tuition,tcode);
	}
}