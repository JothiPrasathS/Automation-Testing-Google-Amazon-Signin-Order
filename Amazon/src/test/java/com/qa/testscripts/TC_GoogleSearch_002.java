package com.qa.testscripts;
import java.util.List;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import com.qa.pages.GooglePages;
public class TC_GoogleSearch_002 extends TestBase2
{
	GooglePages GoogleOR=new GooglePages(Driver);
	@Parameters({"Browser","Url"})
	 @Test
	 public void SearchGoogle() throws InterruptedException {
	
	GooglePages GoogleOR=new GooglePages(Driver);
	
	String title=Driver.getTitle();
	System.out.println("The Page landed in:"+title);
	
	GoogleOR.getSearchBoxfield().sendKeys("mobiles");
	
	 Thread.sleep(3000);
	 
	List<WebElement> AllItems =GoogleOR.getAllItems();
	
	Thread.sleep(2000);
	
	System.out.println("Total no. of items loaded are : " + AllItems.size());
	
	 Thread.sleep(3000);
	 
	for(WebElement item: AllItems) 
	{
		System.out.println(item.getText());
	}
 }    
}