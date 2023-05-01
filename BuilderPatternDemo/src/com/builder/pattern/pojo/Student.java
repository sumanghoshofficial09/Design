package com.builder.pattern.pojo;

import java.net.Inet4Address;
import java.util.HashMap;

public class Student {
	
	
	


	private String name;
	private int roll;
	private HashMap<String,Integer> marks= new HashMap<>();
	private int cgpa;
	private Adrress address;
	private Department department;
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getRoll() {
		return roll;
	}
	private void setRoll(int roll) {
		this.roll = roll;
	}
	public HashMap<String, Integer> getMarks() {
		return marks;
	}
	private void setMarks(HashMap<String, Integer> marks) {
		this.marks = marks;
	}
	public int getCgpa() {
		return cgpa;
	}
	private void setCgpa(int cgpa) {
		this.cgpa = cgpa;
	}
	public Adrress getAddress() {
		return address;
	}
	private void setAddress(Adrress address) {
		this.address = address;
	}
	public Department getDepartment() {
		return department;
	}
	private void setDepartment(Department department) {
		this.department = department;
	}
	
	@Override
	public String toString() {
		return "Student [name=" + name + ", roll=" + roll + ", marks=" + marks + ", cgpa=" + cgpa + ", address="
				+ address + ", department=" + department + "]";
	}

	
	
	
	public static class StudentBuilder
	{
		
		private String fname;
		private String lname;
		private int roll;
		
		private int marksInMaths;
		
		private int marksInPhysics;
		
		private int marksinChemistry;
		
		private String flatNo;
		private String area;
		private String postoffice;
		private String city;
		private int pincode;
		
		private int deptId;
		private String deptName;
		
		
		
		
		public String getFname() {
			return fname;
		}

		public String getLname() {
			return lname;
		}

		public int getRoll() {
			return roll;
		}

		public int getMarksInMaths() {
			return marksInMaths;
		}

		public int getMarksInPhysics() {
			return marksInPhysics;
		}

		public int getMarksinChemistry() {
			return marksinChemistry;
		}

		public String getFlatNo() {
			return flatNo;
		}

		public String getArea() {
			return area;
		}

		public String getPostoffice() {
			return postoffice;
		}

		public String getCity() {
			return city;
		}

		public int getPincode() {
			return pincode;
		}

		public int getDeptId() {
			return deptId;
		}

		public String getDeptName() {
			return deptName;
		}

		public StudentBuilder withFirstName(String fname)
		{
			this.fname=fname;
			
			return this ;
		}
		
		public StudentBuilder withLastName(String lname)
		{
			this.lname=fname;
			
			return this ;
		}
		
		public StudentBuilder withRoll(int roll)
		{
			this.roll=roll;
			return this;
			
		}
		
		
		public StudentBuilder withMarksInMaths(int mathMarks)
		{
			this.marksInMaths=mathMarks;
			return this;
		}
		
		public StudentBuilder withMarksInPhysics(int physicsMarks)
		{
			this.marksInPhysics=physicsMarks;
			
			return this;
		}
		
		public StudentBuilder withMarksInChemistry(int chemistryMarks)
		{
			this.marksinChemistry=chemistryMarks;
			
			return this;
		}
		
		public StudentBuilder withFlatNo(String flatNo)
		{
			this.flatNo=flatNo;
			
			return this;
		}
		
		
		public StudentBuilder withArea(String area)
		{
			this.area=area;
			
			return this;
		}
		
		
		public StudentBuilder withPostOffice(String postOffice)
		{
			this.postoffice=postOffice;
			
			return this;
		}
		
		public StudentBuilder withCity(String city)
		{
			this.city=city;
			
			return this;
		}
		
		public StudentBuilder withPinCode(int pin)
		{
			this.pincode=pin;
			return this;
		}
		
		public StudentBuilder withDeptId(int did)
		{
			this.deptId=did;
			
			return this;
		}
		
		
		public StudentBuilder withDeptName(String deptName)
		{
			this.deptName=deptName;
			
			return this;
		}
		
		
		public Student build()
		{
			Department dept = new Department(this.getDeptId(), this.getDeptName());
			
			Adrress address = new Adrress(this.getFlatNo(), this.getArea(), this.getPostoffice(), this.getCity(), this.getPincode());
			
			Student student = new Student();
			
			student.setAddress(address);
			student.setDepartment(dept);
			HashMap<String,Integer> marks = new HashMap<String,Integer>();
			marks.put("Maths", this.getMarksInMaths());
			marks.put("Physics", this.getMarksInPhysics());
			marks.put("Chemistry", this.getMarksinChemistry());
			student.setMarks(marks);
			int cgpa = (getMarksinChemistry()+getMarksInMaths()+getMarksInPhysics())/3;
			
			student.setCgpa(cgpa);
			student.setName(this.getFname()+" "+this.getLname());
			
			student.setRoll(this.getRoll());
			
			return student;
			
		}
		
		public static StudentBuilder  getStudentBuilder()
		{
			return new StudentBuilder();
		}
		
		
		
		
		
	}
	

}
