package com.rotate;

public class SimpleArrayRotation {

	public static void main(String[] args) {
	ex2();
	}

	
	public static void ex1() {

		int [] arrayInt = {1,2,3,4,5,6,7,8,9,10};
		
		System.out.println("Length of an array "+arrayInt.length);
		
		int [] arrayNew  = new int [arrayInt.length ]; 
		int j =0;
		 for(int i=arrayInt.length-1;i>=0;i--) {
			  arrayNew[j] = arrayInt[i]; 
			 j++;
		 }
		 
		 for(int value :arrayNew) {
			 System.out.println(value);
		 }
		
	}
	
	
	public  static void ex2 () {
		String [] nameArray  = {"Jack","Roshe","Abby","James","Rahul","India"};
		int j =0;
		 String [] reversedList  = new String [nameArray.length] ; 
		
		for(int i = nameArray.length-1;i>=0 ;i--) {
			reversedList[j] = nameArray[i];
			j++;
		}
		
		for(String revreseName:reversedList) {
			 System.out.print(revreseName +",");
		}
		
		
		
		
	}
	
	
	
}
