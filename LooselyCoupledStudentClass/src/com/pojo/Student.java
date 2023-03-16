package com.pojo;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.util.Date;

import com.repository.StudentRepository;

/**
 * 
 * 
 * @author ciphe
 * 
 * if you change the under line database student class need not to change 
 *
 */
public class Student {
	
	private String studentId;
	private Date studentDob;
	private String address;
	
	
	public String getStudentId() {
		return studentId;
	}


	public void setStudentId(String studentId) {
		this.studentId = studentId;
	}


	public Date getStudentDob() {
		return studentDob;
	}


	public void setStudentDob(Date studentDob) {
		this.studentDob = studentDob;
	}


	public String getAddress() {
		return address;
	}


	public void setAddress(String address) {
		this.address = address;
	}
	
	public void save()
	{
		new StudentRepository().save(this);
	}



	}


