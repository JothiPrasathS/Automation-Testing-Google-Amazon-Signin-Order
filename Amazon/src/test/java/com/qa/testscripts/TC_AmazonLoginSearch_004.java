
package com.qa.testscripts;

import java.io.IOException;

import org.openqa.selenium.Keys;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.qa.pages.AmazonLoginPages;

public class TC_AmazonLoginSearch_004 extends TestBase4 {
	
	AmazonLoginPages pages;
	
	@Parameters({"Browser","Url"})
	@Test
	public void Test() throws InterruptedException, IOException
	{
		
		 pages =new AmazonLoginPages(Driver);
		 
		 pages.searchbox().sendKeys("amazon"+Keys.ENTER);
		 
		 Thread.sleep(3000);
		 
		 pages.amzpage().click();
		 
		 Thread.sleep(2000);
		 
		 pages.signup().click();
		 
		 Thread.sleep(2000);
		 
		 pages.createAccount().click();
		 
		 Thread.sleep(2000);
		 
		 pages.Fname().sendKeys("Jothi Prasath");
		 
		 pages.Mobileno().sendKeys("8807019543");

		 pages.Email().sendKeys("19e216@kce.ac.in");
		 
		 pages.password().sendKeys("Jothi2510*+@");
		 
		 Thread.sleep(2000);
		 
		 pages.continue1().click();
		
		 Thread.sleep(2000);
}
}
