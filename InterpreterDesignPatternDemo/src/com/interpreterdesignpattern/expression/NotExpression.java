package com.interpreterdesignpattern.expression;

import com.interpreterdesignpattern.pojo.User;

/**
 * 
 * @author ciphe
 * Non terminal expression
 * 
 *
 */
public class NotExpression implements PermissionExpression {
	private PermissionExpression permissionExpression1;
	
	
	public NotExpression(PermissionExpression permissionExpression1) {
		super();
		this.permissionExpression1 = permissionExpression1;
		
	}

	@Override
	public boolean interpret(User user) {
		return ! permissionExpression1.interpret(user) ;
	}

	@Override
	public String toString() {
		return "NotExpression [permissionExpression1=" + permissionExpression1+"";
	}
	
	
	
	

}
