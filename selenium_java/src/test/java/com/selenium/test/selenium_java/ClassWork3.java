package com.selenium.test.selenium_java;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class ClassWork3 {
	private static final String action = null;

	WebDriverConfig driver = new WebDriverConfig();

	WebDriver chrome = driver.getChrome();

	@Test
	public void rightClickTest() throws InterruptedException {
		chrome.get("http://artoftesting.com/sampleSiteForSelenium.html");
		chrome.findElement(By.id("fname")).sendKeys("mahi");
		chrome.findElement(By.id("idOfButton")).click();
		chrome.close();
	}

	@Test
	public void doubleclick() {

		WebDriverConfig driver = new WebDriverConfig();

		WebDriver chrome = driver.getChrome();
		chrome.get("http://artoftesting.com/sampleSiteForSelenium.html");
		Actions action = new Actions(chrome);
		
		WebElement doubleClickButton = chrome.findElement(By.xpath("//*[@id=\"dblClkBtn\"]"));
		
		action.doubleClick(doubleClickButton).perform();
		
		chrome.close();
	}

	@Test
	public void dropDown() {
		
		WebDriverConfig driver = new WebDriverConfig();

		WebDriver chrome = driver.getChrome();
		chrome.get("http://artoftesting.com/sampleSiteForSelenium.html");
		WebElement dropDown = chrome.findElement(By.xpath("//*[@id=\"testingDropdown\"]"));
		Select selectDropDown = new Select(dropDown);
				selectDropDown.selectByIndex(2);
				chrome.close();
	}


@Test 

public void click() {

	WebDriverConfig driver = new WebDriverConfig();

	WebDriver chrome = driver.getChrome();
	chrome.get("http://artoftesting.com/sampleSiteForSelenium.html");
	chrome.findElement(By.name("gender")).click();
	
}
	
}