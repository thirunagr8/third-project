package pagefactory;

import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import groups.ProjectMethods;

public class MergeLeadsPage extends ProjectMethods {
	public MergeLeadsPage ()
	{
		PageFactory.initElements(driver, this);
	}

	
	@FindBy(linkText ="//button[text()='Merge Leads']")
	WebElement mleadEle;
	public MergeLeadsPage clickmergeleads()
	{
		click(mleadEle);
		return this;
	}
	@FindBy(xpath ="\"//img[@alt='Lookup']\"")
	WebElement elookup;
	public MergeLeadsPage typefindleads()
	{
		click(elookup);
		return this;
	}
	//Navigate to Find Leads window
	Set<String> windHand = driver.getWindowHandles();
	ArrayList<String>windHandArr=new ArrayList<String>();
	//windHandArr.addAll(windHand); need to add these two lines 10 09 2018
	//driver.switchTo().window(windHandArr.get(1));
	//Thread.sleep(2000);

	String txt = driver.findElementByXPath("(//a[@class='linktext']/parent::div)[1]").getText();
	@FindBy(xpath ="//input[@name='id']")
	WebElement eleid1;
	public MergeLeadsPage clickeleid1()
	{
		click(eleid1);
		return this;
	}
	//	driver.findElementByXPath("//input[@name='id']").sendKeys(txt);(1)
	@FindBy(xpath ="(//td[@class='x-btn-center'])[1]']")
	WebElement elebtn;
	public MergeLeadsPage clickelebtn()
	{
		click(elebtn);
		return this;
	}
	//Thread.sleep(2000);
	@FindBy(xpath ="(//a[@class='linktext'])[1]")
	WebElement elelinktext;
	public MergeLeadsPage clickeletxt()
	{
		click(elelinktext);
		return this;
	}
	//Thread.sleep(2000);
	//Switch back to primary window
	driver.switchTo().window(windHandArr.get(0));
	//Thread.sleep(2000);
	@FindBy(xpath ="(//img[@alt='Lookup'])[2]")
	WebElement elelookup2;
	public MergeLeadsPage clickelelookup()
	{
		click(elelookup2);
		return this;
	}
	
		//Navigate to Find Leads window
	windHand = driver.getWindowHandles();
	windHandArr=new ArrayList<String>();
	windHandArr.addAll(windHand);
	driver.switchTo().window(windHandArr.get(1));
	Thread.sleep(2000);
	String txt1 = driver.findElementByXPath("(//div[@class='x-grid3-cell-inner x-grid3-col-partyId'])[10]").getText();
	driver.findElementByXPath("//input[@name='id']").sendKeys(txt1);
	@FindBy(xpath ="(//td[@class='x-btn-center'])[1]")
	WebElement elebtncenter2;
	public MergeLeadsPage clickelecenter2()
	{
		click(elebtncenter2);
		return this;
	}
	Thread.sleep(2000);
}}
