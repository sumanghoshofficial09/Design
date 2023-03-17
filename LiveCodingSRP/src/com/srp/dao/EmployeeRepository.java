package com.srp.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

import com.srp.nonviolation.EmployeeNonViolatingSRP;
import com.srp.util.Myutil;

/*
 * 
 * 
 * this hold the srp principle 
 * 
 * as this class has one and only one reason to change 
 */

public class EmployeeRepository {
	
	public void save(EmployeeNonViolatingSRP emp)
	{
		
		String objectString = Myutil.serializeIntoString(emp);
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


}
