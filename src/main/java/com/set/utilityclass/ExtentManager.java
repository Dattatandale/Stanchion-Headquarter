package com.set.utilityclass;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

public class ExtentManager {
	public static ExtentHtmlReporter htmlreporter;
	public static ExtentReports report;
	public static ExtentTest test;

	public static void setextent() {
		htmlreporter = new ExtentHtmlReporter("./ExtentReport/ExtentReport.html");

	}

}
