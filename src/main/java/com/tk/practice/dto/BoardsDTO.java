package com.tk.practice.dto;

public class BoardsDTO {

	public int idx;
	public String boardcode;
	public String boardcodeOld;
	public String boardname;
	public String regdate;

	public BoardsDTO() {
		// TODO Auto-generated constructor stub
	}

	public String getBoardcodeOld() {
		return boardcodeOld;
	}

	public void setBoardcodeOld(String boardcodeOld) {
		this.boardcodeOld = boardcodeOld;
	}

	public BoardsDTO(int idx, String boardcode, String boardname, String regdate) {
		super();
		this.idx = idx;
		this.boardcode = boardcode;
		this.boardname = boardname;
		this.regdate = regdate;
	}

	public int getIdx() {
		return idx;
	}

	public void setIdx(int idx) {
		this.idx = idx;
	}

	public String getBoardcode() {
		return boardcode;
	}

	public void setBoardcode(String boardcode) {
		this.boardcode = boardcode;
	}

	public String getBoardname() {
		return boardname;
	}

	public void setBoardname(String boardname) {
		this.boardname = boardname;
	}

	public String getRegdate() {
		return regdate;
	}

	public void setRegdate(String regdate) {
		this.regdate = regdate;
	}

}
