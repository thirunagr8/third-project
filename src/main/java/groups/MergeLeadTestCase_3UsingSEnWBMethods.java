package groups;
import java.util.ArrayList;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import wdMethods.ProjectMethods;

public class MergeLeadTestCase_3UsingSEnWBMethods extends ProjectMethods {
	@BeforeTest (groups = {"regression"})

	public void setData()
	{
		testCaseName = "Test_case_001";
		testCaseDesc = "Test case to create Lead";
		category = "smoke";
		author = "Thiru";
	}
	@Test (groups = {"regression"})
	//public static void main(String[] args) throws InterruptedException {
	//MergeLead Homework - Test case Excel sheet - Sep 8th

	/*	System.setProperty("webdriver.chrome.driver", "./Driver/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.findElementById("username").sendKeys("DemoSalesManager");
		driver.findElementById("password").sendKeys("crmsfa");
		driver.findElementByClassName("decorativeSubmit").click();
		driver.findElementByLinkText("CRM/SFA").click();
	 */
	//Thread.sleep(2000);
	public void mergelead() throws InterruptedException {
		WebElement elemergeLead = locateElement("linkText","Leads");
		click(elemergeLead);
		//	WebElement eleCreateLead = locateElement("linkText","Create Lead");
		//click(eleCreateLead);
		WebElement elemergeLeads = locateElement("linkText","Merge Leads");
		click(elemergeLeads);
		WebElement elelookup = locateElement("xpath","//img[@alt='Lookup']");
		click(elelookup);

		//Navigate to Find Leads window
		Set<String> windHand = driver.getWindowHandles();
		ArrayList<String>windHandArr=new ArrayList<String>();
		windHandArr.addAll(windHand);
		driver.switchTo().window(windHandArr.get(1));
		Thread.sleep(2000);

		String txt = driver.findElementByXPath("(//a[@class='linktext']/parent::div)[1]").getText();
		WebElement eleid = locateElement("xpath","//input[@name='id']");
		click(eleid);

		//	driver.findElementByXPath("//input[@name='id']").sendKeys(txt);(1)
		WebElement elebtn = locateElement("xpath","(//td[@class='x-btn-center'])[1]");
		click(elebtn);
		Thread.sleep(2000);

		WebElement elelinktext = locateElement("xpath","(//a[@class='linktext'])[1]");
		click(elelinktext);
		//Thread.sleep(2000);

		//Switch back to primary window
		driver.switchTo().window(windHandArr.get(0));

		//Thread.sleep(2000);
		WebElement elelookup2 = locateElement("xpath","(//img[@alt='Lookup'])[2]");
		click(elelookup2);

		//Navigate to Find Leads window
		windHand = driver.getWindowHandles();
		windHandArr=new ArrayList<String>();
		windHandArr.addAll(windHand);
		driver.switchTo().window(windHandArr.get(1));
		Thread.sleep(2000);

		String txt1 = driver.findElementByXPath("(//div[@class='x-grid3-cell-inner x-grid3-col-partyId'])[10]").getText();
		driver.findElementByXPath("//input[@name='id']").sendKeys(txt1);
		WebElement elebtncenter2 = locateElement("xpath","(//td[@class='x-btn-center'])[1]");
		click(elebtncenter2);
		Thread.sleep(2000);

		WebElement eleclslink = locateElement("xpath","//div[@class='x-grid3-cell-inner x-grid3-col-partyId']//a[@class='linktext']");
		click(eleclslink);
		//Thread.sleep(2000);

		//Switch back to primary window
		driver.switchTo().window(windHandArr.get(0));
		Thread.sleep(2000);

		WebElement elemerge1 = locateElement("linkText","Merge");
		click(elemerge1);
		Alert alert = driver.switchTo().alert();
		alert.accept();
		WebElement elefindleads1 = locateElement("linkText","Find Leads");
		click(elefindleads1);
		Thread.sleep(2000);
		WebElement eleCompName = locateElement("xpath","(//div[@class='x-form-item x-tab-item'])[1]//input[@name='id']");
		type(eleCompName,"ab");
		WebElement elebutnleads = locateElement("xpath","//button[text()='Find Leads']");
		click(elebutnleads);
		driver.close();

	}

}

