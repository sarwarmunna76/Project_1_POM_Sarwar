package testcases;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pages.LoginPage;
import pages.MyaddressPage;
import wrappers.ProjectSpecificWrappers;

public class TestCase2 extends ProjectSpecificWrappers{
	
	@BeforeClass
	public void setData() {
		testCaseName="TestCase2";
		testDescription="Lognin, Checkout and Lognout";
		browserName="chrome";
		dataSheetName="TC001";
		category="Smoke";
		authors="Sarwar";
	}
	@Test(dataProvider="fetchData")
	public void testCase2(String UN, String PW) throws InterruptedException {
		new LoginPage(driver,test)
		.enterUserName(UN)
		.enterPassword(PW)
		.clicklogin();
		new MyaddressPage(driver,test).clickWomen().scrollToElement().varifyProduct().proceedCheckout()
		.checkTermsAndService().clickSignout();
	
		
	
	}

}
