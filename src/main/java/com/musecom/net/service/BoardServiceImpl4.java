package com.musecom.net.service;

import com.musecom.net.dto.Board4;
import com.musecom.net.repository.BoardRepository4;

import java.util.List;

public class BoardServiceImpl4 implements BoardService4{

    private BoardRepository4 boardRepository4;

    @Override
    public List<Board4> selectAllBoard() {
        return boardRepository4.findAll();
    }

    @Override
    public Board4 selectBoard(Long id) {
        return boardRepository4.findById(id).orElse(null);
    }

    @Override
    public Board4 createBoard(Board4 board) {
        return boardRepository4.save(board);
    }

    @Override
    public Board4 updateBoard(Board4 board) {
        return boardRepository4.save(board);
    }

    @Override
    public void deleteBoard(Long id) {
        boardRepository4.deleteById(id);
    }
}
