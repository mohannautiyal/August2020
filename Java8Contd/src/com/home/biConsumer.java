package com.home;

import java.util.function.BiConsumer;

public class biConsumer {

	
	
	// It represents a function which takes in two arguments and produces a result. 
	public static void main(String[] args) {
		
		BiConsumer<Integer,Integer> addTwoNum = (x,y)-> System.out.println("Sum of numbers is " + (x+y));
		addTwoNum.accept(10, 20);
	}

}
