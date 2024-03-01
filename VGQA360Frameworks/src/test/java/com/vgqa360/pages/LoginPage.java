package com.vgqa360.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

	WebDriver driver;
	//constructor
	public LoginPage(WebDriver lDriver)
	{
		this.driver=lDriver;
		
		PageFactory.initElements(driver,this);
	}
	
	@FindBy(xpath="//*[@id=\"loginlabel\"]") WebElement loginclick;
	
	
@FindBy(name="log") WebElement uname;
	
	@FindBy(name="pwd") WebElement pass;
	
	@FindBy(name="wp-submit") WebElement loginButton;
	
	public void loginPortal(String username,String password)
	{
		loginclick.click();
		uname.sendKeys(username);
		pass.sendKeys(password);;
		loginButton.click();
	}
	




}




