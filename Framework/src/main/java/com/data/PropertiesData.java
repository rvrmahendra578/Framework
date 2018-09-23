package com.data;


import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Properties;

public class PropertiesData {
	
	HashMap hm=new HashMap<String,String>();
	 File file = new File("D:/MyFramework/Framework/webproperties.properties");
	 FileInputStream fileInput = null;
	public HashMap browserdetails() throws Exception{
		fileInput = new FileInputStream(file);
		Properties prop = new Properties();
		prop.load(fileInput);
		
		if(prop.getProperty("drivertype").equalsIgnoreCase("web")){
		hm.put("url",prop.getProperty("browserurl"));
		hm.put("driverpath",prop.getProperty("driverpath"));
		hm.put("browsername",prop.getProperty("browsername"));
		hm.put("drivertype",prop.getProperty("drivertype"));
		}
		return hm;
		
	}
}
