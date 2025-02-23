package com.musecom.net.service;


import com.musecom.net.dto.Board4;

import java.util.List;

public interface BoardService4 {
    //CRUD
    List<Board4> selectAllBoard();
    Board4 selectBoard(Long id);
    Board4 createBoard(Board4 board);
    Board4 updateBoard(Board4 board);
    void deleteBoard(Long id);

}
