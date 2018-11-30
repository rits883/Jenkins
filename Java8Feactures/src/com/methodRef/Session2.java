package com.methodRef;

public class Session2 {

	public static void main(String[] args) {
		
		
		//Thread thread  = new Thread(Session2::m1);
			//	thread.start();
		
		/**non static*/
		Session2 ses = new Session2();
		Runnable run = ses::m2;
		Thread thread = new Thread(run);
		thread.start();
	}
	
	
	/** Thread creation using lambda**/
	
	public static void m1() {
		
		Runnable run = () ->{
			System.out.println("Run method called");
		};
	run.run();
	}
	
	
	/**Thread for by non static**/
	
	public void m2 () {
		for(int i =1;i<=10;i++) {
			System.out.println("Child thread called"+i);
		}
	}
	

}
