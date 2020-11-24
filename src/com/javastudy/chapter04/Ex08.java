package com.javastudy.chapter04;

public class Ex08 {

	public static void main(String[] args) {
		// 방정식 2x+4y=10의 모든 해를 구하시오. 단, x와 y는 정수이고 각각의 범위는 0<=x<=10, 0<=y<=10이다.
		
		
		int x, y;
		int sum = 0;
		
		for(x=0; x<=10; x++) {
			for(y=0; y<=10; y++) {
				if((2*x)+(4*y)==10) {
					sum = (2*x)+(4*y);
					System.out.println("(2*"+x+")"+"+"+"(4*" + y + ") =" + sum);
					System.out.print("x값은: "+x);
					System.out.println("  y값은: "+y);
					
				}
			}
				
		}
		
		

	}

}
