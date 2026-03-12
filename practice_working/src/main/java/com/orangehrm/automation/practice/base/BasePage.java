package com.orangehrm.automation.practice.base;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.orangehrm.automation.practice.utils.WaitUtils;

public class BasePage {
	    protected WebDriver driver;
	    protected WaitUtils wait;

	    public BasePage(WebDriver driver) {
	        this.driver = driver;
	        this.wait = new WaitUtils(driver, 15);
	    }

	    public void click(By locator) {
	        wait.waitForClickable(locator).click();
	    }

	    public void enterText(By locator, String text) {
	        wait.waitForVisibility(locator).sendKeys(text);
	    }

	    public String getText(By locator) {
	        return wait.waitForVisibility(locator).getText();
	    }
	}


