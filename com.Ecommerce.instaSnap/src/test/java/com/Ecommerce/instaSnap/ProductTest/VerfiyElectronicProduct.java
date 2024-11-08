package com.Ecommerce.instaSnap.ProductTest;

import org.testng.Reporter;
import org.testng.annotations.Test;

import com.Ecommerce.instaSnap.genericLibrary.BaseTest;

public class VerfiyElectronicProduct extends BaseTest {

		@Test(priority=1)
		public void createProduct()
		{
			Reporter.log("Electronic Product Created",true);
		}
		@Test(priority=2,invocationCount=2,dependsOnMethods="createProduct")
		public void updateproduct() {
			Reporter.log("Electronic Product Updated",true);
		}
		
			
		}


