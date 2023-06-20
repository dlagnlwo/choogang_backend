package com.mysql.jdbc.list.dao;

import java.util.List;

import com.mysql.jdbc.list.dto.Board;

public interface BoardDAO {
	List<Board> selectList();
}
