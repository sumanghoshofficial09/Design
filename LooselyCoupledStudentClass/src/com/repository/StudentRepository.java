package com.repository;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

import com.pojo.Myutil;
import com.pojo.Student;

public class StudentRepository {
	
	public void save(Student student)
	{
		
		String objectString = Myutil.serializeIntoString(student);
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
