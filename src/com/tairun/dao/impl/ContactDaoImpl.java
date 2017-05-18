package com.tairun.dao.impl;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.tairun.bean.Contact;
import com.taritun.dao.ContactDao;

@Repository("contactDao")
public class ContactDaoImpl extends BaseDaoImpl<Contact>
  implements ContactDao {

	


	@Override
	public List<Contact> findByIds(int id) {
		
		return this.sessionFactory
				.getCurrentSession()
				.createQuery("from Contact c where c.u_id=:u_id")
				.setParameter("u_id", id).list();
	}

	
	@Override
	public boolean updateStatus(int id) {
		
		this.sessionFactory.getCurrentSession()
		.createQuery("update Contact set c_status = 0")
		.executeUpdate();
		
		this.sessionFactory.getCurrentSession().
		createQuery("update Contact set c_status = 1 where c_id=:id")
		.setParameter("id", id).executeUpdate();
		
		return true;
	}


	@Override
	public void delete(int id) {
	  this.sessionFactory.getCurrentSession()
	  .createQuery("delete from Contact where c_id=:c_id")
	  .setParameter("c_id", id).executeUpdate();
	  
	  }
      
	@Override
	public void updateById(Contact contact) {
		this.sessionFactory.getCurrentSession()
		.createQuery("update from Contact set c_address=:address ,c_name=:name,c_telephone=:telephone where c_id =:id")
		.setParameter("address", contact.getC_address())
		.setParameter("name", contact.getC_name())
		.setParameter("telephone", contact.getC_telephone())
		.setParameter("id", contact.getC_id()).executeUpdate();
		
	}

}
