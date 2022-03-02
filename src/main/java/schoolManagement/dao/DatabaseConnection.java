package schoolManagement.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DatabaseConnection {
	public Connection MysqlDbConnection()
	{
	Connection conn=null;
	
	String databaseUrl="jdbc:mysql://localhost:3306/school_management";
	String userName="root";
	String userPassword="mysql";
	
		try {
			conn=DriverManager.getConnection(databaseUrl, userName, userPassword);
			
				if (conn != null) {
					System.out.println();

			}
			}
		
		
		catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return conn;

}
}