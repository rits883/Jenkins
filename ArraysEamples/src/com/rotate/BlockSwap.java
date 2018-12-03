package com.rotate;

public class BlockSwap {

	public static void main(String[] args) {
		
		int [] array  = {1,2,3,4,5,6,7};
		int d =2;
		int n = array.length;
		ex1(array,d,n);
	}

	public static void ex1(int [] array,int d, int n) {
		if(array == null) {
			return;
		}
	
		/*
		 * Check for negative values
		 * abs method return positive number
		 * **/
		if(d<0) {
			d =n-Math.abs(d);
			
		}
		
		/**
		 * value of d is in between length of array
		 * */
		//System.out.println(d);
		//System.out.println(n);
		System.out.println(29%3);
		System.out.println(((d%n)+n)%n);
		d = ((d%n)+n)%n;
		
	}
}
