package com.Function;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;

import com.pojo.Student;

public class Precticsession2 {

	
	
	public static void main(String [] args) {
		
		List<Student> studentList = 
				new ArrayList<>(Arrays.asList(
						new Student("Sunny", "Ist",400),
						new Student("Rohit", "Ist",300),
						new Student("Ravi", "Ist",150),
						new Student("Prem", "Ist",250),
						new Student("Rahul", "Ist",200),
						new Student("James", "Ist",430)
						));
		
		Precticsession2 p = new Precticsession2();
		p.m1(studentList);
		
		
		
	}
	
	
	public void m1(List<Student> studentList) {
		Function<Student,String> fun =
				(student)->{
				double  perCentMarks = (student.getsMarks()*100)/600;
				if(perCentMarks>=60) {
					return "Ist Devison" + "Percantage :- "+perCentMarks;
				}
				if(perCentMarks>=50 && perCentMarks<=59.99) {
					return "2Nd Devison"+ "Percantage :- "+perCentMarks;
				}
				
				if(perCentMarks>=36 && perCentMarks<=49.99) {
					return "3rd Devison"+ "Percantage :- "+perCentMarks;
				}
				else {
					return "Failed"+ "Percantage :- "+perCentMarks;
				}};
				
				for(Student s:studentList) {
					System.out.println(
							"Name :- "+s.getsName() +" " +" Marks :"+s.getsMarks()
									+ " Greatde :- "+fun.apply(s)
							);
					
				}
		
	}
}
