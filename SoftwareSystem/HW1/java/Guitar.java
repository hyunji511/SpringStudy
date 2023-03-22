package com.example.springidol;

public class Guitar implements Instrument, InstrumentForSinger{
	public Guitar() {
	}

	public void play() {
		System.out.println("STRUM STRUM STRUM~~");
	}
}
