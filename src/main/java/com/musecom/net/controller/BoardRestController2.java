package com.musecom.net.controller;

import com.musecom.net.dto.Board;
import com.musecom.net.dto.Board2;
import com.musecom.net.service.BoardService;
import com.musecom.net.service.BoardService2;
import lombok.RequiredArgsConstructor;
import org.apache.coyote.Response;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/board")
public class BoardRestController2 {

    private BoardService boardService;
    //RCUD

    @GetMapping("/{id}")
    public ResponseEntity<Integer> selectBoard(@PathVariable Long id) {
        Board result = boardService.selectBoard(id);
        if (result != null) {
            return ResponseEntity.ok(1);
        } else {
            return ResponseEntity.internalServerError().body(null);
        }
    }

    @PostMapping("/write")
    public ResponseEntity<Board> createBoard(@RequestBody Board board) {
        Board result = boardService.createBoard(board);
        if (result != null) {
            return ResponseEntity.ok(result);
        } else {
            return ResponseEntity.internalServerError().body(null);
        }

    }

    @PutMapping("/{id}")
    public ResponseEntity<Integer> updateBoard(@PathVariable Long id, @RequestBody Board board) {
        board.setId(id);
        Board result = boardService.updateBoard(board);
        if (result != null) {
            return ResponseEntity.ok(1);
        } else {
            return ResponseEntity.internalServerError().body(null);
        }
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Integer> deleteBoard(@PathVariable Long id) {
        Board result = boardService.selectBoard(id);
        if (result != null) {
            boardService.deleteBoard(id);
            return ResponseEntity.ok(1);
        } else {
            return ResponseEntity.notFound().build();
        }
    }

}



