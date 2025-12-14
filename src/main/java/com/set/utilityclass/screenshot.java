package com.set.utilityclass;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class screenshot {
	public static void takescreenshot(WebDriver driver, String name) throws IOException {
		File source = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		File dist = new File("./Screenshot/" + name + ".png");
		org.openqa.selenium.io.FileHandler.copy(source, dist);
	}

}
