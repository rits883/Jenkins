package com.streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.jar.Attributes.Name;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class CollectDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
m1();
	}

	public static void m1() {
		List<String> list 
		= new ArrayList<>
		(Arrays.asList("Apple","Manogo","Gavava","Lemon","Onion",
				"Tomato","Apple","Manogo","Banana","Lemon","Lichi"));
		
		
		
		/*List<String> newList = list.stream().filter(name ->name.length()>=6).
				collect(Collectors.toList());
		System.out.println(newList);*/
		
		/*List<String> newList  = list.stream().distinct().
				collect(Collectors.toList());
		
		System.out.println(newList);*/
		
		/*List<String> newList  = list.stream().sorted().
				collect(Collectors.toList());
		System.out.println(newList);*/
		
		/*List<String> newList  = list.stream().distinct().sorted().
				collect(Collectors.toList());
		System.out.println(newList);
		*/
		
	/*System.out.println(list);
		long size = list.stream().filter(name ->name.length()>=6)
				.distinct().sorted().count();
		System.out.println(size);*/
		
		
		/*List<String> newList  = list.stream().distinct().sorted((i1,i2) -> i2.compareTo(i1)).
				collect(Collectors.toList());
		System.out.println(newList);
		*/
		
		/*List<Integer> numberList = new ArrayList<Integer>(Arrays.asList(2,4,6,8
				,10,12,14,16,18,20));
		
		Integer maxValue = numberList.stream().max((number1,number2)->number1.compareTo(number2)).get();
		
		System.out.println( "Max value"+maxValue);
		
		Integer min  = numberList.stream().min((number1, number2)->number1.compareTo(number2)).get();
		
		System.out.println("Min value "+min);*/
		
		Integer [] intArray = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15};
		
		Stream<Integer> stream = Stream.of(intArray);
		stream.forEach(number -> System.out.println(number));
		
 		
	}
}
