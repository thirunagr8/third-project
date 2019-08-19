package homeWork;

import java.util.ArrayList;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.chrome.ChromeDriver;
public class Homework10092018 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./Driver/ChromeDriver.exe" );
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.findElementById("username").sendKeys("DemoSalesManager");
		driver.findElementById("password").sendKeys("crmsfa");
		driver.findElementByClassName("decorativeSubmit").click();
		driver.findElementByLinkText("CRM/SFA").click();

		Thread.sleep(2000);

		driver.findElementByLinkText("Leads").click();
		driver.findElementByLinkText("Merge Leads").click();
		driver.findElementByXPath("//img[@alt='Lookup']").click();

		//Navigate to Find Leads window
		Set<String> windHand = driver.getWindowHandles();
		ArrayList<String>windHandArr=new ArrayList<String>();
		windHandArr.addAll(windHand);
		driver.switchTo().window(windHandArr.get(1));
		Thread.sleep(2000);
		String txt = driver.findElementByXPath("(//a[@class='linktext']/parent::div)[1]").getText();
		driver.findElementByXPath("//input[@name='id']").sendKeys(txt);
		driver.findElementByXPath("(//td[@class='x-btn-center'])[1]").click();
		Thread.sleep(2000);
		driver.findElementByXPath("(//a[@class='linktext'])[1]").click();
		//Thread.sleep(2000);

		//Switch back to primary window
		driver.switchTo().window(windHandArr.get(0));

		//Thread.sleep(2000);
		driver.findElementByXPath("(//img[@alt='Lookup'])[2]").click();

		//Navigate to Find Leads window
		windHand = driver.getWindowHandles();
		windHandArr=new ArrayList<String>();
		windHandArr.addAll(windHand);
		driver.switchTo().window(windHandArr.get(1));
		Thread.sleep(2000);

		String txt1 = driver.findElementByXPath("(//div[@class='x-grid3-cell-inner x-grid3-col-partyId'])[10]").getText();
		driver.findElementByXPath("//input[@name='id']").sendKeys(txt1);
		driver.findElementByXPath("(//td[@class='x-btn-center'])[1]").click();
		Thread.sleep(2000);

		driver.findElementByXPath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']//a[@class='linktext']").click();
		//Thread.sleep(2000);

		//Switch back to primary window
		driver.switchTo().window(windHandArr.get(0));
		Thread.sleep(2000);
		driver.findElementByLinkText("Merge").click();
		Alert alert = driver.switchTo().alert();
		alert.accept();
		driver.findElementByLinkText("Find Leads").click();
		Thread.sleep(2000);
		driver.findElementByXPath("(//div[@class='x-form-item x-tab-item'])[1]//input[@name='id']").sendKeys(txt);
		driver.findElementByXPath("//button[text()='Find Leads']").click();
		driver.close();

	}}
