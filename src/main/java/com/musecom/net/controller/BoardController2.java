package com.musecom.net.controller;

import com.musecom.net.dto.Board;
import com.musecom.net.dto.Board2;
import com.musecom.net.service.BoardService;
import com.musecom.net.service.BoardService2;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
@RequiredArgsConstructor
public class BoardController2 {

    private final BoardService2 boardService2;

    @GetMapping("/")
    public String selectAllBoard(Model model) {
        List<Board2> result  = boardService2.selectAllBoard();
        model.addAttribute("board2", model);

        return "board/list";
    }

	
	
}
