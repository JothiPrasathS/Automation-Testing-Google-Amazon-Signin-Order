package com.qa.pages;
import java.io.IOException;
import java.util.List;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.DataProvider;

import com.qa.utility.ExcelUtility;

public class GooglePages
{
	WebDriver driver;
	
	  @FindBy(name="q")
	  WebElement searchbox;
	  public WebElement getSearchBoxfield()
	  {
		  return searchbox;	  
	  }
	  @FindBy(xpath="/html[1]/body[1]/div[1]/div[3]/form[1]/div[1]/div[1]/div[2]")
	  List<WebElement> AllItems;
	  
	  public List<WebElement> getAllItems(){
	      return AllItems;
	  }
	  
	    public GooglePages(WebDriver driver)
	  {
	   this.driver=driver;
	   PageFactory.initElements(driver, this);  
	  }
	   
}
/*

<test thread-count="5" name="Test 2 Chrome" parallel="classes">
<parameter name="Browser" value="Chrome"/>
 <classes>
    <class name="com.qa.testscripts.TC_GoogleAmazonSearch_003"/>
   </classes>
</test> <!-- Test --> 

<test thread-count="5" name="Test 3 Chrome" parallel="classes">
<parameter name="Browser" value="Chrome"/>
 <classes>
    <class name="com.qa.testscripts.TC_AmazonSigninSearch_005"/>
   </classes>
</test> <!-- Test --> 

<test thread-count="5" name="Test 1 Firefox" parallel="classes">
<parameter name="Browser" value="Firefox"/>
 <classes>
    <class name="com.qa.testscripts.TC_GoogleSearch_002"/>
   </classes>
</test> <!-- Test --> 

<test thread-count="5" name="Test 2 Firefox" parallel="classes">
<parameter name="Browser" value="Firefox"/>
 <classes>
    <class name="com.qa.testscripts.TC_GoogleAmazonSearch_003"/>
   </classes>
</test> <!-- Test --> 


<test thread-count="5" name="Test 3 Firefox" parallel="classes">
<parameter name="Browser" value="Firefox"/>
 <classes>
    <class name="com.qa.testscripts.TC_AmazonSigninSearch_005"/>
   </classes>
</test> <!-- Test --> 
*/