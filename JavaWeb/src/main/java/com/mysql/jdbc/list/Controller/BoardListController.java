package com.mysql.jdbc.list.Controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.mysql.jdbc.list.dto.Board;
import com.mysql.jdbc.list.service.BoardService;
import com.mysql.jdbc.list.service.BoardServiceImpl;

@WebServlet(name = "boardListController", urlPatterns = "/board/list")
public class BoardListController extends HttpServlet {

	BoardService boardService = new BoardServiceImpl();
	protected void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		System.out.println("현재 메소드 : " + req.getMethod());
		
		List<Board> boardList = boardService.getList();
		
		req.setAttribute("boardList", boardList);
		
		req.getRequestDispatcher("/WEB-INF/Board/boardList.jsp").forward(req, res);
	}


}
