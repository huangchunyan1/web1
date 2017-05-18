package com.tairun.dao.impl;

import java.lang.reflect.ParameterizedType;
import java.util.List;

import javax.annotation.Resource;

import org.hibernate.SessionFactory;

import com.taritun.dao.BaseDao;

public class BaseDaoImpl<T> implements BaseDao<T>{
   @Resource
	SessionFactory sessionFactory;
   Class clazz ;
   public BaseDaoImpl(){
	    ParameterizedType parameterizedType = 
	    		(ParameterizedType) this.getClass().getGenericSuperclass();//获取当前new对象的泛型的父类类型  
	    clazz  = (Class<T>) parameterizedType.getActualTypeArguments()[0];  
        System.out.println("clazz ==>> "+clazz);  
   }
   
   public T findById(int id){
	   return (T)sessionFactory.
			   getCurrentSession().get(clazz, id);
	   
   }

@Override
public void add(T t) {
	sessionFactory.getCurrentSession().save(t);
	
}

@Override
public List findAll() {
	
	return sessionFactory.getCurrentSession()
			.createQuery("from "+clazz.getSimpleName()).list();
}

@Override
public void updateById(T t) {
 
	
}

 




}
