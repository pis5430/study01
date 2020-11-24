package com.javastudy.chapter06_1;

public class SutdaCard {
	
	private int num;

	private boolean isKwang;



	public SutdaCard(){

		this(1, true); //SutdaCard(1,true)를 호출한다.

	}



	public SutdaCard(int num, boolean isKwang){

		this.num = num;

		this.isKwang = isKwang;

	}



	public String info(){

		return num + (isKwang ? "K" : "");

	}
	
	
}
