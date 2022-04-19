package Actions_task;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Question_8 {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Admin\\eclipse-workspace\\Selenium_New\\Driver 1\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();		
		driver.get("http://www.greenstechnologys.com/selenium-course-content.html"); 
		driver.manage().window().maximize();
		
		Actions act = new Actions (driver);
		
		WebElement C = driver.findElement(By.xpath("//a[text()='COURSES']"));
		  act.moveToElement(C).build().perform();
		
		WebElement Oracle = driver.findElement(By.xpath("//span[normalize-space()='Oracle Training']"));
		   act.moveToElement(Oracle).click().build().perform();
		
		WebElement SQL = driver.findElement(By.xpath("//span[text()='Oracle SQL Training']"));
		  act.moveToElement(SQL).click().build().perform();
		
	}	
		
		
		
		
		
	}		
		

