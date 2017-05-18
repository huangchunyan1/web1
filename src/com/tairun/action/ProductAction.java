package com.tairun.action;

import java.util.List;

import javax.annotation.Resource;

import com.opensymphony.xwork2.ModelDriven;
import com.tairun.bean.Product;
import com.tairun.service.ProductService;

public class ProductAction extends BaseAction implements ModelDriven<Product> {

	Product product = new Product();
	@Resource
	ProductService productService;
	private int id;
	
	public int getId() {
		return id;
	}



	public void setId(int id) {
		this.id = id;
	}



	public void findAll(){
		List<Product> list = productService.findAll();
		String result = gson.toJson(list);
		writeStr(result);
	}
	
	
	
	public void findById(){
		
		Product product = productService.findById(id);
		String result = gson.toJson(product);
		writeStr(result);
	}
	
	@Override
	public Product getModel() {
		return product;
	}

}
