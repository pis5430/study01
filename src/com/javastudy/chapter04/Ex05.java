package com.javastudy.chapter04;

public class Ex05 {

	public static void main(String[] args) {
		
		// 다음 for문을 while 문으로 변경하기
		/*
		for(int i=0; i<=10; i++) { 
			for(int j=0; j<=i; j++) 
				System.out.print("*"); System.out.println(); 
		*/	
		
		int i=0;
		int j;
		
		while(i<=10){
			j=0;
			while(j<=i) {
				System.out.print("*");
				j++;
			}
			System.out.println();
			i++;
		
				
				
		} 
	}

}
