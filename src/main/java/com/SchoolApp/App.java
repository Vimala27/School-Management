package com.SchoolApp;

 import java.sql.ResultSet; 
 import java.util.Scanner;

import schoolManagement.dao.StudentLogin;
import schoolManagement.dao.TeacherLogin;  
 public class App 
 { public static void main(String[] args)
 { 
	 boolean status = true;
	 try{
		 do
		 { 
			 Scanner scan = new Scanner(System.in); 
			 System.out.println("*********************************************************************"); 
			 System.out.println(" Welcome to THERESA School!!!"); 
			 System.out.println("*********************************************************************");
			 System.out.println(" "); 
			 System.out.println(" TEACHER LOGIN - Press 1"); 
			 System.out.println(" STUDENTS LOGIN - Press 2"); 
			 System.out.println(" Kindly select your option....."); 
			 System.out.println("*********************************************************************");
			 int Logintype = scan.nextInt();
			 if(Logintype==1)
			 { 
				 System.out.println("Enter Teacher Login ID..."); 
				 int TeacID=scan.nextInt();
				 System.out.println("Enter Access Password..."); 
				 String Tpass = scan.next(); 
				 TeacherLogin obj=new TeacherLogin();
				 if(obj.login(TeacID,Tpass))
				 { 
					 System.out.println("***********************************************************************");
			 System.out.println(" Login Sucessfuly!!!");
			 System.out.println("***********************************************************************"); 
			 System.out.println(" Insert details - Press 1\r\n" + " View Details - Press 2 \r\n" + " Delete details - Press 3\r \n" +    " Logout - Press 5"); 
			 int option = scan.nextInt(); 
			 if(option==1)
			 {
				 System.out.println("Enter your empId"); 
				 int empId = scan.nextInt(); 
				 System.out.println("Enter Your password"); 
				 String password = scan.next(); 
				 System.out.println("Enter your name"); 
				 String name = scan.next(); 
				 System.out.println("gender");
				 String gender = scan.next();
				 System.out.println("Enter your address"); 
				 String address = scan.next();
				 System.out.println("Enter your contact number");
				 Long number = scan.nextLong(); 
				 if(obj.insertTeacherdetails(empId, password, name, gender, address,number ))
				 {
					 System.out.println("*********************************************************");
					 System.out.println(" Details inserted successfully!!");
					 System.out.println("*********************************************************");
					 }
				 else{ 
					 System.out.println("*********************************************************");
					 System.out.println(" Issue occured....insert again"); 
					 System.out.println("*********************************************************");
					 } } 
			 else if(option==2)
			 { 
				 obj.Viewteachertable();
			 } 
			 else if(option==3)
			 { 
				 System.out.println("Enter your id to delete  details"); 
				 int teach_Id = scan.nextInt(); 
				 if(obj.DeleteTeacherdetails(teach_Id))
				
					 System.out.println("Your details has been deleted..."); 
					 
				 else{ System.out.println("Problem occurred in deleting process....."); 
				 } }
			 
			 
			 else if(option==5)
			 {
				 if(obj.logout())
				 { 
					 status= false; 
					 System.out.println("************************************************************"); 
					 System.out.println(" Logout sucessfully!!!!"); 
					 System.out.println("************************************************************"); 
					 } } } 
				 else
				 {
					 System.out.println("**************************************************************");
					 System.out.println(" Login failed...."); 
					 System.out.println("**************************************************************");
					 } } 
			 else if(Logintype==2)
			 { 
				 System.out.println("Enter Student Login ID...");
				 int StudentId = scan.nextInt(); 
				 System.out.println("Enter Access Password..."); 
				 String Spassword = scan.next(); 
				 StudentLogin obj = new StudentLogin(); 
				 if(obj.studentlogin(StudentId,Spassword))
				 { 
					 System.out.println("***********************************************************************");
					 System.out.println(" Login Sucessfuly!!!");
					 System.out.println("***********************************************************************"); 
					 System.out.println(" Insert details - Press 1\n" + " View Details - Press 2 \n" + " Delete details - Press 3 \n" + " Check Fee - Press 4 \n" + " Logout - Press 5");
					 int option = scan.nextInt(); 
					 if(option==1)
					 { 
						 System.out.println("Enter your  id..."); 
						 int SId=scan.nextInt();
					 System.out.println("Enter Your password");
					 String spassword= scan.next(); 
					 System.out.println("Enter your name "); 
					 String sname = scan.next(); 
					 System.out.println(" Enter your gender"); 
					 String sgender= scan.next(); 
					 System.out.println("Enter your parentsName"); 
					 String sparentsName = scan.next(); 
					 System.out.println("Enter your address");
					 String saddress  = scan.next(); 
					 System.out.println("Enter your phoneno");
					 int spphoneno  = scan.nextInt(); 
					 
					 if(obj.insertstudentdetails(SId,spassword,sname,sgender,sparentsName,saddress, spphoneno ))
					 { 
						 System.out.println("*********************************************************"); 
						 System.out.println(" Details inserted successfully!!");
						 System.out.println("*********************************************************");
						 } 
					 else{ 
						 System.out.println("*********************************************************"); 
						 System.out.println(" Issue occured....insert again"); 
						 System.out.println("*********************************************************");
						 } } 
					 else if(option==2)
					 { 
						 System.out.println("Enter your id"); 
						int sid = scan.nextInt();
						 ResultSet result= obj.studentDetails(sid); 
						 while(result.next())
						 {
							 System.out.println("***************************************************************");
							 System.out.println(" Student Details");
							 System.out.println("***************************************************************");
							 System.out.println("name :"+ result.getString(3));
							 System.out.println("sgender :"+result.getString(4)); 
							 System.out.println("sparentsname :"+result.getString(5));
							 System.out.println("sAddress :"+result.getString(6)); 
							 System.out.println("ps2Number :"+result.getString(7));
							 } }

else if(option==4)
{ 
	System.out.println("Standard wise student fees..\n" + "Enter your position and check your fee structure\n " + "Press 1 - Nursery\n" + "Press 2 - Primar\n" + "Press 3 - High School\n" + "Press 4 - Higher Secondary School"); 
	int feesStructure = scan.nextInt(); 
	switch(feesStructure)
	{
	case 1 : System.out.println("10K"); 
	break;
	case 2 : System.out.println("15K"); 
	break;
	case 3 : System.out.println("20K");
	break;
	case 4 : System.out.println("25K"); 
	break; 
	default: System.out.println("Invalid input...");
	} } 
else if(option==5)
{
	if(obj.studentlogout())
	{ 
		status= false; 
		System.out.println("************************************************************");
		System.out.println(" Logout sucessfully!!!!"); 
		System.out.println("************************************************************"); 
		} } } 
				 else{ 
					 System.out.println("**************************************************************"); 
					 System.out.println(" Login failed...."); 
					 System.out.println("**************************************************************"); 
					 } } 
			 else{
				 System.out.println("*************************************************************************"); 
				 System.out.println(" Invalid ID or Password............."); 
				 System.out.println("*************************************************************************");
				 } } 
		 while(status);
		 } 
	 catch(Exception e)
	 { 
		 System.out.println(e.getMessage());
		 } } }
 
