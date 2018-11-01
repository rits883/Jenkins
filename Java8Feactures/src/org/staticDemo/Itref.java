/**
 * 
 */
package org.staticDemo;

/**
 * @author REETESH  *
 */
public interface Itref {
	public static void mStatic(){
		System.out.println("Static method calling ");
	}
	public void mRegular();
	
	default void  mDefault(){
		System.out.println("Default method calling");
	}
	
	public static void main(String[] args) {
		 
		System.out.println("Hello testing");
	}

}
