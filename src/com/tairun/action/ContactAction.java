package com.tairun.action;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import com.opensymphony.xwork2.ModelDriven;
import com.tairun.bean.Contact;
import com.tairun.bean.User;
import com.tairun.service.ContactService;

public class ContactAction 
extends BaseAction implements ModelDriven<Contact> {
	private int id;
	
  public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

Contact contact = new Contact();
  @Resource
    ContactService contactService;
    
  
  public void add(){
	  User user = (User)session.getAttribute("user");
	  
	  System.out.println(user.getU_id());
	  contact.setU_id(user.getU_id());
	  contactService.add(contact);
	  Map<String,String> map = new HashMap<String,String>();
	  map.put("message", "success");
	  String result = gson.toJson(map);
	  writeStr(result);
  }
  
  public void findAll(){
	  User user = (User) session.getAttribute("user");
	  List<Contact> list =  contactService.findByIds(user.getU_id());
	  String result = gson.toJson(list);
	  writeStr(result);
  }
  
  public void updateStatus(){
	 contactService.updateStatus(id);
	 Map<String,String> map = new HashMap<String,String>();
	 map.put("message", "success");
	String result = gson.toJson(map);
	writeStr(result);
  }
  
  public void deleteById(){
	   contactService.delete(id);
	   Map<String,String> map = new HashMap<String,String>();
	   map.put("message", "success");
	   String result = gson.toJson(map);
	   writeStr(result);
  }
  
  public void findById(){
	  Contact contact = (Contact)contactService.findById(id);
	  String result = gson.toJson(contact);
	  writeStr(result);
	}
  
  public void updateById(){
	   contactService.updateById(contact);
	   Map<String,String> map = new HashMap<String,String>();
	   map.put("message", "success");
	   String result = gson.toJson(map);
	   writeStr(result);
  }
	@Override
	public Contact getModel() {
		
		return contact;
	}

}
