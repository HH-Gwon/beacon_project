package servlet_vote_db_command;

import java.io.*;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public interface VCommand{ // �������̽�
	public abstract void execute(HttpServletRequest request, HttpServletResponse response);
}