package com.tk.practice.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.tk.practice.dto.BoardsDTO;

@Mapper
public interface BoardsMapper {

	public int insertBoard(BoardsDTO dto);

	public int updateBoard(BoardsDTO dto);

	public int deleteBoard(String boardcode);

	public BoardsDTO selectBoard(String boardcode);

	public List<BoardsDTO> selectBoardAll();

	public int selectBoardCnt();

	public int createBoard(BoardsDTO dto);

	public int dropBoard(String boardcode);

	public int renameBoard(BoardsDTO dto);
}
