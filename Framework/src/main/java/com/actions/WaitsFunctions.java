package com.actions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.listensers.TestListeners;

public class WaitsFunctions {
	
	WebDriverWait wait=null;
	WebDriver driver;
	TestListeners listener=null;
	public WaitsFunctions(WebDriver driver) {
		// TODO Auto-generated constructor stub
		this.driver=driver;
		listener=new TestListeners();
	}

	public void waitforvisibiltyofelement(WebElement ele){
		wait =new WebDriverWait(driver,10);
		listener.stepifo("Wait for", ele);
		wait.until(ExpectedConditions.visibilityOf(ele));
	}

}
