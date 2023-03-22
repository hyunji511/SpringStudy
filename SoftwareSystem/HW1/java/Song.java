package com.example.springidol;
/* 5. 곡(Song)과 가수(Singer)를 나타내는 새로운 클래스를 아래와 같이 정의한다.
	◼ Song은 제목(title)과 원곡자(artist) 이름을 속성(property)으로 갖는다.*/
public class Song{
	private String title;
	private String artist;
	public Song() {	}

	
	public String getTitle() { //singer에서 참조할 수 있게 getter 설정
		return title;
	}
	public void setTitle(String title) { //setter을 이용한 DI
		this.title = title;
	}
	public String getArtist() {
		return artist;
	}
	public void setArtist(String artist) { //setter을 이용한 DI
		this.artist = artist;
	}
	
	
	
}
