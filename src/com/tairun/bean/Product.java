package com.tairun.bean;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinColumns;
import javax.persistence.OneToMany;
import javax.persistence.Table;


@Entity
@Table
public class Product {
	@Id
	@GeneratedValue(strategy= GenerationType.IDENTITY)
   private int p_id;
   private double p_price;
   private String p_description;
   private String p_picUrl;
   
   @OneToMany(cascade = {CascadeType.PERSIST, CascadeType.MERGE},
		   fetch = FetchType.EAGER)
  private List<ProductDetails>  productDetails;
   
public int getP_id() {
	return p_id;
}
public void setP_id(int p_id) {
	this.p_id = p_id;
}
public double getP_price() {
	return p_price;
}
public void setP_price(double p_price) {
	this.p_price = p_price;
}
public String getP_description() {
	return p_description;
}
public void setP_description(String p_description) {
	this.p_description = p_description;
}

public String getP_picUrl() {
	return p_picUrl;
}
public void setP_picUrl(String p_picUrl) {
	this.p_picUrl = p_picUrl;
}

public List<ProductDetails> getProductDetails() {
	return productDetails;
}

public void setProductDetails(List<ProductDetails> productDetails) {
	this.productDetails = productDetails;
}

 
    
}
