package com.Base;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeSuite;

import com.listensers.TestListeners;
import com.relevantcodes.extentreports.LogStatus;

public class BaseTest extends TestListeners {
InitDriver browser=null;
public static WebDriver driver;
@BeforeSuite
public void initconfig(){
	
	driver = new InitDriver().init();
	
}



public void Listenerstep(){
	test.log(LogStatus.INFO,"Driver initized");
}

}
