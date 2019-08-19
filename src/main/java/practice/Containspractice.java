package practice;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.apache.commons.collections4.iterators.ArrayListIterator;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Containspractice {

	public static void main(String[] args) {
		ChromeOptions op = new ChromeOptions();
		op.addArguments("disable-notifications");
	System.setProperty("webdriver.chrome.driver", "./Driver/chromedriver.exe");
	ChromeDriver driver = new ChromeDriver(op);
	driver.navigate().to("https://www.toolsqa.com/automation-practice-form/");
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(2000, TimeUnit.MILLISECONDS);
	//driver.findElementByXPath("(//input[@type='radio'])[2]").click();
	List<WebElement> lst =	(List<WebElement>) driver.findElementByXPath("//input[@type='radio']");
	int sz = lst.size();
	System.out.println(sz);
	
	}}
