package com.hqk.dubbo.demo_client;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.hqk.dubbo.demo_api.service.UserService;

public class XmlClient {
	public static void main(String[] args) {
		ClassPathXmlApplicationContext cpxa  = new ClassPathXmlApplicationContext("dubbo-consumer.xml");
		cpxa.start();
		UserService us = (UserService) cpxa.getBean("userService");
		System.out.println(us.toString());
		System.err.println(us.getById(1));
	}
}
