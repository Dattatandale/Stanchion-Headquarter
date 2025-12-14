/**
 * 
 */
package com.set.testclass;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.set.baseclass.baseclass;
import com.set.pomclasses.HomePageSET;
import com.set.pomclasses.LoginSET;

/**
 * @author datta.tandale
 *
 */
public class TestHomePageSET extends baseclass
{
	public HomePageSET HomePage;
	public LoginSET LoginSET;
	
	@BeforeMethod
	   public void LogintoSETApp() throws IOException
	   {
			launchapp();			
	   }
	
		
		@AfterMethod
		public void closeset()
		{
			closeapp();
		}
		
		@Test
		public void TC1_ValidateIsElementsDisplayed()
		{
			LoginSET=new LoginSET(driver);
			HomePage = LoginSET.ClickToLogin();
			boolean MDMResult = HomePage.MDMLogoDisplayed();
			Assert.assertTrue(MDMResult);
			boolean PromoPackLogoResult = HomePage.PromoPackLogoDisplayed();
			Assert.assertTrue(PromoPackLogoResult);
			boolean CommunicationResult = HomePage.CommunicationLogoDisplayed();
			Assert.assertTrue(CommunicationResult);
			boolean ReportsResult = HomePage.ReportsLogoDisplayed();
			Assert.assertTrue(ReportsResult);
			boolean ListsResult = HomePage.ListsLogoDisplayed();
			Assert.assertTrue(ListsResult);
			boolean VouchersResult = HomePage.VouchersLogoDisplayed();
			Assert.assertTrue(VouchersResult);
			boolean ApplicationResult = HomePage.ApplicationLogoDisplayed();
			Assert.assertTrue(ApplicationResult);
			
		}
		
		@Test
		public void TC2_ValidateIsElementsEnables()
		{
			LoginSET=new LoginSET(driver);
			HomePage = LoginSET.ClickToLogin();
			boolean MDMResult = HomePage.MDMLogoEnabled();
			Assert.assertTrue(MDMResult);
			boolean PromoPackLogoResult = HomePage.PromoPackLogoEnabled();
			Assert.assertTrue(PromoPackLogoResult);
			boolean CommunicationResult = HomePage.CommunicationLogoEnabled();
			Assert.assertTrue(CommunicationResult);
			boolean ReportsResult = HomePage.ReportsLogoEnabled();
			Assert.assertTrue(ReportsResult);
			boolean ListsResult = HomePage.ListsLogoEnabled();
			Assert.assertTrue(ListsResult);
			boolean VouchersResult = HomePage.VouchersLogoEnabled();
			Assert.assertTrue(VouchersResult);
			boolean ApplicationResult = HomePage.ApplicationLogoEnabled();
			Assert.assertTrue(ApplicationResult);			
		}
		@Test
		public void TC3_NavigateToMDM()
		{
			LoginSET=new LoginSET(driver);
			HomePage = LoginSET.ClickToLogin();
			HomePage.MDMLogoClick();
		}
		
}
