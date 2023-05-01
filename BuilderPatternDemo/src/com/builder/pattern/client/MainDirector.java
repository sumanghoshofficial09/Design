package com.builder.pattern.client;

import com.builder.pattern.pojo.Student;
import com.builder.pattern.pojo.Student.StudentBuilder;

public class MainDirector {
	
	public static void main(String args[])
	{
		StudentBuilder  builder = StudentBuilder.getStudentBuilder();
		
		Student std=builder.withFirstName("Suman")
			   .withLastName("Ghosh")
			   .withRoll(61)
			   .withMarksInMaths(7)
			   .withMarksInChemistry(8)
			   .withMarksInPhysics(9)
			   .withFlatNo("34r")
			   .withArea("sarjapur")
			   .withCity("bangalore")
			   .withPostOffice("East Bangalore")
			   .withPinCode(560045)
			   .withDeptId(12)
			   .withDeptName("CSE")
			   .build();
		
		System.out.println(std);
			   
	}

}
