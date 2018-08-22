package com.selenium.test.selenium_java;

import java.awt.Desktop.Action;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class MouseOver {
WebDriverConfig driver = new WebDriverConfig();
	
	WebDriver chrome = driver.getChrome();

//   WebDriver firefox = driver.getFirefox();
   
   @Test
   public void MouseOverTest() throws InterruptedException {
	   chrome.get("http://artoftesting.com/sampleSiteForSelenium.html");
	   chrome.manage().window().maximize();

	   Actions action = new Actions(chrome);
	   WebElement btn = chrome.findElement(By.id("idOfButton"));
	   action.moveToElement(btn).build().perform();
	   Thread.sleep(4000);
	   chrome.quit();
	  
   }

}
