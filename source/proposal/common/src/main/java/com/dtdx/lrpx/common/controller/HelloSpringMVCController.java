package com.dtdx.lrpx.common.controller;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
@Controller("HelloSpringMVCController")
@RequestMapping("/common/HelloSpringMVCController")
public class HelloSpringMVCController {

 @RequestMapping("/handleRequest")
 public ModelAndView handleRequest(HttpServletRequest request,
   HttpServletResponse response) throws Exception {
   System.out.println("-------进入HelloSpringMVCController类--------");
   return new ModelAndView("forward:/demo.jsp");
 }

}
