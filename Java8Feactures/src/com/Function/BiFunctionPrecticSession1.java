package com.Function;

import java.util.List;
import java.util.function.BiFunction;

import com.pojo.Employee;
import com.pojo.Student;
import com.pojo.TimeSheet;

public class BiFunctionPrecticSession1 {

	public static void main(String[] args) {
		BiFunctionPrecticSession1 b1 = new BiFunctionPrecticSession1();
		b1.m2();
	}
	
	
	public void m1 () {
		BiFunction<Student, Integer,Student> bf 
		
		= (studentDetails ,rollNumbre ) ->{
			
			if(studentDetails.getsClass().equalsIgnoreCase("II")
					
					&& rollNumbre>=10) {
				return studentDetails;
			}
			return null;
		};
		
		Student s = new Student("Raju",28);
		s.setsClass("II");
		System.out.println(bf.apply(s,100));
	}
	
	public void m2() {
		Employee emp  = new Employee();
		List<Employee> empList = emp.getEmployeeList();
		TimeSheet tm  = new TimeSheet();
		List<TimeSheet> tmList = tm.getTimeSheetList();
		
		BiFunction<Employee,TimeSheet,Employee> bf = 
				(empDetails ,timeDetails) ->
		        {
		        	Double totalSalary = (double) (timeDetails.getEmpWorkingDays()*1000); 
		        	empDetails.setSalary(totalSalary);
					return empDetails;
		        	
		        };
		
		     for(Employee empd :empList) {
		    	 
		    	 for(TimeSheet t : tmList) {
		    		 
		    		 if(empd.geteId().equalsIgnoreCase(t.getEmpNumber())) {
		    			 
		    			 System.out.println(bf.apply(empd, t)
		    					 );
		    		 }
		    	 }
		     }
		
		      
		        
	
		
	}
	
	

}
