package com.ActiTime.Generics;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class BaseTest 
{
public WebDriver driver;
@BeforeMethod    //BeforeMethod executed before the test method
public void openApp()
{
	System.setProperty("webdriver.chrome.driver","C:/chrome/chromedriver.exe");
    driver=new ChromeDriver();
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	driver.get("https://demo.actitime.com");
}

@AfterMethod      //AfterMethod executed after the test method
public void closeApp()
{
	driver.quit();
}
}
