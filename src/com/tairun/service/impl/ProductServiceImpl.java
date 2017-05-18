package com.tairun.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.tairun.bean.Product;
import com.tairun.service.ProductService;
import com.taritun.dao.ProductDao;

@Service("productService")
@Transactional
public class ProductServiceImpl extends BaseServiceImpl<Product>
implements ProductService {
      @Resource
	  ProductDao productDao;
	@Override
	public List<Product> findAll() {
	
		return productDao.findAll();
	}
	@Override
	public Product findById(int id) {
		
		return productDao.findById(id);
	}
	
	@Override
	public void add(Product t) {
		// TODO Auto-generated method stub
		
	}

}
