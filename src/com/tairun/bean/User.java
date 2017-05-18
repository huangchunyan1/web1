package com.tairun.bean;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table
public class User {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
   private int u_id;
   private String u_username;
   private String u_password;
   private String u_telephone;
   private String u_email;
public int getU_id() {
	return u_id;
}
public void setU_id(int u_id) {
	this.u_id = u_id;
}
public String getU_username() {
	return u_username;
}
public void setU_username(String u_username) {
	this.u_username = u_username;
}
public String getU_password() {
	return u_password;
}
public void setU_password(String u_password) {
	this.u_password = u_password;
}
public String getU_telephone() {
	return u_telephone;
}
public void setU_telephone(String u_telephone) {
	this.u_telephone = u_telephone;
}
public String getU_email() {
	return u_email;
}
public void setU_email(String u_email) {
	this.u_email = u_email;
}
@Override
public String toString() {
	return "User [u_id=" + u_id + ", u_username=" + u_username
			+ ", u_password=" + u_password + ", u_telephone=" + u_telephone
			+ ", u_email=" + u_email + "]";
}
    
}
