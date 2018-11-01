package com.Pridecate;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.Scanner;
import java.util.function.Predicate;

import javax.jws.soap.SOAPBinding.Use;

import com.pojo.User;

public class PrecticeSession1 {

	public static void main(String[] args) {
		//m1();
		//m2();
		userAuthenticate();
	}

	
	/**Get All Name start with K*/
	public static void m1() {
		String [] nameList = {"Sunny","Kajol","Katrina","Malika","Ashwaira"};
		
		Predicate<String> checkName = name -> name.startsWith("K");
		
		for(String actName :nameList){
			if(checkName.test(actName)){
			System.out.println(actName);
			}
		}
		
	}
	
	//Remove Null value and empty string form list;
	public static void m2(){
		List<String> listOfFuits = 
				new ArrayList<>(Arrays.asList("Mango","","Gvava",null,"Apple",null,"papaya"));
		Predicate<Collection<String>> listEmpltyCheck = collection-> collection.isEmpty();
		Predicate<String> checkEmpltyAndNull = name -> name!=null && (!name.isEmpty());
				
		if(!listEmpltyCheck.test(listOfFuits)){
			for(String fName :listOfFuits){
				if(checkEmpltyAndNull.test(fName)){
				System.out.println(fName);
				}
				
			}
		}
		
	}
	
	// Authenticate  user
	
	public static void userAuthenticate(){
		Predicate<User> checkUser = user -> user.getUserName().equals("Admin")
				&& user.getPassword().equals("Password");
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter User Name");
		String userName = sc.next();
		
		System.out.println("Please enter password ");
		
		String password = sc.next();
		User u = new User(userName, password);
		
		if(checkUser.test(u)){
			System.out.println("Sucssful log in ");
		}
		else {
			System.out.println("Failes ");
		}
	/*	User user1 = new User("User 1", "Admin");
		User user2 = new User("User 2", "Admin1");
		User user3 = new User("User 3", "Admi1");
		User user4 = new User("Admin", "Password");
		List<User> userList = new ArrayList<>(Arrays.asList(user1,user2,user3,user4));
		
		
		for(User user:userList){
		
			if(checkUser.test(user)){
				System.out.println("Authentic user "+user.getUserName());
			}
			else{
			System.out.println("Invalid user "+user.getUserName());
			}
		}
		*/
	
	}
}
