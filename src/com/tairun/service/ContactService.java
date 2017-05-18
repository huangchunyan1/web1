package com.tairun.service;

import java.util.List;

public interface ContactService<Contact>  
   extends BaseService<Contact> {
 
	public boolean updateStatus(int id);
	public List<Contact> findByIds(int uid);
	

	

}
