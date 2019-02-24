package com.hqk.study._05;

import javax.sql.DataSource;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;

import com.alibaba.druid.pool.DruidDataSource;

@SpringBootApplication
public class App {
	/**
	 * main方法启动程序
	 */
	public static void main(String[] args) throws Exception {
		SpringApplication.run(App.class, args);
		System.out.println("===========");
	}

	@Bean
	//ConfigurationProperties 这个知识点请看参数绑定
	@ConfigurationProperties(prefix = "db")
	public DataSource dateSource() {
		DruidDataSource dataSource = new DruidDataSource();
		return dataSource;
	}
}
