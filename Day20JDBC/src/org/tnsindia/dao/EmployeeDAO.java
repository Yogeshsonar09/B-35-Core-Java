
package org.tnsindia.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class EmployeeDAO {
	
	/*making a connection between Java and Database */
	public Connection createConnection()
	{
		
		String url="jdbc:mysql://127.0.0.1:3306/b35";
		String user="root";
		String password="Yog@091521";
		
		/*if Driver class is not there ,then it will throw an exception
		 * and that exception we are handling here with the help of catch block*/
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			System.out.println("Class Not Found");
		}
		
		Connection c;
		
		try {
			c=DriverManager.getConnection(url,user,password);
		} catch (SQLException e) {
			System.out.println("Kindly check the URL/USER/PASSWORD");
			c=null;

		}
		return c;
		
	}

}