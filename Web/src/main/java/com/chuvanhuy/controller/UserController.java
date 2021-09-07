package com.chuvanhuy.controller;


import javax.servlet.http.HttpSession;

import org.apache.tomcat.jni.User;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.chuvanhuy.model.Users;
import com.chuvanhuy.service.CategoryService;
import com.chuvanhuy.service.UserService;
import com.chuvanhuy.service.UserServiceImpl;

@Controller
public class UserController {
	private UserService userService;
	@Autowired(required = true)
	@Qualifier(value = "userService")
	public void setUserService(UserService us) {
		this.userService = us;
	}
     UserServiceImpl accountService=new UserServiceImpl();
	@RequestMapping(value = "/dang-ky", method = RequestMethod.GET)
	public ModelAndView Register() {
		ModelAndView mv=new ModelAndView("login/register");
		mv.addObject("user",new Users());
		return mv;
	}
	@RequestMapping(value = "/dang-ky", method = RequestMethod.POST)
	public String AddAcc(HttpSession session,@ModelAttribute("user") Users user) {
	
		ModelAndView mv=new ModelAndView("login/register");
		if(user.getId()==0 && userService.CheckCreat(user) !=null)
		{
			this.userService.AddAccount(user);
			 mv.addObject("status","Dang ky that bai!");
		}
		return "redirect:";
	}
	/*
	 * @RequestMapping(value = "/dang-nhap", method = RequestMethod.POST) public
	 * String Login(HttpSession session,@ModelAttribute("user") Users user) {
	 * 
	 * ModelAndView mv=new ModelAndView("login/login"); boolean check =
	 * accountService.CheckAccount(user);
	 * 
	 * if(check) {
	 * 
	 * mv.setViewName("redirect:home"); session.setAttribute("LoginInfor",user); }
	 * else { mv.addObject("statusLogin","Dang nhap tai khoan that bai!"); }
	 * 
	 * return "mv"; }
	 */
}
	
