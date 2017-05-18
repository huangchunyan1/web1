package com.taritun.dao;

import java.util.List;

import com.tairun.bean.Product;

public interface ProductDao extends BaseDao<Product>{
   public List<Product> findAll();
}
