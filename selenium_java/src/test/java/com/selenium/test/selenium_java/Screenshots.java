package com.selenium.test.selenium_java;

import java.io.File;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;

public class Screenshots {
WebDriverConfig driver = new WebDriverConfig();
	
	WebDriver firefox = driver.getFirefox();
public void testScreenshots() throws InterruptedException{
	firefox.get("http://google.com");
	firefox.manage().timeouts().implicitlyWait(40,TimeUnit.SECONDS );
	
	File scrFile = ((TakesScreenshot)firefox).getSrceenshootAs(OutputType.FILE);
}
	

}
