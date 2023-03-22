package com.example.springidol;
//4. Piano 클래스를 정의하고 piano bean 을 정의한다. Piano 의 play()는 "PLANK PLANK PLANK~~"를 출력한다.
public class Piano implements Instrument, InstrumentForSinger{
	public Piano() {}
	
	public void play() {
		System.out.println("PLANK PLANK PLANK~~");
	}
}
