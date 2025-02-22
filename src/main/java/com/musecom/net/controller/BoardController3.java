package com.musecom.net.controller;

import com.musecom.net.dto.Board3;
import com.musecom.net.service.BoardService3;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@RequiredArgsConstructor
@Controller
public class BoardController3 {

    private final BoardService3 boardService3;

    @GetMapping("/")
    public String selectAllBoard(Model model){
        List<Board3> board3 = boardService3.selectAllBoard();
        model.addAttribute("board3",board3);

        return "board/list";
    }


}
