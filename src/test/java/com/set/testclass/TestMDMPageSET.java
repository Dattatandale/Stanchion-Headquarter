package com.set.testclass;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.set.baseclass.baseclass;
import com.set.pomclasses.HomePageSET;
import com.set.pomclasses.LoginSET;

public class TestMDMPageSET extends baseclass
{
	public com.set.pomclasses.MDMPageSET MDMPageSET;
	public LoginSET LoginSET;
	public HomePageSET HomePageSET;
	@BeforeMethod
	   public void openset() throws IOException
	   {
			launchapp();
					
	   }
		
		@AfterMethod
		public void closeset()
		{
			closeapp();
		}
		
		@Test
		public void TC_ValidatePageTitle()
		{
			LoginSET=new LoginSET(driver);
			HomePageSET=LoginSET.ClickToLogin();
			MDMPageSET=HomePageSET.MDMLogoClick();
			MDMPageSET.SwitchToMDMFrame();
			String Result = MDMPageSET.MDMMenuTitleText();
			Assert.assertEquals(Result, "Master Data Management");
			
		}
		

}
