package com.ActiTime.Scripts;

import java.io.IOException;

import org.testng.annotations.Test;

import com.ActiTime.Generics.BaseTest;
import com.ActiTime.Pages.POMActitimeLoginPage;

public class TESTActiTimeLogin extends BaseTest
{
	
@Test
public void loginMethod() throws IOException
{
	POMActitimeLoginPage login=new POMActitimeLoginPage(driver);
			
			login.login();
}
	
}
