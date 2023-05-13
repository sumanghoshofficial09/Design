package com.interpreterdesignpattern.expression;

import com.interpreterdesignpattern.pojo.User;

public interface PermissionExpression {
	
	boolean interpret(User user);

}
