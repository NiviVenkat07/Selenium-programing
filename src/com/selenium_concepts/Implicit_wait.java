package com.selenium_concepts;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Implicit_wait {

	public static void main(String[] args) {
		
	System.setProperty("webdriver.chrome.driver",
			"C:\\Users\\Admin\\eclipse-workspace\\Selenium_New\\Driver 1\\chromedriver.exe");	
		
	WebDriver driver = new ChromeDriver();
	driver.get("https://www.facebook.com/");
	driver.manage().window().maximize();
	
	WebElement Clk  =driver.findElement(By.xpath("(//a[@role='button'])[2]"));
	Clk.click();
	
	
	driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	
	WebElement N =driver.findElement(By.name("firstname"));
	N.sendKeys("nivi");
	
	
	}
	
	
	
	
	
	
}
