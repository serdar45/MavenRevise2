package com.codistan.qaclass01.mavenrevise2;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

public class MavenRevise1 {
	String url=System.setProperty("webdriver.chrome.driver", "C:\\Users\\serda\\OneDrive\\Documents\\Chromedriver\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	
	@Test
	public void Ebay() {
driver.get("https://www.ebay.com");
		
		driver.findElement(By.id("gh-ac")).sendKeys("coffe"+Keys.ENTER);
	}
	@AfterTest
	public void endTest() {
		driver.close();
	}
}
