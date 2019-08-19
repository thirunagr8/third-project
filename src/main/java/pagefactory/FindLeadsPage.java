package pagefactory;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;


public class FindLeadsPage extends groups.ProjectMethods {
	public FindLeadsPage() {
		PageFactory.initElements(driver, this);
	}
	/*@FindBy(how = How.LINK_TEXT, using ="Leads")
	WebElement eleLeads;
	public MyLeadsPage clickLeads()
	{
		click (eleLeads);
		return new  MyLeadsPage();
	}*/
	@FindBy(xpath="//div[@class='gwtWidget subSectionBlock']//input)[2]")
	WebElement elefirstName;
	public FindLeadsPage typefindleads(String data)
	{
		type(elefirstName,data);
		return this;
	}
	@FindBy(xpath="//button[text()='Find Leads']")
	WebElement eleFindLeadBtn;
	public FindLeadsPage clickFindLeadsBtn() {
		click(eleFindLeadBtn);
		return this;
	}

	//Click Found element 
	@FindBy(linkText="10020")
	WebElement eleSearchItem;
	public FindLeadsPageForDelete clickSearchItem() {
		click(eleSearchItem);
		return new FindLeadsPageForDelete();
	}
}
