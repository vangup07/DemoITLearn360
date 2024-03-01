package com.vgqa360.utility;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

public class ConfigDataProvider {
	Properties pro;
	public ConfigDataProvider()
	 {
		 File src = new File("./Configration/config.properties");
			
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


	public Object getStagingUrl() {
		// TODO Auto-generated method stub
		return null;
	}
	
	
	
	
	
	
	
	
	
}
