package com.musecom.net.controller;


import com.musecom.net.dto.Board4;
import com.musecom.net.repository.BoardRepository4;
import com.musecom.net.service.BoardService4;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller

public class BoardController4 {

    private BoardService4 boardService4;

    @GetMapping("/")
    private String selectBoard(Model model){
        List<Board4> result = boardService4.selectAllBoard();
        model.addAttribute("Board4", result);
        return "board/list";
    }

}
