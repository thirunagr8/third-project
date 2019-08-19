package groups;

import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;

import testcase.ReadExcel;
import wdMethods.SeMethods;

public class ProjectMethods extends SeMethods{
	@BeforeSuite (groups = {"smoke"})
	public void beforeSuite() {
		beginResult();
	}
	@BeforeClass (groups = {"smoke"})
	public void beforeClass() {
		startTestCase();
	}

	@BeforeMethod (groups = {"smoke"})
	public void login() {
		startApp("chrome","http://leaftaps.com/opentaps/");
		/*WebElement eleUserName = locateElement("id", "username");
		type(eleUserName,username);
		WebElement elePassword = locateElement("id","password");
		type(elePassword, password);
		WebElement eleLogin = locateElement("class", "decorativeSubmit");
		click(eleLogin);
		WebElement eleCRM = locateElement("linkText","CRM/SFA");
		click(eleCRM);*/

	}
	@AfterMethod
	public void closeApp() {
		closeBrowser();
	}
	@AfterSuite (groups = {"smoke"})
	public void afterSuite() {
		endResult();
	}

	@DataProvider (name = "fetchdata")
	public Object[][] fetchData() throws Exception
	{
		return ReadExcel.getExcelData(fileName);

	}
}


