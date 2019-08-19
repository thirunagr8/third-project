package wdMethods_old;

import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;

public class ProjectMethods extends SeMethods{
	@BeforeSuite
	public void beforeSuite() {
		beginResult();
	}
	@BeforeClass
	public void beforeClass() {
		startTestCase();
	}

	@BeforeMethod
	public void login() {
		startApp("chrome", "http://leaftaps.com/opentaps");
		WebElement eleUserName = locateElement("id", "username");
		type(eleUserName, "DemoSalesManager");
		WebElement elePassword = locateElement("id","password");
		type(elePassword, "crmsfa");
		WebElement eleLogin = locateElement("class", "decorativeSubmit");
		click(eleLogin);
		WebElement eleCRM = locateElement("linkText","CRM/SFA");
		click(eleCRM);
	}
	@AfterMethod
	public void closeApp() {
		closeBrowser();
	}
	@AfterSuite
	public void afterSuite() {
		endResult();
	}








}
