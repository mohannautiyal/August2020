package com.home.data;

import org.testng.annotations.DataProvider;

public class data {
	
	
	@DataProvider
	public static Object[][] getData(){
		
		Object[][] data = new Object[2][2];
		data[0][0] = "Madan Nautiyal";
		data[0][1]=1234;
		
		data[1][0]="Rishita Nautiyal";
		data[1][1]=2345;
		
		return data;
		
	}

}
