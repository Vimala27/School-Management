package com.school.models;

public class Teacher {
	
	int teach_Id;
	String password;
	String Name;
	String gender;
	String address;
	Long phoneNo;
	
	public Teacher() {
		super();
		// TODO Auto-generated constructor stub
	}
	public int getTeach_Id() {
		return teach_Id;
	}
	public void setTeach_Id(int teach_Id) {
		this.teach_Id = teach_Id;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public Long getPhoneNo() {
		return phoneNo;
	}
	public void setPhoneNo(Long phoneNo) {
		this.phoneNo = phoneNo;
	}
	public Teacher(int teach_Id, String password, String name, String gender, String address, Long phoneNo) {
		super();
		this.teach_Id = teach_Id;
		this.password = password;
		Name = name;
		this.gender = gender;
		this.address = address;
		this.phoneNo = phoneNo;
	}
	

}
