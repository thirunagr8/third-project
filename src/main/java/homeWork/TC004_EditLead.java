package homeWork;



	import org.openqa.selenium.WebElement;
	import org.testng.annotations.BeforeTest;
	import org.testng.annotations.Test;

import wdMethods.ProjectMethods;
//import wdmethods.ProjectMethods;
	import wdMethods_old.SeMethods;

	public class TC004_EditLead extends ProjectMethods{
		
		@BeforeTest(groups= {"common"})
		public void setData() {
		testCaseName = "EditLead";
		testCaseDesc="Edit a Lead";
		category="Smoke";
		author="Thiru";
		}
		@Test(groups= {"sanity"})
		public void editLead() throws InterruptedException {
		
		WebElement leadTab = locateElement("linktext", "Leads");
		click(leadTab);
		
		//Click Leads link
		WebElement leadEle = locateElement("linktext", "Leads");
		click(leadEle);
		//Click Find leads
		WebElement fleadEle = locateElement("linktext", "Find Leads");
		click(fleadEle);
		
		WebElement leadId = locateElement("xpath", "(//div[@class='gwtWidget subSectionBlock']//input)[2]");
		type(leadId,"babu");
		
		Thread.sleep(3000);
		WebElement btnfLead = locateElement("xpath", "//button[text()='Find Leads']");
		click(btnfLead);
		Thread.sleep(3000);
		WebElement fEle = locateElement("linktext", "10032");
		click(fEle);
		
		String title= getTitle();
		System.out.println(title);
		
		 verifyTitle(title);
		 Thread.sleep(3000);
		 WebElement editEle = locateElement("xpath", "//a[text()='Qualify Lead']/following::a[1]");
		click(editEle);
		
		WebElement comName = locateElement("updateLeadForm_companyName");
		comName.clear();
		type(comName,"Conduent");
		
		 WebElement updEdit = locateElement("xpath", "//input[@value='Update']");
			click(updEdit);
			
			verifyExactText(comName, "Conduent");
		
		}
		

	}
