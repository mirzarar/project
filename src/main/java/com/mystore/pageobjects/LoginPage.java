/**
 * 
 */
package com.mystore.pageobjects;

import org.openqa.selenium.WebElement;

import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.mystore.actiondriver.Action;
import com.mystore.base.BaseClass;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.mystore.actiondriver.Action;


public class LoginPage extends BaseClass {
	
	Action action= new Action();
	//homepageobjects Homepageobjects;


	
	@FindBy(xpath="//input[@id='email']")
	private WebElement userName;
	
	
	@FindBy(xpath="//input[@id='pass']")
	private WebElement password;

	@FindBy(xpath="//button[@id='login_login_btn']")
	private WebElement signInBtn;

	
	public LoginPage() {
		PageFactory.initElements(getDriver(), this);
	}
	
	public homepageobjects login(String uname, String pswd) throws Throwable {
	
		action.type(userName, uname);
		action.type(password, pswd);
		action.click(getDriver(), signInBtn);
		
		Thread.sleep(2000);
		 return new homepageobjects();

	}
	

	
}