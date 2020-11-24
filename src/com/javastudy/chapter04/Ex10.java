package com.javastudy.chapter04;

public class Ex10 {

	public static void main(String[] args) {
		int num = 12345; //문자열로 입력 ㄴㄴ
		int sum = 0;
		
		while(num>0) {
			sum+=(num%10);
			num = num/10;
		}
		
		System.out.println("각자리의 합을 더한 결과 : " + sum); 

	}

}
