package com.hqk.study._06.dao;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import com.hqk.study._06.model.BasicUser;

@Mapper //是 MyBatis的备注，目的是为了让spring能够根据xml和这个接口动态生成这个接口的实现。不加也可以
public interface BasicUserDao  {	
    
    public void deleteByIds(@Param("ids") List<Integer> ids);
    
    public List<BasicUser> selectList();
}
