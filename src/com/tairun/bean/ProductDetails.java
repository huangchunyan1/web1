package com.tairun.bean;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table
public class ProductDetails {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
   private int pd_id;
   private String pd_picUrl;
   
public int getPd_id() {
	return pd_id;
}
public void setPd_id(int pd_id) {
	this.pd_id = pd_id;
}
public String getPd_picUrl() {
	return pd_picUrl;
}
public void setPd_picUrl(String pd_picUrl) {
	this.pd_picUrl = pd_picUrl;
}

   
}
