package com.selenium_concepts;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Robot_cnpt {
public static void main(String[] args) throws Throwable {
	System.setProperty("webdriver.chrome.driver",
			"C:\\Users\\Admin\\eclipse-workspace\\Selenium_New\\Driver 1\\chromedriver.exe");
	WebDriver driver = new ChromeDriver ();
	driver.get("https://www.amazon.in/");
	driver.manage().window().maximize();
	
	Actions act = new Actions(driver);
	
	
	WebElement Fas =driver.findElement(By.xpath("//a[text()='Fashion']"));
	act.contextClick(Fas).build().perform();
	
	Robot rob = new Robot();
     rob.keyPress(KeyEvent.VK_DOWN);
     rob.keyRelease(KeyEvent.VK_DOWN);
     
     Thread.sleep(3000);
     
     rob.keyPress(KeyEvent.VK_DOWN);
     rob.keyRelease(KeyEvent.VK_DOWN);
     Thread.sleep(3000);
   
     rob.keyPress(KeyEvent.VK_DOWN);
     rob.keyRelease(KeyEvent.VK_DOWN);
     Thread.sleep(3000);
     
	 rob.keyPress(KeyEvent.VK_ENTER);
	 rob.keyRelease(KeyEvent.VK_ENTER);
	
	driver.quit();
	
	
	
	
}
	
	
	
	
	
	
	
	
	
	
	
	
	
}
