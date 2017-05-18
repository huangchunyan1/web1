package com.tairun.bean;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="o_order")
public class Order {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
  private int o_id;
	
  @OneToOne
  @JoinColumn(name="product_id")
  private Product product;
  
  @ManyToOne
  @JoinColumn(name="user_id")
  private User user;
  private Date o_createTime;
  
public int getO_id() {
	return o_id;
}
public void setO_id(int o_id) {
	this.o_id = o_id;
}
public Product getProduct() {
	return product;
}
public void setProduct(Product product) {
	this.product = product;
}
public User getUser() {
	return user;
}
public void setUser(User user) {
	this.user = user;
}
public Date getO_createTime() {
	return o_createTime;
}
public void setO_createTime(Date o_createTime) {
	this.o_createTime = o_createTime;
}
  
}
