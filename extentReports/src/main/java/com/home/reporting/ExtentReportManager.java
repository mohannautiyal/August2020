package com.home.reporting;

import java.io.File;
import java.util.Date;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class ExtentReportManager {

	public static ExtentReports reports;

	public static ExtentReports getReports() {

		if (reports == null) {
			
			// Create report folder with timestamp
			Date date = new Date();
			String reportPath = System.getProperty("user.dir") + "\\Reports\\"+date.toString().replace(":", "_");
			File file = new File(reportPath+"\\Screenshots");
			file.mkdirs();
			
			// initialize the report object
			reports = new ExtentReports();
			ExtentSparkReporter reporter = new ExtentSparkReporter(reportPath);
			reporter.config().setReportName("Extent Report");
			reporter.config().setTheme(Theme.DARK);

			reports.attachReporter(reporter);
		}
		return reports;

	}
}
