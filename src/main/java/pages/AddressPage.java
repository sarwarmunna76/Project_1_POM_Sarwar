package pages;

import org.openqa.selenium.remote.RemoteWebDriver;

import com.relevantcodes.extentreports.ExtentTest;

import wrappers.ProjectSpecificWrappers;

public class AddressPage extends ProjectSpecificWrappers {
	public AddressPage(RemoteWebDriver driver, ExtentTest test){
		this.driver = driver;
		this.test = test;

		if(!verifyTitle("Login-My Store")){
			reportStep("This is not Login Page", "Fail");
		}

}
	public AuditPage clickNewAddress() {
	
	getElementByXpath("//span[contains(text(),'Update')]").click();
	return new AuditPage(driver, test);
	}
}
