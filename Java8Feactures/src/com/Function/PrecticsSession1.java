
package com.Function;

import java.util.function.Function;

import com.pojo.Traingle;
public class PrecticsSession1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		PrecticsSession1 p =  new PrecticsSession1();
		p.m5();

	}
	
	/**Length */
	public  void m1() {
		Function<String,Integer> function =  (str) -> str.length();
		System.out.println(function.apply("Hello"));
		
	}
	
	/**Square   */
	public void m2 () {
		
		Function<Integer,Integer> fun = (Int) -> Int*Int;
		 System.out.println(fun.apply(2));
		 System.out.println(fun.apply(25));
		
	}
	
	/**Area of triangle**/
	public void m3() {
		
		Function<Traingle,Integer> fun = (cord)->
		(cord.getBase()*cord.getHight())/2; 
		Traingle t = new Traingle(55,5);
		System.out.println(fun.apply(t));
	}
	
	//Remove space 
	
	public void m4() {
		Function<String,String> fun = (line)-> line.replace(" ","_");
		String line  ="Hello Java 8 You are awsome ";
		System.out.println(fun.apply(line));
	}
	// Number of spaces present in string 
	
	public void m5() {
		Function<String,Integer> fun = (line)->{
			 String line2  = line.replace(" ","");
				return line.length()-line2.length();
				};
				
				System.out.println(fun.apply("Hello Java 8 You are awsome"));
	}
	

}
