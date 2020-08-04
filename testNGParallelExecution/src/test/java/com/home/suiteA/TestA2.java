package com.home.suiteA;

import org.testng.annotations.Test;

public class TestA2 {
	
	@Test
	public void testB() throws InterruptedException {
		System.out.println("Starting test A2");
		
		Thread.sleep(5000);
		System.out.println("Ending test A2");

	}


}
