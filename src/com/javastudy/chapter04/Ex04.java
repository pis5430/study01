package com.javastudy.chapter04;

public class Ex04 {

	public static void main(String[] args) {
		
		//1+(-2)+3+(-4)+... 과 같은 식으로 계속 더해나갔을 때, 
		//몇까지 더해야 총합이 100이상이 되는지 구하시오.
		
		int sum=0;
		int num=0;
		
		while(true) {
			num++; //초기값0
			
			if(num%2==0) { //짝수만 마이너스
				sum-=num;
			}else {
				sum+=num;
			}
			
			if(sum>=100) {
				break;
			}
		}
		
		System.out.println(num);

		
	}

}
