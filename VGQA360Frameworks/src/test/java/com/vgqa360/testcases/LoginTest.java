package com.vgqa360.testcases;

import org.testng.annotations.Test;

import com.vgqa360.pages.BaseTest;
import com.vgqa360.pages.LoginPage;

public class LoginTest extends BaseTest{

	@Test
	public void verifyLogin()
	{
		LoginPage lp= new LoginPage(driver);
		String user="Demo12";
		String pass="Test123456$";
		
		lp.loginPortal(user, pass);
	}
	
	
}
