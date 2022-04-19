package com.selenium_concepts;

import java.awt.Frame;
import java.io.File;
import java.io.IOException;
import java.util.List;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.TargetLocator;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Frames_cnpt {

	public static void main(String[] args) throws Throwable   {
		System.setProperty("webdriver.chrome.driver", 
				"C:\\Users\\Admin\\eclipse-workspace\\Selenium_New\\Driver 1\\chromedriver.exe");
		
	WebDriver driver = new ChromeDriver ();	
	driver.get("http://demo.automationtesting.in/Frames.html");
	driver.manage().window().maximize();
	
	      int size =driver.findElements(By.tagName("iframe")).size();
	                     System.out.println(size);
	
	      WebElement Sub =driver.findElement(By.id("singleframe"));
	                              driver.switchTo().frame(Sub);
	
	      WebElement enter =driver.findElement(By.xpath("(//input[@type='text'])[1]"));
	                                enter.sendKeys("entertainment");
	         
	            driver.switchTo().defaultContent();
	         
	        Thread.sleep(3000);
	        
                    	//screenshot.
	                  TakesScreenshot Sc = (TakesScreenshot)driver;
                      File Src= Sc.getScreenshotAs(OutputType.FILE);
                      File destination = new File ("C:\\Users\\Admin\\eclipse-workspace\\Selenium_New\\Screenshot//snap.png") ;
	                  FileUtils.copyFile(Src, destination); 
	                  
	 
	       WebElement C = driver.findElement(By.xpath("//a[text()='Iframe with in an Iframe']"));
	                                C.click();
	  
	       WebElement outer = driver.findElement(By.xpath("//iframe[@style='float: left;height: 300px;width:600px']"));      
                                   driver.switchTo().frame(outer);
    
           WebElement inner = driver.findElement(By.xpath("//iframe[@style='float: left;height: 250px;width: 400px']"));
                                   driver.switchTo().frame(inner);
	
	       WebElement Pass =driver.findElement(By.xpath("(//input[@type='text'])[1]"));
	                               Pass.sendKeys("selenium frame concept");
	
	                            //screenshot
	Thread.sleep(3000);
	                     TakesScreenshot One = (TakesScreenshot)driver;
	                     File src= One.getScreenshotAs(OutputType.FILE);
	                     File des= new File ("C:\\Users\\Admin\\eclipse-workspace\\Selenium_New\\Screenshot//frame.png");
	                     FileUtils.copyFile(src, des);
	
	
	}

	
	}
	
	
	
	
	
	
	
	
	
	

