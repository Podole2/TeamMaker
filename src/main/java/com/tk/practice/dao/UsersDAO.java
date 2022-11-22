package com.tk.practice.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.tk.practice.dto.UsersDTO;
import com.tk.practice.mapper.UsersMapper;

@Repository
public class UsersDAO implements UsersMapper {

	@Autowired
	UsersMapper mapper;

	@Override
	public int insertUser(UsersDTO dto) {
		// TODO Auto-generated method stub
		return mapper.insertUser(dto);
	}

	@Override
	public int updateUser(UsersDTO dto) {
		// TODO Auto-generated method stub
		return mapper.updateUser(dto);
	}

	@Override
	public int deleteUser(int idx) {
		// TODO Auto-generated method stub
		return mapper.deleteUser(idx);
	}

	@Override
	public UsersDTO selectUser(int idx) {
		// TODO Auto-generated method stub
		return mapper.selectUser(idx);
	}

	@Override
	public List<UsersDTO> selectUserAll() {
		// TODO Auto-generated method stub
		return mapper.selectUserAll();
	}

	@Override
	public int selectUserCnt() {
		// TODO Auto-generated method stub
		return mapper.selectUserCnt();
	}

	public UsersDTO loginUser(UsersDTO dto) {
		// TODO Auto-generated method stub
		return mapper.loginUser(dto);
	}

}
