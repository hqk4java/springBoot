package com.hqk.study._06.service.impl;


import java.util.ArrayList;
import java.util.List;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import com.hqk.study._06.dao.BasicUserDao;
import com.hqk.study._06.model.BasicUser;
import com.hqk.study._06.service.BasicUserService;
@Transactional
@Service("basicUserService")
public class BasicUserServiceImpl implements BasicUserService {

	private final static Logger log = Logger.getLogger(BasicUserServiceImpl.class);

	@Autowired
	private BasicUserDao basicUserDao;

	public List<BasicUser> selectList() {
		return basicUserDao.selectList();
	}

	public void deleteIds(String ids) {
		String[] idArr = ids.split(",");
		if (idArr.length > 1) {
			List<Integer> idsList = new ArrayList<Integer>();
			for (int i = 0; i < idArr.length; i++) {
				idsList.add(Integer.valueOf(idArr[i]));
			}
			this.basicUserDao.deleteByIds(idsList);
		} 
	}
}
