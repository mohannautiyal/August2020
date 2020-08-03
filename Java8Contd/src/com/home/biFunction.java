package com.home;

import java.util.function.BiFunction;

public class biFunction {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//It represents a function which takes in two arguments and produces a result.
		
		
		BiFunction<String,String,String> concat = (x,y)-> x+y;
		
		/*
		 * Hence this functional interface which takes in 3 parameters namely:-
		 * 
		 * T: denotes the type of the first argument to the function U: denotes the type
		 * of the second argument to the function R: denotes the return type of the
		 * function
		 */
		
	  String fullName =	concat.apply("Madan ", "Mohan");
	  System.out.println(fullName);
		
		
	}

}
