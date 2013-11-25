package com.dtdx.lrpx.user.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.dtdx.lrpx.user.domain.User;
import com.dtdx.lrpx.user.service.UserService;

@Controller("UserController")
@RequestMapping("/user/UserController")
public class UserController {
	@Autowired
	private UserService userService;
//	public ModelAndView insertUser(HttpServletRequest request, User user){
//		
//	}
	@RequestMapping(value="/queryUserList",method=RequestMethod.GET)
	public ModelAndView queryUserList(HttpServletRequest request){
		System.out.println("开始查询用户列表");
		List<User> users = userService.queryUserList();
		System.out.println("查询用户列表结果 = " + users);
		request.setAttribute("users", users);
		return new ModelAndView("forward:/pages/userList.jsp");
	}
	  
}
