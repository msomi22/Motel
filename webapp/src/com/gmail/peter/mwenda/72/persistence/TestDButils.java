/**
 * 
 */
package com.gmail.murithi.mugambi.dennis.persistence;

import java.sql.Connection;

import org.junit.Test;

/**
 * @author peter
 *
 */
public class TestDButils {
	
	protected DButils dbutils;

	/**
	 * Test method for {@link peter.practice.DButils#getJdbcConection()}.
	 */
	@Test
	public void testGetJdbcConection() {
		System.out.println("connection test"); 
		dbutils = new DButils("hoteldb","hotel","localhost","hotel12345",5432); 
		Connection con;
		con = dbutils.getJdbcConection();
		System.out.println("Connection is: " + con);
	}

}
