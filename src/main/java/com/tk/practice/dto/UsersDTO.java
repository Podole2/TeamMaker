package com.tk.practice.dto;

public class UsersDTO {

	public int idx;
	public String name;
	public String userid;
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
