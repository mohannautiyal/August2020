package com.home;

import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class TestClassB {

	
	  @BeforeSuite 
	  public void BeforeSuite() {
	  System.out.println("Running before suite next class"); }
	 
	
	@Test
	public void TestD() {
		
	}
}
