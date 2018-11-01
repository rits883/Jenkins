package com.pojo;

public class Person {
	
	private String pName;
	private String pGader;
	private Integer pAge;
	private Boolean stage;
	
	public Person(String pName , String pGader ,Integer pAge ,Boolean stage) {
		this.pName = pName;
		this.pGader = pGader;
		this.pAge = pAge;
		this.stage = stage;
	}

	
	
	
	public String getpName() {
		return pName;
	}

	public void setpName(String pName) {
		this.pName = pName;
	}

	public String getpGader() {
		return pGader;
	}

	public void setpGader(String pGader) {
		this.pGader = pGader;
	}

	public Integer getpAge() {
		return pAge;
	}

	public void setpAge(Integer pAge) {
		this.pAge = pAge;
	}

	public Boolean getStage() {
		return stage;
	}

	public void setStage(Boolean stage) {
		this.stage = stage;
	}
	
	
	

}
