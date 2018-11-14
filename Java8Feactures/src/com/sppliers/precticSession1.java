package com.sppliers;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;
import java.util.function.Supplier;

import com.pojo.Student;

public class precticSession1 {

	
	public static void main(String [] ags) {
		
		precticSession1 p = new precticSession1();
	p.m3();
	}
	
	/*Supply Date*/
	
	public void m1() {
		
		Supplier<Date>  dateSupplier = () ->{
			
			Date d = new Date();
			return d;};
			System.out.println(dateSupplier.get());
	}
	
	
	/** Select  Random name  **/
	
	public void m2() {
		List<Student> sudentList = 
				new ArrayList<>(Arrays.asList(new Student("Sunny",12),
						new Student("Ravi",15), new Student("Niharika",23),
						new Student("Ujjain",16), new Student("Mala",17)
						));
		
		Supplier<Student> rendomStudent = ()->{
			int index = (int) (Math.random()*4);
			
			return  sudentList.get(index);
		};
		
		System.out.println(rendomStudent.get());
		
	}
	
	/** OTP Supply**/
	
	public void m3 () {
		Supplier<String> otpSupper =() ->{
			
			String otp ="";
			for(int i =1;i<=6;i++) {
				
				otp = otp+(int)(Math.random()*10);
			}
			return otp;
		};
		 System.out.println(otpSupper.get());
		}
	
	

}


