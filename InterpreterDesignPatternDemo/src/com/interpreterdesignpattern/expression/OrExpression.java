package com.interpreterdesignpattern.expression;

import com.interpreterdesignpattern.pojo.User;

/**
 * 
 * @author ciphe
 * Non terminal expression
 * 
 *
 */
public class OrExpression implements PermissionExpression {
	private PermissionExpression permissionExpression1;
	private PermissionExpression permissionExpression2;
	
	public OrExpression(PermissionExpression permissionExpression1, PermissionExpression permissionExpression2) {
		super();
		this.permissionExpression1 = permissionExpression1;
		this.permissionExpression2 = permissionExpression2;
	}

	@Override
	public boolean interpret(User user) {
		return permissionExpression1.interpret(user) || permissionExpression2.interpret(user);
	}

	@Override
	public String toString() {
		return "OrExpression [permissionExpression1=" + permissionExpression1 + ", permissionExpression2="
				+ permissionExpression2 + "]";
	}
	
	
	
	

}
