package com.Function;

import java.util.Scanner;
import java.util.function.Function;
import java.util.function.Predicate;

public class UserAuthenticApp {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
	    System.out.println("Enter User Name");
	    String userName = sc.next();
		System.out.println("Enter Password");
		String passowrd = sc.next();
		
		UserAuthenticApp usr = new UserAuthenticApp();
		usr.validation(userName,passowrd);
	}
	
	public void validation(String userName,String password) {
		Function<String, String> getStart5Char = (str)-> str.substring(0, 5);
		Function<String,String> getLowerCase = (str)-> str.toLowerCase();
		Predicate<String> checkUserName =  (user)->user.equals("admin");
		Predicate<String> checkPassword =  (user)->user.equals("passw");
		
		  if(checkUserName.test(getStart5Char.andThen(getLowerCase).apply(userName) )
				  && 
				  checkPassword.test(getStart5Char.andThen(getLowerCase).apply(password))) {
			  System.out.println("User verified");
		  }
		  else {
			  System.out.println("User autherization failed");
		  }
		 
		}

}
