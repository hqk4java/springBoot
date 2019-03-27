package com.hqk.dubbo.demo_server;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class XmlServer {
	public static void main(String[] args) throws Exception {
		ClassPathXmlApplicationContext cpxa  = new ClassPathXmlApplicationContext("dubbo-provider.xml");
		cpxa.start();
		System.in.read();
	}
}
