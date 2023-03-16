import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.util.Date;

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

}
