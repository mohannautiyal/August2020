package com.home.suiteB;

import org.testng.annotations.Test;

public class TestB2 {
	
	@Test
	public void testB() throws InterruptedException {
		System.out.println("Starting test B");
		
		Thread.sleep(5000);
		System.out.println("Ending test B");

	}


}
