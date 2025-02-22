package com.musecom.net.controller;

import com.musecom.net.dto.Board3;
import com.musecom.net.service.BoardService3;
import lombok.RequiredArgsConstructor;
import org.apache.coyote.Response;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping
@RequiredArgsConstructor
public class BoardRestController3 {

    private final BoardService3 boardService3;

    @GetMapping("{/id}")
    public ResponseEntity<Board3> selectBoard(Long id) {
        Board3 result = boardService3.selectBoard(id);
        if (result != null) {
            return ResponseEntity.ok(result);
        } else {
            return ResponseEntity.internalServerError().body(null);
        }



    @PostMapping

    @PutMapping

    @DeleteMapping

    }

}
