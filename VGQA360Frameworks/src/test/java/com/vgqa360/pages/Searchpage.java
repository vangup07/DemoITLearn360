package com.vgqa360.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Searchpage {
	WebDriver driver;
	//constructor
		public Searchpage(WebDriver lDriver)
		{
			this.driver=lDriver;
			
			PageFactory.initElements(driver,this);
		}
		
		@FindBy(name="search_course") WebElement searchInput;
		
		@FindBy(xpath="//*[@id=\"primary_menu\"]/nav[1]/form/button") WebElement serachbtn;
		
		
		public void serachCourse(String courseName) throws InterruptedException
		{
			System.out.println(courseName);
			
			searchInput.sendKeys(courseName);
			Thread.sleep(5000);
			serachbtn.submit();
		}

}
