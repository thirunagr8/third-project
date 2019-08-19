package wdMethods;

import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ProjectMethods extends SeMethods{
	@BeforeSuite (groups = {"smoke"})
	public void beforeSuite() {
		beginResult();
	}
	@BeforeClass (groups = {"smoke"})
	public void beforeClass() {
		startTestCase();
	}
@Parameters({"url","username","password"})
	@BeforeMethod (groups = {"smoke"})
@Test
	public void login(String url,String username,String password) {
		startApp("chrome",url);
		WebElement eleUserName = locateElement("id", "username");
		type(eleUserName, username);
		WebElement elePassword = locateElement("id","password");
		type(elePassword, password);
	/*	WebElement eleLogin = locateElement("class", "decorativeSubmit");
		click(eleLogin);
		WebElement eleCRM = locateElement("linkText","CRM/SFA");
		click(eleCRM);*/
	}
	/*@AfterMethod
	public void closeApp() {
		closeBrowser();
	}
	 */@AfterSuite (groups = {"smoke"})
	 public void afterSuite() {
		 endResult();
	 }
}
