package com.ssm.springmvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.ssm.springmvc.service.Login;

@Controller
@RequestMapping({"","/","Login"})
public class LoginController {
	@RequestMapping({"","/","login"})
	public String login() {
		return "login";
	}
	@RequestMapping("/login_submit")
	/*public String login_submit(String username,String password) {
		//业务逻辑代码Login
		Login login=new Login();
		boolean result=login.execute(username,password);
		System.out.println(result);
		if(result) {
			return "login/login_succ";//   /WEB-INF/jsp/login/login_succ.jsp
		}else {
			return "login/login_fail";//   /WEB-INF/jsp/login/login_fail.jsp
		}
	}*/
	/*public String login_submit(User user) {
		//业务逻辑代码Login，1.实体类 后台简单类接收前台数据
		Login login=new Login();
		boolean result=login.execute(user.getUsername(),user.getPassword());
		System.out.println(result);
		if(result) {
			return "login/login_succ";//   /WEB-INF/jsp/login/login_succ.jsp
		}else {
			return "login/login_fail";//   /WEB-INF/jsp/login/login_fail.jsp
		}
	}*/
  /*
	public String login_submit(HttpServletRequest request,String username,String password) {
		//业务逻辑代码Login，2.属性驱动 后台原生HttpServletRequest的API接收前台数据
		request.setAttribute("username",username);
		System.out.println("username："+username);
		Login login=new Login();
		boolean result=login.execute(request.getParameter("username"),request.getParameter("password"));
		System.out.println(result);
		if(result) {
			return "login/login_succ";//   /WEB-INF/jsp/login/login_succ.jsp
		}else {
			return "login/login_fail";//   /WEB-INF/jsp/login/login_fail.jsp
		}
	}*/
	public ModelAndView login_submit(String username,String password) {
		//业务逻辑代码Login，3.模型驱动 使用ModelAndView传递数据
		Login login=new Login();
		boolean result=login.execute(username,password);
		System.out.println(result);
		if(result) {
			ModelAndView modelAndView=new ModelAndView("login/login_succ");//设置视图
			modelAndView.addObject("username", username);
			//return "login/login_succ";//   /WEB-INF/jsp/login/login_succ.jsp
			return modelAndView;
		}else {
			ModelAndView modelAndView=new ModelAndView("login/login_fail");//设置视图
			modelAndView.addObject("username", username);
			//return "login/login_succ";//   /WEB-INF/jsp/login/login_fail.jsp
			return modelAndView;
		}
	}
	/*public String login_submit(Model model,User user) {
		//业务逻辑代码Login，4.模型驱动， 使用model接收前台数据
		model.addAttribute(user);
		Login login=new Login();
		boolean result=login.execute(user.getUsername(),user.getPassword());
		System.out.println(result);
		if(result) {
			return "login/login_succ";//   /WEB-INF/jsp/login/login_succ.jsp
		}else {
			return "login/login_fail";//   /WEB-INF/jsp/login/login_fail.jsp
		}
	}*/
}
