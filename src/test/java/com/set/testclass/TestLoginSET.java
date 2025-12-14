package com.set.testclass;



import java.io.IOException;

import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.set.baseclass.baseclass;
import com.set.pomclasses.LoginSET;
import com.set.utilityclass.screenshot;

public class TestLoginSET extends baseclass
{
	public static LoginSET lgn;
	public static screenshot shot=new screenshot();
	
	@BeforeMethod
   public void openset() throws IOException
   {
		launchapp();
			
   }
	
	@AfterMethod
	public void closeset(ITestResult result) throws IOException
	{
		if(result.getStatus()==ITestResult.FAILURE)
		{
			shot.takescreenshot(driver, result.getName().toString());
		}
		lgn=new LoginSET(driver);	
		closeapp();
	}
	
	
	@Test(description = "LoginApplicationTEst")
	public void TC1_ValidateText()
	
	{
		lgn=new LoginSET(driver);
		Reporter.log("Executing TC1 of TestLoginSET", true);
		String username = lgn.usernametext();
		Assert.assertEquals(username, "Name");
		String password = lgn.passwordtext();
		Assert.assertEquals(password, "Password");	
	}
	
	
	@Test
	public void TC2_ValidateBtnEnables()
	{
		lgn=new LoginSET(driver);	
		
		boolean loginbtn = lgn.btnenabled();
		Assert.assertTrue(loginbtn);	
	}
	
	@Test
	public void TC3_logintoSET() throws IOException, InterruptedException
	{   
		lgn=new LoginSET(driver);	
		lgn.ClickToLogin(); 
	}	
	
}
