package com.example.springidol;

public class PoeticJuggler extends Juggler {
	private Poem poem; //property

	public PoeticJuggler(Poem poem) {
		super();
		this.poem = poem;
	}

	public PoeticJuggler(int beanBags, Poem poem) {
		super(beanBags);
		this.poem = poem;
	}
	public Poem getPoem() {
		return poem;
	}

	public void setPoem(Poem poem) {// p namespace 사용위한 setter 선언
		this.poem = poem;
	}

	@Override
	public void perform() throws PerformanceException {
		super.perform();
		System.out.println("While reciting...");
		poem.recite();
	}
}
