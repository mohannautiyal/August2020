package com.home;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.home.listeners.Testlistener;





@Listeners(Testlistener.class)
public class TestClassB {

	
	  @BeforeSuite 
	  public void BeforeSuite() {
	  System.out.println("Running before suite next class"); }
	  
	
	@Test
	public void TestD() {
		assertTrue(true);
	}
}
