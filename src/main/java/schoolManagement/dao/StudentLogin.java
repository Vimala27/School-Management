package schoolManagement.dao;

 import java.sql.Connection;
 import java.sql.PreparedStatement; 
 import java.sql.ResultSet; 
 import java.sql.SQLException;
 
 public class StudentLogin
 { 
	 DatabaseConnection obj = new DatabaseConnection(); 
	 Connection connect = obj.MysqlDbConnection(); 
	 public boolean studentlogin(int StudentId, String spassword ) throws SQLException
	 { 
		 PreparedStatement ps = connect.prepareStatement("select * from student_details where StudentId=? && spassword=?");
		 ps.setInt(1, StudentId);
		 ps.setString(2,spassword ); 
		 ResultSet result = ps.executeQuery(); 
		 if(result.next())
		 { 
			 return true;
			 } 
		 else{
			 return false; 
			 } }
	 
public boolean insertstudentdetails( int SId ,String password,String sname,String sgender,String sparentsName,String saddress,int spphoneno ) throws SQLException
{ 
	PreparedStatement ps = connect.prepareStatement("insert into student_details values (?,?,?,?,?,?,?)"); 
	ps.setInt(1, SId);
	ps.setString(2, password); 
	ps.setString(3,sname); 
	ps.setString(4, sgender);
	ps.setString(5,  sparentsName); 
	ps.setString(6, saddress);
	ps.setInt(7, spphoneno );
	int affectedRows=ps.executeUpdate();
	if(affectedRows>0) 
		return true; 
	else return false;
	}
public ResultSet studentDetails(int sid) throws SQLException
{ 
	PreparedStatement ps = connect.prepareStatement("select * from student_details where StudentId=?"); 
	ps.setInt(1,sid); 
	ResultSet result = ps.executeQuery(); 
	return result;
	} 

public boolean studentlogout() throws SQLException
{ 
	connect.close(); 
	return true; } }
 