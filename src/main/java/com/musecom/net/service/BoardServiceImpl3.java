package com.musecom.net.service;


import com.musecom.net.dto.Board3;
import com.musecom.net.repository.BoardRepository3;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class BoardServiceImpl3 implements BoardService3{

    private final BoardRepository3 boardRepository3;

    @Override
    public List<Board3> selectAllBoard() {
        return boardRepository3.findAll();
    }

    @Override
    public Board3 selectBoard(Long id) {
        return boardRepository3.findById(id).orElse(null);
    }

    @Override
    public Board3 createBoard(Board3 board3) {
        return boardRepository3.save(board3);
    }

    @Override
    public Board3 updateBoard(Board3 board3) {
        return boardRepository3.save(board3);
    }

    @Override
    public void deleteBoard(Long id) {
        boardRepository3.deleteById(id);
    }

}
