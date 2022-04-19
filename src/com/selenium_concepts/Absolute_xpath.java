package com.selenium_concepts;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Absolute_xpath {
public static void main(String[] args) {
	   System.setProperty("webdriver.chrome.driver",
			   "C:\\Users\\Admin\\eclipse-workspace\\Selenium_New\\Driver 1\\chromedriver.exe");
	   
          WebDriver driver = new ChromeDriver();
          
            driver.get("https://www.amazon.in/");
            driver.manage().window().maximize();

      JavascriptExecutor js = (JavascriptExecutor)driver;
          js.executeScript("window.scrollBy(0, 8000)");
          js.executeScript("window.scrollBy(0, -8000)");

           WebElement revamp = driver.findElement(By.xpath("/html/body/div/div/div[2]/div/div[2]/div/div/h2"));
             System.out.println(revamp.getText());

        WebElement toppicks = driver.findElement(By.xpath("/html/body/div/div/div[2]/div[2]/div/div[2]/div/div/div/h2"));
            System.out.println(toppicks.getText());

         // homeproducts = driver.findElement(By.xpath("/html/body/div/div/div/div[2]/div/div[14]/div/div/div/h2"));
              //  System.out.println(homeproducts.getText());





}
}	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

