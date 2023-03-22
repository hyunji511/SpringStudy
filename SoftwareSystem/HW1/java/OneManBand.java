package com.example.springidol;

import java.util.Map;//map 객체 사용 위해 import

//3. OneManBand 클래스에서 “instruments” property 를 Map<String, Instrument> 타입으로 수정
public class OneManBand implements Performer {
	private Map<String,Instrument> instruments; // Map 타입 property

	public OneManBand() {
	}

	public void setInstruments(Map<String,Instrument> instruments) {
		this.instruments = instruments;
		}

	//perform() method 도 알맞게 수정한다
	@Override
	public void perform() throws PerformanceException {
		for (String key : instruments.keySet()) {
			System.out.print(key + " : "); //입력받은 악기의 이름(key)
			Instrument instrument = instruments.get(key); //입력받은 악기에 대한 소리(value)를 받아옴
			instrument.play(); //출력
		}
	}

}
