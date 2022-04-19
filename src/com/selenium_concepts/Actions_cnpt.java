package com.selenium_concepts;

import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Actions_cnpt {
public static void main(String[] args) {
System.setProperty("webdriver.chrome.driver",
		"C:\\Users\\Admin\\eclipse-workspace\\Selenium_New\\Driver 1\\chromedriver.exe");	
	
	WebDriver  driver= new ChromeDriver();
	driver.get("https://demoqa.com/buttons");
	driver.manage().window().maximize();
	Actions act = new Actions(driver);
	
	WebElement DC =driver.findElement(By.id("doubleClickBtn"));//doubleclick
	act.doubleClick(DC).build().perform();
	
	WebElement Ri8 =driver.findElement(By.id("rightClickBtn"));//rightclick
	act.contextClick(Ri8).build().perform();

	WebElement CLK =driver.findElement(By.xpath("//button[text()='Click Me']"));//click
	act.click(CLK).build().perform();
	
	WebElement Scroll =driver.findElement(By.xpath("//span[text()='Dynamic Properties']"));
	act.moveToElement(Scroll).build().perform();
	
}
	
	
	
	
	
	
}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

