package com.musecom.net.service;


import com.musecom.net.dto.Board2;
import org.springframework.stereotype.Service;

import java.util.List;


public interface BoardService2 {

	List<Board2> selectAllBoard();
	Board2 selectBoard(Long id);
	Board2 createBoard(Board2 board2);
	Board2 updateBoard(Board2 board2);
	void deleteBoard(long id);

	//CRUD

}



