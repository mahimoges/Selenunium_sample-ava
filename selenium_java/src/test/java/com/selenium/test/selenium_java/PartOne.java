package com.selenium.test.selenium_java;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

public class PartOne {
	WebDriverConfig driver = new WebDriverConfig();
			
			WebDriver chrome = driver.getChrome();
	
             WebDriver firefox = driver.getFirefox();

@Test
public void locatorsInWeb() {
	chrome.get("HTTP://google.com");
	WebElement searchBox = chrome.findElement(By.name("q"));
			try {
			 Thread.sleep(4000);
			} catch(InterruptedException e) {
				e.fillInStackTrace();
			}

}
@Test
public void basiccommands() {
	firefox.navigate().to("https://amazon.com");
	firefox.navigate().refresh();
	try {
		Thread.sleep(5000);
	
	}
		catch(InterruptedException e) {
			//todo auto henerated catch block
			e.printStackTrace();
		}
	
	}
	

}



//wait for 10 seconds
//open an amazon in chrome and firefox browsers 
//find the name or id for serch box on amazon
//referesh the webpage
//fined the name or id for serch box and type iphome case //close the both of brosers/*

class Amazone {
	void getamazon() {
}
	WebDriverConfig driver = new WebDriverConfig();
	
	WebDriver chrome = driver.getChrome();

   WebDriver firefox = driver.getFirefox();
   
   @Test 
   
   public void  locatorsInWeb() 
   {
   	chrome.get("HTTP://amazon.com");
   	chrome.findElement(By.id("q")).getText();
   	WebElement searchBox = chrome.findElement(By.name("q"));
   	chrome.navigate().refresh();
   	chrome.manage().timeouts().implicitlyWait(10, null);
   	
}
   @AfterTest
	public void CloseTest() {
		chrome.close();
		firefox.close();
   }
}