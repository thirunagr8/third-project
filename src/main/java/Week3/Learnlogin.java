package Week3;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Learnlogin {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./Driver/ChromeDriver.exe" );
		ChromeDriver wb = new ChromeDriver();
		wb.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		wb.get("http://leaftaps.com/opentaps/");
		try {
			wb.findElementById("username").sendKeys("DemoSalesManager");
			wb.findElementById("password").sendKeys("crmsfa");
			wb.findElementByClassName("decorativeSubmit").click();
			wb.findElementByLinkText("CRM/SFA").click();
			wb.findElementByLinkText("Create Lead").click();
			wb.findElementById("createLeadForm_companyName").sendKeys("Lathikka Ltd");
			wb.findElementById("createLeadForm_firstName").sendKeys("Lathika");
			wb.findElementById("createLeadForm_lastName").sendKeys("Sandeep");
			//Dropdown using Visible text

			WebElement src = wb.findElementById("createLeadForm_dataSourceId");
			Select dropDown = new Select(src);
			dropDown.selectByVisibleText("e");
			//Dropdown using Index
			WebElement src1 = wb.findElementById("createLeadForm_marketingCampaignId");
			Select dropDown1 = new Select(src1);
			//dropDown1.selectByIndex(7);
			List<WebElement> options = dropDown1.getOptions();
			int h = options.size();
			dropDown1.selectByIndex(h-2);
			//	System.out.println(options.get(h-2));

			//System.out.println(h-2);
			/*for (WebElement each : options) {

				System.out.println(each.getText());
			}*/
		} catch (Exception e) {
			// TODO Auto-generated catch block
			System.out.println("Exception caught"+ e);
		}/*finally {
			wb.close();
		}*/
	}


}
//wb.findElementByClassName("smallSubmit").click();

