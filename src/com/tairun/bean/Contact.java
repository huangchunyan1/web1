package com.tairun.bean;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.hibernate.annotations.Cascade;

@Entity
@Table(name="c_contact")
public class Contact {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
  private int c_id;
  private String c_address;
  private String c_telephone;
  private String c_name;
  private int c_status = 0;
  
  private int u_id;
  
public int getC_id() {
	return c_id;
}
public void setC_id(int c_id) {
	this.c_id = c_id;
}

public String getC_address() {
	return c_address;
}
public void setC_address(String c_address) {
	this.c_address = c_address;
}
public String getC_telephone() {
	return c_telephone;
}
public void setC_telephone(String c_telephone) {
	this.c_telephone = c_telephone;
}
public String getC_name() {
	return c_name;
}
public void setC_name(String c_name) {
	this.c_name = c_name;
}
public int getU_id() {
	return u_id;
}
public void setU_id(int u_id) {
	this.u_id = u_id;
}
public int getC_status() {
	return c_status;
}
public void setC_status(int c_status) {
	this.c_status = c_status;
}


  

}
