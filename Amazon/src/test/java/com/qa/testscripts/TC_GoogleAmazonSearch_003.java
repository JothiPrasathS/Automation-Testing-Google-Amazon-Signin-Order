package com.qa.testscripts;
import java.io.IOException;
import java.util.List;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.qa.pages.GoogleAmazonPages;

public class TC_GoogleAmazonSearch_003 extends TestBase3
{
GoogleAmazonPages gap;
	
@Parameters({"Browser","Url"})
@Test
public void Search() throws InterruptedException, IOException
{
	gap=new GoogleAmazonPages(Driver);
	
  		gap.SearchBox().sendKeys("amazon"+Keys.ENTER);
  		
  		Thread.sleep(2000);
  		
  		gap.amz().click();
  	
  		Thread.sleep(3000);
  		
  		gap.Search().sendKeys("vivo");
  		
  		Thread.sleep(3000);

  		List<WebElement> alllist1 = gap.amzdrop();
		for(WebElement list: alllist1)
		{
			System.out.println(list.getText());
		}
  	    Thread.sleep(2000);
		Driver.navigate().back();

}
}


