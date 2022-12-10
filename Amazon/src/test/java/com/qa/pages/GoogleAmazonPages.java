package com.qa.pages;
import java.io.IOException;
import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.DataProvider;

import com.qa.utility.ExcelUtility;

public class GoogleAmazonPages 
{
	 WebDriver Driver;
	
	 @FindBy(xpath="/html/body/div[1]/div[3]/form/div[1]/div[1]/div[1]/div/div[2]/input")
	 WebElement searchbox;
	 public WebElement SearchBox()
	 {
		 return searchbox;
	 }
	 
	 
	 @FindBy(xpath="/html/body/div[1]/div[3]/form/div[1]/div[1]/div[2]")
	List <WebElement> dropdown;
	 public  List <WebElement> DropDown()
	 {
		 return dropdown;
	 }
	 
	 @FindBy(xpath="/html/body/div[7]/div/div[11]/div/div[2]/div[2]/div/div/div[1]/div/div/div/div/div/div/div[1]/a/h3")
	 WebElement amz;
	 public WebElement amz()
	 {
		 return amz;
	 }
	 
	 @FindBy(xpath="//*[@id=\"twotabsearchtextbox\"]")
	 WebElement search;
	 public WebElement Search()
	 {
		 return search;
	 }
	 
	 @FindBy(xpath="//*[@id=\"nav-flyout-searchAjax\"]/div[2]")
	 List<WebElement>amzdrop;
	 public List<WebElement> amzdrop()
	 {
		 return amzdrop;
	 }
	 

	 public GoogleAmazonPages(WebDriver Driver)
	 {
		 this.Driver=Driver;
		PageFactory.initElements(Driver,this); 
	 }
	 
//	    @DataProvider
//			public String[][] getData() throws IOException {
//				
//				String xFile="C:\\eclipse\\cleartrip\\src\\test\\java\\com\\qa\\testdata\\TestData.xlsx";
//				String xSheet="Sheet1";
//				
//				int rowCount = ExcelUtility.getRowCount(xFile, xSheet);
//				int cellCount = ExcelUtility.getCellCount(xFile, xSheet, rowCount);
//				
//				String[][] data = new String[rowCount][cellCount];
//				
//				for(int i=1; i<=rowCount; i++) {
//					for(int j=0;j<cellCount;j++) {
//						data[i-1][j] = ExcelUtility.getCellData(xFile, xSheet, i, j);
//					}
//				}
//				return data;
//				
//		}
}
