package com.javastudy.chapter04;

public class Ex01 {

	public static void main(String[] args) {
		
//	[4-1] 다음의 문장들을 조건식으로 표현하라.
	//	1. int형 변수 x가 10보다 크고 20보다 작을때 true인 조건식
		
		int x =15;
		
		if(x>10 && x<20) {
			System.out.println("x는 10보다 크고 20보다 작다");
		}
		
	//	2. char형 변수ch가 true  가 공백이나 탭이 아닐 때 true인 조건식
		
		char ch01 = '1';
		if(ch01 != ' ') {
			System.out.println("ch01값은 공백이 아니다.");
		}
		
	//	3. char형 변수 ch가 ‘x' 또는 ’X' 일 때 true인 조건식
		
		char ch02 = 'x';
		if(ch02 == 'x' || ch02 == 'X') {
			System.out.println("ch02값은" + ch02 + "이다." );
		}
		
		
	//	4. char형 변수 ch 가 숫자(‘0’~‘4’)일 때 true인 조건식  //숫자로 봐야하나 문자열로 봐야하나?
	// 숫자로 봣을경우	'0'~'4' = 0,1,2,3,4
		char ch03 = '5';
		
	//	if ('0' <= ch03 && ch03 <='9'){ 
	//		System.out.println("ch04값은" + ch03 + "이다." );
	//	}
		
		
		switch(ch03) {
			case '0' : 
				System.out.println("ch03값은 0이다." );
				break;
			case '1' : 
				System.out.println("ch03값은 1이다." );
				break;
			case '2' : 
				System.out.println("ch03값은 2이다." );
				break;
			case '3' : 
				System.out.println("ch03값은 3이다." );
				break;
			case '4' : 
				System.out.println("ch03값은 4이다." );
				break;
			default : 
				System.out.println("ch03값은 0~4 외 다른 숫자이다." );
				
		}
		
		
	//	5. char형 변수 ch가 영문자(대문자 또는 소문자) 일 때 true인 조건식 
		
		char ch04 = 'd';
		if (('a' <= ch04 && ch04 <= 'z') || ('A' <= ch04 && ch04 <= 'Z')){ // 알파벳이랑 숫자를 차례대로 인식하는지?
			System.out.println("ch04값은" + ch04 + "이다." );
		}
		
		
	//	6. int형 변수 year가 400으로 나눠떨어지거나 또는 4로 나눠떨어지고 100으로 나눠떨어지지	
	//	않을 때 인 조건식
		
		int year = 404;
		if((year%400==0 || year%4==0) && year%100!=0) {
			System.out.println("year는 400으로 나눠떨어지거나 또는 4로 나눠떨어지고 100으로 나눠떨어지지 않는값" );
		}
		
	//	7. boolean형 변수 powerOn가 false일때 true인 조건식
		
		boolean powerOn = false;
		
		if(!powerOn) {
			System.out.println("boolean형 변수 powerOn가 false일때 true인 조건식" );			
		}
		

		
	//	8. 문자열 참조변수 str이 “yes”일때 true인 조건식
		
		String str = "yes";
		
		if(str=="yes") {
			System.out.println("str의 값은" + str + "이다.");						
		}


		
		

	}

}
