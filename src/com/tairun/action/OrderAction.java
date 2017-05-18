package com.tairun.action;

import java.util.HashMap;
import java.util.Map;

import javax.annotation.Resource;

import com.opensymphony.xwork2.ModelDriven;
import com.tairun.bean.Order;
import com.tairun.service.OrderService;

public class OrderAction  extends BaseAction  
     implements ModelDriven<Order> {
	  Order order = new Order();
    @Resource
	OrderService orderService;
	public void add(){
		
		orderService.add(order);
		Map<String,String> map = new HashMap<String,String>();
		map.put("message", "succes");
		String result = gson.toJson(map);
		writeStr(result);
	}
	
	@Override
	public Order getModel() {
	   
		return order;
	}
}
