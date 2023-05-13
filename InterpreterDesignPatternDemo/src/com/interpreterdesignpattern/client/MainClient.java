package com.interpreterdesignpattern.client;

import com.interpreterdesignpattern.expression.PermissionExpression;
import com.interpreterdesignpattern.pojo.Report;
import com.interpreterdesignpattern.pojo.User;
import com.interpreterdesignpattern.syntaxtree.ExpressionBuilder;

public class MainClient {
	public static void main(String args[])
	{
		Report report1 = new Report("CashFlow Report", "DIRECTOR OR FINANCE_ADMIN");
		
		ExpressionBuilder expressionBuilder = new ExpressionBuilder();
		
		PermissionExpression perm=expressionBuilder.build(report1);
		
		System.out.println(perm);
		
		User user1 = new User("suman", "USER","DIRECTOR");
		
		System.out.println("User access report : "+perm.interpret(user1));
	}

}
