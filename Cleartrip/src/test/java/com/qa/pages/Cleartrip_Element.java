
package com.qa.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Cleartrip_Element {


	WebDriver Driver = null;
	
//	@FindBy(xpath="/html/body/div[2]/div/div/div[2]/div/div[1]/div[2]")
//	 public static WebElement close;
	@FindBy(xpath="//span[contains(text(),'One way')]")
	public static WebElement firstdropdown;
	
	@FindBy(xpath="//span[contains(text(),'Round trip')]")
	public static WebElement roundtrip;
	
	@FindBy(xpath="//body/div[@id='root']/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[3]/div[1]/div[2]/div[1]/div[1]/button[1]/*[1]")
	public static WebElement seconddropdown;
	
	@FindBy(xpath="//body/div[@id='root']/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[3]/div[1]/div[2]/div[1]/div[1]/div[1]/span[1]/div[1]/div[1]/div[1]/ul[1]/li[3]/*[1]")
	public static WebElement adult;
	
	@FindBy(xpath="//body/div[@id='root']/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[3]/div[1]/div[2]/div[1]/div[1]/div[1]/span[1]/div[1]/div[1]/div[1]/ul[1]/li[1]/*[1]f                                   ")
	public static WebElement adultless;
//	@FindBy(xpath="//body/div[@id='root']/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[3]/div[1]/div[2]/div[1]/div[1]/div[1]/span[1]/div[1]/div[1]/div[2]/ul[1]/li[3]/*[1]")
//	public static WebElement children;
//	
//	@FindBy(xpath="//body/div[@id='root']/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[3]/div[1]/div[2]/div[1]/div[1]/div[1]/span[1]/div[1]/div[1]/div[3]/ul[1]/li[3]/*[1]")
//	public static WebElement Infants;
	
	@FindBy(xpath="//div[contains(text(),'Business class')]")
	public static WebElement businessclass;

      @FindBy(xpath="//body/div[@id='root']/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[3]/div[3]/div[1]/div[1]/div[1]/div[1]/button[1]/div[1]")
	public static WebElement sourcedatelink;
	
	@FindBy(xpath="//body/div[@id='root']/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[3]/div[3]/div[1]/div[1]/div[1]/div[1]/div[1]/ul[1]/div[3]/div[1]/div[2]/div[1]/div[3]/div[2]/div[7]/div[1]/div[1]")
	public static WebElement sourcedate;

	@FindBy(xpath="//*[@id=\"root\"]/div/div/div[1]/div/div[2]/div/div[1]/div/div[3]/div[1]/div[1]/div/div/button/div/div/span")
	public static WebElement trip;

	@FindBy(xpath="//*[@id=\"root\"]/div/div/div[1]/div/div[2]/div/div[1]/div/div[3]/div[1]/div[1]/div/div/div/ul/li[1]/div/div/span")
	public static WebElement drop;

	@FindBy(xpath="//*[@id=\"root\"]/div/div/div[1]/div/div[2]/div/div[1]/div/div[3]/div[1]/div[2]/div/div/button/div/div/span")
	public static WebElement Class;


	@FindBy(xpath="//*[@id=\"root\"]/div/div/div[1]/div/div[2]/div/div[1]/div/div[3]/div[1]/div[1]/div/div/button/div/div/span")
	public static WebElement count;


	@FindBy(xpath="//*[@id=\"root\"]/div/div/div[1]/div/div[2]/div/div[1]/div/div[3]/div[1]/div[2]/div/div/button/div/div/span")
	public static WebElement type;


	@FindBy(xpath="//*[@id=\"root\"]/div/div/div[1]/div/div[2]/div/div[1]/div/div[3]/div[2]/div/div/div[1]/input")
	public static WebElement Where;

	@FindBy(xpath="//*[@id=\"root\"]/div/div/div[1]/div/div[2]/div/div[1]/div/div[3]/div[2]/div/div/div[3]/input")
	public static WebElement to;

	@FindBy(xpath="//*[@id=\"root\"]/div/div/div[1]/div/div[2]/div/div[1]/div/div[3]/div[2]/div/div/div[1]/div[2]")
	public static WebElement drop1;

	@FindBy(xpath="//*[@id=\"root\"]/div/div/div[1]/div/div[2]/div/div[1]/div/div[3]/div[2]/div/div/div[3]/div[2]")
	public static WebElement drop2;

	@FindBy(xpath="//*[@id=\"root\"]/div/div/div[1]/div/div[2]/div/div[1]/div/div[3]/div[3]/div/div[2]")
	public static WebElement search;

	@FindBy(xpath="/html")
	public static WebElement flightdetails;


}