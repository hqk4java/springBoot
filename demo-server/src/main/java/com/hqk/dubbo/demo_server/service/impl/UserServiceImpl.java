package com.hqk.dubbo.demo_server.service.impl;

import com.hqk.dubbo.demo_api.po.User;
import com.hqk.dubbo.demo_api.service.UserService;

public class UserServiceImpl implements UserService{

	@Override
	public User getById(Integer id) {
		return new User(id,"hqk");
	}

}
