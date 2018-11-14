package com.consumer;

import java.util.function.BiConsumer;

public class ByConsumerPrecticsSession {

	public static void main(String[] args) {
		ByConsumerPrecticsSession  bf = new ByConsumerPrecticsSession();
		bf.m1();
	}

	
	public void m1() {
		
		BiConsumer<String, Integer> bc = (name,version)->{
			System.out.println(name+" "+version);
		};
		
		bc.accept("Java", 8);
	}
}
