package pagefactory;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import groups.ProjectMethods;

public class LoginPage extends ProjectMethods{

	public LoginPage()
	{
		PageFactory.initElements(driver, this);

	}
	@FindBy(id="username")
	WebElement eleUserName;
	public LoginPage typeUserName(String data)
	{
		type(eleUserName,data);
		return this;
	}
	@FindBy(id="password")
	WebElement elePassword;
	public LoginPage typePassword(String data)
	{
		type(elePassword,data);
		return this;
	}


	@FindBy(how = How.CLASS_NAME, using ="decorativeSubmit")
	WebElement eleLogin;
	public HomePage clickLogin()
	{
		click (eleLogin);
		return new  HomePage();

	}}