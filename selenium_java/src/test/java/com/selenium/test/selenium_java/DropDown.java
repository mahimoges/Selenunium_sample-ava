package com.selenium.test.selenium_java;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class DropDown {
	//  only imput from user
WebDriverConfig driver = new WebDriverConfig();
	
	WebDriver chrome = driver.getChrome();

   WebDriver firefox = driver.getFirefox();
   @Test
   public void selectDropDownTest() throws InterruptedException {
	   firefox.get("http://dempo.guru99.com/test/newtours/registr.php");
	   WebElement dropDown = firefox.findElement(By.name("country"));
	   Select selectDropDown = new  Select(dropDown);
	   Thread.sleep(3000);
	  selectDropDown.selectByValue("AUSTRALIA");
	  Thread.sleep(3000);
	  selectDropDown.selectByValue("INDIA");
	  Thread.sleep(5000);
	  selectDropDown.getOptions();
   }

}
