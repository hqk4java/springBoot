package com.hqk.study._02.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class ArgsController {
	@Autowired
	private ApplicationArguments applicationArguments;

	@ResponseBody // 返回体
	@RequestMapping("/ArgsController") // 映射地址
	public String sayHello() {
		System.out.println(applicationArguments.getNonOptionArgs());
		return "helloWorld";
	}
}
