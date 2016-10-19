/**
 * 
 */
package com.gmail.murithi.mugambi.dennis.persistence;

/**
 * @author peter
 *
 */
public class GenericDAO {
	
	protected DButils dbutils;

	/**
	 * 
	 */
	public GenericDAO(String name,String username,String host,String password,int port) {
		dbutils = new DButils(name,username,host,password,port);
	}

}
