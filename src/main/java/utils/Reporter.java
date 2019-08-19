package utils;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

public class Reporter {
	public static ExtentReports extent;
	public static ExtentTest test;
	public static String testCaseName,testCaseDesc,category,author,fileName;
	public void beginResult() {
		ExtentHtmlReporter html = new ExtentHtmlReporter("./reporter/result.html");
		html.setAppendExisting(false);
		extent = new ExtentReports();
		extent.attachReporter(html);
	}	

	public void startTestCase() {
		test = extent.createTest(testCaseName, testCaseDesc);
		test.assignCategory(category);
		test.assignAuthor(author);
	}

	public void reportStep(String desc,String status) {
		if(status.equalsIgnoreCase("Pass")) {

			test.pass(desc);			
		} else if(status.equalsIgnoreCase("Fail")) {
			test.fail(desc);			
		} else if(status.equalsIgnoreCase("Warning")) {
			test.warning(desc);			
		}		
	}	

	public void endResult() {
		extent.flush();
	}
}