package pagefactory;

import org.openqa.selenium.WebElement;

import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import groups.ProjectMethods;
public class DeleteLeadPage extends ProjectMethods {
	public DeleteLeadPage()
	{
		PageFactory.initElements(driver, this);

	}
	@FindBy(how = How.LINK_TEXT, using ="Phone")
	WebElement elePhone;
	public DeleteLeadPage clickPhone()
	{
		click (elePhone);
		return new DeleteLeadPage();
	}
	@FindBy(xpath ="//button[text()='Find Leads']")
	WebElement fleadEle2;
	public DeleteLeadPage clickfindleads2()
	{
		click(fleadEle2);
		return this;
	}
	@FindBy(how = How.LINK_TEXT, using = "10017")
	WebElement fEle2;
	public DeleteLeadPage clickfEle2()
	{
		click(fEle2);
		return  this;
	}
	
	@FindBy(how = How.CLASS_NAME, using="subMenuButtonDangerous")
	WebElement fleadDelete;
	public DeleteLeadPage clickdelete()
	{
		click(fleadDelete);
		return this;
	}
}
