package com.selenium_concepts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Actions_drag_drop {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver",
			"C:\\Users\\Admin\\eclipse-workspace\\Selenium_New\\Driver 1\\chromedriver.exe");
	
	WebDriver driver = new ChromeDriver();		
	driver.get("https://jqueryui.com/droppable/");
	driver.manage().window().maximize();
	Actions act = new Actions(driver);
	
	driver.switchTo().frame(0);
	
	WebElement cpy =driver.findElement(By.id("draggable"));
    WebElement pst= driver.findElement(By.id("droppable"));
	act.dragAndDrop(cpy, pst).build().perform();
	
	
	

	
	
	
	
	
}

private static void DragandDrop(WebElement drag, WebElement drop) {
	// TODO Auto-generated method stub
	
}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
