package com.prallerl;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public class Session1 {

	public static void main(String[] args) {
        m1();
		
	}

	
	public static void m1() {
		List<String>list = 
				new ArrayList<>(Arrays.asList("Hello","Java","Mango","Apple"
						,"Banana","Rice","Buttar","Oil","Spices"));
		
		
		 // Processing sequentially
        long startTime = System.currentTimeMillis();
        list.stream().forEach(i -> System.out.println(i));
        long endTime = System.currentTimeMillis();
        double sequentialStreamTimetaken = (endTime - startTime) / 1000;
        System.out.println("Time required with stream() : " + sequentialStreamTimetaken);
 
        // Parallel processing 
        
        startTime = System.currentTimeMillis();
        		
		list.stream().parallel().forEach(
				name -> System.out.println(name)
				);
		
		endTime = System.currentTimeMillis();
        long parallelStreamTimetaken = (endTime - startTime) / 1000;
        System.out.println("Time required with parallelStream() : " + parallelStreamTimetaken);
        System.out.println("Differential time : " + (sequentialStreamTimetaken - parallelStreamTimetaken));
		
	}
	
}
