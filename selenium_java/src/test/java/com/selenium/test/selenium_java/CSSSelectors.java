package com.selenium.test.selenium_java;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

public class CSSSelectors {
	WebDriverConfig driver = new WebDriverConfig();
	 WebDriver firefox = driver.getFirefox();
@Test
	 public void searchWitCssPath() {
	 
		 firefox.navigate().to("http://google.com");
		 firefox.findElement(By.cssSelector("#lst-ib")).sendKeys("CSS NAme");
	 }
	
	
@AfterTest

public void closeTest() {
	firefox.close();

}
}
// go to the w3 school home page click HtMl
// and click back
// .element 
// 
// 1 get page
// get homepage
// 2. get clik 