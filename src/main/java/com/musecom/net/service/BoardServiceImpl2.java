package com.musecom.net.service;

import com.musecom.net.dto.Board2;
import com.musecom.net.repository.BoardRepository2;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class BoardServiceImpl2 implements BoardService2 {

    private final BoardRepository2 boardRepository2;

    @Override
    public List<Board2> selectAllBoard() {
        return boardRepository2.findAll();
    }

    @Override
    public Board2 selectBoard(Long id) {
        return boardRepository2.findById(id).orElse(null);
    }

    @Override
    public Board2 createBoard(Board2 board2) {
        return boardRepository2.save(board2);
    }

    @Override
    public Board2 updateBoard(Board2 board2) {
        return boardRepository2.save(board2);
    }

    @Override
    public void deleteBoard(long id) {
        boardRepository2.deleteById(id);
    }
}
