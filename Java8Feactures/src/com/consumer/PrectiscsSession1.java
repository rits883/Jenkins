package com.consumer;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class PrectiscsSession1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PrectiscsSession1 ps = new PrectiscsSession1();
		ps.m1();

	}
	
	/* Display Food list**/
	public void m1() {
		Consumer<String> displayItemName = (itemName)-> System.out.println(itemName);
displayItemName.accept("Maggi");

Consumer<List<String>> itemListDisplay = (itemList)->{
	System.out.println(itemList);
};
List<String> list = new ArrayList<>(Arrays.asList("Mango","Aplle","Banan","govava"));
itemListDisplay.accept(list);
	}

}
