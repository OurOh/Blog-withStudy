package com.musecom.net.service;


import com.musecom.net.dto.Board;

import java.util.List;

public interface BoardService {

	List<Board> selectAllBoard();
	Board selectBoard(Long id);
	Board createBoard(Board board);
	Board updateBoard(Board board);
	void deleteBoard(Long id);

	/// //
}

// MVC Model View Controller

// 클라이언트View -> Controller -> Service -> Repository -> DB -> Repository -> Service -> Controller->clientVIew

// Model(dto entity)

