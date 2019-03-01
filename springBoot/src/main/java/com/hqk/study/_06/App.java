package com.hqk.study._06;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * 两种扫描mapper 文件。
 * 1.在启动类提交@MapperScan("mapper所在的文件夹地址")
 * 
 * 2.在配置文件写上
 *mybatis.mapper-locations=classpath*:/com/hqk/study/_06/mapping/*.xml
 */
@MapperScan("com.hqk.study._06.mapper")
@SpringBootApplication
public class App {
	public static void main(String[] args) throws Exception {
		SpringApplication.run(App.class, args);
	}
}
