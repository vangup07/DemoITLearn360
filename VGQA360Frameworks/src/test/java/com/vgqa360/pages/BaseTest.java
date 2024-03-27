package com.vgqa360.pages;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import com.vgqa360.utility.BrowserFactory;
import com.vgqa360.utility.ConfigDataProvider;


public class BaseTest {

	
	public WebDriver driver;
	public ConfigDataProvider config = new ConfigDataProvider();
	
	
	
	@BeforeClass
	public void setUp()
	{
		driver=BrowserFactory.startAppliaction(driver,config.getBrowser(),config.getUrl());
	}
	
 @AfterClass
	public void tearDown()
	{
		driver.close();
		
	}
}
