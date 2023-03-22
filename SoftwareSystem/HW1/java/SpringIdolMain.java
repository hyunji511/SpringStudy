package com.example.springidol;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringIdolMain {
	public static void main(String[] args) {
		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("springIdol.xml");

		TalentCompetition competition = ctx.getBean("springIdol", TalentCompetition.class);
		Encore encore = ctx.getBean("encore", Encore.class); // 추가 코드
		competition.run();
		encore.execute(); // 추가 코드: 참가자들의 공연이 모두 끝난 후 앵콜 공연 실시하기 위해
		ctx.close();
	}
}