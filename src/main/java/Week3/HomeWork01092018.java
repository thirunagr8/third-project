package Week3;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
public class HomeWork01092018 {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./Driver/ChromeDriver.exe" );
		ChromeDriver wb = new ChromeDriver();
		wb.manage().window().maximize();
		wb.get("https://www.irctc.co.in/eticketing/userSignUp.jsf");
		wb.findElementById("userRegistrationForm:userName").sendKeys("abcdefg123");
		wb.findElementById("userRegistrationForm:checkavail").click();
		wb.findElementById("userRegistrationForm:password").sendKeys("infotech@1");
		wb.findElementById("userRegistrationForm:confpasword").sendKeys("infotech@1");
		WebElement ab = wb.findElementById("userRegistrationForm:securityQ");
		Select newid = new Select(ab);
		newid.selectByVisibleText("What is your pet name?");
		wb.findElementById("userRegistrationForm:securityAnswer").sendKeys("pinky");
		wb.findElementById("userRegistrationForm:firstName").sendKeys("Thirunaarasu");
		wb.findElementById("userRegistrationForm:gender:0").click();
		wb.findElementById("userRegistrationForm:maritalStatus:0").click();
		WebElement src = wb.findElementById("userRegistrationForm:dobDay");
		Select dropDown = new Select(src);
		dropDown.selectByVisibleText("04");
		WebElement src1 = wb.findElementById("userRegistrationForm:dobMonth");
		Select dropDown1 = new Select(src1);
		dropDown1.selectByVisibleText("AUG");
		WebElement src2 = wb.findElementById("userRegistrationForm:dateOfBirth");
		Select dropDown2 = new Select(src2);
		dropDown2.selectByVisibleText("1989");
		WebElement src3 = wb.findElementById("userRegistrationForm:occupation");
		Select dropDown3 = new Select(src3);
		dropDown3.selectByVisibleText("Public");
		WebElement src4 = wb.findElementById("userRegistrationForm:countries");
		Select dropDown4 = new Select(src4);
		dropDown4.selectByVisibleText("India");
		wb.findElementById("userRegistrationForm:email").sendKeys("divya82122018@yahoomail.com");
		wb.findElementById("userRegistrationForm:mobile").sendKeys("9952895774");
		WebElement src5 = wb.findElementById("userRegistrationForm:nationalityId");
		Select dropDown5 = new Select (src5);
		dropDown5.selectByVisibleText("India");
		wb.findElementById("userRegistrationForm:address").sendKeys("No 65");
		wb.findElementById("userRegistrationForm:pincode").sendKeys("600088",Keys.TAB);
		Thread.sleep(30);
		WebElement src6 = wb.findElementById("userRegistrationForm:cityName");
		Select dropDown6 = new Select (src6);
		dropDown6.selectByIndex(1);
		WebElement src7 = wb.findElementById("userRegistrationForm:postofficeName");
		Select dropDown7 = new Select (src7);
		dropDown7.deselectByIndex(1);
		wb.findElementById("userRegistrationForm:landline").sendKeys("42616485");
	} 

}
