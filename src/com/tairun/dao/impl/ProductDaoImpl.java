package com.tairun.dao.impl;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.tairun.bean.Product;
import com.taritun.dao.ProductDao;

@Repository("productDao")
public class ProductDaoImpl extends BaseDaoImpl<Product> implements ProductDao {

	@Override
	public List<Product> findAll() {
		
		return sessionFactory.getCurrentSession()
				.createQuery("from Product").list();
	}
	
	
	

}
