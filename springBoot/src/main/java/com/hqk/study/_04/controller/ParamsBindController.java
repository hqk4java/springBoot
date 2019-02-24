package com.hqk.study._04.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.hqk.study._04.DataSourceBean;

@Controller	
public class ParamsBindController {
	@Autowired
	private DataSourceBean dataSourceBean;
	
	
	@ResponseBody
	@RequestMapping("/getInfo")
	public void getInfo(){
		 System.out.println(dataSourceBean);
	}
}	
