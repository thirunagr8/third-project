package NewProject;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Facebooklike {

	public static void main(String[] args) {
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--disable-notifications");
		//driver = new ChromeDriver(options);
		System.setProperty("webdriver.chrome.driver","./Driver/ChromeDriver.exe" );
		ChromeDriver driver = new ChromeDriver(options);
		driver.get("https://www.facebook.com/");

		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.findElementById("email").sendKeys("thirunagr8@gmail.com");
		driver.findElementById("pass").sendKeys("infotech@1");
		driver.findElementById("loginbutton").click();
		//driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

		driver.findElementByClassName("_1frb").sendKeys("Testleaf");
		driver.getKeyboard().sendKeys(Keys.ENTER);

		//driver.findElementByClassName("_42ft _4jy0 _4w98 _4jy3 _517h _51sy").click();


		String text = driver.findElementByXPath("//div[@class='_3ko9']//button").getText();
		System.out.println(text);
		if (text.contains("Liked"))
		{
			System.out.println("Already liked");

		}
		else
		{
			driver.findElementByXPath("//div[@class='_3ko9']//button").click();
		}
		driver.findElementByXPath("//div[text()='TestLeaf']").click();
		String text1 = driver.findElementByXPath("//div[contains(text(),'people like this')]").getText();
		System.out.println(text1);

	}
}