package com.ActiTime.Generics;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class BasePage 
{
	public void dropdownbyvisibletest(WebElement ele, String text)
	{
		Select sel= new Select(ele);
		sel.selectByVisibleText(text);
	}
   public void dropdownbyvalue(WebElement ele,String val)
   {
	   Select sel=new Select(ele);
	   sel.selectByValue(val);
   }
   public void dropdownbyIndex(WebElement ele,int val)
   {
	   Select sel=new Select(ele);
	   sel.selectByIndex(val);
   }
   
}
