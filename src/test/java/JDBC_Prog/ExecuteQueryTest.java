package JDBC_Prog;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import org.testng.annotations.Test;

import com.mysql.cj.jdbc.Driver;

public class ExecuteQueryTest {
	
	@Test
	public void executeQueryTest() throws Throwable {
		
//		Register the database
		Driver dref = new Driver();
		DriverManager.registerDriver(dref);
		
//		Connect to the database
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/students", "root", "root");
		
//		Create Statement
		Statement stmt = con.createStatement();	
		
//		Execute my query and will get the data
		ResultSet res = stmt.executeQuery("select * from students_info;");
		
		while(res.next())
		{
			System.out.println(res.getInt(1)+"\t"+res.getString(2)+"\t"+res.getString(3));
		}
		
//		Close the connection
		con.close();
		
	}

}
