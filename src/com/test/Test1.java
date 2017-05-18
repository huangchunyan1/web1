package com.test;

import com.test.dao.UserDaoImpl;


public class Test1 {

	public void test(){
		UserDaoImpl userDao = new UserDaoImpl();
		userDao.findAll();
	}
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		new Test1().test();

	}

}
