package practice;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Practiceon27022019 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./Driver/ChromeDriver.exe");
		ChromeOptions op = new ChromeOptions();
		op.addArguments("--disable-notification");
		ChromeDriver driver = new ChromeDriver(op);
		//driver.get("http://automationpractice.com/index.php");
		driver.get("http://demo.guru99.com/test/guru99home/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(2000, TimeUnit.MILLISECONDS);
		WebDriverWait waits = new WebDriverWait(driver,10);
		//waits.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[@class=header_user_info"))).click();;
		
		WebElement src1 =driver.findElementById("SubmitCreate");
		Select dropdown = new Select(src1);
		dropdown.selectByVisibleText("India");
		
		List<WebElement> options = dropdown.getOptions();
		for (WebElement eachoption : options) {
String str = eachoption.getText();
System.out.println(str);
			
		}
	

		
		

	}

}
