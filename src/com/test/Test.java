package com.test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Test {

	  public void test(){
		try {
			Class.forName("com.mysql.jdbc.Driver");
			String url ="jdbc:mysql://localhost:3306/guanwang?" +
					"useUnicode=true&characterEncoding=utf-8";
			String user="root";
			String password ="123456";
			
				Connection conn;
				try {
					conn = DriverManager.getConnection(url, user, password);
					String sql ="select * from product";
					PreparedStatement pstmt = conn.prepareStatement(sql);
					ResultSet rs = pstmt.executeQuery();
					while(rs.next()){
						double price = rs.getInt("p_price");
						String description = rs.getString("p_description");
						String picUrl = rs.getString("p_picUrl");
						System.out.println(price);
						System.out.println(description);
						System.out.println(picUrl);
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
	/**
	 * @param args
	 */
	public static void main(String[] args) {
	    new Test().test();

	}

}
