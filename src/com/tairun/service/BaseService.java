package com.tairun.service;

import java.util.List;

import com.tairun.bean.Product;

public interface BaseService<T> {
	 public List<T> findAll();
	   public T findById(int id);
	   public void add(T t);
	   public void delete(int id);
	   public void updateById(T t);
	 
}
