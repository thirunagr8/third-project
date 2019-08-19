package steps;

import java.sql.Driver;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.And;
import cucumber.api.java.en.But;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class LoginSteps {
	public ChromeDriver driver;
	@Given("Open the Chrome Browser")
	public void OpenBrowser()
	{
		System.setProperty("webdriver.chrome.driver","./Driver/ChromeDriver.exe" );
		driver = new ChromeDriver();	
	}
	@And("maximize the Browser")
	public void maxBrowser()
	{
		driver.manage().window().maximize();
	}
	@And("Set the timeouts")
	public void setTimeouts()
	{
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	}

	@And("Hit the URL")
	public void LoadURL()
	{
		driver.get("http://leaftaps.com/opentaps/");
	}
	@And("Enter the User Name as (.*)")
	public void UserName(String username)
	{
		driver.findElementById("username").sendKeys(username);
	}

	@And("Enter the Password as (.*)")
	public void Password(String password)
	{
		driver.findElementById("password").sendKeys(password);
	}

	@When("click on the Login Button")
	public void clickbutton()
	{
		driver.findElementByClassName("decorativeSubmit").click();
	}
	@Then("veify the Login is Success")
	public void LoginSuccess()
	{
		System.out.println("Success");
	}
	@But("verify the Login is failed")
	public void LoginFail()
	{
		System.out.println("Failed");
	}
}

