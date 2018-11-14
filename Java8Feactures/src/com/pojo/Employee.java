package com.pojo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Employee {

	private String eName;
	private String eId;
	private String eDegignation;
	private Double salary;
	private String city;
	private List<Employee> employeeList;
	
	public Employee() {
		
		employeeList = 
				new ArrayList<>(
						Arrays.asList(
								new Employee("Raju","cx001","CEO",10000000D,"Goa"),
								new Employee("Amish","cx002","MD",1000000D,"Delhi"),
								new Employee("Rasmi","cx003","CTO",100000D,"Mumbai"),
								new Employee("Namitha","cx004","PM",100000D,"Jaipur"),
								new Employee("Sunny","cx005","AM",50000D,"Lkhanow"),
								new Employee("Vaibhav","cx006","Dev",3000D,"Chennai"),
								new Employee("Nomita","cx007","Tester",2000D,"Hydrabad"),
								new Employee("James","cx008","CEO",10000000D,"Delhi")
								));
			}
		
	public Employee(String name ,String id , String degination ,Double salary ,
			String city) {
	
		this.eName = name;
		this.eId =id;
		this.eDegignation =degination;
		this.salary =salary;
		this.city = city;
	}

	
	
	

	@Override
	public String toString() {
		String s  = String.format("(%s,%s,%s,%.2f,%s)",eName,eId,eDegignation,salary,city);
		return s;
	}
	public String geteName() {
		return eName;
	}

	public void seteName(String eName) {
		this.eName = eName;
	}

	public String geteId() {
		return eId;
	}

	public void seteId(String eId) {
		this.eId = eId;
	}

	public String geteDegignation() {
		return eDegignation;
	}

	public void seteDegignation(String eDegignation) {
		this.eDegignation = eDegignation;
	}

	public Double getSalary() {
		return salary;
	}

	public void setSalary(Double salary) {
		this.salary = salary;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public List<Employee> getEmployeeList() {
		return employeeList;
	}

	public void setEmployeeList(List<Employee> employeeList) {
		this.employeeList = employeeList;
	}
	
	
	
	
}
