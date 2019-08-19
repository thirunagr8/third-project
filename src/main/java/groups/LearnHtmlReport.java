package groups;

import java.io.IOException;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

public class LearnHtmlReport {

	public static void main(String[] args) throws IOException {
		ExtentHtmlReporter html = new ExtentHtmlReporter("./reporter/result.html"); 
		html.setAppendExisting(false);
		ExtentReports extent = new ExtentReports(); 
		extent.attachReporter(html);
		ExtentTest test = extent.createTest("TestCase_001", "Create a new test lead");
		test.assignCategory("Smoke");
		test.assignAuthor("Thiru");
		//test.pass("", MediaEntityBuilder.createScreenCaptureFromPath("").build());
		test.pass("Browser launched successfully",MediaEntityBuilder.createScreenCaptureFromPath("./../snaps/img1.png").build());
		//test.fail("Data not entered successfully",MediaEntityBuilder.createScreenCaptureFromPath("./../snaps/img2.png").build());
		test.pass("crmsfa data launched successfully",MediaEntityBuilder.createScreenCaptureFromPath("./../snaps/img3.png").build());
		extent.flush();
	}
}
