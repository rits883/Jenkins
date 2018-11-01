package com.Pridecate;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.function.Predicate;

import com.pojo.Student;

public class Demo1  {

	public static void main(String[] args) {
		
Demo1 d1 = new Demo1();
//d1.javaNewWay();
//d1.javaNewCheck();
//d1.predicateDemo();
//d1.predicatePojo();

	}
	
	//Predicate Joining 
	
	
	
	
	// Predicate way 
	
	public void predicateDemo(){
		
		Predicate<Integer> p  = I -> I>100;
		System.out.println(p.test(100));
		//System.out.println();
	}
	
	// Pojo with pridicate 
	
	
	public void predicatePojo(){
		
		Student s1 = new Student("Rahul", 24);
		Student s2 = new Student("Nimitha", 84);
		
	Predicate<Student> p  = (s) -> s.getsAge() >100;
	
	//System.out.println(p.test(s1));
	
		
	Predicate<Collection<Student>> p1 = c -> c.isEmpty();
	
	List<Student> sList1 = new ArrayList<>(Arrays.asList(s1,s2));
	List<Student> sList2 = new ArrayList<>();
	
	System.out.println(p1.test(sList1));
	System.out.println(p1.test(sList2));
	}
	
	
	
	//old java 1.7 for garter then test
	
	
	public boolean oldGt(Integer i){
		if(i>100)
		return true;
		else
			return false;	
	}

// New 1.8 way
	
	public void javaNewWay(){
		
		greaterThanInter gt = (Integer i )-> {
			if(i>100)
							return true;
			
			else
				
				return false;
			
				
		};
		
		System.out.println( gt.greaterThan(200));  
		//gt.greaterThan(250);
	}
	
	// Java 1.8 Shortest way
	
	public void javaNewCheck(){
		greaterThanInter gt = i ->  i>100;
		System.out.println( gt.greaterThan(20));  
	}
	
	
	

}
