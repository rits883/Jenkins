package com.Function;

import java.util.List;
import java.util.function.Function;

import com.pojo.Employee;

public class Precicsesession3 {

	public static void main(String[] args) {
	
		Employee emp  = new Employee();
		
		List<Employee> listOfEmp = emp.getEmployeeList();
		
		Precicsesession3 p = new Precicsesession3();
        p.m1(listOfEmp);
	}
	
	public void m1(List<Employee> listOfEmp) {
     Function<List<Employee>,Double> fun  = (empList)->{
    	 
    	 Double totalSalary =0d;
    	 for(Employee emp:empList) {
    		 
    	totalSalary = totalSalary+emp.getSalary();	 
    	 }
    	
    	 return totalSalary;
     };
	
     System.out.println(fun.apply(listOfEmp));
	}

}
