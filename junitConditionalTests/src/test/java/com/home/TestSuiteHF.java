package com.home;

import org.junit.Assume;
import org.junit.BeforeClass;
import org.junit.Test;



public class TestSuiteHF  {
    public static String Execute="N";
	
	@BeforeClass
	public static void beforeClassCondition() {
		Assume.assumeTrue("Skipping execution for Sc",Execute.equals("Y"));
	
	}
	
	@Test
	public void HFTest1() {
		System.out.println("Excecuting HF Test No 1");
	}
	
	@Test
	public void HFTest2() {
		System.out.println("Excecuting HF Test No 2");
	}
	
	@Test
	public void HFTest3() {
		System.out.println("Excecuting HF Test No 3");
	}

	
}
