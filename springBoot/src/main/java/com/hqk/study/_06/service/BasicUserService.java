package com.hqk.study._06.service;

import java.util.List;

import com.hqk.study._06.model.BasicUser;

public interface BasicUserService {	
    
    public void deleteIds(String ids);
    
    public List<BasicUser> selectList();
   
}

