package com.dtdx.lrpx.web.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller("WebController")
@RequestMapping("/web/WebController")
public class WebController {

	@RequestMapping("/sayHello")
	 public ModelAndView sayHello(HttpServletRequest request,
	   HttpServletResponse response) throws Exception {
	   System.out.println("-------进入WebController类--------\n\t:hello.");
	   return new ModelAndView("forward:/demo.jsp");
	 }
}
