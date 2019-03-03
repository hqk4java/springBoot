package com.hqk.study._06.service.impl;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.hqk.study._06.dao.BasicUserDao;
import com.hqk.study._06.model.BasicUser;
import com.hqk.study._06.service.BasicUserService;

@Transactional
@Service("basicUserService")
public class BasicUserServiceImpl implements BasicUserService {


	@Autowired
	private BasicUserDao basicUserDao;

	public List<BasicUser> selectList() {
		return basicUserDao.selectList();
	}

	@Transactional
	public void insertUser(BasicUser user) {
		int a = 1 / 0;
		basicUserDao.insertUser(user);
	}
}
