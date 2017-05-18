package com.tairun.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.tairun.bean.Contact;
import com.tairun.service.ContactService;
import com.taritun.dao.ContactDao;

@Service("contactService")
@Transactional
public class ContactServiceImpl 
    extends BaseServiceImpl<Contact> implements
		ContactService<Contact> {
	@Resource
   ContactDao contactDao;
	

	@Override
	public void add(Contact t) {
		contactDao.add(t);

	}

	@Override
	public boolean updateStatus(int id) {
		
		return contactDao.updateStatus(id);
	}

	@Override
	public List<Contact> findByIds(int uid) {
	
		return contactDao.findByIds(uid);
	}

	@Override
	public void delete(int id) {
		
		contactDao.delete(id);
	}

	@Override
	public void updateById(Contact contact) {
	   contactDao.updateById(contact);
	}

	@Override
	public Contact findById(int id) {
		
		return contactDao.findById(id);
	}
	
	

}
