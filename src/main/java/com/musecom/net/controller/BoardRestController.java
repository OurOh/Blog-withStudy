package com.musecom.net.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
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

	private final BoardService boardService;

	//Read
    @GetMapping("/{id}")
	public ResponseEntity<Board> selectBoard(@PathVariable Long id){
		Board result = boardService.selectBoard(id);
		if(result != null) {
			return ResponseEntity.ok(result);
		}else {
			return ResponseEntity.internalServerError().body(null);
		}
	}
	//selectBoard(id) 메서드의 반환 타입이 Board

	// 게시글 작성
	@PostMapping("/write")
	public ResponseEntity<Integer> createBoard(@RequestBody Board board){
		Board result = boardService.createBoard(board);
		if(result != null) {
			return ResponseEntity.ok(1);
		}else {
			return ResponseEntity.internalServerError().body(0);
		}
	}
	
	//업데이트
	@PutMapping("/{id}")
	public ResponseEntity<Integer> updateBoard(@PathVariable Long id, @RequestBody Board board){
		board.setId(id);
		Board result = boardService.updateBoard(board);
		if(result != null) {
			return ResponseEntity.ok(1);
		}else {
			return ResponseEntity.internalServerError().body(0);
		}
	}

	//삭제
	@DeleteMapping("/{id}")
	public ResponseEntity<Integer> deleteBoard(@PathVariable Long id){
	    Board result = boardService.selectBoard(id);
	    if (result != null) {
	        boardService.deleteBoard(id);
	        return ResponseEntity.ok(1);
	    } else {
	        return ResponseEntity.notFound().build();
	    }
	}

	
	
}



