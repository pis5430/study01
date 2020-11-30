package com.javastudy.chapter07_1;

public class Tv {
	
	
	//필드
	private boolean power;
	private int channel;
	
	//생성자
	
	public Tv() {}

	public Tv(int channel) {
		this.channel = channel;
	}

	public Tv(boolean power) {
		this.power = power;
	}

	public Tv(boolean power, int channel) {
		this.power = power;
		this.channel = channel;
	}


	
	//메서드 getter,setter
	
	public boolean isPower() {
		return power;
	}

	public void setPower(boolean power) {
		this.power = power;
	}

	public int getChannel() {
		return channel;
	}

	public void setChannel(int channel) {
		this.channel = channel;
	}
	
	
	public void power() { //파워를 호출하면 on/off
		this.power = !power;
	}
	
	public void channelUp() { //증가값을 바로 포함
		++channel;
	}
	
	public void channelDown() { //감소값을 바로 포함
		--channel;
	}

	
	
	
	
	

}
