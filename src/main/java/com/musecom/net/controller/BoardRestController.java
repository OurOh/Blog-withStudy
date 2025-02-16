package com.musecom.net.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.musecom.net.dto.Board;
import com.musecom.net.repository.BoardRepository;
import com.musecom.net.service.BoardService;

import lombok.RequiredArgsConstructor;

@RestController
@RequiredArgsConstructor
@RequestMapping("/board")
public class BoardRestController {

	private BoardService boardService;
	
	@GetMapping("/board/{id}")
	public ResponseEntity<Board> selectBoard(@PathVariable Long id){
		Board board = boardService.selectBoard(id);
		if(board != null) {
			return ResponseEntity.ok(board);
		}else {
			return ResponseEntity.internalServerError().body(null);
		}
		
	}
	
	@PostMapping("/board/write")
	public ResponseEntity<Integer> createBoard(Board board){
		//1아니면 0
		//ok는 1, 아니면 o
		boardboard
	}
	
	@PutMapping
	controller
	
	@DeleteMapping
	
}



