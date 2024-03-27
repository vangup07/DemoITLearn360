package com.ITlearn.utilities;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

public class CofigDataprovider {
	
Properties pro;
	 public CofigDataprovider()
	 {
		 File src = new File("./Configruation/config.properties");
			
			try {
				FileInputStream fis= new FileInputStream(src);
				
				pro= new Properties();
				
				pro.load(fis);
			} catch (Exception e) {
				System.out.println("Not able to load config file "+e.getMessage());
			}	 
	 }
	 
	 
	 public String getBrowser()
	 {
		 return pro.getProperty("browser");
	 }
	 
	 public String getUrl()
	 {
		 return pro.getProperty("url");
	 }
	

}
