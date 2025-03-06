package com.musecom.net.service;

import com.musecom.net.dto.Board;
import com.musecom.net.dto.Board2;
import com.musecom.net.repository.BoardRepository;
import com.musecom.net.repository.BoardRepository2;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;


@RequiredArgsConstructor
@Service
public class BoardServiceImpl2 implements BoardService {

    private final BoardRepository boardRepository;

    @Override
    public List<Board> selectAllBoard() {
        return boardRepository.findAll();
    }

    @Override
    public Board selectBoard(Long id) {
        return boardRepository.findById(id).orElse(null);
    }

    @Override
    public Board createBoard(Board board) {
        return boardRepository.save(board);
    }

    @Override
    public Board updateBoard(Board board) {
        return boardRepository.save(board);
    }

    @Override
    public void deleteBoard(Long id) {
        boardRepository.deleteById(id);
    }
}


/*
public BoardServiceImpl2(BoardRepository boardRepository) {
    this.boardRepository = boardRepository;
}
*/
