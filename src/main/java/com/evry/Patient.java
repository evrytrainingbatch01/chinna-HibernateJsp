 package com.evry;
 
public class Patient {

	private String pname;
	private int age;
	private String bgroup;
	private String checkup;
	private String doctors;
	private String tcase;
	public Patient() {
		super();
	}
	public Patient(String pname, int age, String bgroup, String checkup, String doctors, String tcase) {
		super();
		this.pname = pname;
		this.age = age;
		this.bgroup = bgroup;
		this.checkup = checkup;
		this.doctors = doctors;
		this.tcase = tcase;
	}
	public String getPname() {
		return pname;
	}
	public void setPname(String pname) {
		this.pname = pname;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getBgroup() {
		return bgroup;
	}
	public void setBgroup(String bgroup) {
		this.bgroup = bgroup;
	}
	public String getCheckup() {
		return checkup;
	}
	public void setCheckup(String checkup) {
		this.checkup = checkup;
	}
	public String getDoctors() {
		return doctors;
	}
	public void setDoctors(String doctors) {
		this.doctors = doctors;
	}
	public String getTcase() {
		return tcase;
	}
	public void setTcase(String tcase) {
		this.tcase = tcase;
	}
	
	
}
