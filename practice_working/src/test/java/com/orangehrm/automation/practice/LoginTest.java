package com.orangehrm.automation.practice;


import org.openqa.selenium.Alert;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

import com.orangehrm.automation.practice.base.BaseClass;
import com.orangehrm.automation.practice.pages.LoginPage;

public class LoginTest extends BaseClass {

    @Test
    public void validLoginTest() {
    	
    	String actualTitle=driver.getTitle();
    	Reporter.log(actualTitle, true);
    	Assert.assertEquals(actualTitle, "OrangeHRM");
    	
    	LoginPage loginPage = new LoginPage(driver);
    	loginPage.enterUsername("Admin");
    	loginPage.enterPassword("admin123");
    	loginPage.clickLogin();
      
    	//loginPage.login("Admin", "admin123");
    	
    	    }

   
}

