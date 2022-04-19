package com.selenium_concepts;


import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Screen_cnpt {

	public static void main(String[] args) throws Throwable     {
		
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Admin\\eclipse-workspace\\Selenium_New\\Driver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		
		WebElement  name =driver.findElement(By.id("email"));
		name.sendKeys("nivedhaa12389@gmail.com");
		
		WebElement P =driver.findElement(By.id("pass"));
		P.sendKeys("nivi12345");
		
		WebElement Log  =driver.findElement(By.name("login"));
		Log.click();
		
		driver.navigate().refresh();
		
		
		TakesScreenshot Ts = (TakesScreenshot) driver;
		
		File Src =Ts.getScreenshotAs(OutputType.FILE);
		
		File destination =new File("C:\\Users\\Admin\\eclipse-workspace\\Selenium_New\\Screenshot//snap.png");
		
		FileUtils.copyFile(Src, destination);
		
	
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}

