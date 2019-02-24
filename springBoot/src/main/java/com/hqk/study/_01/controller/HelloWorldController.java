package com.hqk.study._01.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HelloWorldController {

	@ResponseBody // 返回体
	@RequestMapping("/hello") // 映射地址
	public String sayHello() {
		System.out.println("hello");
		System.out.println("hello2");
		System.out.println("hello3");
		return "helloWorld";
	}
}
