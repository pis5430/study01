package com.javastudy.chapter06_3;

public class MyPoint {
	
	//필드
	
	
	//일반 메서드
	static void getDistance(int x, int y, int x1, int y1) {
		// 두 점 (x,y)와 (x1,y1)간의 거리를 구한다
		System.out.println( Math.sqrt(Math.pow(x-x1,2)+Math.pow(y-y1,2)));
		//혹은
		//return Math.sqrt(Math.pow(x-x1,2)+Math.pow(y-y1,2))
		//return Math.sqrt((x-x1)*(x-x1) + (y-y1)*(y-y1)) --> return 사용시 void에 자료형 넣어주기
	}

}
