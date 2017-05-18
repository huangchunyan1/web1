package com.tairun.service.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.tairun.bean.User;
import com.tairun.service.UserService;
import com.taritun.dao.UserDao;

@Repository("userService")
@Transactional
public class UserServiceImpl extends BaseServiceImpl<User>
implements UserService {
      @Resource
	  UserDao userDao;
      
	@Override
	public User login(User user) {
		
		return userDao.login(user);
	}

	@Override
	public void register(User user) {
		userDao.add(user);
		
	}

}
