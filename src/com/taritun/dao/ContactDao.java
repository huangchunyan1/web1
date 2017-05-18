package com.taritun.dao;

import java.util.List;

import com.tairun.bean.Contact;

public interface ContactDao extends BaseDao<Contact> {
   public List<Contact> findByIds(int id);
   public boolean updateStatus(int id);
   public void delete(int id);
}
