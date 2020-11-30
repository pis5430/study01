package com.javastudy.chapter06_1;

public class SutdaCardApp {

	public static void main(String[] args) {
		
		
		SutdaCard card1 = new SutdaCard(3, false);
		SutdaCard card2 = new SutdaCard(); //SutdaCard(1,true)를 호출한다.
		System.out.println(card1.info());
		System.out.println(card2.info());

		

	}

}
