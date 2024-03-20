package com.springjdbc.entities;

public class Student {
	private String sId;
	private String sName;
	private String sCity;
	
	
	public String getsId() {
		return sId;
	}
	public void setsId(String sId) {
		this.sId = sId;
	}
	public String getsName() {
		return sName;
	}
	public void setsName(String sName) {
		this.sName = sName;
	}
	public String getsCity() {
		return sCity;
	}
	public void setsCity(String sCity) {
		this.sCity = sCity;
	}
	
	
	public Student() {
		super();
	}
	public Student(String sId, String sName, String sCity) {
		super();
		this.sId = sId;
		this.sName = sName;
		this.sCity = sCity;
	}
	@Override
	public String toString() {
		return "Student [sId=" + sId + ", sName=" + sName + ", sCity=" + sCity + "]";
	}
	
	
}
