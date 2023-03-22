package com.example.springidol;
/*5. 곡(Song)과 가수(Singer)를 나타내는 새로운 클래스를 아래와 같이 정의한다.
	◼ Singer는 Performer의 일종으로, 이름과 곡 정보를 갖는다. 곡은 위에서 정의한 Song 클래스의 객체를 참조한다. 
	  가수는 공연할 때 자신의 이름과 곡에 관한 모든 정보를 출력한다.
	✓ 예: Chris is singing a song Bohemian Rhapsody by Queen.*/
public class Singer implements Performer, InstrumentForSinger{
	  private String name;	// 이름
	  private Song song;	// 곡 정보
	  private InstrumentForSinger instrument;
	
	  public Singer(String name, Song song) { //생성자를 이용한 DI 설정 위해
		  this.name = name;
		  this.song = song;
	  }
	 
	  public Singer(String name, Song song, InstrumentForSinger instrument) { //생성자를 이용한 DI 설정 위해
		  this.name = name;
		  this.song = song;
		  this.instrument = instrument;
	  }
	  
	  public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}

	//private인 song을 내보내기 위해 사용
	public Song getSong() {
		return song;
	}


	public void setSong(Song song) {
		this.song = song;
	}


	@Override
	  public void perform() throws PerformanceException {
	  	System.out.println(name + " is singing a song " + song.getTitle() + " by " + song.getArtist() + ".");
	  	if(instrument != null) {
		  	System.out.print("while palying Piano : ");
		  	instrument.play();
	  	}
	  }
	
	@Override
	public void play() {
	
		
	};
	
}
