package com.qa.pages;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AmazonSigninPages {
WebDriver Driver;

@FindBy(xpath="/html/body/div[1]/div[3]/form/div[1]/div[1]/div[1]/div/div[2]/input")
WebElement gsearchbox;
public WebElement GSearchBox()
{
	 return gsearchbox;
}


@FindBy(xpath="/html/body/div[7]/div/div[11]/div/div[2]/div[2]/div/div/div[1]/div/div/div/div/div/div/div[1]/a/h3")
WebElement amz;
public WebElement amz()
{
	 return amz;
}

@FindBy(id="nav-link-accountList-nav-line-1")
WebElement signinbox;
public WebElement SigninBox()
{
	return signinbox; 
}


@FindBy(id="createAccountSubmit")
WebElement createnewaccbox;
public WebElement CreateNewAccBox()
{
	return createnewaccbox; 
}

@FindBy(id="ap_customer_name")
WebElement newnamebox;
public WebElement NewNameBox()
{
	return newnamebox; 
}

@FindBy(id="ap_phone_number")
WebElement newmobilebox;
public WebElement NewMobileBox()
{
	return newmobilebox; 
}

@FindBy(id="ap_email")
WebElement newemailbox;
public WebElement NewEmailBox()
{
	return newemailbox; 
}

@FindBy(id="ap_password")
WebElement newpassbox;
public WebElement NewPassBox()
{
	return newpassbox; 
}

//@FindBy(xpath="//*[@id=\\\"continue\\\"]")
//WebElement continuebox;
//public WebElement Continue() {
//	return continuebox;
//}


public AmazonSigninPages(WebDriver Driver){
	this.Driver=Driver;
	PageFactory.initElements(Driver,this);
}

}
