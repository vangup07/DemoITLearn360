package com.vgqa360.testcases;

import org.testng.annotations.Test;

import com.vgqa360.pages.BaseTest;
import com.vgqa360.pages.LoginPage;
import com.vgqa360.pages.Paymentpage;
import com.vgqa360.utility.ReadExcelFile;

public class PaymentTest extends BaseTest{
	
String fileName=System.getProperty("user.dir")+"\\TestData\\TestPortalData.xlsx";
	
	@Test(priority =1)
	void testcourses()
	{
		LoginPage lp=new LoginPage(driver);
		String username=ReadExcelFile.getCellValue(fileName, "LoginData", 1, 0);
		String password=ReadExcelFile.getCellValue(fileName, "LoginData", 1, 1);
		lp.loginPortal(username, password);
		
		
		Paymentpage pg= new Paymentpage(driver);
		String crdnum=ReadExcelFile.getCellValue(fileName, "CardDetails", 0, 0);
		String expdate=ReadExcelFile.getCellValue(fileName, "CardDetails", 0, 1);
		String cvcnum=ReadExcelFile.getCellValue(fileName, "CardDetails", 0, 2);
		
		pg.paymentOption(crdnum, expdate, cvcnum);
		
	}

}
