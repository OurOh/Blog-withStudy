package com.musecom.net.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.musecom.net.dto.Board;
import com.musecom.net.repository.BoardRepository;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class BoardService {
	
	private BoardRepository boardRepository;
	
	public Board selectBoard(Long id) {
		return boardRepository.findById(id).orElse(null);
	}
	
	public List<Board> selectAllBoard(){
		return boardRepository.findAll();
	}
	
	public Board createBoard(Board board) {
		return boardRepository.save(board);
	}
	
	public Board updateBoard(Board board) {
		return boardRepository.save(board);
	}
	
	void deleteBoard(Long id) {
		boardRepository.deleteById(id);
	}
	
	
	
}
