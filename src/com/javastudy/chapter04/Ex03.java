package com.javastudy.chapter04;

public class Ex03 {

	public static void main(String[] args) {
		
		//1+(1+2)+(1+2+3)+(1+2+3+4)+...+(1+2+3+...+10)의 결과를 계산하시오
		
		int i;
		int sum01 = 0;
		int sum02 = 0;
		
		for(i=1; i<11; i++) {
			sum01 += i;
			sum02 +=sum01;
		}
		System.out.println("1부터 10까지의총합: " +sum02);
		
		

	}

}
