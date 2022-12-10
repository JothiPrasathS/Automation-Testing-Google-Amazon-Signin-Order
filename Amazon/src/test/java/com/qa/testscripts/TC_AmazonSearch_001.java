package com.qa.testscripts;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.qa.pages.AmazonPages;

public class TC_AmazonSearch_001 extends TestBase1
{
	AmazonPages amzpages;
@Parameters({"Browser","Url"})
@Test
public void Search(String Browser,String Url) throws InterruptedException
{
	amzpages=new AmazonPages(Driver);
//	amzpages.SearchBox().sendKeys("Samsung mobiles");
//	amzpages.SearchBox().sendKeys(Keys.ENTER);
//	Thread.sleep(2000);
//	String title=Driver.getTitle();
//	if(title.contains("Samsung mobiles"))
//		System.out.println("User Landed on Da Vince Code page");
//	else
//		System.out.println("User Landed on Da Vince Code page");
//	
//    Driver.navigate().back();
//	
//	Thread.sleep(2000);
//	
//	Driver.navigate().refresh();
	
	Thread.sleep(2000);
	
	JavascriptExecutor jse=(JavascriptExecutor)Driver;
	
	jse.executeScript("window.scrollBy(0,4250");
	
	Thread.sleep(2000);
	
    jse.executeScript("window.scrollBy(0,-4250");
	
}

}


