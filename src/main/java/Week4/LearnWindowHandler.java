package Week4;

import java.net.HttpURLConnection;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class LearnWindowHandler {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./Driver/ChromeDriver.exe" );
		ChromeOptions op = new ChromeOptions();
		op.addArguments("--disable-notifications");
		ChromeDriver wb = new ChromeDriver(op);
		wb.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		wb.manage().window().maximize();

		//String homePage = "http://www.google.com";
		String url = "https://www.icicibank.com/";
      //  String url = "";
     //   HttpURLConnection huc = null;
       /* int respCode = 200;
        if(respCode >= 400){
            System.out.println(url+" is a broken link");
        }
        else{
            System.out.println(url+" is a valid link");
        }*/
		wb.get(url);
        JavascriptExecutor js =(JavascriptExecutor) wb;
        js.executeScript("scroll(0,1000)");
        
		/*wb.get("https://www.irctc.co.in/eticketing/userSignUp.jsf");
		wb.findElementByLinkText("Contact Us").click();

		Set<String> windowHandles = wb.getWindowHandles();
		List<String> allwindows = new ArrayList<>();
		allwindows.addAll(windowHandles);
		wb.switchTo().window(allwindows.get(0));
		System.out.println(wb.getTitle());
		System.out.println(wb.getCurrentUrl());
		
		Set<String> wh = wb.getWindowHandles();
		List<String> allw = new ArrayList<>();
		allw.addAll(wh);
		wb.switchTo().window(allw.get(0));
		System.out.println(wb.getCurrentUrl());
		System.out.println(wb.getTitle());
		System.out.println(wb.getSessionId());*/
	}
}

