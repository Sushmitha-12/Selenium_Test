package com.orangehrm.automation.practice.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.orangehrm.automation.practice.base.BasePage;

public class LoginPage extends BasePage{
	
	    WebDriver driver;

	    // Locators
	    By usernameField = By.xpath("//input[@name='username']");
	    By passwordField = By.xpath("//input[@name='password']");
	    By loginButton   = By.xpath("//button[@type='submit']");
	    //By pageTitle = By.cssSelector("oxd-topbar-header-title");
	    // Constructor
	    public LoginPage(WebDriver driver) {
	        super(driver);
	        
	    }

	    // Actions
	    public void enterUsername(String user) {
	        click(usernameField);
	        enterText(usernameField, user);
	    }

	    public void enterPassword(String pass) {
	    	 click(usernameField);
		        enterText(usernameField, pass);
	    }

	    public void clickLogin() {
	    	 click(loginButton);
	    }
	    
	    
	    /*public void login(String user, String pass) {
	        enterUsername(user);
	        enterPassword(pass);
	        clickLogin();
	    }*/
		/*
		 * public String verifyPageTitle() { return getText(pageTitle); }
		 */
	}



