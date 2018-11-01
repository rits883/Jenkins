package com.Pridecate;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

import com.pojo.Person;

public class PrecticsSession2 {

	public static void main(String[] args) {
		
		Person p1  = new Person("Ramu", "Male",25,false);
		Person p2  = new Person("Virat", "Male",20,true);
		Person p3  = new Person("Kalu", "Male",28,true);
		Person p4 = new Person("Namita", "Female",18,false);
		Person p5  = new Person("Dhoni", "Male",28,false);
		Person p6  = new Person("Monika", "Female",21,false);
		Person p7  = new Person("Sunny", "Female",16,false);
		
     List<Person> listOfPersion  = new ArrayList<>(Arrays.asList(p1,p2,p3,p4,p5,p6));
     Predicate<Person> checkPesronForMale = per -> per.getpAge()>=18 
    		 && per.getpGader().equals("Male") && per.getStage()==Boolean.TRUE ;
     
     Predicate<Person> checkPersonForFemale = 
    		 per -> per.getpAge()>=18 
    		 && per.getpGader().equals("Female") ;
     
 
     for( Person p :listOfPersion){
    	 if(checkPesronForMale.test(p)||checkPersonForFemale.test(p) )
    	 {
    		 System.out.println(p.getpName());
    	 }
    	 
     }
    
		
		
	}

}
