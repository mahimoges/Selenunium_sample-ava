package com.selenium.test.selenium_java;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

public class Classwork1 {
WebDriverConfig driver = new WebDriverConfig();
	
	WebDriver chrome = driver.getChrome();

  
   @Test
   public void selectDropDownTest() {
	   chrome.get("http://dempo.guru99.com/test/newtours/registr.php");
	   chrome.findElement(By.name("firstName")).sendKeys("mahi");
       chrome.findElement(By.name("lastName")).sendKeys("moges");
    		   }
}