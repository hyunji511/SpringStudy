package com.example.springidol;

public class Encore {
	private Performer encorePerformer; // 공연 참가자들 중 한 명이 앵콜 공연
		
		public Encore() {
		}
		
		// setter method를 이용한 bean 생성
		public void setEncorePerformer(Performer encorePerformer) {
			this.encorePerformer = encorePerformer;
		}
		
		public void execute() {
			System.out.println("<Encore Performance>");
			encorePerformer.perform();
		}
	}
