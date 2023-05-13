package com.interpreterdesignpattern.pojo;

/**
 * 
 * @author ciphe
 * 
 * we are giving access to this report based on permission
 * 
 * each report object has a permission expression attached to it 
 *
 */
public class Report {
	
	private String name;
	
	private String permission;
	
	public Report(String name,String permission)
	{
		this.name =name;
		this.permission=permission;
	}

	public String getName() {
		return name;
	}

	

	public String getPermission() {
		return permission;
	}


	
	
}
