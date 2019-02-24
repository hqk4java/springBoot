package com.hqk.study._05;

import java.sql.SQLException;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HelloController {
	@Autowired
	private DataSource dataSource;
	
	@ResponseBody // 返回体
	@RequestMapping("/hello") // 映射地址
	public String sayHello() throws Exception {
		System.out.println(dataSource.getConnection());
		System.out.println(dataSource);
		return "hello spring boot";
	}
}
