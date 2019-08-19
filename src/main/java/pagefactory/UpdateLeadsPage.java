package pagefactory;

import org.openqa.selenium.WebElement;

import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import groups.ProjectMethods;
public class UpdateLeadsPage extends ProjectMethods {
	public UpdateLeadsPage()
	{
		PageFactory.initElements(driver, this);

	}

	@FindBy(xpath="//a[text()='Qualify Lead']/following::a[1]")
	WebElement editEle1;
	public UpdateLeadsPage clickeditEle()

	{
		click(editEle1);
		return this;
	}
	@FindBy(id="updateLeadForm_companyName")
	WebElement updateCompanyName;
	public UpdateLeadsPage updateLeadForm_companyName(String data)
	{
		type(updateCompanyName,"Conduent");
		return this;
	}
	@FindBy(xpath="//input[@value='Update']")
	WebElement upeditEle;
	public UpdateLeadsPage clickupedit()

	{
		click(upeditEle);
		return this;
	}
	/*@FindBy(how = How.XPATH, using = "//h2[text()='Conduent']")

	WebElement eleverifyUname;
	public UpdateLeadsPage verifyUsername(String data) {
		verifyPartialText(eleverifyUname, data);
		return this;
	}
*/}
