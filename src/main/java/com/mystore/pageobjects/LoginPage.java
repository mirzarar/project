package com.mystore.pageobjects;

import org.openqa.selenium.WebElement;


import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.mystore.actiondriver.Action;
import com.mystore.base.BaseClass;




public class LoginPage extends BaseClass {
	
	Action action= new Action();
	
	@FindBy(xpath="//input[@id='email']")
	private WebElement userName;
	
	
	@FindBy(xpath="//input[@id='pass']")
	private WebElement password;

	@FindBy(xpath="//button[@id='login_login_btn']")
	private WebElement signInBtn;

	
	public LoginPage() {
		PageFactory.initElements(getDriver(), this);
	}
	
	public homepageobjects login() throws Throwable {
	
		action.type(userName, "abd848qaisrani@gmail.com");
		action.type(password, "61ae01ae");
		action.click(getDriver(), signInBtn);
		
		Thread.sleep(2000);
		 return new homepageobjects();}
		 
		 public String getCurrURL() throws Throwable {
				String LoginPageURL=action.getCurrentURL(getDriver());
				return LoginPageURL;
		
 }
}