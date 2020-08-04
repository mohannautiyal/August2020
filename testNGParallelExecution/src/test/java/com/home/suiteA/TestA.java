package com.home.suiteA;

import org.testng.annotations.Test;

public class TestA {
	
	@Test
	public void testA() throws InterruptedException {
		System.out.println("Starting test A");
		
		Thread.sleep(5000);
		System.out.println("Ending test A");

	}

}
