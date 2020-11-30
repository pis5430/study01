package com.javastudy.chapter07_1;

public class CaptionTv extends Tv {

	//필드
	protected boolean caption;

	
	//생성자
	public CaptionTv() {}
	
	public CaptionTv(boolean caption) {
		this.caption = caption;
	}
	
	//메소드 getter, setter

	public boolean isCaption() {
		return caption;
	}

	public void setCaption(boolean caption) {
		this.caption = caption;
	}

	//일반메소드
	
	public void displatCaption(String text) {
		if(caption) { //캡션상태가 on(treu) 일떄만 text를 보여준다.
			System.out.println(text);
		}
	}
	
	
	
	
	
}
