package com.EmpApp;

import java.util.List;
import java.util.function.Predicate;

import com.pojo.Employee;

public class MainClass {

	public static void main(String[] args) {
		Employee emp = new Employee();
		List<Employee> list = emp.getEmployeeList();
		//displayEmployee(typeOfPredicate("Dev"), list);
	//	displayEmployee(typeOfPredicate("CTO"), list);
		//displayEmployee(typeOfPredicate("AM"), list);
		//displayEmployee(typeOfPredicate("PM"), list);
		
		Predicate<Employee> p2 = per -> per.getCity().equalsIgnoreCase("Delhi");
		displayEmployee(typeOfPredicate("CEO").and(p2), list);
		Predicate<String> p = Predicate.isEqual("India");
		
		System.out.println(p.test("India"));
		
		
		
	}
	
	public static void displayEmployee(Predicate<Employee>filterCondition,List<Employee> employeesList){
		for(Employee emp:employeesList){
		if(filterCondition.test(emp)){
			System.out.println(emp);
		}
		}
	}
	
	public  static Predicate<Employee> typeOfPredicate(String degination) {
		Predicate<Employee> pre ;
	      if(degination.equalsIgnoreCase("CEO")){
	    	  
	    	  return pre = p-> p.geteDegignation().equalsIgnoreCase("CEO");
	      }
	      
         if(degination.equalsIgnoreCase("MD")){
	    	  
	    	  return pre = p-> p.geteDegignation().equalsIgnoreCase("MD");
	      }
         
         if(degination.equalsIgnoreCase("CTO")){
	    	  
	    	  return pre = p-> p.geteDegignation().equalsIgnoreCase("CTO");
	      }
         if(degination.equalsIgnoreCase("PM")){
	    	  
	    	  return pre = p-> p.geteDegignation().equalsIgnoreCase("PM");
	      }
         
         if(degination.equalsIgnoreCase("AM")){
	    	  
	    	  return pre = p-> p.geteDegignation().equalsIgnoreCase("AM");
	      }
         
         if(degination.equalsIgnoreCase("Dev")){
	    	  
	    	  return pre = p-> p.geteDegignation().equalsIgnoreCase("Dev");
	      }
         
         if(degination.equalsIgnoreCase("Tester")){
	    	  
	    	  return pre = p-> p.geteDegignation().equalsIgnoreCase("Tester");
	      }
		return null;
		
	}

}
