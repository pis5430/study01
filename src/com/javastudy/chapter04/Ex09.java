package com.javastudy.chapter04;

public class Ex09 {

	public static void main(String[] args) {
		// 문자열이 "12345"라면, '1+2+3+4+5'의 결과인 15를 출력이 출력되어야 한다. 
		
		String str = "123456"; 
		int sum = 0; 
		for(int i=0; i < str.length(); i++) { 
			sum += str.charAt(i)-'0'; //i번째 문자열 추출
			//문자'3'를 숫자 3로 바꾸는 방법은 문자'3'에서 문자'0'을 빼주는것이다.
		} 
		System.out.println("sum="+sum); 

	}

}
