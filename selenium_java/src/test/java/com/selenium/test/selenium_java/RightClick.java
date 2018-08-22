package com.selenium.test.selenium_java;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class RightClick {
WebDriverConfig driver = new WebDriverConfig();
	
	WebDriver chrome = driver.getChrome();

   WebDriver firefox = driver.getFirefox();
   
   @Test
   public void rightClickTest() throws InterruptedException{
	   firefox.get("http://artoftesting.com/sampleSiteForSelenium.html");
	   Actions action = new Actions(firefox);
	   WebElement searchBox = firefox.findElement(By.id("fname"));
	   Thread.sleep(6000);
	   action.contextClick(searchBox).perform();
	   action.doubleClick(searchBox).perform();
	   // how do you find the paragtape/// by p type
	   //when do you use hadeless driver is stade call you use another toll 
	   // that run fast
	   
	   
	   
	   
	   
	   firefox.quit();
   }

}
