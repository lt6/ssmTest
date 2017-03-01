package com.lt.controller;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.lt.domain.User;
import com.lt.service.UserService;

@Controller
@RequestMapping("/user")
public class UserController {
	@Resource
	private UserService userService;
	//查询所有用户
	@RequestMapping("list")
	public String list(Model model){
		
		List<User> list = userService.findAll();
		
		model.addAttribute("userList", list);
		
		return "userList";
		
	}
	//小小修改，测试一波
	//小小修改，测试一波二
}
