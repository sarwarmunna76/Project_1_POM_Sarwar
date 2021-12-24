package pages;


import org.openqa.selenium.remote.RemoteWebDriver;

import com.relevantcodes.extentreports.ExtentTest;

import wrappers.ProjectSpecificWrappers;

public class TshirtPage extends ProjectSpecificWrappers{
	
	public TshirtPage(RemoteWebDriver driver, ExtentTest test){
		this.driver = driver;
		this.test = test;

		if(!verifyTitle("T-shirts-My Store")){
			reportStep("This is not Tshirt Page", "Fail");
		}

}

	public OrderPage scrollToElement() throws InterruptedException {
		
		 mouseOverByXpath("//img[@itemprop='image']");
		
		clickByXpath("//*[@id=\"center_column\"]/ul/li/div/div[2]/div[2]/a[1]/span");
		Thread.sleep(3000);
		driver.switchTo().alert().getText();
		clickByXpath("//*[@id=\"layer_cart\"]/div[1]/div[2]/div[4]/a/span");
		return new OrderPage(driver, test);
		
	}
	
}