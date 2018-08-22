package com.selenium.test.selenium_java;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

public class ClassWork2 {
	WebDriverConfig driver = new WebDriverConfig();
	
	WebDriver chrome = driver.getChrome();

   WebDriver firefox = driver.getFirefox();
   
   @Test 
   public void classTest(){

   	firefox.navigate().to("http://w3schools.com");
   	firefox.findElement(By.xpath("/html/body/div[7]/div[1]/div[1]/a[1]")).click();
   	firefox.navigate().back();
   	
   }
   @Test
   public void  classTest2() {
		chrome.navigate().to("http://w3schools.com");
	   	chrome.findElement(By.xpath("/html/body/div[7]/div[1]/div[1]/a[1]")).click();
	   	chrome.navigate().back();
	   
   }
   @AfterTest
   public void closeTest()
   {
	   firefox.close();
	   chrome.close();
   }
}
