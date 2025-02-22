package com.musecom.net.service;

import com.musecom.net.dto.Board3;
import org.springframework.stereotype.Service;

import java.util.List;


public interface BoardService3 {

    List<Board3> selectAllBoard();
    Board3 selectBoard(Long id);
    Board3 createBoard(Board3 board3);
    Board3 updateBoard(Board3 board3);
    void deleteBoard(Long id);
}
