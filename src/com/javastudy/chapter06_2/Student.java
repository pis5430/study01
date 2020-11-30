package com.javastudy.chapter06_2;

public class Student {
	
	//필드
	
	private String name; //학생이름
	private int ban;  //반
	private int no;  //번호
	private int kor;  //국어점수
	private int eng;  //영어점수
	private int math;  //수학점수
	
	//생성자
	
	public Student() {}
	
	public Student(String name, int ban, int no, int kor, int eng, int math) {
		super();
		this.name = name;
		this.ban = ban;
		this.no = no;
		this.kor = kor;
		this.eng = eng;
		this.math = math;
	}
	
	
	//매서드 getter, setter
	
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	public int getBan() {
		return ban;
	}
	public void setBan(int ban) {
		this.ban = ban;
	}
	public int getNo() {
		return no;
	}
	public void setNo(int no) {
		this.no = no;
	}
	public int getKor() {
		return kor;
	}
	public void setKor(int kor) {
		this.kor = kor;
	}
	public int getEng() {
		return eng;
	}
	public void setEng(int eng) {
		this.eng = eng;
	}
	public int getMath() {
		return math;
	}
	public void setMath(int math) {
		this.math = math;
	}
	
	
	
	//일반메서드
	
	public int getTotal() {
		return kor + eng +math;
	}
	
	public float getAverage() {  //소수점 둘째자리에서 반환하는법 
		return getTotal()/3;
	}
	
	
	public void info() { 
		System.out.println(name+","+ban + "," +no+","+kor+","+eng+"," + math + ","+getTotal()+"," + getAverage());
	}
	
	
	

}
