package com.selenium_concepts;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alert_cnpt {

public static void main(String[] args) throws Throwable {
	
	System.setProperty("webdriver.chrome.driver",
			"C:\\Users\\Admin\\eclipse-workspace\\Selenium_New\\Driver\\chromedriver.exe");
	
	WebDriver driver = new ChromeDriver();

	driver.get("https://demoqa.com/alerts");
	driver.manage().window().maximize();
	
	WebElement Sim =driver.findElement(By.id("alertButton"));
	Sim.click();
	
	      Thread.sleep(3000);
	driver.switchTo().alert().accept();
	
	  WebElement con = driver.findElement(By.id("confirmButton"));
	con.click();
	
	driver.switchTo().alert().dismiss();
	
	WebElement Promt =driver.findElement(By.id("promtButton"));
	Promt.click();
	
	       Thread.sleep(3000);
	//driver.switchTo().alert().sendKeys("nivi");
	     //    Thread.sleep(3000);
	//driver.switchTo().alert().accept(); or
	
	Alert alert =driver.switchTo().alert();
	
	alert.sendKeys("Entertainment");
	
	    Thread.sleep(2000);
	driver.switchTo().alert().accept();
	
	
	
	
	
	
	
	
	
}







}
