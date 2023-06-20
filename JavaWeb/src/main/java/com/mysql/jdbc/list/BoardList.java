package com.mysql.jdbc.list;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(name = "boardList", urlPatterns = "/board/list")
public class BoardList extends HttpServlet {
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		System.out.println("현재 method = " + req.getMethod());
		
		req.getRequestDispatcher("/WEB-INF/Board/boardList.jsp").forward(req, res);
	}
}
