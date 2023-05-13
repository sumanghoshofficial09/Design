package com.interpreterdesignpattern.syntaxtree;

import java.beans.PersistenceDelegate;
import java.util.Stack;
import java.util.StringTokenizer;

import javax.management.PersistentMBean;

import com.interpreterdesignpattern.expression.AndExpression;
import com.interpreterdesignpattern.expression.NotExpression;
import com.interpreterdesignpattern.expression.OrExpression;
import com.interpreterdesignpattern.expression.Permission;
import com.interpreterdesignpattern.expression.PermissionExpression;
import com.interpreterdesignpattern.pojo.Report;
import com.interpreterdesignpattern.pojo.User;

/**
 * 
 * @author ciphe
 * 
 * Build the syntax tree
 *
 */
public class ExpressionBuilder {
	
	private Stack<PermissionExpression>  permissions = new Stack();
	
	private Stack<String> operators = new Stack();
	
	public PermissionExpression build(Report report)
	{
		parse(report.getPermission());
		buildExpressions();
		
		if(permissions.size()>1 || !operators.isEmpty())
		{
			System.out.println("ERROR");
		}
		
		return permissions.pop();
	}

	private void parse(String permission) {
		StringTokenizer stringTokenizer= new StringTokenizer(permission.toLowerCase());
		while(stringTokenizer.hasMoreTokens())
		{
			String token;
			
			switch(token=stringTokenizer.nextToken())
			{
			case "and" :
				operators.push("and");
				break;
			case "or" :
				operators.push("or");
				break;
			case "not" :
				operators.push("not");
				break;
			default :
				permissions.push(new Permission(token));
				break;
			}
			
		}
		
		
		
	}
	
	private void buildExpressions()
	{
		
		while(!operators.isEmpty())
		{
			String operator=operators.pop();
			
			PermissionExpression perm1;
			
			PermissionExpression perm2;
			
			PermissionExpression exp;
			
			switch(operator)
			{
			case "not" :
				perm1=permissions.pop();
				exp = new NotExpression(perm1);
				break;
				
			case "and" :
				perm1=permissions.pop();
				perm2=permissions.pop();
				exp = new AndExpression(perm1,perm2);
				break;
			case "or" :
				perm1=permissions.pop();
				perm2=permissions.pop();
				exp = new OrExpression(perm1,perm2);
				break;
			default :
				throw new IllegalArgumentException("Unknown operator "+operator);
				
			
			}
			permissions.push(exp);
			
			
		}
		
	}

}
