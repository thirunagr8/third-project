package practice;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Webtableinseleniumpractice {

	public static void main(String[] args) {
		ChromeOptions op = new ChromeOptions();
		op.addArguments("disable-notifications");
	System.setProperty("webdriver.chrome.driver", "./Driver/chromedriver.exe");
	ChromeDriver driver = new ChromeDriver(op);
	driver.navigate().to("http://demo.guru99.com/test/newtours/register.php");
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(2000, TimeUnit.MILLISECONDS);
 WebElement src = driver.findElementByName("country");
 Select dropdown = new Select(src);
/* dropdown.selectByValue("ANGOLA");
List<WebElement> options = dropdown.getOptions();
*///dropdown.selectByIndex(5);
int l = dropdown.getOptions().size();/*
WebDriverWait wait = webdriverwait(driver,10);
wait.until(ExpectedConditions.elementToBeSelected(src));*/

WebDriverWait wait = new WebDriverWait(driver,10);
wait.until(ExpectedConditions.elementToBeSelected(src));


dropdown.selectByIndex(l-2);/*
for (WebElement ele : options) {
	System.out.println(ele.getText());*/
	
}

	private static WebDriverWait webdriverwait(ChromeDriver driver, int i) {
		// TODO Auto-generated method stub
		return null;
	}
	}


