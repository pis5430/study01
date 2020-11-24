package com.javastudy.chapter04;

public class Ex06 {

	public static void main(String[] args) {
		// 두 개의 주사위를 던졌을 때, 눈의 합이 6이 되는 모든 경우의 수를 출력하는 프로그램을 작성하시오.
		
		// (n01 + n02 = sum) == 6 모든 경우의 수 구하기
		
		int n01, n02;
		int sum;
		
		for(n01=1; n01<=6; n01++) { //주사위1
			
			for(n02=1; n02<=6; n02++ ) {
				
				if(n01+n02 ==6) {
					sum = n01 +n02;
					System.out.println(n01+"+"+n02 +"=" + sum );
					
				}
				
				
			}
			
		}
		

		
	

	}

}
