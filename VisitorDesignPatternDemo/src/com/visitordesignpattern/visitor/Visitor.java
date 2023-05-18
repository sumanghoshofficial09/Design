package com.visitordesignpattern.visitor;

import com.visitordesignpattern.pojo.Manager;
import com.visitordesignpattern.pojo.Programmer;
import com.visitordesignpattern.pojo.ProjectLead;
import com.visitordesignpattern.pojo.VicePresident;

public interface Visitor {
	
	void visit(Programmer programmer);
	
	void visit(ProjectLead projectLead);
	
	void visit(Manager manager);
	
	void visit(VicePresident vicePresident);

}
