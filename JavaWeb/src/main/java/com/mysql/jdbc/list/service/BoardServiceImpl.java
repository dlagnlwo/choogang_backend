package com.mysql.jdbc.list.service;

import java.util.List;

import com.mysql.jdbc.list.dao.BoardDAO;
import com.mysql.jdbc.list.dao.BoardDAOImpl;
import com.mysql.jdbc.list.dto.Board;

public class BoardServiceImpl implements BoardService{
	BoardDAO boardDao = new BoardDAOImpl();
	@Override
	public List<Board> getList(){
		List<Board> boardList = boardDao.selectList();
		
		return boardList;
	}
}
