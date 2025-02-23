package com.musecom.net.controller;

import com.musecom.net.dto.Board4;
import com.musecom.net.service.BoardService4;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;
import org.apache.coyote.Response;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping
public class BoardRestController4 {

    private final BoardService4 boardService4;

    @GetMapping("board/{id}")
    public ResponseEntity<Board4> selectBoard(@PathVariable Long id){
        Board4 result = boardService4.selectBoard(id);
        if (result != null) {
           return ResponseEntity.ok().body(result);
        } else {
           return ResponseEntity.internalServerError().body(null);
        }
    }

    //제이슨타입 - @RequestBody
    //dto - modelattribute
    @PostMapping("board")
    public ResponseEntity<Integer> createBoard (@RequestBody Board4 board4){
        Board4 result = boardService4.createBoard(board4);
        if (result != null) {
            return ResponseEntity.ok().body(1);
        } else {
            return ResponseEntity.internalServerError().body(0);
        }
    }
    //업데이트, 수정
    @PutMapping("board/{id}")
    public ResponseEntity<Integer> updateBoard(@PathVariable Long id, @RequestBody Board4 board4){
        board4.setId(id);
        Board4 result = boardService4.updateBoard(board4);
        if (result != null) {
            return ResponseEntity.ok().body(1);
        } else {
            return ResponseEntity.internalServerError().body(0);
        }
    }

    // public. 이렇게 return 줄게. 이렇게 이름을. 이렇게 받아서.
    @DeleteMapping("board/{id}")
    public ResponseEntity<Integer> deleteBoard(@PathVariable Long id){
        try{
           boardService4.deleteBoard(id);
           return ResponseEntity.ok().body(1);
        } catch(Exception e){
            return ResponseEntity.internalServerError().body(0);
        }

    }

}
