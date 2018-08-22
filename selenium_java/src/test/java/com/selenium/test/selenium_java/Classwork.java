package com.selenium.test.selenium_java;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

public class Classwork {
	
		WebDriverConfig driver = new WebDriverConfig();
		
		WebDriver chrome = driver.getChrome();

	   WebDriver firefox = driver.getFirefox();
	   
	   @Test 
	   
	   public void  locatorsInWeb() 
	   {
	   	chrome.get("HTTP://amazon.com");
	   	chrome.findElement(By.xpath("//*[@id=\"twotabsearchtextbox\"]")).sendKeys("Iphone X");
	   	chrome.navigate().refresh();
	   	chrome.manage().timeouts().implicitlyWait(10000, null);
	   	
	}

	   @AfterTest
		public void CloseTest() {
			chrome.close();
			firefox.close();
	   }
	}
