package servlet_vote_db_command;

import java.io.*;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public interface VCommand{ // 인터페이스
	public abstract void execute(HttpServletRequest request, HttpServletResponse response);
}