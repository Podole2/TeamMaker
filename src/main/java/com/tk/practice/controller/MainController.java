package com.tk.practice.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.tk.practice.dao.UsersDAO;
import com.tk.practice.dto.UsersDTO;

@Controller
public class MainController {

	@Autowired
	private UsersDAO udao;

	@RequestMapping({ "/", "/main" })
	public String main() {
		return "main/main";
	}

	@RequestMapping("/main/login")
	public String login() {
		return "main/login";

	}

	// login & logout
	@PostMapping("/main/loginProc")
	public String login(UsersDTO dto, HttpServletRequest request, RedirectAttributes rttr) {
		HttpSession session = (HttpSession) request.getSession();
		String failMessage = "아이디 혹은 비밀번호가 잘못 되었습니다.";

		dto = udao.loginUser(dto);
		if (dto.getIdx() > 0) {
			session.setAttribute("loginedUser", dto);
//			session.setAttribute("username", dto.getName());
		} else {
			rttr.addFlashAttribute("loginFail", failMessage);
//	         session.setAttribute("result", "false");
		}

		return "redirect:/AdminMain";

	}

	@RequestMapping("/AdminMain")
	public String loginedMain() {
		return "main/AdminMain";
	}

	@GetMapping("/logout")
	public String logout(HttpServletRequest request) {
		HttpSession session = request.getSession();
		session.invalidate();
		return "redirect:/main";
	}

	@GetMapping("users/registerUser")
	public String regist() {
		return "users/registerUser"; // write.html 파일
	}

	@PostMapping("users/registerProc")
	public String registProc(UsersDTO dto) {

		udao.insertUser(dto);

		return "redirect:/main/login";
	}

	@RequestMapping("/users/userMain")
	public String users() {
		return "users/userMain";
	}

	@GetMapping({ "/users/userList", "/userList" })
	public String userList(Model model) {

		List<UsersDTO> list = udao.selectUserAll();
		model.addAttribute("userData", list);

		return "users/userList";
	}

}
