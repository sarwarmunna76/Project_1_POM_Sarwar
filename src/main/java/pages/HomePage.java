package pages;

import org.openqa.selenium.remote.RemoteWebDriver;

import com.relevantcodes.extentreports.ExtentTest;

import wrappers.ProjectSpecificWrappers;

public class HomePage extends  ProjectSpecificWrappers{
	
	public HomePage(RemoteWebDriver driver, ExtentTest test){
		this.driver = driver;
		this.test = test;

		if(!verifyTitle("My account-My Store")){
			reportStep("This is not Home Page", "Fail");
		}
	}
		
		public MyaddressPage clickMyAddress() {
			
			clickByXpath("//span[contains(text(),'My addresses')]");
			return new MyaddressPage(driver, test);
			
		 
		}
		
	
	


}
