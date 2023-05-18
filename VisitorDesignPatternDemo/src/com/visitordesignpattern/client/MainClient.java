package com.visitordesignpattern.client;

import com.visitordesignpattern.pojo.Employee;
import com.visitordesignpattern.pojo.Manager;
import com.visitordesignpattern.pojo.Programmer;
import com.visitordesignpattern.pojo.ProjectLead;
import com.visitordesignpattern.pojo.VicePresident;
import com.visitordesignpattern.visitor.PrintVisitor;
import com.visitordesignpattern.visitor.Visitor;

public class MainClient {
	
	public static void main(String args[])
	{
		Employee employees  = buildOrganization();
		
		PrintVisitor  visitor  = new  PrintVisitor();
		
		
		visitOrgStruc(employees, visitor);
		
		
	}
	
	public static Employee buildOrganization()
	{
		
		Programmer p1 = new Programmer("Rachel","C++");
		Programmer p2 = new Programmer("Andy","Java");
		
		Programmer p3 = new Programmer("Josh","C#");
		Programmer p4 = new Programmer("Bill","C++");
		
		ProjectLead pl1 = new ProjectLead("Tina", p1, p2);
		ProjectLead pl2 = new ProjectLead("Joey", p3, p4);
		
		Manager m1 = new Manager("Chad", pl1);
		Manager m2 = new Manager("Chad II", pl2);
		
		VicePresident vp = new VicePresident("Richard", m1,m2);
		
		return vp;
		
	}
	
	private static void  visitOrgStruc(Employee emp , Visitor visitor)
	{
		emp.accept(visitor);
		
		emp.getDirectReports().forEach(e->  visitOrgStruc(e, visitor));
	}

}
