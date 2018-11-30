package com.DateDemo;

import java.text.DateFormat;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;

public class Session1 {

	public static void main(String[] args) {
		Session1    s  = new Session1();
		s.m3();
	} 

	public void m1() {
		
		// Current Date and Time
		LocalDate dateInIndia  = LocalDate.now();
		System.out.println("Date in India  " +dateInIndia);

		// Current Date and Time
				LocalTime timeInIndia  = LocalTime.now();
				System.out.println("Time in India  " +timeInIndia);
		
		
		ZoneId PSTZone = ZoneId.of("America/Los_Angeles");
		LocalDate dateInUS  = LocalDate.now(PSTZone);
		System.out.println("Date in US " +dateInUS);
		
		LocalTime timeInUS  = LocalTime.now(PSTZone);
		System.out.println("Time in US " +timeInUS);
		
		
		
		
	}
	
	public void m2() {
		LocalDate localDate  = LocalDate.now();
		
		System.out.println(localDate.getDayOfWeek());
		System.out.println(localDate.getDayOfMonth());
		System.out.println(localDate.getMonthValue());
		System.out.println(localDate.getYear());
		
		System.out.printf("%s-%d-%d-%d",localDate.getDayOfWeek() ,localDate.getDayOfMonth(),
				localDate.getMonthValue(),localDate.getYear());
		
		
	}
	
	
	public void m3() {
//		LocalDateTime dt  = LocalDateTime.now();
//		System.out.println(dt);
		//LocalDate dob  = LocalDate.of(1991,9,17);
//		DateFormat fd  = DateFormat.
//		LocalDate dob  = LocalDate.parse("1991-9-17","yyyy-MM-dd");
//		System.out.println(dob);
//		Instant i = Instant.now();
//		System.out.println(i);
		
		LocalDate dob  = LocalDate.parse("1991::09::17",DateTimeFormatter.BASIC_ISO_DATE);
	System.out.println(dob);
	}
}
