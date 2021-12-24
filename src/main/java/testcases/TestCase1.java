package testcases;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pages.LoginPage;
import wrappers.ProjectSpecificWrappers;

public class TestCase1 extends ProjectSpecificWrappers{
	
	@BeforeClass
	public void setData() {
		testCaseName="TestCase1";
		testDescription="Login, Update city and state, and Logout";
		browserName="chrome";
		dataSheetName="TC001";
		category="Smoke";
		authors="Sarwar";
	}
	@Test(dataProvider="fetchData")
	public void TestCase1(String UN, String PW) {
		
		new LoginPage(driver,test)
		.enterUserName(UN)
		.enterPassword(PW)
		.clicklogin()
		.clickMyAddress()
		.clickNewAddress()
		.clickCity()
		.findState()
		.findCity()
		.varifyStateName()
		.varifycityName()
		.clickSignOut();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
