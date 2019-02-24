package com.hqk.study._03;

import org.springframework.boot.Banner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class BannerApp {
	//第二种方式
	public static void main(String[] args) throws Exception {
		SpringApplication application = new SpringApplication(BannerApp.class);
		application.setBannerMode(Banner.Mode.OFF);
		application.run(args);
	}
	
	
	//第二种方式
	/*public static void main(String[] args) throws Exception {
		new SpringApplicationBuilder(BannerApp.class).bannerMode(Banner.Mode.OFF).run(args);
	}*/
}
