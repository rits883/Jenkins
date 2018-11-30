package com.prinitiveFunc;

import java.util.function.IntFunction;
import java.util.function.IntPredicate;
import java.util.function.IntToDoubleFunction;
import java.util.function.Predicate;
import java.util.function.ToIntFunction;

public class Session1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Session1 s1 = new Session1(); 
	//	s1.checkEvenNumber();
	//s1.checkEvenIntPredicate();
		s1.fuctionPrem();
	}
	
	
	
	public void checkEvenNumber() {
		
		int [] x  = {1,5,6,8,9,20,35,40,50,42,64,95,80};
		
		Predicate<Integer> checkEven = (i)->i%2==0;
		
		for(int value:x) {
			if(checkEven.test(value)) {
				System.out.println(value);
			}
		}
	}

	
	public void checkEvenIntPredicate() {
		int []  x  = {1,5,6,8,9,20,35,40,50,42,64,95,80};
		
		IntPredicate check = i -> i%2==0;
		
		for(int value:x) {
			if(check.test(value)) {
				System.out.println(value);
			}
		}
		
	}
	
	public void fuctionPrem() {
		
		IntFunction<Integer> funSquer = i ->i*i;
		
		System.out.println(funSquer.apply(5)); 
		
		ToIntFunction<String> stringLenght = str -> str.length();
		
		System.out.println(stringLenght.applyAsInt("Hello Java"));
		
		IntToDoubleFunction  doubleSqure = i -> Math.sqrt(i);
		System.out.println(doubleSqure.applyAsDouble(625));
		
	}
}
