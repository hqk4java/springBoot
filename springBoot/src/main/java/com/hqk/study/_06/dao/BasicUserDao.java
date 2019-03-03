package com.hqk.study._06.dao;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.hqk.study._06.model.BasicUser;

@Mapper //是 MyBatis的备注，目的是为了让spring能够根据xml和这个接口动态生成这个接口的实现。不加也可以
public interface BasicUserDao  {	
    
    public List<BasicUser> selectList();
    
    public void insertUser(BasicUser user);
}
