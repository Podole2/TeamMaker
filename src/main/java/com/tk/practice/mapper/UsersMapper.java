package com.tk.practice.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.tk.practice.dto.UsersDTO;

@Mapper
public interface UsersMapper {
	// 메서드 이름이 mapper.xml 파일의 id와 같으면 알아서 실행됨.

	public int insertUser(UsersDTO dto);

	public int updateUser(UsersDTO dto);

	public int deleteUser(int idx);

	public UsersDTO selectUser(int idx);

	public List<UsersDTO> selectUserAll();

	public int selectUserCnt();

	public UsersDTO loginUser(UsersDTO dto);
}
