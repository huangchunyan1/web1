package com.taritun.dao;

import com.tairun.bean.User;

public interface UserDao extends BaseDao<User>{
   public User login(User user);
}
