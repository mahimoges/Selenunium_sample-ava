package com.selenium.test.selenium_java;

import java.awt.Point;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class ScorllTest {
WebDriverConfig driver = new WebDriverConfig();
	
	WebDriver firefox = driver.getFirefox();
	

	
@Test
	public void testScroll() {
		firefox.get("http://flipkart.com");
		WebElement serchBox = firefox.findElement(By.id("fk-top-search-box"));
			serchBox.sendKeys("BUDDHA");
		
		
		// click on serchbutton//
			
			Thread.sleep(20000);
	
		@Test
		public void testScroll() throws InterruptedException {
			firefox.get("http://flipkart.com");
			int width = 400;
			int height = 400;
			Dimension dim  = new dimension(width,height)
			
			firefox.manage().window().maximize();
			
			firefox.manage().window().setPosition(new Point(0,-1000));
		
		}
}

