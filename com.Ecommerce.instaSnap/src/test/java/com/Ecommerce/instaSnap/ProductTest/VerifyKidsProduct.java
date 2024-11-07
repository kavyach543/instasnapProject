package com.Ecommerce.instaSnap.ProductTest;

import org.testng.Reporter;
import org.testng.annotations.Test;

import com.Ecommerce.instaSnap.genericLibrary.BaseTest;


public class VerifyKidsProduct extends BaseTest {
	
	@Test(priority=1)
	public void createProduct()
	{
		Reporter.log("kids Product Created",true);
	}
	@Test(priority=2,invocationCount=2,dependsOnMethods="createProduct")
	public void updateproduct() {
		
		Reporter.log("kids Product Updated",true);
		
		
	}
	

}
