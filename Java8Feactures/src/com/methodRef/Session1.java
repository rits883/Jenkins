package com.methodRef;

public class Session1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		/** For static methods**/
	//	InterFaceMethodRef in = Session1::m1;
		/** For non static methos**/
		Session1 s = new Session1();
		InterFaceMethodRef in = s ::m2;
		
		in.fun();
	}
	
	/** For static method **/
    public static void m1() {
	
    	System.out.println("Static method called ");
	}
	
    
    public void m2() {
    	System.out.println("Non staic methhod called");
    }
	
	
	
}
