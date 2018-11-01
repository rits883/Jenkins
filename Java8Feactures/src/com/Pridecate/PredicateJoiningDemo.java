package com.Pridecate;

import java.util.function.Predicate;

public class PredicateJoiningDemo {

	public static void main(String[] args) {
		
		int[] x = {0,10,15,20,25,30,40};
		
		Predicate<Integer> p1  = i -> i>10;
		Predicate<Integer> p2 = i ->  i%2 ==0;
		System.out.println("Number is greate then 10");
		m1(p1,x);
		System.out.println("Check for Even number ");
		m1(p2,x);
		System.out.println("Number not greater then 10");
		m1(p1.negate(),x);
		System.out.println("Number  gretaer the 10 and Even");
		m1(p1.and(p2),x);
		System.out.println("Number  greater then 10 or Even ");
		m1(p1.or(p2),x);
		
	}
	
	public static void m1(Predicate<Integer> p ,int[] x){
		for(int i :x){
			
			if(p.test(i))
			System.out.println(i);
		}
		
		
	}
	
	

}
