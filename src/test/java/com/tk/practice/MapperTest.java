package com.tk.practice;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.tk.practice.dto.UsersDTO;
import com.tk.practice.mapper.UsersMapper;

@SpringBootTest
public class MapperTest {
	@Autowired
	private UsersMapper mapper;

	@Test
	public void testInsert() {
		UsersDTO dto = new UsersDTO();
		dto.setName("aaa");
		dto.setUserid("bbb");
		dto.setPasswd("ccc");
		dto.setEmail("ddd");
		dto.setMobile("111");
		dto.setBday("222");
		int result = mapper.insertUser(dto);
		System.out.println("테스트 결과 : " + result);
	}

	@Test
	public void testSelect() {
		List<UsersDTO> list = mapper.selectUserAll();
		for (UsersDTO dto : list) {
			System.out.println(dto.getIdx() + "/" + dto.getName() + "/" + dto.getUserid() + "/" + dto.getPasswd() + "/"
					+ dto.getEmail() + "/" + dto.getMobile() + "/" + dto.getBday());
		}
	}
}