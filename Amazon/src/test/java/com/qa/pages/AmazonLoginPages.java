package com.qa.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AmazonLoginPages {

	 WebDriver Driver;
	 
	 
	 @FindBy(xpath="/html/body/div[1]/div[3]/form/div[1]/div[1]/div[1]/div/div[2]/input")
	 WebElement searchbox;
	 public WebElement searchbox() {
		return searchbox;
		 
	 }
	 
	 
	 @FindBy(xpath="//*[@id=\"rso\"]/div[1]/div/div/div/div/div/div/div[1]/a/h3")
	 WebElement amzpage;
	 public WebElement amzpage() {
		return amzpage;
		 
	 }
	 
	 
	 @FindBy(xpath="//*[@id=\"nav-link-accountList\"]/span")
	 WebElement signup;
	 public WebElement signup() {
		return signup;
		 
	 }
	 
	 
	 @FindBy(id="createAccountSubmit")
	 WebElement createAccount;
	 public WebElement createAccount() {
		return createAccount;
		 
	 }
	 
	 @FindBy(xpath="//*[@id=\"ap_customer_name\"]")
	 WebElement Fname;
	 public WebElement Fname() {
		return Fname;
	 }
	 
	 @FindBy(xpath="//*[@id=\"ap_phone_number\"]")
	 WebElement Mobileno;
	 public WebElement Mobileno() {
		return Mobileno;
	 }
		
	 @FindBy(xpath="//*[@id=\"ap_email\"]")
	 WebElement Email;
	 public WebElement Email() {
		return Email;
	 }
	 
	 @FindBy(xpath="//*[@id=\"ap_password\"]")
	 WebElement password;
	 public WebElement password() {
		return password;
	 }
		 
	 @FindBy(xpath="//*[@id=\"continue\"]")
	 WebElement continue1;
	 public WebElement continue1() {
		return continue1;
	 }

	 public AmazonLoginPages (WebDriver Driver)
	 {
		 this.Driver=Driver;
		PageFactory.initElements(Driver,this); 
	 }
	

}
