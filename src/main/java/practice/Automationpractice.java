package practice;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

public class Automationpractice {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./Driver/chromedriver.exe");
		ChromeOptions op = new ChromeOptions();
		op.addArguments("--disable-notifications");
		ChromeDriver driver = new ChromeDriver(op);
		driver.get("http://automationpractice.com/index.php");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(2000,TimeUnit.MILLISECONDS);
		driver.findElementByClassName("login").click();
		driver.findElementById("email").sendKeys("thirunagr8@gmail.com");
		driver.findElementById("passwd").sendKeys("Coke@123");
		driver.findElementById("SubmitLogin").click();
		driver.findElementByXPath("//*[@id=\"block_top_menu\"]/ul/li[2]/a").click();
		driver.findElementByXPath("//*[@id=\"subcategories\"]/ul/li[2]/div[1]/a/img").click();

		WebElement element = driver.findElementByClassName("replace-2x img-responsive");
		Actions actions = new Actions(driver);
		actions.moveToElement(element).build().perform();

	}

}
