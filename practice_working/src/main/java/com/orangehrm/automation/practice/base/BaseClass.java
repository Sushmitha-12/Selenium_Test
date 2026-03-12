package com.orangehrm.automation.practice.base;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {
protected WebDriver driver;

@BeforeMethod
public void setUp() {
	WebDriverManager.chromedriver().setup();
	driver = new ChromeDriver();
	//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	driver.manage().window().maximize();
	driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	
}

@AfterMethod
public void tearDown() {
	if(driver!= null) {
		driver.quit();
	}
}
}
