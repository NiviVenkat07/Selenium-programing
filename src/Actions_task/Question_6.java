package Actions_task;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Question_6 {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Admin\\eclipse-workspace\\Selenium_New\\Driver 1\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();		
		driver.get("https://www.shopclues.com/wholesale.html"); 
		driver.manage().window().maximize();
		
		Actions act = new Actions (driver);
		
		WebElement Sm = driver.findElement(By.xpath("//a[text()='Sports & More']"));
		  act.moveToElement(Sm).click().build().perform();
		           driver.switchTo().frame(0);
		WebElement Wg = driver.findElement(By.xpath("//a[text()='Weight Gainers']"));
		   act.moveToElement(Wg).click().build().perform();
		
		   
	
	
		
		
		
		
		
	}		
		
}
