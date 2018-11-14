package com.pojo;

public class Student {

private String sName;
private Integer sAge;
private String sClass;
private Integer sMarks;


public Student(String sName , Integer sAge) {
this.sName =sName;
this.sAge = sAge;
}

public Student(String sName,String sClass ,Integer sMarks) {
this.sName =sName;
this.sClass = sClass;
this.sMarks = sMarks;
}

@Override
	public String toString() {
	return "Name:- "+this.sName + " Age :- "+this.sAge;
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


public String getsClass() {
	return sClass;
}


public void setsClass(String sClass) {
	this.sClass = sClass;
}


public Integer getsMarks() {
	return sMarks;
}


public void setsMarks(Integer sMarks) {
	this.sMarks = sMarks;
}
}
