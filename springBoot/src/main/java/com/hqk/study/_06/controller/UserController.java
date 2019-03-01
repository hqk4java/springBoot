package com.hqk.study._06.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.hqk.study._06.model.BasicUser;
import com.hqk.study._06.service.BasicUserService;

@Controller
public class UserController {

	@Autowired
	private BasicUserService basicUserService;
	
	@RequestMapping("/getUserInfo")
	@ResponseBody
	public void getUserInfo() {
		List<BasicUser> selectList = basicUserService.selectList();
		for (BasicUser basicUser : selectList) {
			System.out.println(basicUser.toString());
		}
	}
}
