package com.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.pojo.pojo;

public class dao {

	
					/*-----  CONNECTION  -----*/
	public static Connection getconn() {
		
		Connection cn =null;
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			cn = DriverManager.getConnection("jdbc:mysql://localhost/java1","root","");
		} catch (ClassNotFoundException | SQLException e) {
			System.out.println("Class not found." + e);
		}
		
		
		return cn;
		
	}
	
					/*----- DATA INSERT   -----*/
	
	public static int dataInsert(pojo p) {
		
		int status = 0;
		
	    Connection	cn = getconn();
		
		String Insert = "INSERT into crud (name,email,password) values (?,?,?)";
		
		try {
			PreparedStatement ps = cn.prepareStatement(Insert);
			
			ps.setString(1, p.getName());
			ps.setString(2, p.getEmail());
			ps.setString(3, p.getPassword());
			
			status = ps.executeUpdate();
			
			if(status > 0)
			{
				System.out.println("Data Inserted");
			}
			
		} catch (SQLException e) {
			System.out.println("Statement not found");
		}
		
		
		return status;
		
	}
	
	
	
					/*-----  DATA DELETE  -----*/
	
	
	public static int dataDelete(pojo p) {
		int status = 0;
		
		Connection cn = getconn();
		
		String delete = "DELETE from crud where rid = ? ";
		
		try {
			PreparedStatement ps = cn.prepareStatement(delete);
			
			ps.setInt(1, p.getRid());

			status = ps.executeUpdate();
			
			if(status > 0)
			{
				System.out.println("Data Deleted");
			}
			
			
		} catch (SQLException e) {
			System.out.println("Statement not found.");
			}
		
		return status;
		
	}
	
					/*-----  DATA UPDATE  -----*/
	
	
	public static int dataUpdate(pojo p) {
 	   
 	   int status= 0;
 	   
 	   Connection cn=getconn();
 	   
String update= "update crud set name=?,email=?,password=? where rid=?";


try {
	PreparedStatement ps = cn.prepareStatement(update);
	
	 ps.setString(1, p.getName());
	 ps.setString(2, p.getEmail());
	 ps.setString(3, p.getPassword());
	 ps.setInt(4, p.getRid());
	 
	status=    ps.executeUpdate();
	
	 if(status > 0) {
		 
		     System.out.println("data update");
	 }
	 
} catch (Exception e) {

	  System.out.println("data not updated");
}
 	    
		return status;
 	   
 	   
    } 
	
	
	
	
	
	
	
	
	
	
					/*-----  SINGLE DATA FETCH BY ID  -----*/
	
				public static pojo getdatafetchbyid(int rid) {
	        	
						pojo p=null;
	        	
	        	 Connection cn = getconn();
	 	    	
		    	 String dfetch1 = "select * from crud where rid=?";
	        	
	        	
		    	 try {

						PreparedStatement ps = cn.prepareStatement(dfetch1);
						
						 ps.setInt(1, rid);
						ResultSet rs= ps.executeQuery();

						while (rs.next()) {
							
							 p= new pojo();
							 
							 p.setRid(rs.getInt("rid"));
							 p.setName(rs.getString("name"));
							 p.setEmail(rs.getString("email"));
							 p.setPassword(rs.getString("password"));
							 
							
						}
					} catch (Exception e) {
						
						System.out.println("single data not fetch");
					}
			    	 
	        	
				
				return p;
	        	
	        	
	        	
	        	
	        }
	
					/*-----  DATA STORE IN LIST  -----*/
	
	
	public static  List<pojo> getalldata() {
		
		List<pojo> p = new ArrayList<pojo>();
		
		Connection cn = getconn();
		
		String dfetch = "SELECT * from crud";
		
		try {
			Statement st = cn.createStatement();
			
			ResultSet rs = st.executeQuery(dfetch);
			
			while(rs.next())
			{
				pojo p1 = new pojo();
				p1.setRid(rs.getInt("rid"));
				p1.setName(rs.getString("name"));
				p1.setEmail(rs.getString("email"));
				p1.setPassword(rs.getString("password"));
				
				
				p.add(p1);
				
			}
		} catch (SQLException e) {
			System.out.println("Statement not found.");
		}
		
		
		return p;
		
		
		
	}
	
}
