package com.javastudy.chapter06;

public class StudentApp {

	public static void main(String[] args) {
		
		Student information = new Student();
		
		
		information.setNum(102749);
		information.setName("표이슬");
		information.setGrade(3);
		information.setAddress("서울특별시 10-10번지");
		
		information.showInfo();

	}

}
