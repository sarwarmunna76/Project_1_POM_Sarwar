package pages;


import org.openqa.selenium.remote.RemoteWebDriver;

import com.relevantcodes.extentreports.ExtentTest;

import wrappers.ProjectSpecificWrappers;

public class MyaddressPage extends  ProjectSpecificWrappers{
	
	public MyaddressPage(RemoteWebDriver driver, ExtentTest test){
		this.driver = driver;
		this.test = test;

		if(!verifyTitle("Addresses-My Store")){
			reportStep("This is not Myaddress Page", "Fail");
		}
	}
	public TshirtPage clickWomen() {
		mouseOverByXpath("//a[@title='Women']");
		clickByXpath("//a[@title='T-shirts']");
		return new TshirtPage(driver,test);
		
	}
		public AuditPage clickNewAddress() {
			
			getElementByXpath("//span[contains(text(),'Update')]").click();
			return new AuditPage(driver, test);
			}
		public MyaddressPage varifyStateName() {
			
			String city = getTextByXpath("//*[@id=\"center_column\"]/div[1]/div/div/ul/li[5]/span[1]");
			System.out.println("City of the Address verified as: "+city);
			return this;
			
		}
		public MyaddressPage varifycityName() {
			
			String city = getTextByXpath("//*[@id=\"center_column\"]/div[1]/div/div/ul/li[5]/span[2]");
			System.out.println("City of the Address verified as: "+city);
			return this;
			
		}
		
		public LoginPage clickSignOut(){
			clickByXpath("//a[@class='logout']");
			return new LoginPage(driver, test); 
			
		
		
			
			
			
			
			
			
			
			
			
		

}
}
