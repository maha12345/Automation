package com.ActiTime.Pages;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.ActiTime.Generics.AutoConstant;
import com.ActiTime.Generics.ExcelLibrary;

public class POMActitimeLoginPage implements AutoConstant
{
	//Declaration
	@FindBy(xpath="//input[@name='username']")
	private WebElement usernameTestfield;
	
	@FindBy(xpath="//input[@name='pwd']")
	private WebElement passwordTestfield;
	
	
	@FindBy(id="Login")
	private WebElement loginbutton;
	
	//Initialization
	public POMActitimeLoginPage(WebDriver driver) 
	{
		PageFactory.initElements(driver, this);
	}
	
	//utilization
	public void login() throws IOException
	{
		String un=ExcelLibrary.getcellvalue(excel_path, "Sheet2", 1, 0);
	    usernameTestfield.sendKeys(un);
		
		String pwd=ExcelLibrary.getcellvalue(excel_path, "Sheet2", 1, 1);
		passwordTestfield.sendKeys(pwd);
		
		loginbutton.click();	
			
		
	}
	
	
	

}
