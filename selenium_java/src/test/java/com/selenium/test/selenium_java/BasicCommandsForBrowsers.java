package com.selenium.test.selenium_java;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

public class BasicCommandsForBrowsers {
	WebDriverConfig driver = new WebDriverConfig ();
	WebDriver chrome = driver.getChrome();
	@Test
	//implicit wait
	public void basicCommandTest() {
		chrome.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		chrome.get("https://chrome.com");
		chrome.findElement(By.xpath("//*[@id=\"q\"]")).getText();
		chrome.findElement(By.xpath("//*[@id=\"q\"]")).sendKeys ("QA Automation class");
		
		
		// Explicit wait
		WebDriverWait wait = new WebDriverWait(chrome,20);
		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id=\"q\"]")));
	}
	
	@AfterTest
	public void CloseTest() {
		chrome.close();
	}
	

}
