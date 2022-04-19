package com.selenium_concepts;

import java.io.File;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Gmail_login {

	public static void main(String[] args) throws Throwable {
		
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Admin\\eclipse-workspace\\Selenium_New\\Driver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.instagram.com/");
		driver.manage().window().maximize();
		
		Thread.sleep(2000);
		
	 WebElement U =driver.findElement(By.name("username"));
		U.sendKeys("nivi123");
	WebElement P =driver.findElement(By.name("password"));	
		P.sendKeys("123456789");
    WebElement log	=driver.findElement(By.xpath("(//button[@type='submit'])[1]"));
		log.click();
		
		
         	Thread.sleep(2000);
	
		TakesScreenshot ts = (TakesScreenshot)driver;
		File Src =ts.getScreenshotAs(OutputType.FILE);
		File destination = new File ("C:\\Users\\Admin\\eclipse-workspace\\Selenium_New\\Screenshot//snap.png");
		FileUtils.copyFile(Src, destination);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
	
	
	
	
}
