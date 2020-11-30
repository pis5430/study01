package com.javastudy.chapter07_1;

public class CaptionTvTest {

	public static void main(String[] args) {
		
		CaptionTv ctv = new CaptionTv();
		
		
		ctv.channel = 10; // 변수를 그대로 가져오려면 protected로 설정해줘야함
		// -- > 아니면 getter,setter를 만들어줘서 가져와야함
		ctv.channelUp();  //채널 +1
		System.out.println(ctv.channel);
		
		ctv.displatCaption("안녕하세요1"); // --> caption이 true값이 아니라서 출력안됨
		ctv.caption = true;// 변수를 그대로 가져오려면 protected로 설정해줘야함
		// -- > 아니면 getter,setter를 만들어줘서 가져와야함
		ctv.displatCaption("안녕하세요2");
		
	}

}
