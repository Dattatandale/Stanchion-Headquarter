package com.set.baseclass;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;

import org.apache.log4j.xml.DOMConfigurator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

import com.set.actionclass.Action;
import com.set.utilityclass.log;

public class baseclass {
	public static WebDriver driver;
	public static Properties prop;

	@BeforeSuite
	public void beforesuit() {
		DOMConfigurator.configure("log4j.xml");
		log.info("---Before Suit Method Called---");
	}

	@BeforeTest
	public static void fetchPropertyValue() throws IOException {
		File f = new File("./configuration/config.properties");
		FileInputStream file = new FileInputStream(f);
		prop = new Properties();
		prop.load(file);
//		System.out.println(prop.getProperty("username"));
//		System.out.println(prop.getProperty("password"));
//		System.out.println(prop.getProperty("url"));
//		System.out.println(prop.getProperty("browser"));
	}

	public static void launchapp() throws IOException {
//		String browsername = prop.getProperty("browser");
//		System.out.println(browsername);
//		String url = prop.getProperty("url");
		if (prop.getProperty("browser").toString().contains("chrome")) {
			System.setProperty("webdriver.chrome.driver", "./Driver/chromedriver.exe");
			ChromeOptions option = new ChromeOptions();
			Map<String, Object> prefs = new HashMap();
			prefs.put("profile.password_manager_leak_detection", false);
			prefs.put("profile.credentials_enable_service", false);
			option.setExperimentalOption("prefs", prefs);
			option.addArguments("--remote-allow-origins=*");
			driver = new ChromeDriver(option);
		} else if (prop.getProperty("browser").toString().contains("firefox")) {
			System.setProperty("webdriver.chrome.driver", "./Driver/FirefoxDriver.exe");
			driver = new FirefoxDriver();
		} else if (prop.getProperty("browser").toString().contains("ie")) {
			System.setProperty("webdriver.chrome.driver", "./Driver/InternetExplorerDriver.exe");
			driver = new InternetExplorerDriver();
		} else {
			System.setProperty("webdriver.chrome.driver", "./Driver/chromedriver.exe");
			driver = new ChromeDriver();
		}

		Action.implicitwait(driver, 10);
		Action.pageLoadTimeOut(driver, 20);
		driver.manage().window().maximize();
		driver.get(prop.getProperty("url").toString());
	}

	public static void closeapp() {
		driver.quit();
	}

	@AfterSuite
	public void aftersuit() {
		log.info("--After Suite Method Called--");
	}

}
