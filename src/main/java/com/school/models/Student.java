package com.school.models;

public class Student {
	
	int StudentId;
	String spassword;
	String sname;
	String sgender;
	String sParentsName;
	String sadress;
	String sparentsno;
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	public int getStudentId() {
		return StudentId;
	}
	public void setStudentId(int studentId) {
		StudentId = studentId;
	}
	public String getSpassword() {
		return spassword;
	}
	public void setSpassword(String spassword) {
		this.spassword = spassword;
	}
	public String getSname() {
		return sname;
	}
	public void setSname(String sname) {
		this.sname = sname;
	}
	public String getSgender() {
		return sgender;
	}
	public void setSgender(String sgender) {
		this.sgender = sgender;
	}
	public String getsParentsName() {
		return sParentsName;
	}
	public void setsParentsName(String sParentsName) {
		this.sParentsName = sParentsName;
	}
	public String getSadress() {
		return sadress;
	}
	public void setSadress(String sadress) {
		this.sadress = sadress;
	}
	public String getSparentsno() {
		return sparentsno;
	}
	public void setSparentsno(String sparentsno) {
		this.sparentsno = sparentsno;
	}
	public Student(int studentId, String spassword, String sname, String sgender, String sParentsName, String sadress,
			String sparentsno) {
		super();
		StudentId = studentId;
		this.spassword = spassword;
		this.sname = sname;
		this.sgender = sgender;
		this.sParentsName = sParentsName;
		this.sadress = sadress;
		this.sparentsno = sparentsno;
	}
	

}
