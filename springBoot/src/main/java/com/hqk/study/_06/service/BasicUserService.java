package com.hqk.study._06.service;

import java.util.List;

import com.hqk.study._06.model.BasicUser;

public interface BasicUserService {	
    
    public List<BasicUser> selectList();

    public void insertUser(BasicUser user);
}

