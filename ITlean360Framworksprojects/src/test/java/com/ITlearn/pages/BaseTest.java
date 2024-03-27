package com.ITlearn.pages;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;

import com.ITlearn.utilities.Browserfactory;
import com.ITlearn.utilities.CofigDataprovider;
import com.ITlearn.utilities.ReadExlData;

public class BaseTest 
{
	public CofigDataprovider conf;
	public WebDriver driver;
	public ReadExlData excel;
	
	
	@BeforeSuite
	public void setUpSuite()
	{
		conf= new CofigDataprovider();
		excel= new ReadExlData();
	}
	
	@BeforeClass
	public void setup()
	{
		driver=	Browserfactory.startAppliaction(driver,conf.getBrowser(),conf.getUrl());
	}
	
//	@AfterClass
//	public void closebrowser() 
//	{
//		driver.close();
//	}
	public void captureScreenShot(WebDriver driver,String testName) throws IOException
	 {
		 // Convert Webdriver object to TakesScreenshot interface
		 TakesScreenshot screenshot= ((TakesScreenshot)driver);
		 
		 // Step 2 :call getScreenshotAs method to capture image file
		 
		 File src= screenshot.getScreenshotAs(OutputType.FILE);
		 File srcpath=new File("."+"//ScreenShot//"+ testName + ".png");
		 
		 // Step 3 : copy image file to destination 
		 FileUtils.copyFile(src, srcpath);
		 
	 }
}

