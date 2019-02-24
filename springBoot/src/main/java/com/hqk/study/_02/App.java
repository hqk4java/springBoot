package com.hqk.study._02;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

//必须标注@SpringBootApplication注解才能扫描程序里面的注解组件
@SpringBootApplication
public class App {
	
	public static void main(String[] args) throws Exception {
		SpringApplication.run(App.class, "11111");
	}
}