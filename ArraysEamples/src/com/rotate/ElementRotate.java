package com.rotate;

public class ElementRotate {

	public static void main(String[] args) {
		int arrayList [] = {1,2,3,4,5,6,7,8,9,10};
		int k =1;
           ex4(arrayList,k);
           
           k =3;
           ex4(arrayList,k);
           k =4;
           ex4(arrayList,k);
           k =6;
           ex4(arrayList,k);
	}

/** Creating new array**/	
	public static void ex1() {
		int [] intArray  = {1,2,3,4,5,6,7,8,9,10};
		int rotateFromIndex = 3;
		
		int [] newArray = new int [intArray.length]; 
		int j =0;
		for(int i=rotateFromIndex;i<=intArray.length-1;i++) {
			newArray [j] = intArray[i];
			j++;
			
		}
		for(int i =0;i<=rotateFromIndex-1;i++) {
			newArray[j] =intArray[i];
			j++;
		}
		
		for(int value:newArray) {
			System.out.println(value);
		}
		
		
	}
	
	public  static void ex2() {
	 String [] nameArray    =   {"Apple","Mango","Banna","Books","Coffee","Pasta"};
	    String [] reversedArray = new String[nameArray.length];
	    int rotateIndex = 4;
	    int startPoint=0;
	    for(int i =rotateIndex;i<=nameArray.length-1 ;i++) {
	    	reversedArray[startPoint] = nameArray[i];
	    	startPoint++;
	    }
	    
	    for(int i =0;i<=rotateIndex-1;i++) {
	    	reversedArray[startPoint] = nameArray[i];
	    	startPoint++;
	    }
	    
	    for(String value:reversedArray) {
	    	System.out.println(value);
	    }
		
	}
	
	/**
	 * By shifting 
	 * **/
	public  static  void  ex3() {
		int [] arrayInt = {1,2,3,4,5,6,7,8,9,10};
		 int changeIndex  = 4;
		 int temp [] = new int [changeIndex];
		 
		 for(int i =0 ; i<=changeIndex-1;i++) {
			 temp[i] = arrayInt[i];
			// System.out.println(temp[i]);
		 }
		 int j =0;
		 for(int i =changeIndex;i<=arrayInt.length-1 ;i++) {
			 arrayInt[j] = arrayInt[i];
			 System.out.println(arrayInt[j]);
					 j++;
		 }
		 
		 for(int i =0;i<=temp.length-1;i++) {
			 arrayInt[j] = temp[i];
			 System.out.println( arrayInt[j]);
			 j++;
		 }
		 
	}

	/**
	 * Using  multiple values 
	 * */
	public static void ex4(int arrayList [] ,int k) {
		int n  = arrayList.length;
		int mod = k%n;
		System.out.println(mod);
		for(int i = 0; i < n; ++i) {
		System.out.println((i + mod) % n);
		}
		
		/* for(int i = 0; i < n; ++i) {
			 System.out.println("***");
		        System.out.print(arrayList[(i + mod) % n] + " ");  
		 } */
		
		        System.out.println(); 
		    } 
	
	
}


