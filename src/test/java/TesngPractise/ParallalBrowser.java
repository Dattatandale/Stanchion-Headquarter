package TesngPractise;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.set.utilityclass.screenshot;

public class ParallalBrowser 
{
	public static WebDriver driver;
	
	@Parameters("browser")
	@BeforeMethod
	public void TC1_openbrowser(@Optional("Chrome")String brows)
	{
		if(brows.contains("Chrome"))
		{
			System.setProperty("webdriver.chrome.driver", "./Driver/chromedriver.exe");
		ChromeOptions option=new ChromeOptions();
		Map<String, Object> prefs=new HashMap();
		prefs.put("profile.password_manager_leak_detection", false);
		prefs.put("profile.credentials_enable_service", false);			
		option.setExperimentalOption("prefs", prefs);
		option.addArguments("--remote-allow-origins=*");
		driver=new ChromeDriver(option);
		driver.get("http://172.30.69.247/cgi-bin/mstore/login.w");
		System.out.println("Browser opened in Chrome");
		}
		else if(brows.contains("MicrosoftEdge"))
		{
			System.setProperty("webdriver.edge.driver", "D:\\Automation\\Applications\\msedgedriver.exe");
	
		driver=new EdgeDriver();
		driver.get("http://172.30.69.247/cgi-bin/mstore/login.w");
		System.out.println("Browser opened in firefox");
		}
		else
		{
			System.out.println("Not able to lauch application");
			
		}
	}
	
	@Parameters({"username","password"})
	@Test
	public void TC2_logintoApp(@Optional("stanchion")String user,@Optional("stan1234") String pass) throws IOException, InterruptedException
	{   
		driver.findElement(By.xpath("//input[@name='ipusername']")).sendKeys(user);
		driver.findElement(By.xpath("//input[@name='ippassword']")).sendKeys(pass);
		driver.findElement(By.xpath("//input[@align='absbottom']")).click();
		Thread.sleep(4000);
		//utilityclass.takescreenshot(driver, "TC2_Screenshot");
		Assert.assertTrue(false);
	}
	@AfterMethod
	public void TC3_closebrowser(ITestResult result) throws IOException
	{
		if(result.getStatus()==ITestResult.FAILURE)
		{
			screenshot.takescreenshot(driver, result.getName());
		}
		driver.quit();
		System.out.println("Browser Closed");
	}

}
