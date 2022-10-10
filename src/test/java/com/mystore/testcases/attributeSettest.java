package com.mystore.testcases;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.mystore.base.BaseClass;
import com.mystore.pageobjects.LoginPage;
import com.mystore.pageobjects.attributeSet;
import com.mystore.pageobjects.homepageobjects;

public class attributeSettest extends BaseClass{
	
	
    private LoginPage loginPage;
	public homepageobjects Homepageobjects;
	public attributeSet Attributesset;
	
	@Parameters("browser") 
	@BeforeMethod()
	public void setup(String browser ) {
		launchApp(browser); 
	}
	
	@AfterMethod()
	public void tearDown() {
		// driver.quit();
	}

	
	
	@Test(dataProvider = "credentials", dataProviderClass = com.mystore.dataprovider.DataProviders.class)
	public void attributeSettest1(String uname, String pswd, String atRegulr, String atSavebtn) throws Throwable {
		// loginPage=indexPage.clickOnSignIn();
	   loginPage = new LoginPage();
	   Homepageobjects= loginPage.login(uname,pswd);
	   Homepageobjects.productClick();
	   Thread.sleep(1000);
	   Attributesset = new attributeSet();

	   Attributesset.att(atRegulr,atSavebtn);
	   
	 
	   
	}
	   

}
