package com.pojo;

public class Student {

private String sName;
private Integer sAge;


public Student(String sName , Integer sAge) {
this.sName =sName;
this.sAge = sAge;
}


public String getsName() {
	return sName;
}


public void setsName(String sName) {
	this.sName = sName;
}


public Integer getsAge() {
	return sAge;
}


public void setsAge(Integer sAge) {
	this.sAge = sAge;
}
}
