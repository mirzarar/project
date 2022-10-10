package com.mystore.pageobjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.mystore.actiondriver.Action;
import com.mystore.base.BaseClass;

public class attributeSet extends BaseClass{

	Action action= new Action();
	homepageobjects Homepageobjects;
	
	@FindBy(xpath="//span[normalize-space()='Attributes']")
	private WebElement attributes;
	
	
	
	 @FindBy(xpath="//a[@id='add-attribute']")
	 private WebElement addattributes;
	
	@FindBy(xpath="//li[@class='opt']")
	private WebElement attributessetindex;
	
	@FindBy(xpath="//li[@class='opt']")
	private WebElement attributessetindex1;
	
	@FindBy(xpath="//input[@id='name']")
	private WebElement attributetittle;
	
	@FindBy(xpath="//input[@id='description']")
	private WebElement attributeDescription;
	
	@FindBy(xpath="//input[@name='regular_expression']")
	private WebElement attributeregulr;
	
	@FindBy(xpath="//button[@id='pro_attr_create_btn']")
	private WebElement attributesavebtn;
	

	public attributeSet() {
		PageFactory.initElements(getDriver(), this);
	}

	public void att(String atRegulr, String atSavebtn) {
		
		action.click(getDriver(), attributes);
		action.click(getDriver(), addattributes);
	//	action.JSClick(getDriver(), attributessetindex);
	//	action.type(attributeDescription, atTittle);
		action.type(attributeregulr, atRegulr);

		action.type(attributesavebtn, atSavebtn);
		
	//	action.JSClick(getDriver(), atSavebtn);



	
	}
	
}
