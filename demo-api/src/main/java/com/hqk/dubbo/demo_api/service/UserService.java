package com.hqk.dubbo.demo_api.service;

import com.hqk.dubbo.demo_api.po.User;

public interface UserService {
	User getById(Integer id);
}
