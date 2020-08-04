package com.home.suiteB;

import org.testng.annotations.Test;

public class TestB1 {
	
	@Test
	public void testA() throws InterruptedException {
		System.out.println("Starting test B2");
		
		Thread.sleep(5000);
		System.out.println("Ending test B2");

	}

}
