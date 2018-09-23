package com.tests;

import java.util.HashMap;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.Base.BaseTest;
import com.actions.WebActions;
import com.data.PropertiesData;
import com.listensers.TestListeners;
import com.pages.Checkpages;

public class Check extends BaseTest {

PropertiesData data=null;
HashMap details=new HashMap();
TestListeners listener=null;
Checkpages check=null;
@BeforeMethod
public void methodinitized(){

	data=new PropertiesData();
	
	try {
		 details=data.browserdetails();
	} catch (Exception e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
			
	driver.get((String) details.get("url"));
}
@Test
public void Test(){
	Listenerstep();
	System.out.println("test");
}
	
@Test
public void Test1(){
	Listenerstep();
	
	check=new Checkpages(driver);
	check.getgmailclick();
}
}
