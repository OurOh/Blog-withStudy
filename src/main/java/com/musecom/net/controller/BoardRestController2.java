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
    //CRUD

    private final BoardService2 boardService2;

    //R
    @GetMapping("/{id}")
    public ResponseEntity<Board2> selectBoard(@PathVariable Long id){
        Board2 result = boardService2.selectBoard(id);
        if(result != null) {
            return ResponseEntity.ok(result);
        }else {
            return ResponseEntity.internalServerError().body(null);
        }

    }

    //C-
    @PostMapping("/write")
    public ResponseEntity<Integer> createBoard(@RequestBody Board2 board2) {
        Board2 result = boardService2.createBoard(board2);
        if(result != null) {
            return ResponseEntity.ok(1);
        }else {
            return ResponseEntity.internalServerError().body(0);
        }
    }

    @PutMapping("/{id}")
    public ResponseEntity<Integer> updateBoard(@PathVariable Long id, @RequestBody Board2 board2){
        board2.setId(id);
        Board2 result = boardService2.updateBoard(board2);
        if (result != null) {
            return ResponseEntity.ok(1);
        } else {
            return ResponseEntity.internalServerError().body(0);
        }
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Integer> deleteBoard(@PathVariable Long id) {
        Board2 result = boardService2.selectBoard(id);
        if (result != null) {
            boardService2.deleteBoard(id);
            return ResponseEntity.ok(1);
        } else {
            return ResponseEntity.notFound().build();
        }
    }


}



