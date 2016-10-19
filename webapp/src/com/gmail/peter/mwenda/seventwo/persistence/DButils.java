/**
 * 
 */
package com.gmail.peter.mwenda.seventwo.persistence;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 * @author peter
 *
 */
public class DButils {
	
	private String dbname;
	private String dbusername;
	private String dbhost;
	private String dbpassword;
	private int dbport;
	
	public DButils(){
		this.dbname = "hoteldb";
		this.dbusername = "hotel";
		this.dbhost = "localhost";
		this.dbpassword = "hotel12345";
		this.dbport = 5432;
	}
	
	/**
	 * 
	 */
	public DButils(String name,String username,String host,String password,int port) {
		this.dbname = name;
		this.dbusername = username;
		this.dbhost = host;
		this.dbpassword = password;
		this.dbport = port;
	}
	
	
   public Connection getJdbcConection(){
	   Connection con = null;
	   String dbURL;
	     dbURL = "jdbc:postgresql://" + dbhost + ":" + dbport + "/" + dbname;//host,port,database
	     try{
	    	 Class.forName("org.postgresql.Driver");
	         con = DriverManager.getConnection(dbURL,dbusername,dbpassword); 
	         con.close();
	     }catch(SQLException e){
	    	 
	     }catch(ClassNotFoundException e){
	    	 
	     }
	   return con;
   }
   
}
