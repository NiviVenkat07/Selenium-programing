package com.selenium_concepts;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavaScript {
public static void main(String[] args)  {
	System.setProperty("webdriver.chrome.driver", 
			"C:\\Users\\Admin\\eclipse-workspace\\Selenium_New\\Driver 1\\chromedriver.exe");
	
	WebDriver driver = new ChromeDriver();
	driver.get("https://www.amazon.in/");
	driver.manage().window().maximize();
	
	JavascriptExecutor js = (JavascriptExecutor)driver;
	
	driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
	
	js.executeScript("alert('helloworld');");                        //alert
	
	driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
	
	driver.switchTo().alert().accept();
	
	js.executeScript("window.scrollBy(0,8000);");                     //scrolldown
	driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);

	
   js.executeScript("window.scrollBy(0,-8000);");                     //scrollup
   driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
	
   WebElement Clk = driver.findElement(By.xpath("(//h2[@class='a-color-base as-title-block-left'])[1]"));//middle of the pg
	js.executeScript("arguments[0].scrollIntoView();",Clk);	   
   driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS );
   
  WebElement Ck = driver.findElement(By.xpath("(//div[@class='a-section a-spacing-none _deals-shoveler-v2_style_imageContainer__2Wm4A'])[1]"));
   js.executeScript("arguments[0].click();",Ck);                       //click
   
   js.executeScript("history.go(0)");                                  // refresh
   
   String stext =js.executeScript("return document.title;").toString();   // get title
   System.out.println(stext);
   
   driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS );       //back 
   driver.navigate().back();
   
 String url   = js.executeScript("return document.Url;").toString();
  System.out.println(url); 
   
 
}
	
	
	
	
	
	
	
	
}
