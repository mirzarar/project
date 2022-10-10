package com.mystore.pageobjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.mystore.actiondriver.Action;
import com.mystore.base.BaseClass;

public class homepageobjects extends BaseClass {
	
Action action= new Action();
// public App app;


	
	@FindBy(xpath="//a[@id='products']")
	private WebElement productClick;
	
	
	public homepageobjects() {
		PageFactory.initElements(getDriver(), this);
	}
	
	



	public void productClick() {
		action.click(getDriver(), productClick);

		// TODO Auto-generated method stub
		
	}

	

}
