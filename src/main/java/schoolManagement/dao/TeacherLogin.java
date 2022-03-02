package schoolManagement.dao;

 import java.sql.Connection;
 import java.sql.PreparedStatement; 
 import java.sql.ResultSet; 
 import java.sql.SQLException;
 
 public class TeacherLogin 
 
 { 
	 DatabaseConnection obj = new DatabaseConnection(); 
	 Connection connect = obj.MysqlDbConnection(); 
 public boolean login(int TeacID, String Tpass) throws SQLException
 { 
	 PreparedStatement ps = connect.prepareStatement("select * from teacher_Details where teach_Id=? && password=?");
	 ps.setInt(1,TeacID); 
	 ps.setString(2,Tpass);
	 ResultSet result = ps.executeQuery();
	 if(result.next())
	 { 
		 return true;
		 } 
	 else{
		 return false;
		 } }
 public boolean insertTeacherdetails( int empId,String password,String name,String gender,String address,long number) throws SQLException
 {
	 PreparedStatement ps = connect.prepareStatement("insert into teacher_Details values (?,?,?,?,?,?)"); 

	 ps.setInt(1, empId); 
 ps.setString(2, password); 
 ps.setString(3,name); 
 ps.setString(4,gender); 
 ps.setString(5, address); 
 ps.setLong(6,number);
 int affectedRows=ps.executeUpdate();
 if(affectedRows>0) 
	 return true; 
 else 
	 return false; 
 } 
 public void Viewteachertable() throws SQLException {
		PreparedStatement ps=connect.prepareStatement("select * from teacher_details");
		ResultSet rs=ps.executeQuery();
		System.out.println("emp_id"+"  "+"Password"+"  "+"name"+"  "+"phoneNo");
		
		while(rs.next())
			System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getString(3)+" "+rs.getLong(6));
	}

 public boolean DeleteTeacherdetails(int teach_Id) throws SQLException
 { 
	 PreparedStatement ps = connect.prepareStatement("delete from teacher_Details where teach_Id=?");
 ps.setInt(1, teach_Id); 
 int affectedRows = ps.executeUpdate();
 if(affectedRows>0)
	 return true;
 else 
	 return false; 
 } 
 public boolean logout() throws SQLException
 { 
	 connect.close(); 
	 return true;
	 } }
