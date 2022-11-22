package com.tk.practice.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.tk.practice.dao.BoardsDAO;
import com.tk.practice.dto.BoardsDTO;

@Controller
public class BoardsController {

	@Autowired
	private BoardsDAO bdao;

	@RequestMapping("/boards/boardMain")
	public String list(Model model) {
		model.addAttribute("boardData", bdao.selectBoardAll());
		return "boards/boardMain";
	}

	@PostMapping("/boards/buildBoardProc")
	public String buildBoardProc(BoardsDTO dto) {

		bdao.insertBoard(dto);
		bdao.createBoard(dto);

		return "redirect:/boards/boardMain";
	}

	@GetMapping("/boards/deleteBoard")
	public String delete(String boardcode) {

		bdao.deleteBoard(boardcode);
		bdao.dropBoard(boardcode);

		return "redirect:/boards/boardMain";
	}

	@GetMapping("/boards/updateBoard")
	public String selectBoard(Model model, String boardcode) {

		BoardsDTO dto = bdao.selectBoard(boardcode);

		// 모델에 담기
		model.addAttribute("dto", dto);

		return "boards/boardUpdate";
	}

	@PostMapping("/boards/updateBoardProc")
	public String updateProc(BoardsDTO dto) {
//		System.out.println(dto.getBoardcode());
//		System.out.println(dto.getBoardcodeOld());
//		System.out.println(dto.getBoardname());
		bdao.updateBoard(dto);
		bdao.renameBoard(dto);

		return "redirect:/boards/boardMain";
	}

}
