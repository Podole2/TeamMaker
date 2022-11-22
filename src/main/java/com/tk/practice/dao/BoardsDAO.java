package com.tk.practice.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.tk.practice.dto.BoardsDTO;
import com.tk.practice.mapper.BoardsMapper;

@Repository
public class BoardsDAO implements BoardsMapper {

	@Autowired
	BoardsMapper mapper;

	@Override
	public int insertBoard(BoardsDTO dto) {
		// TODO Auto-generated method stub
		return mapper.insertBoard(dto);
	}

	@Override
	public int updateBoard(BoardsDTO dto) {
		// TODO Auto-generated method stub
		return mapper.updateBoard(dto);
	}

	@Override
	public int deleteBoard(String boardcode) {
		// TODO Auto-generated method stub
		return mapper.deleteBoard(boardcode);
	}

	@Override
	public BoardsDTO selectBoard(String boardcode) {
		// TODO Auto-generated method stub
		return mapper.selectBoard(boardcode);
	}

	@Override
	public List<BoardsDTO> selectBoardAll() {
		// TODO Auto-generated method stub
		return mapper.selectBoardAll();
	}

	@Override
	public int selectBoardCnt() {
		// TODO Auto-generated method stub
		return mapper.selectBoardCnt();
	}

	@Override
	public int createBoard(BoardsDTO dto) {
		// TODO Auto-generated method stub
		return mapper.createBoard(dto);
	}

	@Override
	public int dropBoard(String boardcode) {
		// TODO Auto-generated method stub
		return mapper.dropBoard(boardcode);
	}

	@Override
	public int renameBoard(BoardsDTO dto) {
		// TODO Auto-generated method stub
		return mapper.renameBoard(dto);
	}

}
