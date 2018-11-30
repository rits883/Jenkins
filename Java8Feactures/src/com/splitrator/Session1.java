package com.splitrator;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Spliterator;
import java.util.concurrent.TimeUnit;
import java.util.function.Consumer;

public class Session1 {

	public static void main(String[] args) {
		List<String> list = new ArrayList<>(
				Arrays.asList("Hello","Apple","Banana","Mango","Rice","Gavaa"));
		
		Session1 session1 = new Session1();
		session1.m2();
		
		/*Example 1*/
	/*	for(Spliterator<String> split = list.spliterator();
				split.tryAdvance(System.out::println)!=false;
				);
*/
		
		/*Example 2*/
		
		/*Spliterator<String> secondHalf = list.spliterator();
		Spliterator<String>firstHalf = secondHalf.trySplit();
		
		firstHalf.forEachRemaining(System.out::println);
		secondHalf.forEachRemaining(System.out::println);*/
	}
	public void m1() {
		List<Integer> list = new ArrayList<>(Arrays.asList(1,2,3,4,5,6,7,8,9,10,11,12,14));
		
		/*Iterator<Integer> it = list.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}*/
		/*Iterator<Integer> it = list.iterator();
		it.forEachRemaining((value)->{
		System.out.println(value);
		});*/
		
		Spliterator<Integer> spIt = list.spliterator();
		
		spIt.forEachRemaining((value)->{
			System.out.println(value);
		});	
	}

	public void m2() {
		
		long startTime = System.currentTimeMillis();
		List<Box> boxList = new ArrayList<>();
		for(float f =0;f<=5000000f ;f++) {
			boxList.add(new Box(f, f+1,f+5));
		}		
		
		Consumer<Box> consumer = (box)->{
			System.out.println("Box"+box.getHight()*box.getLenght()*box.getWeight());
		};

		
		/***Calculate Voluem for box*/
		
		
		Spliterator<Box> split2 = boxList.spliterator();
		Spliterator<Box> split1 = split2.trySplit();
		
		split1.forEachRemaining(consumer);
		split2.forEachRemaining(consumer);
		
		
	     /*Iterator<Box> it = boxList.iterator();
	     while(it.hasNext()) {
	    	 Box box = it.next();
	    	 consumer.accept(box);
	     }*/

	
		
		
		/*Spliterator<Box> split = boxList.spliterator();
				split.forEachRemaining(consumer);*/
		long endTime = System.currentTimeMillis()-startTime;
		System.out.println((endTime/1000));
		
	}
}

