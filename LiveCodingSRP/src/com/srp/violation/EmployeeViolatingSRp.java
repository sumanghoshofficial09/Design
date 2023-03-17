package com.srp.violation;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

/*
 * 
 * 
 * please note down the reason to change for the class 
 * 
 *  reason 1 : employee related information 
 *  
 *  reason 2 :   tax related method to change 
 *  
 *  reson 3 : database related save method to change 
 *  what we can do here we can take the reason 2 and reason 3 out of this class 
 *  to separate class 
 *   becuase we need to abide by SRP which is saying classes must have only one reasont to change 
 *   
 *   this is violating SRP
 *  
 */

public class EmployeeViolatingSRp {
	
	private String employeId;
	private String employeeName;
	private String employeeAddress;
	private String contactNumber;
	private String employeeType;
	
	
	
	
	
	public String getEmployeId() {
		return employeId;
	}





	public void setEmployeId(String employeId) {
		this.employeId = employeId;
	}





	public String getEmployeeName() {
		return employeeName;
	}





	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}





	public String getEmployeeAddress() {
		return employeeAddress;
	}





	public void setEmployeeAddress(String employeeAddress) {
		this.employeeAddress = employeeAddress;
	}





	public String getContactNumber() {
		return contactNumber;
	}





	public void setContactNumber(String contactNumber) {
		this.contactNumber = contactNumber;
	}





	public String getEmployeeType() {
		return employeeType;
	}





	public void setEmployeeType(String employeeType) {
		this.employeeType = employeeType;
	}



	
	public void save()
	{
		
		String objectString = Myutil.serializeIntoString(this);
		Connection connection=null;
		Statement statement=null;
		
		try
		{
			
			Class.forName("com.sql.jdbc.Driver");
			connection=DriverManager.getConnection("jdbc:mysql://localhost:3386/MyDB","root,", "password");
			statement = connection.createStatement();
			statement.execute("insert into student values ("+objectString+")");
			
			
			
		}
		catch(Exception e )
		{
			e.printStackTrace();
		}
		
	}


	private void calculateTax()
	{
		if(this.getEmployeeType().equals("fulltime "))
		{
			System.out.println("full time employee tax");
		}
		if(this.getEmployeeType().equals("part time "))
		{
			System.out.println("part time employee tax");
		}
		
	}
	
}
