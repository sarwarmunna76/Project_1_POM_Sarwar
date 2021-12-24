package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.Select;

import com.relevantcodes.extentreports.ExtentTest;

import wrappers.ProjectSpecificWrappers;

public class AuditPage extends  ProjectSpecificWrappers{
	
	public AuditPage(RemoteWebDriver driver, ExtentTest test){
		this.driver = driver;
		this.test = test;

		if(!verifyTitle("Address-My Store")){
			reportStep("This is not Adit Page", "Fail");
		}
	}
		public AuditPage clickCity() {
			
			getElementByXpath("//input[@name='city']").sendKeys("Texas");
			return this;
			
			}
		public AuditPage findState () {
			
			WebElement PD = getElementByXpath("//select[@id='id_state']");
			
			Select option = new Select(PD);
			option.selectByVisibleText("Ohio");
			return this;
			
		}
		
		public MyaddressPage findCity() {
			
			getElementByXpath("//button[@id='submitAddress']").click();
			return new MyaddressPage(driver, test);
			
			
			
			
		}
		
		
	
	
	
	

}
