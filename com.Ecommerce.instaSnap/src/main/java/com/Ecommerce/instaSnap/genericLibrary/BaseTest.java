package com.Ecommerce.instaSnap.genericLibrary;

import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

public class BaseTest {
	@BeforeClass
	public void BrowserSetup() {
		Reporter.log("Brower launched Successfully", true);		
		
	}
	@BeforeMethod
	public void login() {
		Reporter.log("login Successfully", true);		
			
	}
	@AfterMethod
	public void logout() {
		Reporter.log("logout Successfully", true);
	}
	@AfterClass
	public void terminateBrower() {
		Reporter.log("Brower terminate Successfully",true);
	}
	

}
