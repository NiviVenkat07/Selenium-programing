package Actions_task;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Question_5 {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Admin\\eclipse-workspace\\Selenium_New\\Driver 1\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();		
		driver.get(" https://www.shopclues.com/wholesale.html"); 
		driver.manage().window().maximize();
		
		Actions act = new Actions (driver);
		
		WebElement Ma = driver.findElement(By.xpath("//label[text()='Mobiles & Tablets']"));
		act.click(Ma).build().perform();
		
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,900)");
		
		WebElement R = driver.findElement(By.xpath("//label[@For='1001 - 2500']"));
		   act.click(R).build().perform();
	}
}
		
		  
		
		
    
