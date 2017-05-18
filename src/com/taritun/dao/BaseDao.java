package com.taritun.dao;

import java.util.List;

public interface BaseDao<T> {
    public T findById(int id);
    public void add(T t);
    public List findAll();
    public void updateById(T t);
    
}
