package com.tk.practice.dto;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Pattern;

public class UsersDTO {

	public int idx;

	@NotBlank(message = "아이디는 필수 입력 값입니다.")
	public String name;

	public String userid;

	@NotBlank(message = "비밀번호는 필수 입력 값입니다.")
	@Pattern(regexp = "(?=.*[0-9])(?=.*[a-zA-Z])(?=.*\\W)(?=\\S+$).{8,16}", message = "비밀번호는 8~16자 영문 대 소문자, 숫자, 특수문자를 사용하세요.")
	public String passwd;

	public String email;
	public String mobile;
	public String bday;

	public UsersDTO() {
		// TODO Auto-generated constructor stub
	}

	public UsersDTO(int idx, String name, String userid, String passwd, String email, String mobile, String bday) {
		super();
		this.idx = idx;
		this.name = name;
		this.userid = userid;
		this.passwd = passwd;
		this.email = email;
		this.mobile = mobile;
		this.bday = bday;
	}

	public int getIdx() {
		return idx;
	}

	public void setIdx(int idx) {
		this.idx = idx;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getUserid() {
		return userid;
	}

	public void setUserid(String userid) {
		this.userid = userid;
	}

	public String getPasswd() {
		return passwd;
	}

	public void setPasswd(String passwd) {
		this.passwd = passwd;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getMobile() {
		return mobile;
	}

	public void setMobile(String mobile) {
		this.mobile = mobile;
	}

	public String getBday() {
		return bday;
	}

	public void setBday(String bday) {
		this.bday = bday;
	}

}
