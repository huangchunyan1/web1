package com.tairun.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.tairun.bean.Order;
import com.tairun.service.OrderService;
import com.taritun.dao.OrderDao;

@Service("orderService")
public class OrderServiceImpl  extends BaseServiceImpl<Order>
implements OrderService {
    
	@Resource
	OrderDao orderDao;
	@Override
	public List<Order> findAll() {
		
		return null;
	}

	@Override
	public Order findById(int id) {
		
		return null;
	}

	@Override
	public void add(Order t) {
	    orderDao.add(t);
	}

}
