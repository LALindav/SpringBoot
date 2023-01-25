package com.luv2code.springdemo;

import java.util.Random;

public class RandomFortuneService implements FortuneService {
	
	private String[] table = {"Welcome to", "test","fortune tesst 3"};
	private Random rand = new Random();
	
	@Override
	public String getFortune() {
		int index = rand.nextInt(table.length);
		return table[index];
	}
	
	

}
