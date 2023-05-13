package com.interpreterdesignpattern.expression;

import com.interpreterdesignpattern.pojo.User;

/**
 * 
 * @author ciphe
 * 
 * Terminal Expression 
 *
 */
public class Permission implements PermissionExpression{
	
	private String permission;
	
	

	public Permission(String permission) {
		super();
		this.permission = permission.toLowerCase();
	}



	@Override
	public boolean interpret(User user) {
		return user.getPermissions().contains(permission);
	}



	@Override
	public String toString() {
		return "Permission [permission=" + permission + "]";
	}
	
	

}
