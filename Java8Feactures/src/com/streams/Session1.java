package com.streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.stream.Collectors;

public class Session1 {

	public static void main(String[] args) {
		m3();

	}

	
	
	//Streams filtres
	
	public  static void m1() {
		List<Integer> numbersList = new ArrayList<>();
		numbersList.add(10);
		numbersList.add(51);
		numbersList.add(125);
		numbersList.add(30);
		numbersList.add(20);
		numbersList.add(6);
		numbersList.add(8);
		numbersList.add(36);
		numbersList.add(12);
		
		
		List<Integer> evenNumberList =numbersList.stream().
				filter((number) ->number%2==0).collect(Collectors.toList());
		
		Consumer<List<Integer>> consumer  = (list) ->
		list.forEach(number ->System.out.println(number));
		
		
		consumer.accept(evenNumberList);
	}
	
	/*Get square**/
	public static void m2() {
		List<Integer>  numberList  =
				new ArrayList<>(Arrays.asList(1,2,3,4,5,6,7,8,9));
		
		List<Integer> squareList =
				numberList.stream().map(number -> number*number).collect(Collectors.toList());
		
		Consumer<List<Integer>> consumer = 
				list -> {list.forEach(
					number -> System.out.println(number)	
						);};
		
				consumer.accept(squareList);
	}
	
	
	//Use filter and map both
	
	public static void m3() {
		List<Integer> list = 
				new ArrayList<>(Arrays.asList(1,2,3,4,5,6,7,8,9,10));
		
		List<Integer> evenNuberSquerList =
				list.stream().filter(number -> number%2==0)
				.map(number -> number*number).collect(Collectors.toList());
		
		Consumer<List<Integer>> consumner = 
				numberList -> numberList.forEach(
                          number -> System.out.println(number)
						);
				
				consumner.accept(evenNuberSquerList);
				
		
	}
	
	
}
