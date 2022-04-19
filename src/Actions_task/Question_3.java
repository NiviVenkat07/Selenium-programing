package Actions_task;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Question_3 {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Admin\\eclipse-workspace\\Selenium_New\\Driver 1\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();		
		driver.get("http://www.flipkart.com");
		driver.manage().window().maximize();
		
		Actions act = new Actions(driver);
		
		WebElement X = driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']"));
		  act.click(X).build().perform();
		WebElement H = driver.findElement(By.xpath("//div[text()='Home']"));
		  act.moveToElement(H).click().build().perform();
		WebElement LR = driver.findElement(By.xpath("(//div[@class='xtXmba'])[6]"));
		   act.moveToElement(LR).click().build().perform();
		
	}
}
		
		
		
		
		
		
		
		
		
		
		
		
			
		
		
		


