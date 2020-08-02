package com.home;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class consumer {

	public static void main(String[] args) {


		
		// It represents a function which takes in one argument and produces a result. 
		//However these kind of functions don’t return any value.
		
		// Ex1
		Consumer<Integer> Consumer1 = x -> System.out.println(x+40);
	//	Consumer1.accept(10);
	
		//Ex2
	    Consumer<List<Integer>> modifyList = x -> {
	    	x.stream().forEach(y->System.out.println(y*10));	    	
	    };
	    
	   // modifyList.accept(Arrays.asList(2,3,4,5,6,8));
	
	    //Ex3
	    Consumer<List<String>> modifyNames = x -> {
	    	for(int i=0;i<x.size();i++) {
	    	x.set(i,x.get(i).toUpperCase());	    	 
	    	}
	    };
	   // 	modifyNames.accept(Arrays.asList("ram","shyam","brij"));
	    	
	    Consumer<List<String>> display = x -> x.stream().forEach(System.out::println);	
	    modifyNames.andThen(display).accept(Arrays.asList("ram","shyam","brij"));
	    
	}

}
