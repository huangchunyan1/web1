package com.tairun.dao.impl;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.tairun.bean.User;
import com.taritun.dao.UserDao;

@Repository("userDao")
public class UserDaoImpl extends BaseDaoImpl<User> implements UserDao {

	@Override
	public User login(User user) {
	    
		      List list = sessionFactory.getCurrentSession()
				.createQuery("from User u where u.u_username=:username and u.u_password=:password")
				.setParameter("username", user.getU_username())
				.setParameter("password", user.getU_password()).list();
		      return (User)list.get(0);
	}
	
	

}
