package com.Function;

import java.util.function.Function;

public class FunctionChaningPrectics {

	public static void main(String[] args) {
		
		FunctionChaningPrectics fcp = new FunctionChaningPrectics();
		
fcp.m1();
	}
	
	public void m1() {
		Function<String,String> fun1 = (name1) -> name1.toLowerCase();
		Function<String,String> fun2 =(name2) -> name2.substring(0, 4);
		
		String name1 ="Apple";
		
		//System.out.println(fun1.apply(name1)+fun2.apply(name2));
		System.out.println(fun1.andThen(fun2).apply(name1));
		System.out.println(fun1.compose(fun2).apply(name1));
		
		
	}

}
