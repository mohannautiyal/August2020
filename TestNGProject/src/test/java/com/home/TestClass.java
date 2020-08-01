package com.home;

import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import com.home.data.data;

public class TestClass {
	
	@BeforeSuite
	public void BeforeSuite() {
		System.out.println("Running before suite");
	}
	
	@Test(dataProviderClass=data.class,dataProvider="getData")
	public void TestData(String Param1,int Param2) {
		System.out.println("Running with DataProvider "+Param1+"  and "+Param2);
		
	}

}
