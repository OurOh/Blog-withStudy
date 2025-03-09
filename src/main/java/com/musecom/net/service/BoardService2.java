package com.musecom.net.service;


import com.musecom.net.dto.Board;
import com.musecom.net.dto.Board2;
import org.springframework.stereotype.Service;

import java.util.List;


public interface BoardService2 {

	List<Board> selectAllBoard();
	Board selectBoard(Long id);
	Board writeBoard(Board board);
	Board updateBoard(Board board);
	void deleteBoard(Long id);
	//CRUD
}



