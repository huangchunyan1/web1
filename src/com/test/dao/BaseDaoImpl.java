package com.test.dao;

import java.lang.reflect.ParameterizedType;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

public class BaseDaoImpl<T> {
	
	
   public void findAll() {
	   
	   
	  try {
		  ParameterizedType pt = (ParameterizedType)
				  this.getClass().getGenericSuperclass();
		  Class clazz = (Class<T>)pt.getActualTypeArguments()[0];
		Class.forName("com.mysql.jdbc.Driver");
		String url ="jdbc:mysql://localhost:3306/guanwang";
		String user ="root";
		String password = "123456";
		try {
			Connection conn = DriverManager.getConnection(url, user, password);
			String sql ="select * from "+ clazz.getSimpleName();
			PreparedStatement pstmt = conn.prepareStatement(sql);
			ResultSet rs = pstmt.executeQuery();
			while(rs.next()){
				System.out.println(rs.getString("u_username"));
				System.out.println(rs.getString("u_password"));
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	} catch (ClassNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	   
   }
   
}
