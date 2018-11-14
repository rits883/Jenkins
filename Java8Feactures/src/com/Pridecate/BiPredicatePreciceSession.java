package com.Pridecate;

import java.util.function.BiPredicate;

public class BiPredicatePreciceSession {

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		
		BiPredicatePreciceSession b = new BiPredicatePreciceSession();
b.m1();
	}

	public void m1() {
		
	BiPredicate<String,Integer> b = (name,age)->{
		
		if(name.equalsIgnoreCase("Ritesh") && age==28) {
			return true ;
		}
		else {
			return false;
		}
	};
	
	System.out.println(b.test("Ritesh",27));
	}
}
