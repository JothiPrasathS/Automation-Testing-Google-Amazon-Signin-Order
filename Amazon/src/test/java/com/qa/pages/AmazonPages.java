package com.qa.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AmazonPages 
{
	 WebDriver Driver;
	 
	 @FindBy(id="twotabsearchtextbox")
	 WebElement searchbox;
	 public WebElement SearchBox()
	 {
		 return searchbox;
	 }

	 @FindBy(xpath="//input[@id='nav-search-submit-button']")
	 WebElement SearchBtn;
	 public WebElement SearchButton() {
			return SearchBtn;
		}
		 
	 public AmazonPages(WebDriver Driver)
	 {
		 this.Driver=Driver;
		PageFactory.initElements(Driver,this); 
	 }
}





