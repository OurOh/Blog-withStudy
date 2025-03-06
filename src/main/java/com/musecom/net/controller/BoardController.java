package com.musecom.net.controller;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.musecom.net.dto.Board;
import com.musecom.net.service.BoardService;

import lombok.RequiredArgsConstructor;

@Controller
@RequiredArgsConstructor
public class BoardController {
	
	private final BoardService boardService;
	
	@GetMapping("/")
	public String selectAllBoard(Model model) {
		List<Board> board = boardService.selectAllBoard();
		model.addAttribute("board", board);

		return "board/list";
	}
	
	
}
