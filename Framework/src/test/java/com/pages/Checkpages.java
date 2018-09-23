package com.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.actions.WebActions;

public class Checkpages extends WebActions{

	WebDriver driver;
	public Checkpages(WebDriver driver){
		super(driver);
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}
	
	@FindBy(id="gb_70")
	WebElement gmail;
	
	public void getgmailclick(){
		elementclickable(gmail);
	}
}
