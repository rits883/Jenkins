package org.staticDemo;

public class MainDemo implements Itref {

	public static void main(String[] args) {
	
		
MainDemo mDemo = new MainDemo();
mDemo.mRegular();
mDemo.mDefault();
Itref.mStatic();

	}

	@Override
	public void mRegular() {
		System.out.println("Regular method calling");
		
	}
	
	public void mStatic(){
		System.out.println("Non overided method");
	}
	
	

}
