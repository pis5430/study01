package com.javastudy.chapter06_1;

public class SutdaCard { //다시풀어보기
	
	private int num;
	private boolean isKwang;


	public SutdaCard(){  //생성자 --> 기본생성자
		this(1, true); //SutdaCard(1,true)를 호출한다.
	}


	public SutdaCard(int num, boolean isKwang){
		this.num = num;
		this.isKwang = isKwang;
	}



	public String info(){
		return num + (isKwang ? "K" : ""); //삼항연산자 (조건식) ? A : B
		 // 조건식이 참일경우 => A가 실행되고, 거짓일경우 => B가 실행된다.
		
	}
	
	
}
