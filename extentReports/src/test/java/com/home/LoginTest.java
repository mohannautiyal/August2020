package com.home;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.home.reporting.ExtentReportManager;

public class LoginTest {
	
	ExtentReports reports;
	
	@BeforeMethod
	public void init() {
		reports = ExtentReportManager.getReports();
	}
	
	@AfterMethod
	public void quit() {
		reports.flush();
	}
	
	@Test
	public void LoginTestCase() {
		
		ExtentTest test = reports.createTest("Login Test");
		test.log(Status.INFO,"Login to the application");
		test.log(Status.PASS,"Successfully logged into the application");
			}

}
