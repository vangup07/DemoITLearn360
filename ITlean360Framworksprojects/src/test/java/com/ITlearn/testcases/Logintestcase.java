package com.ITlearn.testcases;

import org.testng.annotations.Test;

import com.ITlearn.pages.BaseTest;
import com.ITlearn.pages.LoginPage;

public class Logintestcase extends BaseTest {

	
	@Test
	void verify()
	{
		
		LoginPage lp= new LoginPage(driver);
		String user="Demo12";
		String pass="Test123456$";
		lp.loginPortal(user, pass);
	}
}
