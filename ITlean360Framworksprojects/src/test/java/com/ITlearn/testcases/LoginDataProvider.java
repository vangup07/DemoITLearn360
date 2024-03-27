package com.ITlearn.testcases;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.ITlearn.pages.BaseTest;
import com.ITlearn.pages.LoginPage;
import com.ITlearn.utilities.ReadExlData;

public class LoginDataProvider extends BaseTest {
	
	String fileName=System.getProperty("user.dir")+"\\Testdata\\Projectdata.xlsx";
	
	@Test(dataProvider ="logindataProvider")
	void verify(String user,String pass) throws IOException
	{
		
		LoginPage lp= new LoginPage(driver);
		
		
		
//		String user="Demo12";
//		String pass="Test123456$";
		lp.loginPortal(user, pass);
		
		if(user.equals("Demo12") && pass.equals("Test123456$"))
		{
			System.out.println("The test passed");
			Assert.assertTrue(true);
		}
		else
		{
			captureScreenShot(driver,"verify");
			Assert.assertTrue(false);
			
		}
	}
	
	
	
	@DataProvider
	public String[][] logindataProvider()
	{
		int intRows= ReadExlData.getRowCount(fileName, "login");
		int intCols=ReadExlData.getColCount(fileName, "login");
		
		String data [][] =new String[intRows-1][intCols];
		
		for(int i =1;i<intRows;i++)
		{
			for(int j =0;j<intCols;j++)
			{
				data[i-1][j] =ReadExlData.getCellValue(fileName, "login", i, j);
			}
		}
		
			
			
		return data;
	}
}
