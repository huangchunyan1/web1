package com.tairun.service;

import com.tairun.bean.User;

public interface UserService {
   public User login(User user);
   public void register(User user);
}
