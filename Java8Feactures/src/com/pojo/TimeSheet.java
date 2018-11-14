package com.pojo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TimeSheet {
	
    private String empNumber ;
	private Integer  empWorkingDays;
	private List<TimeSheet> timeSheetList = new ArrayList<>();
	
	
	public TimeSheet(String empNumber ,Integer  empWorkingDays) {
		this.empNumber = empNumber;
		this.empWorkingDays = empWorkingDays;
	}
	
	public TimeSheet() {
		 timeSheetList  = new ArrayList<>(
				 Arrays.asList(new TimeSheet("cx001",22),
						 new TimeSheet("cx002",22)
						 ,new TimeSheet("cx003",23)
						 ,new TimeSheet("cx004",24)
						 ,new TimeSheet("cx005",25)
						 ,new TimeSheet("cx006",26)
						 ,new TimeSheet("cx007",26)
						 ,new TimeSheet("cx008",28)
						 ));
		 
	}
	
	
	 @Override
	public String toString() {
		return "Number of working days "+empWorkingDays;
	}
	
	public Integer getEmpWorkingDays() {
		return empWorkingDays;
	}
	public void setEmpWorkingDays(Integer empWorkingDays) {
		this.empWorkingDays = empWorkingDays;
	}



	public List<TimeSheet> getTimeSheetList() {
		return timeSheetList;
	}



	public void setTimeSheetList(List<TimeSheet> timeSheetList) {
		this.timeSheetList = timeSheetList;
	}

	public String getEmpNumber() {
		return empNumber;
	}

	public void setEmpNumber(String empNumber) {
		this.empNumber = empNumber;
	}
	

}
