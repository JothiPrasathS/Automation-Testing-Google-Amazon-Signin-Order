package com.qa.testscripts;

import org.testng.annotations.Test;
import org.openqa.selenium.Keys;
import org.testng.annotations.Parameters;

import com.qa.pages.AmazonSigninPages;

public class TC_AmazonSigninSearch_005 extends TestBase5{
	AmazonSigninPages amzsign;
	@Parameters({"Brower","Url"})
	@Test
	public void Test() throws InterruptedException
	{
		amzsign=new AmazonSigninPages(Driver);
		
		Thread.sleep(1000);
  		amzsign.GSearchBox().sendKeys("amazon"+Keys.ENTER);
  		Thread.sleep(1000);
  		amzsign.amz().click();
  	
  		Thread.sleep(1000);
  
		amzsign.SigninBox().click();
		
		amzsign.CreateNewAccBox().click();
		Thread.sleep(1000);
		
		amzsign.NewNameBox().sendKeys("Jothi Prasath"+Keys.ENTER);
		Thread.sleep(1000);
		
		amzsign.NewMobileBox().sendKeys("9361489543"+Keys.ENTER);
		
		amzsign.NewEmailBox().sendKeys("19e216@kce.ac.in"+Keys.ENTER);
		Thread.sleep(1000);
		
		amzsign.NewPassBox().sendKeys("Jothi2510*+@"+Keys.ENTER);
		Thread.sleep(1000);
//	    amzsign.Continue().click();
//	    
//		Thread.sleep(1000);
	}

}
