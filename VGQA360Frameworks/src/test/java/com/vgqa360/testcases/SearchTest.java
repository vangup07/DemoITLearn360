package com.vgqa360.testcases;

import org.testng.annotations.Test;

import com.vgqa360.pages.BaseTest;
import com.vgqa360.pages.LoginPage;
import com.vgqa360.pages.Searchpage;
import com.vgqa360.utility.ReadExcelFile;

public class SearchTest extends BaseTest{

	String filename=System.getProperty("user.dir")+"\\TestData\\VGQAProjectData.xlsx";

	@Test
	public void verifyLogin()
	{
		LoginPage lp= new LoginPage(driver);
		String user="Demo12";
		String pass="Test123456$";
		
		lp.loginPortal(user, pass);
	}
	@Test(dependsOnMethods="verifyLogin")
	public void verifySearch() throws InterruptedException
	{
		System.out.println(filename);
		Searchpage sp= new Searchpage(driver);
		String course=ReadExcelFile.getCellValue(filename, "Search", 0, 0);
		System.out.println(course);
		sp.serachCourse(course);
	}
		
		
	
	

}
