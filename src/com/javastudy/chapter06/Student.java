package com.javastudy.chapter06;

public class Student {
	
	private int idnum;
	private String name;
	private int grade;
	private String address;
	
	//학번
	public void setNum(int idnum) {
		this.idnum = idnum;
	}
	
	public int getNum() {
		return idnum;
	}
	
	
	//이름
	public void setName(String name) {
		this.name = name;
	}
	
	public String getName() {
		return name;
	}
	
	
	//학년
	public void setGrade(int grade) {
		this.grade = grade;
	}
	
	public int getGrade() {
		return grade;
	}
	
	
	//주소
	public void setAddress(String address) {
		this.address = address;
	}
	
	public String getAddress() {
		return address;
	}
	
	
	
	public void showInfo() {
		System.out.println("학번: " + idnum);
		System.out.println("이름: " + name);
		System.out.println("학년: " + grade +"년");
		System.out.println("사는곳: " + address);
		}

}
