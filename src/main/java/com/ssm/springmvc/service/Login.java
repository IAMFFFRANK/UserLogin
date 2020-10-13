package com.ssm.springmvc.service;

public class Login {
	//判断用户是否登录成功
	public boolean execute(String username,String password) {
		if("马宏波".equals(username)&&"205".equals(password)) {
			return true;
		}else {
			return false;
		}
	}
}
